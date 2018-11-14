package com.zerp.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zerp.models.Statement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-14T07:54:47.750Z[GMT]")

public class Transaction  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("transactionId")
  private BigDecimal transactionId = null;

  @JsonProperty("transactionType")
  private String transactionType = null;

  @JsonProperty("accountOwenerReference")
  private String accountOwenerReference = null;

  @JsonProperty("originatingBanksReference")
  private String originatingBanksReference = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("transactionDate")
  private OffsetDateTime transactionDate = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("statement")
  private Statement statement = null;

  public Transaction transactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(BigDecimal transactionId) {
    this.transactionId = transactionId;
  }

  public Transaction transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")


  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction accountOwenerReference(String accountOwenerReference) {
    this.accountOwenerReference = accountOwenerReference;
    return this;
  }

  /**
   * Get accountOwenerReference
   * @return accountOwenerReference
  **/
  @ApiModelProperty(value = "")


  public String getAccountOwenerReference() {
    return accountOwenerReference;
  }

  public void setAccountOwenerReference(String accountOwenerReference) {
    this.accountOwenerReference = accountOwenerReference;
  }

  public Transaction originatingBanksReference(String originatingBanksReference) {
    this.originatingBanksReference = originatingBanksReference;
    return this;
  }

  /**
   * Get originatingBanksReference
   * @return originatingBanksReference
  **/
  @ApiModelProperty(value = "")


  public String getOriginatingBanksReference() {
    return originatingBanksReference;
  }

  public void setOriginatingBanksReference(String originatingBanksReference) {
    this.originatingBanksReference = originatingBanksReference;
  }

  public Transaction description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Transaction transactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(OffsetDateTime transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Transaction statement(Statement statement) {
    this.statement = statement;
    return this;
  }

  /**
   * Get statement
   * @return statement
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Statement getStatement() {
    return statement;
  }

  public void setStatement(Statement statement) {
    this.statement = statement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionId, transaction.transactionId) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.accountOwenerReference, transaction.accountOwenerReference) &&
        Objects.equals(this.originatingBanksReference, transaction.originatingBanksReference) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.transactionDate, transaction.transactionDate) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.statement, transaction.statement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, transactionType, accountOwenerReference, originatingBanksReference, description, transactionDate, amount, statement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountOwenerReference: ").append(toIndentedString(accountOwenerReference)).append("\n");
    sb.append("    originatingBanksReference: ").append(toIndentedString(originatingBanksReference)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    statement: ").append(toIndentedString(statement)).append("\n");
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

