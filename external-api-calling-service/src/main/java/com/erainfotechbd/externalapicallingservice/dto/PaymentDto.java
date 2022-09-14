package com.erainfotechbd.externalapicallingservice.dto;


import com.erainfotechbd.annotations.Encrypt;
import com.erainfotechbd.annotations.EncryptedRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EncryptedRequest
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDto {

    public Long id;

    public String acNo;

    @Encrypt
    public String customerNo;

    @Encrypt
    public String email;

    public String amout;

}
