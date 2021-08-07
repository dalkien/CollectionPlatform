package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BillReferenceRequest {
    private Authentication aut;
    private String reference;
    private String agreement ;
}
