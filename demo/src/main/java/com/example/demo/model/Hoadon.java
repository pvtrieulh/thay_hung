package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblHoadon")
@Getter
@Setter
public class Hoadon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int tblPhongid;
    private int tblKhachHangid;
    private int tblNVPhucvuNhanvienid;
    private int tblNVPhucvuNhanvienid2;

    public void setTblPhongid(int tblPhongid) {
        this.tblPhongid = tblPhongid;
    }

    public void setTblKhachHangid(int tblKhachHangid) {
        this.tblKhachHangid = tblKhachHangid;
    }

    public void setTblNVPhucvuNhanvienid(int tblNVPhucvuNhanvienid) {
        this.tblNVPhucvuNhanvienid = tblNVPhucvuNhanvienid;
    }

    public void setTblNVPhucvuNhanvienid2(int tblNVPhucvuNhanvienid2) {
        this.tblNVPhucvuNhanvienid2 = tblNVPhucvuNhanvienid2;
    }
}
