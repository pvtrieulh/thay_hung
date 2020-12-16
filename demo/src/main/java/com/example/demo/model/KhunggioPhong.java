package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblKhunggioPhong")
@Getter
@Setter
public class KhunggioPhong {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private double gia;
    private int tblKhunggioid;
    private int tblPhongid;
}
