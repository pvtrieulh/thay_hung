package com.example.demo.repository;

import com.example.demo.model.KhunggioPhong;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KhunggioPhongRepository extends CrudRepository<KhunggioPhong, Integer> {
    @Query(value = "SELECT gio_batdau, gio_ketthuc, gia, p.id " +
            "FROM tbl_khunggio_phong kgp " +
            "JOIN tbl_khunggio kg on kg.id = kgp.tbl_khunggioid " +
            "JOIN tbl_phong p on p.id = kgp.tbl_phongid " +
            "WHERE kg.gio_batdau >= :start " +
            "AND kg.gio_ketthuc <= :end " +
            "AND p.id in :id_phong " +
            "ORDER BY gio_batdau" +
            "",
            nativeQuery = true)
    List<Object[]> getKhunggioPhong(@Param("start") int start, @Param("end") int end, @Param("id_phong") int[] id_phong);
}
