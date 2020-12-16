package com.example.demo.repository;

import com.example.demo.model.NVPhucvu;
import com.example.demo.model.Phong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NVPhucvuRepository extends CrudRepository<NVPhucvu, Integer> {
    @Query(
            value = "SELECT nv.id, nv.manv, nv.ten, nv.ngay_sinh, nv.trangthai, 0 " +
                    "FROM tblnvphucvu nv" +
                    "WHERE nv.ten LIKE :value " +
                    "AND nv.trangthai = 0",
            nativeQuery = true)
    Page<Object[]> searchNV(@Param("value") String value, Pageable pageable);
}