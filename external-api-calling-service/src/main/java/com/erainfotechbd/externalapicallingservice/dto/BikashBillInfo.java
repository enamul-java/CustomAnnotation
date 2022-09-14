package com.erainfotechbd.externalapicallingservice.dto;


import com.erainfotechbd.annotations.Decrypt;
import com.erainfotechbd.annotations.Encrypt;
import com.erainfotechbd.annotations.EncryptedRequest;
import com.erainfotechbd.annotations.EncryptedResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EncryptedResponse
public class BikashBillInfo {

    @Id
    Long id;

    @Decrypt
    String accountNumber;

    String billDesc;

    @Decrypt
    String billAmount;

    @Decrypt(decryptType = "AES")
    String address;
}
