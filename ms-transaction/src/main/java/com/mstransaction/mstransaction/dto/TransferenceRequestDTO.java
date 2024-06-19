package com.mstransaction.mstransaction.dto;

import com.mstransaction.mstransaction.domain.enumTypes.ReceiptCurrency;
import com.mstransaction.mstransaction.domain.enumTypes.ShippingCurrency;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferenceRequestDTO {

    private ShippingCurrency shippingCurrency;
    private ReceiptCurrency receiptCurrency;
    private BigDecimal transferValue;
    private BigDecimal rate; //todo: make decimal fired in proceessTransference
    private String sourceAccountNumber;
    private String destinationAccountNumber;


}

