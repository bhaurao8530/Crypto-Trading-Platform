package com.cryptotreading.service;

import com.cryptotreading.domain.VerificationType;
import com.cryptotreading.model.ForgotPasswordToken;
import com.cryptotreading.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
