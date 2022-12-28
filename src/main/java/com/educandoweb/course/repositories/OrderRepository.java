package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	// Apenas para extender o JPARepository que vai ser benefico para quem implementar essa interface
	// Faremos manipulações no banco de users com essa interface
}
