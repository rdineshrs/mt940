package com.zerp.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zerp.models.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Statement
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-14T07:54:47.750Z[GMT]")

public class Statement  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("statementId")
  private BigDecimal statementId = null;

  @JsonProperty("bankStatementId")
  private String bankStatementId = null;

  @JsonProperty("openingDate")
  private OffsetDateTime openingDate = null;

  @JsonProperty("closingDate")
  private OffsetDateTime closingDate = null;

  @JsonProperty("openingBalance")
  private Double openingBalance = null;

  @JsonProperty("closingBalance")
  private Double closingBalance = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("readStatus")
  private Boolean readStatus = null;

  @JsonProperty("readDate")
  private OffsetDateTime readDate = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = null;

  public Statement statementId(BigDecimal statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Get statementId
   * @return statementId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getStatementId() {
    return statementId;
  }

  public void setStatementId(BigDecimal statementId) {
    this.statementId = statementId;
  }

  public Statement bankStatementId(String bankStatementId) {
    this.bankStatementId = bankStatementId;
    return this;
  }

  /**
   * Get bankStatementId
   * @return bankStatementId
  **/
  @ApiModelProperty(value = "")


  public String getBankStatementId() {
    return bankStatementId;
  }

  public void setBankStatementId(String bankStatementId) {
    this.bankStatementId = bankStatementId;
  }

  public Statement openingDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Get openingDate
   * @return openingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(OffsetDateTime openingDate) {
    this.openingDate = openingDate;
  }

  public Statement closingDate(OffsetDateTime closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Get closingDate
   * @return closingDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(OffsetDateTime closingDate) {
    this.closingDate = closingDate;
  }

  public Statement openingBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
    return this;
  }

  /**
   * Get openingBalance
   * @return openingBalance
  **/
  @ApiModelProperty(value = "")


  public Double getOpeningBalance() {
    return openingBalance;
  }

  public void setOpeningBalance(Double openingBalance) {
    this.openingBalance = openingBalance;
  }

  public Statement closingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
    return this;
  }

  /**
   * Get closingBalance
   * @return closingBalance
  **/
  @ApiModelProperty(value = "")


  public Double getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(Double closingBalance) {
    this.closingBalance = closingBalance;
  }

  public Statement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Statement fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Statement readStatus(Boolean readStatus) {
    this.readStatus = readStatus;
    return this;
  }

  /**
   * Get readStatus
   * @return readStatus
  **/
  @ApiModelProperty(value = "")


  public Boolean isReadStatus() {
    return readStatus;
  }

  public void setReadStatus(Boolean readStatus) {
    this.readStatus = readStatus;
  }

  public Statement readDate(OffsetDateTime readDate) {
    this.readDate = readDate;
    return this;
  }

  /**
   * Get readDate
   * @return readDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getReadDate() {
    return readDate;
  }

  public void setReadDate(OffsetDateTime readDate) {
    this.readDate = readDate;
  }

  public Statement transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public Statement addTransactionsItem(Transaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statement statement = (Statement) o;
    return Objects.equals(this.statementId, statement.statementId) &&
        Objects.equals(this.bankStatementId, statement.bankStatementId) &&
        Objects.equals(this.openingDate, statement.openingDate) &&
        Objects.equals(this.closingDate, statement.closingDate) &&
        Objects.equals(this.openingBalance, statement.openingBalance) &&
        Objects.equals(this.closingBalance, statement.closingBalance) &&
        Objects.equals(this.accountNumber, statement.accountNumber) &&
        Objects.equals(this.fileName, statement.fileName) &&
        Objects.equals(this.readStatus, statement.readStatus) &&
        Objects.equals(this.readDate, statement.readDate) &&
        Objects.equals(this.transactions, statement.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statementId, bankStatementId, openingDate, closingDate, openingBalance, closingBalance, accountNumber, fileName, readStatus, readDate, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statement {\n");
    
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    bankStatementId: ").append(toIndentedString(bankStatementId)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    openingBalance: ").append(toIndentedString(openingBalance)).append("\n");
    sb.append("    closingBalance: ").append(toIndentedString(closingBalance)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    readStatus: ").append(toIndentedString(readStatus)).append("\n");
    sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

