package com.erainfotechbd.bikahservice.controller;


import com.eraifotechbd.encodeing.Decoder;
import com.erainfotechbd.bikahservice.dto.MyPaymentInfoReceiverPojo;
import com.erainfotechbd.bikahservice.entity.BikashBillInfo;
import com.erainfotechbd.bikahservice.serviceimpl.BikashBillInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bikash")
public class BillInfoController {

    @Autowired
    BikashBillInfoServiceImpl bikashBillInfoService;

    @GetMapping("/billinfo/{id}")
    public BikashBillInfo getBillInfo(@PathVariable("id") Long billId){
        System.out.println(""+billId);
        return bikashBillInfoService.getBillInfo(billId);
    }

    @PostMapping("/billinfo/pay")
    public Object payBill(@RequestBody MyPaymentInfoReceiverPojo data){
        System.out.println(" data: "+ data.toString());
        data = (MyPaymentInfoReceiverPojo) new Decoder().decodeFomObject(data);
        System.out.println(" data: "+ data.toString());
        return data;
    }
}
