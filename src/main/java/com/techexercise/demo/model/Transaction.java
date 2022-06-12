package com.techexercise.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
    private long $Id;
    private long accountNumber;
    private long id;
    private long idType;
    private long commentCode;
    private long transferCode;
    private long adjustmentCode;
    private long regECode;
    private long regDCheckCode;
    private long regDTransferCode;
    private long voidCode;
    private String subActionCode;
    private long sequenceNumber;
    private String effectiveDate;
    private String postDate;
    private long postTime;
    private double previousAvailableBalance;
    private long userNumber;
    private long userOverride;
    private long securityLevels;
    private String description;
    private String actionCode;
    private String sourceCode;
    private long balanceChange;
    private long interestPenalty;
    private double newBalance;
    private long feeAmount;
    private long escrowAmount;
    private String lastTranDate;
    private String maturityLoanDueDate;
    private String comment;
    private long branch;
    private long consoleNumber;
    private long batchSequence;
    private double salesTaxAmount;
    private String activityDate;
    private long billedFeeAmount;
    private long processorUser;
    private String memberBranch;
    private long subSourceCode;
    private long confirmationSequence;
    private long micrAccountNumber;
    private String micrRtNumber;
    private long recurring;
    private long feeExemptCourtesyAmount;
    private String balSeg001SegmentId;
    private String balSeg001PmtChangeDate;
    private String interestEffectiveDate;
    private String balSeg001PrevFirstPmtDate;
    private String draftNumber;
    private long tracerNumber;
    private String subSourceDescription;
    private double transactionAmount;
    private long confirmationNumber;


    public Transaction() {}

    public Transaction(long id , long accountNumber, Double transactionAmount , String postDate , String description ) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
        this.postDate = postDate;
        this.description = description;
    }

    public long get$Id() {
        return $Id;
    }

    public void set$Id(long $Id) {
        this.$Id = $Id;
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
    }


    public long getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(long commentCode) {
        this.commentCode = commentCode;
    }


    public long getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(long transferCode) {
        this.transferCode = transferCode;
    }


    public long getAdjustmentCode() {
        return adjustmentCode;
    }

    public void setAdjustmentCode(long adjustmentCode) {
        this.adjustmentCode = adjustmentCode;
    }


    public long getRegECode() {
        return regECode;
    }

    public void setRegECode(long regECode) {
        this.regECode = regECode;
    }


    public long getRegDCheckCode() {
        return regDCheckCode;
    }

    public void setRegDCheckCode(long regDCheckCode) {
        this.regDCheckCode = regDCheckCode;
    }


    public long getRegDTransferCode() {
        return regDTransferCode;
    }

    public void setRegDTransferCode(long regDTransferCode) {
        this.regDTransferCode = regDTransferCode;
    }


    public long getVoidCode() {
        return voidCode;
    }

    public void setVoidCode(long voidCode) {
        this.voidCode = voidCode;
    }


    public String getSubActionCode() {
        return subActionCode;
    }

    public void setSubActionCode(String subActionCode) {
        this.subActionCode = subActionCode;
    }


    public long getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }


    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }


    public long getPostTime() {
        return postTime;
    }

    public void setPostTime(long postTime) {
        this.postTime = postTime;
    }


    public double getPreviousAvailableBalance() {
        return previousAvailableBalance;
    }

    public void setPreviousAvailableBalance(double previousAvailableBalance) {
        this.previousAvailableBalance = previousAvailableBalance;
    }


    public long getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
    }


    public long getUserOverride() {
        return userOverride;
    }

    public void setUserOverride(long userOverride) {
        this.userOverride = userOverride;
    }


    public long getSecurityLevels() {
        return securityLevels;
    }

    public void setSecurityLevels(long securityLevels) {
        this.securityLevels = securityLevels;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }


    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }


    public long getBalanceChange() {
        return balanceChange;
    }

    public void setBalanceChange(long balanceChange) {
        this.balanceChange = balanceChange;
    }


    public long getInterestPenalty() {
        return interestPenalty;
    }

    public void setInterestPenalty(long interestPenalty) {
        this.interestPenalty = interestPenalty;
    }


    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }


    public long getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(long feeAmount) {
        this.feeAmount = feeAmount;
    }


    public long getEscrowAmount() {
        return escrowAmount;
    }

    public void setEscrowAmount(long escrowAmount) {
        this.escrowAmount = escrowAmount;
    }


    public String getLastTranDate() {
        return lastTranDate;
    }

    public void setLastTranDate(String lastTranDate) {
        this.lastTranDate = lastTranDate;
    }


    public String getMaturityLoanDueDate() {
        return maturityLoanDueDate;
    }

    public void setMaturityLoanDueDate(String maturityLoanDueDate) {
        this.maturityLoanDueDate = maturityLoanDueDate;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public long getBranch() {
        return branch;
    }

    public void setBranch(long branch) {
        this.branch = branch;
    }


    public long getConsoleNumber() {
        return consoleNumber;
    }

    public void setConsoleNumber(long consoleNumber) {
        this.consoleNumber = consoleNumber;
    }


    public long getBatchSequence() {
        return batchSequence;
    }

    public void setBatchSequence(long batchSequence) {
        this.batchSequence = batchSequence;
    }


    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }


    public String getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }


    public long getBilledFeeAmount() {
        return billedFeeAmount;
    }

    public void setBilledFeeAmount(long billedFeeAmount) {
        this.billedFeeAmount = billedFeeAmount;
    }


    public long getProcessorUser() {
        return processorUser;
    }

    public void setProcessorUser(long processorUser) {
        this.processorUser = processorUser;
    }


    public String getMemberBranch() {
        return memberBranch;
    }

    public void setMemberBranch(String memberBranch) {
        this.memberBranch = memberBranch;
    }


    public long getSubSourceCode() {
        return subSourceCode;
    }

    public void setSubSourceCode(long subSourceCode) {
        this.subSourceCode = subSourceCode;
    }


    public long getConfirmationSequence() {
        return confirmationSequence;
    }

    public void setConfirmationSequence(long confirmationSequence) {
        this.confirmationSequence = confirmationSequence;
    }


    public long getMicrAccountNumber() {
        return micrAccountNumber;
    }

    public void setMicrAccountNumber(long micrAccountNumber) {
        this.micrAccountNumber = micrAccountNumber;
    }


    public String getMicrRtNumber() {
        return micrRtNumber;
    }

    public void setMicrRtNumber(String micrRtNumber) {
        this.micrRtNumber = micrRtNumber;
    }


    public long getRecurring() {
        return recurring;
    }

    public void setRecurring(long recurring) {
        this.recurring = recurring;
    }


    public long getFeeExemptCourtesyAmount() {
        return feeExemptCourtesyAmount;
    }

    public void setFeeExemptCourtesyAmount(long feeExemptCourtesyAmount) {
        this.feeExemptCourtesyAmount = feeExemptCourtesyAmount;
    }


    public String getBalSeg001SegmentId() {
        return balSeg001SegmentId;
    }

    public void setBalSeg001SegmentId(String balSeg001SegmentId) {
        this.balSeg001SegmentId = balSeg001SegmentId;
    }


    public String getBalSeg001PmtChangeDate() {
        return balSeg001PmtChangeDate;
    }

    public void setBalSeg001PmtChangeDate(String balSeg001PmtChangeDate) {
        this.balSeg001PmtChangeDate = balSeg001PmtChangeDate;
    }


    public String getInterestEffectiveDate() {
        return interestEffectiveDate;
    }

    public void setInterestEffectiveDate(String interestEffectiveDate) {
        this.interestEffectiveDate = interestEffectiveDate;
    }


    public String getBalSeg001PrevFirstPmtDate() {
        return balSeg001PrevFirstPmtDate;
    }

    public void setBalSeg001PrevFirstPmtDate(String balSeg001PrevFirstPmtDate) {
        this.balSeg001PrevFirstPmtDate = balSeg001PrevFirstPmtDate;
    }


    public String getDraftNumber() {
        return draftNumber;
    }

    public void setDraftNumber(String draftNumber) {
        this.draftNumber = draftNumber;
    }


    public long getTracerNumber() {
        return tracerNumber;
    }

    public void setTracerNumber(long tracerNumber) {
        this.tracerNumber = tracerNumber;
    }


    public String getSubSourceDescription() {
        return subSourceDescription;
    }

    public void setSubSourceDescription(String subSourceDescription) {
        this.subSourceDescription = subSourceDescription;
    }


    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    public long getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(long confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "$Id=" + $Id +
                ", accountNumber=" + accountNumber +
                ", id=" + id +
                ", idType=" + idType +
                ", commentCode=" + commentCode +
                ", transferCode=" + transferCode +
                ", adjustmentCode=" + adjustmentCode +
                ", regECode=" + regECode +
                ", regDCheckCode=" + regDCheckCode +
                ", regDTransferCode=" + regDTransferCode +
                ", voidCode=" + voidCode +
                ", subActionCode='" + subActionCode + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", postDate='" + postDate + '\'' +
                ", postTime=" + postTime +
                ", previousAvailableBalance=" + previousAvailableBalance +
                ", userNumber=" + userNumber +
                ", userOverride=" + userOverride +
                ", securityLevels=" + securityLevels +
                ", description='" + description + '\'' +
                ", actionCode='" + actionCode + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                ", balanceChange=" + balanceChange +
                ", interestPenalty=" + interestPenalty +
                ", newBalance=" + newBalance +
                ", feeAmount=" + feeAmount +
                ", escrowAmount=" + escrowAmount +
                ", lastTranDate='" + lastTranDate + '\'' +
                ", maturityLoanDueDate='" + maturityLoanDueDate + '\'' +
                ", comment='" + comment + '\'' +
                ", branch=" + branch +
                ", consoleNumber=" + consoleNumber +
                ", batchSequence=" + batchSequence +
                ", salesTaxAmount=" + salesTaxAmount +
                ", activityDate='" + activityDate + '\'' +
                ", billedFeeAmount=" + billedFeeAmount +
                ", processorUser=" + processorUser +
                ", memberBranch='" + memberBranch + '\'' +
                ", subSourceCode=" + subSourceCode +
                ", confirmationSequence=" + confirmationSequence +
                ", micrAccountNumber=" + micrAccountNumber +
                ", micrRtNumber='" + micrRtNumber + '\'' +
                ", recurring=" + recurring +
                ", feeExemptCourtesyAmount=" + feeExemptCourtesyAmount +
                ", balSeg001SegmentId='" + balSeg001SegmentId + '\'' +
                ", balSeg001PmtChangeDate='" + balSeg001PmtChangeDate + '\'' +
                ", interestEffectiveDate='" + interestEffectiveDate + '\'' +
                ", balSeg001PrevFirstPmtDate='" + balSeg001PrevFirstPmtDate + '\'' +
                ", draftNumber='" + draftNumber + '\'' +
                ", tracerNumber=" + tracerNumber +
                ", subSourceDescription='" + subSourceDescription + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", confirmationNumber=" + confirmationNumber +
                '}';
    }
}
