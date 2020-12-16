package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblPhong")
@Getter
@Setter
public class Phong {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String ma;
    private String ten;
    private String chuthich;
    private int trangthai;
//    @OneToOne@JoinColumn(name="tblSize_id")
    private int tblSizeid;
//    @OneToOne @JoinColumn(name="tblType_id")
    private int tblTypeId;

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
}
