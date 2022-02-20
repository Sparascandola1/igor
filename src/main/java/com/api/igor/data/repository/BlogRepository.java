package com.api.igor.data.repository;

import com.api.igor.data.entity.BlogEntity;

import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<BlogEntity, Long>{
    
}
