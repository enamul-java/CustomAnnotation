package com.erainfotechbd.bikahservice.repository;

import com.erainfotechbd.bikahservice.entity.BikashBillInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface BikashBillInfoRepository extends JpaRepository<BikashBillInfo, Long> {
}
