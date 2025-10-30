package com.t2404e.assignmentspringboot.service;

import com.t2404e.assignmentspringboot.entity.Category;
import com.t2404e.assignmentspringboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {

        return categoryRepository.findAll();
    }
}
