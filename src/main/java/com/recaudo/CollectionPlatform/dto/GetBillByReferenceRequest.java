package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.xml.bind.annotation.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "aut",
        "reference",
        "agreement"
})
@XmlRootElement(name = "getBillByReferenceRequest")
public class GetBillByReferenceRequest {
    private Authentication aut;
    private String reference;
    private String agreement ;
}
