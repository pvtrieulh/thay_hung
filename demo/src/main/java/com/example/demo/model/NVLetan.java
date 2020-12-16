package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="tblNVLetan")
class NVLetan {
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
    private boolean trangthai;

    public NVLetan(int id, String maNV, String username, String password, String ten, String ngaySinh, String diaChi, String email, String sdt, String vaitro, boolean trangthai) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
}