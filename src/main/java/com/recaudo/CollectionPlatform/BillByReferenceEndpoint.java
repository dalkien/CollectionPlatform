package com.recaudo.CollectionPlatform;

import com.recaudo.CollectionPlatform.dto.GetBillByReferenceRequest;
import com.recaudo.CollectionPlatform.dto.GetBillByReferenceResponse;
import com.recaudo.CollectionPlatform.dto.SettlerPaymentRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;


@Endpoint
public class BillByReferenceEndpoint {
    private static  final  String NAME_SPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAME_SPACE_URI, localPart = "getBillByReferenceRequest")
    @ResponsePayload
    public JAXBElement<GetBillByReferenceResponse> getBill(@RequestPayload JAXBElement<GetBillByReferenceRequest> request){
        System.out.println(request);

        JAXBElement<GetBillByReferenceResponse> response = null;
        return response;
    }

    @PayloadRoot(namespace = NAME_SPACE_URI, localPart = "settlerPaymentRequest")
    @ResponsePayload
    public JAXBElement<GetBillByReferenceResponse> makePayment(@RequestPayload SettlerPaymentRequest request){
        System.out.println(request);
        JAXBElement<GetBillByReferenceResponse> response = null;
        return response;
    }
}
