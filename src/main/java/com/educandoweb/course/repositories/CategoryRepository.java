package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Apenas para extender o JPARepository que vai ser benefico para quem implementar essa interface
	// Faremos manipulações no banco de users com essa interface
}
