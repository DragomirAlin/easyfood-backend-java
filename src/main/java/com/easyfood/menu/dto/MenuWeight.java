package com.easyfood.menu.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class MenuWeight {

    private String typeOfMenu;
    private String nameProduct;
    private double weightProduct;

}