package com.example.demo.controller;

import com.example.demo.model.Hoadon;
import com.example.demo.model.KhachHang;
import com.example.demo.repository.PhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hoadon")
public class HoadonController {
//    @Autowired
//    PhongRepository phongRepository ;
//
//    @PostMapping("/add")
//    public ResponseEntity<KhachHang> addHoadon(
//            @RequestParam int phong,
//            @RequestParam int khach,
//            @RequestParam int nv1,
//            @RequestParam int nv2
//            ){
//        Hoadon hoadon = new Hoadon();
//        hoadon.setTblPhongid(phong);
//        hoadon.setTblKhachHangid(khach);
//        hoadon.setTblNVPhucvuNhanvienid(nv1);
//        hoadon.setTblNVPhucvuNhanvienid2(nv2);
//        // add khunggiohoadon
//        // set status nhan vien
//        //set status Phong
//        return new ResponseEntity(phong, HttpStatus.ACCEPTED);
//    }

}
