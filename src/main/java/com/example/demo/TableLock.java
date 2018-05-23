package com.example.demo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "a_1")
public class TableLock {
    @Id
    @GeneratedValue(generator = "generator")
//    @GenericGenerator(name = "generator", strategy = "native")
    @SequenceGenerator(name = "generator")
    private int id;

    @Column(name = "unikey")
    private String unicode;
}

