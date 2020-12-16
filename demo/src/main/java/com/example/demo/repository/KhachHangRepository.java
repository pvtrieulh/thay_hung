package com.example.demo.repository;

import com.example.demo.model.Phong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.KhachHang;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface KhachHangRepository extends CrudRepository<KhachHang, Integer> {
    @Query(
            value = "SELECT * FROM tbl_khachhang p WHERE p.ten LIKE %:value% or " +
                    "p.ngaysinh LIKE %:value% or p.cmnd LIKE %:value%",
            nativeQuery = true)
    Page<KhachHang> searchKhachhang(@Param("value") String value, Pageable pageable);
}