package com.example.auditorio.Interface;

import com.example.auditorio.Modelo.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryInterface extends CrudRepository<Category,Integer> {
}
