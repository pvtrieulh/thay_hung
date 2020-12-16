package com.example.demo.dao;

import com.example.demo.dto.KhachHangDTO;
import com.example.demo.model.KhachHang;
import com.example.demo.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class KhachhangDAO {
    @Autowired
    KhachHangRepository khachhangRepository;

    public Page<KhachHang> searchKhachhang(String value){
        Pageable pageable = PageRequest.of(0, 10, Sort.by("ten"));
        Page<KhachHang> khachHangs = khachhangRepository.searchKhachhang(value, pageable);
        return khachHangs;
    }

    public Boolean addKhachHang(KhachHangDTO khachHangDTO){
        try {
            KhachHang kh = new KhachHang(khachHangDTO);
            khachhangRepository.save(kh);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
