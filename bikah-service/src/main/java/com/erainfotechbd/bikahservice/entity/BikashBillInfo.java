package com.erainfotechbd.bikahservice.entity;


import com.erainfotechbd.annotations.Encrypt;
import com.erainfotechbd.annotations.EncryptedRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EncryptedRequest
public class BikashBillInfo {

    @Id
    Long id;

    @Encrypt
    String accountNumber;

    String billDesc;

    //@Encrypt
    String billAmount;

    @Encrypt(encryptType = "AES")
    String address;
}
