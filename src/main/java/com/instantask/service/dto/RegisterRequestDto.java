package com.instantask.service.dto;

/**
 * DTO for user registration request.
 * Fields: name, email, tel, password
 */
public class RegisterRequestDto {

    private String name;
    private String email;
    private String tel;
    private String password;

    public RegisterRequestDto() {
    }

    public RegisterRequestDto(String name, String email, String tel, String password) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.password = password;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
