/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dao.pojo;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author user
 */

@Data

public class User /*implements Serializable*/{
    @Id
    private int id;
    private String fio;
}
