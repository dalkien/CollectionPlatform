package com.recaudo.CollectionPlatform.endpoint;

import com.recaudo.CollectionPlatform.dto.BillReferenceRequest;
import com.recaudo.CollectionPlatform.dto.BillReferenceResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class BillByReferenceEndpoint {
    private static  final  String NAME_SPACE_URI = "";

    @PayloadRoot(namespace = NAME_SPACE_URI, localPart = "getBillByReference")
    @ResponsePayload
    public BillReferenceResponse getBill(@RequestPayload BillReferenceRequest request){
        BillReferenceResponse response = new BillReferenceResponse();
        return response;
    }

}
