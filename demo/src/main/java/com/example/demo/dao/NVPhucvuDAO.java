package com.example.demo.dao;

import com.example.demo.controller.Constant;
import com.example.demo.dto.PhongDTO;
import com.example.demo.dto.PhucvuDTO;
import com.example.demo.model.NVPhucvu;
import com.example.demo.model.Phong;
import com.example.demo.repository.NVPhucvuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class NVPhucvuDAO {
    @Autowired
    NVPhucvuRepository nvPhucvuRepository ;

    public Page<PhucvuDTO> searchNV(String value){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Object[]> nvs = nvPhucvuRepository.searchNV(value, pageable);
        Page<PhucvuDTO> pvs  = nvs.map(this::convertToPhucvuDto);
        return pvs;
    }

    private PhucvuDTO convertToPhucvuDto(Object[] p) {
        PhucvuDTO dto = new PhucvuDTO(p);
        return dto;
    }

    public Boolean updateStatusNV(int status, int id){
        NVPhucvu phucvu = nvPhucvuRepository.findById(id).get();
        if (phucvu!= null && Constant.STATUS.contains(status)){
            phucvu.setTrangthai(status);
            nvPhucvuRepository.save(phucvu);
            return true;
        }
        return false;
    }
}
