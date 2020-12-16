package com.example.demo.dto;

public class KhunggioPhongDTO {
    private int gio_batdau;
    private int gio_ketthuc;
    private double gia;
    private int id_phong;

    public KhunggioPhongDTO(Object[] o) {
        this.gio_batdau = Integer.parseInt(String.valueOf(o[0]));
        this.gio_ketthuc = Integer.parseInt(String.valueOf(o[1]));
        this.gia = Double.parseDouble(String.valueOf(o[2]));
        this.id_phong = Integer.parseInt(String.valueOf(o[3]));
    }

    public int getGio_batdau() {
        return gio_batdau;
    }

    public void setGio_batdau(int gio_batdau) {
        this.gio_batdau = gio_batdau;
    }

    public int getGio_ketthuc() {
        return gio_ketthuc;
    }

    public void setGio_ketthuc(int gio_ketthuc) {
        this.gio_ketthuc = gio_ketthuc;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getId_phong() {
        return id_phong;
    }

    public void setId_phong(int id_phong) {
        this.id_phong = id_phong;
    }
}
