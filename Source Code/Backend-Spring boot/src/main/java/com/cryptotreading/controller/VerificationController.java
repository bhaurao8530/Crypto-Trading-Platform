package com.cryptotreading.controller;

import com.cryptotreading.exception.UserException;
import com.cryptotreading.model.User;
import com.cryptotreading.model.VerificationCode;
import com.cryptotreading.service.EmailService;
import com.cryptotreading.service.UserService;
import com.cryptotreading.service.VerificationService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerificationController {
    private final VerificationService verificationService;
    private final UserService userService;

    @Autowired
    private EmailService emailService;

    @Autowired
    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }




}
