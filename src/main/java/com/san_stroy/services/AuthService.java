package com.san_stroy.services;

import com.san_stroy.dto.auth.LoginRequest;
import com.san_stroy.dto.auth.RegisterRequest;

import java.util.Map;

public interface AuthService {

    String register(RegisterRequest request);

    Map<String, String> login(LoginRequest request);

    String refreshToken(String refreshToken);
}
