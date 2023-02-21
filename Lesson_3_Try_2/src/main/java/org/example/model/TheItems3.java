package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
/*Сведения о книге состоят из
названия, фамилии автора, цены, года издания и количества страниц*/

@Data
@AllArgsConstructor
public class TheItems3 {
    private String name;
    private String author;
    private Float cost;
    private Integer year;
    private Integer pages;

}
