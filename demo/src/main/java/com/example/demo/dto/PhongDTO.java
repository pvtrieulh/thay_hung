package com.example.demo.dto;

import com.example.demo.model.Phong;
import com.example.demo.model.Size;
import com.example.demo.model.Type;

import java.util.ArrayList;
import java.util.List;

public class PhongDTO {
    private Integer id;
    private String ma;
    private String ten;
    private String chuthich;
    private int trangthai;
    private Type type;
    private Size size;
    private List<KhunggioPhongDTO> gia;

    public PhongDTO(Object[] o) {
        int dem = 0;
        this.id = toInt(o[dem++]);
        this.ma = toStr(o[dem++]);
        this.ten = toStr(o[dem++]);
        this.chuthich = toStr(o[dem++]);
        this.trangthai = toInt(o[dem++]);
        this.type = new Type(
                toInt(o[dem++]),
                toStr(o[dem++]),
                toStr(o[dem++])
        );
        this.size = new Size(
                toInt(o[dem++]),
                toStr(o[dem++]),
                toStr(o[dem++])
        );
        gia = new ArrayList<>();
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<KhunggioPhongDTO> getGia() {
        return gia;
    }

    public void setGia(List<KhunggioPhongDTO> gia) {
        this.gia = gia;
    }
}
