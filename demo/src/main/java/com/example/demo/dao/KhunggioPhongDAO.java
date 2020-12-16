package com.example.demo.dao;

import com.example.demo.dto.KhunggioPhongDTO;
import com.example.demo.dto.PhongDTO;
import com.example.demo.model.KhunggioPhong;
import com.example.demo.repository.KhunggioPhongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KhunggioPhongDAO {
    @Autowired
    KhunggioPhongRepository khunggioPhongRepository;
    public void getKhunggioPhong(int gio_batdau, int gio_ketthuc, Page<PhongDTO> phong){
        int[] idPhong = new int[phong.getNumberOfElements()];
        int dem = 0;
        for (PhongDTO p: phong) idPhong[dem++] = p.getId();
        List<Object[]> list = khunggioPhongRepository.getKhunggioPhong(gio_batdau, gio_ketthuc, idPhong);
        List<KhunggioPhongDTO> gia = new ArrayList<>();
        for(Object[] o: list) gia.add(new KhunggioPhongDTO(o));
        for (PhongDTO p: phong){
            for (KhunggioPhongDTO g : gia){
                if (p.getId() == g.getId_phong()){
                    p.getGia().add(g);
                }
            }
        }
    }

}
