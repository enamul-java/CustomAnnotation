package com.erainfotechbd.externalapicallingservice.networkcall;

import com.eraifotechbd.encodeing.Decoder;
import com.erainfotechbd.externalapicallingservice.dto.BikashBillInfo;
import com.erainfotechbd.externalapicallingservice.dto.PaymentDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Component
public class CallingBikashApi {

    public BikashBillInfo getBillInfoFormBikash(Long id) {
        System.out.println("========== Calling Api==========");

        try {
        /*
        ResponseEntity<BikashBillInfo> responseEntity =
                new RestTemplate().getForEntity(
                        "http://localhost:8090/v1/bikash/billinfo/{"+id+"}", BikashBillInfo.class);
        */

            BikashBillInfo info = new RestTemplate().getForObject(
                    "http://localhost:8090/v1/bikash/billinfo/{id}",
                    BikashBillInfo.class, id);

            System.out.println(info.toString());

            info = (BikashBillInfo) new Decoder().decode(info);

            System.out.println(info.toString());
            return info;
        }catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }


    public PaymentDto payBill(Object object) {
        try{

            RestTemplate restTemplate = new RestTemplate();
            PaymentDto result = restTemplate.postForObject("http://localhost:8090/v1/bikash/billinfo/pay",
                    object,
                    PaymentDto.class);

            return result;
        }catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
