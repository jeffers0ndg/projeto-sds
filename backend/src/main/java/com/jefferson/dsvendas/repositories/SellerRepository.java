package com.jefferson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}