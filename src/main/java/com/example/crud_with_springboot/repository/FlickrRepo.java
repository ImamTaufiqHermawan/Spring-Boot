/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.crud_with_springboot.repository;

import com.example.crud_with_springboot.controller.PhotoEntity;
import com.flickr4java.flickr.photos.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author imam
 */
public interface FlickrRepo extends JpaRepository<PhotoEntity, Long>{
    
}
