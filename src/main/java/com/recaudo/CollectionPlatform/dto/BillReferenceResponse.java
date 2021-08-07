package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class BillReferenceResponse {

    private String status;
    private String description;
    private BillInfo[] bills;

}
