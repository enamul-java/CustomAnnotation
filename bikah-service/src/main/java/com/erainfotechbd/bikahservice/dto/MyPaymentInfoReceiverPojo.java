package com.erainfotechbd.bikahservice.dto;


import com.erainfotechbd.annotations.Decrypt;
import com.erainfotechbd.annotations.Encrypt;
import com.erainfotechbd.annotations.EncryptedRequest;
import com.erainfotechbd.annotations.EncryptedResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EncryptedRequest
@AllArgsConstructor
@NoArgsConstructor
@Data
@EncryptedResponse
public class MyPaymentInfoReceiverPojo {

    public Long id;

    public String acNo;

    public String customerNo;

    public String email;

    public String amout;

}
