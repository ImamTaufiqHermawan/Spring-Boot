/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.crud.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author imam
 */

@Entity
@Table(name = "photo")
@Data
public class PhotoEntity implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String url;
}
