package com.cryptotreading.service;

import com.cryptotreading.domain.WalletTransactionType;
import com.cryptotreading.model.Wallet;
import com.cryptotreading.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
