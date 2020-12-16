package com.example.demo.model;
import javax.persistence.*;
// @EnableAutoConfiguration // This tells Hibernate to make a table out of this class
import com.example.demo.dto.KhachHangDTO;
import lombok.*;

@Entity
@Table(name="tblKhachhang")
@Getter
@Setter

public class KhachHang {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String ten;

  private String ngaysinh;
  @Column(unique = true)
  private String cmnd;

  public KhachHang() {
  }

  public KhachHang(KhachHangDTO kh) {
    this.ten = kh.getTen();
    this.ngaysinh = kh.getNgaysinh();
    this.cmnd = kh.getCmnd();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public void setNgaysinh(String ngaysinh) {
    this.ngaysinh = ngaysinh;
  }

  public void setCmnd(String cmnd) {
    this.cmnd = cmnd;
  }

  public String getNgaysinh() {
    return ngaysinh;
  }

  public String getCmnd() {
    return cmnd;
  }
}