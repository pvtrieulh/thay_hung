package com.example.demo.dao;

import com.example.demo.controller.Constant;
import com.example.demo.dto.PhongDTO;
import com.example.demo.model.Phong;
import com.example.demo.repository.PhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhongDAO {
    @Autowired
    PhongRepository phongRepository ;

    public Page<PhongDTO> searchPhong(String value){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Object[]> phongs = phongRepository.searchPhong(value, pageable);
        Page<PhongDTO> dtos  = phongs.map(this::convertToPhongDto);
        return dtos;
    }

    private PhongDTO convertToPhongDto(Object[] p) {
        PhongDTO dto = new PhongDTO(p);
        return dto;
    }

    public Boolean updateStatusPhong(int status, int id){
        Phong phong = phongRepository.findById(id).get();
        if (phong!= null && Constant.STATUS.contains(status)){
            phong.setTrangthai(status);
            phongRepository.save(phong);
            return true;
        }
        return false;
    }
}
