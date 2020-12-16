package com.example.demo.controller;

import com.example.demo.dao.KhachhangDAO;
import com.example.demo.dto.KhachHangDTO;
import com.example.demo.model.KhachHang;
import com.example.demo.model.Phong;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("khach-hang")
public class KhachHangController {
    @Autowired
    KhachHangRepository khachhangRepository;
    @Autowired
    KhachhangDAO khachhangDAO;

    @PostMapping("/add")
    public ResponseEntity<KhachHang> addKhachHang(@RequestBody KhachHangDTO khachHang){
        Boolean check = khachhangDAO.addKhachHang(khachHang);
        if (check) return new ResponseEntity("Success", HttpStatus.ACCEPTED);
        else return new ResponseEntity("Fail", HttpStatus.BAD_REQUEST);
    }
    @GetMapping("/search")
    public ResponseEntity<KhachHang> searchKhachhang(@RequestParam String value){
        return new ResponseEntity(khachhangDAO.searchKhachhang(value), HttpStatus.OK);
    }
}