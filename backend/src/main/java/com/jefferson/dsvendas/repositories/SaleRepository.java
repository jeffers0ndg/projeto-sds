package com.jefferson.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jefferson.dsvendas.dto.SaleSuccessDTO;
import com.jefferson.dsvendas.dto.SaleSumDTO;
import com.jefferson.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.jefferson.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupeBySeller();
	
	@Query("SELECT new com.jefferson.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), "
			+ "SUM(obj.deals)) FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupeBySeller();

}