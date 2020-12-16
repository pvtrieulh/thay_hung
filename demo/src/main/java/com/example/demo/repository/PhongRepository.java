package com.example.demo.repository;

import com.example.demo.model.Phong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PhongRepository extends CrudRepository<Phong, Integer> {
    @Query(
            value = "SELECT p.id pid, p.ma, p.ten pten, p.chuthich, p.trangthai, " +
                    "type.id tid, type.ten tten, type.mota tmota, " +
                    "size.id sid, size.ten sten, size.mota smota " +
                    "FROM tbl_phong p " +
                    "LEFT JOIN tbl_type type ON type.id = p.tbl_type_id " +
                    "LEFT JOIN tbl_size size ON size.id = p.tbl_sizeid " +
                    "WHERE p.ten LIKE %:value% " +
                    "AND p.trangthai = 0",
            nativeQuery = true)
    Page<Object[]> searchPhong(@Param("value") String value, Pageable pageable);
}