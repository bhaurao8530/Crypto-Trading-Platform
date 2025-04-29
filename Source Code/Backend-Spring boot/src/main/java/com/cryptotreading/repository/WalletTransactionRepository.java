package com.cryptotreading.repository;

import com.cryptotreading.domain.WalletTransactionType;
import com.cryptotreading.model.Wallet;
import com.cryptotreading.model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
