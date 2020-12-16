package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="tblKhunggio")
@Getter
@Setter
class Khunggio{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private int gio_batdau;
    private int gio_ketthuc;
}