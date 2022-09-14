package com.erainfotechbd.externalapicallingservice.controller;


import com.eraifotechbd.encodeing.Encoder;
import com.erainfotechbd.externalapicallingservice.dto.BikashBillInfo;
import com.erainfotechbd.externalapicallingservice.dto.PaymentDto;
import com.erainfotechbd.externalapicallingservice.networkcall.CallingBikashApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/apicalling")
public class BikashApiCallingController {

    @Autowired
    CallingBikashApi callingBikashApi;

    @GetMapping("/billinfo/{id}")
    public BikashBillInfo getBillInfo(@PathVariable("id") Long id){
        System.out.println(id+"");
        return callingBikashApi.getBillInfoFormBikash(id);
    }

    @PostMapping("/billinfo/pay")
    public PaymentDto payBill(@RequestBody PaymentDto billInfo){
        System.out.println(" data: "+ billInfo.toString());
        billInfo = (PaymentDto) new Encoder().encodeAsObject(billInfo);
        System.out.println(" data: "+ billInfo.toString());

        return callingBikashApi.payBill(billInfo);
    }
}
