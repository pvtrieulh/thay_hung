package com.example.demo.controller;

import com.example.demo.dao.NVPhucvuDAO;
import com.example.demo.model.NVPhucvu;
import com.example.demo.repository.NVPhucvuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/phucvu")
public class NVPhucvuController {
    @Autowired
    NVPhucvuRepository nvPhucvuRepository;
    @Autowired
    NVPhucvuDAO nvPhucvuDAO;

//    @PostMapping("/add")
//    public ResponseEntity<NVPhucvu> addNV(
//            @RequestParam String ten,
//            @RequestParam String ma){
//        NVPhucvu nv = new NVPhucvu();
//        nv.setTen(ten);
//        nv.setMaNV(ma);
//        nvPhucvuRepository.save(nv);
//        return new ResponseEntity(nv, HttpStatus.ACCEPTED);
//    }

    @GetMapping("/search")
    public ResponseEntity<NVPhucvu> searchNV(@RequestParam String value){
        return new ResponseEntity(nvPhucvuDAO.searchNV(value), HttpStatus.OK);
    }



}
