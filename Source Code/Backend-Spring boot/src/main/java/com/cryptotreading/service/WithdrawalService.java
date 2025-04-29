package com.cryptotreading.service;

import com.cryptotreading.model.User;
import com.cryptotreading.model.Withdrawal;
import lombok.With;

import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount,User user);
    Withdrawal procedWithdrawal(Long withdrawalId,boolean accept) throws Exception;
    List<Withdrawal> getUsersWithdrawalHistory(User user);
    List<Withdrawal> getAllWithdrawalRequest();
}
