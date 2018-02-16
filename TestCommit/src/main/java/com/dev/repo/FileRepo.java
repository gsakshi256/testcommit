package com.dev.repo;

import org.springframework.data.repository.CrudRepository;

import com.dev.model.File;

public interface FileRepo extends CrudRepository<File, String> {

}
