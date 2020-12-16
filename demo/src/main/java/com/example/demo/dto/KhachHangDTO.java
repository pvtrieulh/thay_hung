package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KhachHangDTO {
    private Integer id;
    private String ten;
    private String ngaysinh;
    private String cmnd;

    public KhachHangDTO(String ten, String ngaysinh, String cmnd) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}
