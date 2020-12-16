package com.example.demo.controller;

import com.example.demo.dao.KhunggioPhongDAO;
import com.example.demo.dao.PhongDAO;
import com.example.demo.dto.PhongDTO;
import com.example.demo.model.KhachHang;
import com.example.demo.model.Phong;
import com.example.demo.repository.PhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/phong")
public class PhongController {
    @Autowired
    PhongRepository phongRepository ;
    @Autowired
    PhongDAO phongDAO;
    @Autowired
    KhunggioPhongDAO khunggioPhongDAO;

//    @PostMapping("/add")
//    public ResponseEntity<KhachHang> addPhong(
//            @RequestParam String ten,
//            @RequestParam String ma,
//            @RequestParam String chuthich,
//            @RequestParam int trangthai){
//        Phong phong = new Phong();
//        phong.setTen(ten);
//        phong.setMa(ma);
//        phong.setChuthich(chuthich);
//        phong.setTrangthai(trangthai);
//        phongRepository.save(phong);
//        return new ResponseEntity(phong, HttpStatus.ACCEPTED);
//    }

    @GetMapping("/search")
    public ResponseEntity<Phong> searchPhong(
            @RequestParam String value,
            @RequestParam(defaultValue = "0", required = false) int batdau,
            @RequestParam(defaultValue = "24", required = false) int ketthuc){
        Page<PhongDTO> phong = phongDAO.searchPhong(value);
        khunggioPhongDAO.getKhunggioPhong(batdau,ketthuc,phong);
        return new ResponseEntity(phong, HttpStatus.OK);
    }
}
