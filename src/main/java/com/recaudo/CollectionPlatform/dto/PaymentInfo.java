package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class PaymentInfo {
    private String reference   ;
    private double totalAmount ;
    private String date        ;
    private String receipt     ;
    private String franchise   ;
    private String channel     ;
    private String method      ;
    private double cashAmount  ;
    private CheckInfo checkInfo   ;
    private String payerID     ;
    private String agreement   ;
    private String agentID     ;
    private String location    ;
}
