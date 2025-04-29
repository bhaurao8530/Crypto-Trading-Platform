package com.cryptotreading.repository;

import com.cryptotreading.domain.WithdrawalStatus;
import com.cryptotreading.model.Withdrawal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}
