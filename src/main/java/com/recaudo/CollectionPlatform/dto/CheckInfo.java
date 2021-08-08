package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class CheckInfo {
    private String  number       ;
    private String  bank         ;
    private double  amount       ;
    private String  exchange     ;
}
