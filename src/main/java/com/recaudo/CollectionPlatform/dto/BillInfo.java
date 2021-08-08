package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BillInfo {

    private String reference       ;
    private String description     ;
    private String debtorID        ;
    private double totalAmount     ;
    private String debtorCode      ;
    private String debtorFirstName ;
    private String debtorLastname  ;

}
