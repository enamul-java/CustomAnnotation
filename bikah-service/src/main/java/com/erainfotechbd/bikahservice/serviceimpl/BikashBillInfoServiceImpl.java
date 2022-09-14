package com.erainfotechbd.bikahservice.serviceimpl;

import com.eraifotechbd.encodeing.Encoder;
import com.erainfotechbd.bikahservice.entity.BikashBillInfo;
import com.erainfotechbd.bikahservice.repository.BikashBillInfoRepository;
import com.erainfotechbd.bikahservice.service.BikashBillInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BikashBillInfoServiceImpl implements BikashBillInfoService {

    @Autowired
    BikashBillInfoRepository bikashBillInfoRepository;

    @Override
    public BikashBillInfo getBillInfo(Long billId) {
        try {
            BikashBillInfo bikashBillInfo = bikashBillInfoRepository.findById(billId).get();
            //System.out.println(bikashBillInfo.toString());
            bikashBillInfo = (BikashBillInfo) new Encoder().encode(bikashBillInfo);

            return bikashBillInfo;
        }catch (Exception e){
            return null;
        }

    }
}
