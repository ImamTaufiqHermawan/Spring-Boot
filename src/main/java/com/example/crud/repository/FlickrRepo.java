/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.crud.repository;

import com.example.crud.model.PhotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author imam
 */

@Repository
public interface FlickrRepo extends JpaRepository<PhotoEntity, Long>{
    
}
