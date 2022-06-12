package com.techexercise.demo.dao;

import com.techexercise.demo.model.Transaction;
import com.techexercise.demo.model.TransactionNotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class JdbcTransactionDao implements TransactionDao {


    private JdbcTemplate jdbcTemplate;

    public JdbcTransactionDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Transaction get(long id) {
        Transaction transaction = null;
        String sql = "SELECT Id, AccountNumber , TransactionAmount, PostDate , Description FROM transactions WHERE Id = ?;";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        if (results.next()) {
            transaction = mapRowToTransaction(results);
        } else {
            throw new TransactionNotFoundException();
        }
        return transaction;
    }

    @Override
    public List<Transaction> list(long accountNumber) {
        List<Transaction> transactions = new ArrayList<>();
        String sql = "SELECT Id, AccountNumber , TransactionAmount, PostDate , Description FROM transactions WHERE AccountNumber = ?";

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, accountNumber);
        while (results.next()) {
            Transaction transaction = mapRowToTransaction(results);
            transactions.add(transaction);
        }
        return transactions;
    }
    private Transaction mapRowToTransaction (SqlRowSet rs) {
        Transaction tr = new Transaction();
        tr.setId(rs.getInt("Id"));
        tr.setAccountNumber(rs.getLong("AccountNumber"));
        tr.setTransactionAmount(rs.getDouble("TransactionAmount"));
        tr.setPostDate(rs.getString("PostDate"));
        tr.setDescription(rs.getString("Description"));
        return tr;
    }
    }



