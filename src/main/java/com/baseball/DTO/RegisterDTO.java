package com.baseball.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RegisterDTO {
    public String id;
    public String password;
    public String name;
    public String email;
    public String phone;
    public String address;
}
