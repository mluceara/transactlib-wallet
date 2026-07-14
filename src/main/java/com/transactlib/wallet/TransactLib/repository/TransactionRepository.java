package com.transactlib.wallet.TransactLib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transactlib.wallet.TransactLib.model.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findBySenderOrRecipient(String sender, String recipient);
}
