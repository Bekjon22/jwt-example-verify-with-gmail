package com.example.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author Bekjon Bakhromov
 * @created 23.02.2022-2:21 PM
 */
@Getter
@Setter
public class LoginDto {
    @NotNull
    @Email
    private String username;

    @NotNull
    private String password;
}
