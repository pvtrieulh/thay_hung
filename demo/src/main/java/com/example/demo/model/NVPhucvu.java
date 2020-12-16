package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblNVPhucvu")
@Getter
@Setter
public class NVPhucvu{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String maNV;
    private String username;
    private String password;
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private String email;
    private String sdt;
    private String vaitro;
    private int trangthai;

    public NVPhucvu() {
    }

    public NVPhucvu(int id, String maNV, String username, String password, String ten, String ngaySinh, String diaChi, String email, String sdt, String vaitro, int trangthai) {
        this.id = id;
        this.maNV = maNV;
        this.username = username;
        this.password = password;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.email = email;
        this.sdt = sdt;
        this.vaitro = vaitro;
        this.trangthai = trangthai;
    }

    public int getTrangthai() {
        return trangthai;
    }
    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }


}