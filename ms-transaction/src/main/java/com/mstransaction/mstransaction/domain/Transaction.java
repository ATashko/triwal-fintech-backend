package com.mstransaction.mstransaction.domain;

import com.mstransaction.mstransaction.domain.enumTypes.MethodOfPayment;
import com.mstransaction.mstransaction.domain.enumTypes.ReceiptCurrency;
import com.mstransaction.mstransaction.domain.enumTypes.ShippingCurrency;
import com.mstransaction.mstransaction.domain.enumTypes.TransferType;
import jakarta.persistence.*;

import lombok.*;

import java.util.Date;

@Data
@Entity
@Table(name = "transactions")
public class Transaction  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Enumerated(EnumType.STRING)
    @Column(name = "shipping_currency")
    private ShippingCurrency shippingCurrency;

    @Enumerated(EnumType.STRING)
    @Column(name = "receipt_currency")
    private ReceiptCurrency receiptCurrency;

    @Column(name = "value_to_transfer")
    private float valueToTransfer;

    @Column(name = "rate")
    private float rate;

    @Column(name = "rate_value")
    private float rateValue;

    @Column(name = "transaction_total")
    private float transactionTotal;

    @Column(name = "converted_transaction_total")
    private float convertedTransactionTotal;

    @Enumerated(EnumType.STRING)
    @Column(name = "method_of_payment")
    private MethodOfPayment methodOfPayment;

    @Enumerated(EnumType.STRING)
    @Column(name = "transfer_type")
    private TransferType transferType;

    @Column(name = "name_of_recipient", length = 50)
    private String nameOfRecipient;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "user_id",length = 36)
    private String userId;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "transaction_details", length = 255)
    private String transactionDetails;

    @Column(name = "account_number")
    private String accountNumber;

}
