package com.erainfotechbd.bikahservice.controller;


import com.erainfotechbd.bikahservice.entity.BikashBillInfo;
import com.erainfotechbd.bikahservice.repository.BikashBillInfoRepository;
import com.erainfotechbd.bikahservice.serviceimpl.BikashBillInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
