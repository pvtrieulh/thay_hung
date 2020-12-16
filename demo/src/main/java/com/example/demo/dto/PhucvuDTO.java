package com.example.demo.dto;

public class PhucvuDTO {
    private int id;
    private String maNV;
    private String ten;
    private String ngaySinh;
    private int trangthai;
    private int gio_lam;

    public PhucvuDTO(Object[] o) {
        int dem = 0;
        this.id = toInt(o[dem++]);
        this.maNV = toStr(o[dem++]);
        this.ten = toStr(o[dem++]);
        this.ngaySinh = toStr(o[dem++]);
        this.trangthai = toInt(o[dem++]);
    }

    int toInt(Object o){
        return o == null ? 0 : Integer.parseInt(String.valueOf(o));
    }
    String toStr(Object o){
        return o != null ? String.valueOf(o) : "";
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

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getGio_lam() {
        return gio_lam;
    }

    public void setGio_lam(int gio_lam) {
        this.gio_lam = gio_lam;
    }
}
