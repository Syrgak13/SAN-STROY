package com.san_stroy.services;

import com.san_stroy.entities.RefreshToken;
import com.san_stroy.entities.User;

import java.util.Optional;

public interface RefreshTokenService {

    RefreshToken createRefreshToken(User user);

    Optional<RefreshToken> findByToken(String token);

    RefreshToken verifyExpiration(RefreshToken token);
}
