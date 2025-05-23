package com.san_stroy.services.serviceImpl;


import com.san_stroy.entities.RefreshToken;
import com.san_stroy.entities.User;
import com.san_stroy.repositories.RefreshTokenRepository;
import com.san_stroy.services.RefreshTokenService;
import com.sun.net.httpserver.HttpsServer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RefreshTokenServiceImpl implements RefreshTokenService {

    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken createRefreshToken(User user) {
        long refreshTokenDurationMs = 1000 * 60 * 60 * 24 * 7;
        RefreshToken token = RefreshToken.builder()
                .user(user)
                .token(UUID.randomUUID().toString())
                .expiryDate(Instant.now().plusMillis(refreshTokenDurationMs))
                .build();
        return refreshTokenRepository.save(token);
    }

    public Optional<RefreshToken> findByToken(String token) {
        return refreshTokenRepository.findByToken(token);
    }

    public RefreshToken verifyExpiration(RefreshToken token) {
        if (token.getExpiryDate().isBefore(Instant.now())) {
            refreshTokenRepository.delete(token);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Refresh token was expired. Please login again.");
        }
        return token;
    }
}
