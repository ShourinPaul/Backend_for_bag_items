package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Bags;

public interface BagDao extends JpaRepository<Bags,Long>{

}
