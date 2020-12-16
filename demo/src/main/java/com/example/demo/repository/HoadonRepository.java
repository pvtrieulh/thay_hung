package com.example.demo.repository;

import com.example.demo.model.Hoadon;
import com.example.demo.model.Phong;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HoadonRepository extends CrudRepository<Hoadon, Integer> {
}