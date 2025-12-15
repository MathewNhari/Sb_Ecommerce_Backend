package com.ecommerce.project.service;

import com.ecommerce.project.exceptions.APIException;
import com.ecommerce.project.exceptions.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        if(categories.isEmpty())
            throw new APIException("There are no categories created");
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        Category savedCategory = categoryRepository.findByCategoryName(category.getCategoryName());
        if(savedCategory != null)
            throw new APIException("Category with the name "+ category.getCategoryName()+ " already exist !!!");
        categoryRepository.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("Category","categporyId", categoryId));
        categoryRepository.delete(category);
        return "Category with ID: " + categoryId + " deleted successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
       
        Category savedCategory =  categoryRepository.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("Category","categporyId", categoryId));
        category.setCategoryId(categoryId);
        categoryRepository.save(category);
        return savedCategory;
    }

}
