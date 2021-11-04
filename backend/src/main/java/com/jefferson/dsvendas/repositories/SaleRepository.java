package com.jefferson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefferson.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}