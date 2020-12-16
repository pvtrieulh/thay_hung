package com.example.demo.dao;

import com.example.demo.model.Hoadon;
import com.example.demo.repository.HoadonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.demo.controller.Constant.BUSY;

@Service
public class HoadonDAO{
    @Autowired
    HoadonRepository hoadonRepository;
    @Autowired
    NVPhucvuDAO nvPhucvuDAO;
    @Autowired
    PhongDAO phongDAO;
    public boolean addHoadon(int khach, int phong, int phucvu1, int phucvu2){
        Hoadon hoadon = new Hoadon();
        hoadon.setTblPhongid(phong);
        hoadon.setTblKhachHangid(khach);
        hoadon.setTblNVPhucvuNhanvienid(phucvu1);
        hoadon.setTblNVPhucvuNhanvienid2(phucvu2);
        hoadonRepository.save(hoadon);
        nvPhucvuDAO.updateStatusNV(BUSY,phucvu1);
        nvPhucvuDAO.updateStatusNV(BUSY,phucvu2);
        phongDAO.updateStatusPhong(BUSY, phong);
        return true;
    }
}
