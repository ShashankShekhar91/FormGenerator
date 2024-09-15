package com.formgenerator.entity;


import com.formgenerator.models.FormData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormEntityRepo extends JpaRepository <FormData,Integer>{
}
