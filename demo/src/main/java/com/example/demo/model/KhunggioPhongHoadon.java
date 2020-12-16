package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblKhunggioPhongHoadon")
@Getter
@Setter
public class KhunggioPhongHoadon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int tblKhunggioPhongid;
    private int tblHoadonid;

    public KhunggioPhongHoadon(int id, int tblKhunggioPhongid, int tblHoadonid) {
        this.id = id;
        this.tblKhunggioPhongid = tblKhunggioPhongid;
        this.tblHoadonid = tblHoadonid;
    }
}
