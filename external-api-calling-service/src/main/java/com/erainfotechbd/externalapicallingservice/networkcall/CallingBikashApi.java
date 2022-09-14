package com.erainfotechbd.externalapicallingservice.networkcall;

import com.eraifotechbd.encodeing.Decoder;
import com.erainfotechbd.externalapicallingservice.dto.BikashBillInfo;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
}
