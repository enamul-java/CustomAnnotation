package com.erainfotechbd.externalapicallingservice.controller;


import com.erainfotechbd.externalapicallingservice.dto.BikashBillInfo;
import com.erainfotechbd.externalapicallingservice.networkcall.CallingBikashApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
