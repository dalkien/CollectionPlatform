package com.recaudo.CollectionPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.management.Attribute;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Authentication {
    private String login;
    private String tranKey;
    private String seed;
    private Attribute additional;

}
