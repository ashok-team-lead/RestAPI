package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entites.VikasInfo;

@Repository
public interface VikasRepository extends JpaRepository<VikasInfo, Integer> {

}
