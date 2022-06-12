package com.techexercise.demo.dao;

import com.techexercise.demo.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TransactionDao {
    Transaction get(long id);
    List<Transaction> list(long accountNumber);
}
