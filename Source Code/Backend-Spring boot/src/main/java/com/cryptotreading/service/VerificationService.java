package com.cryptotreading.service;

import com.cryptotreading.domain.VerificationType;
import com.cryptotreading.model.User;
import com.cryptotreading.model.VerificationCode;

public interface VerificationService {
    VerificationCode sendVerificationOTP(User user, VerificationType verificationType);

    VerificationCode findVerificationById(Long id) throws Exception;

    VerificationCode findUsersVerification(User user) throws Exception;

    Boolean VerifyOtp(String opt, VerificationCode verificationCode);

    void deleteVerification(VerificationCode verificationCode);
}
