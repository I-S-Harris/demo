package com.techexercise.demo;


import com.techexercise.demo.dao.TransactionDao;
import com.techexercise.demo.model.Transaction;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {


    private TransactionDao transactionDao;

    public TransactionController(TransactionDao transactionDao){
        this.transactionDao = transactionDao;
    }

    @RequestMapping(path = "/{id}" , method = RequestMethod.GET)
    public Transaction get(@PathVariable long id){return transactionDao.get(id);}

    @RequestMapping(path = "/account/{accountNumber}" )
    public List<Transaction> list(@PathVariable long accountNumber){
        List<Transaction> listAllTransactions = transactionDao.list(accountNumber);
        return listAllTransactions;
    }


}