package com.t2404e.assignmentspringboot.repository;

import com.t2404e.assignmentspringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
