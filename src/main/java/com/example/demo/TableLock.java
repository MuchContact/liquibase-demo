package com.example.demo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "a_1")
public class TableLock {
//    @GenericGenerator(name = "generator", strategy = "assigned")
    @Id
    @GeneratedValue(generator = "generator")
    @SequenceGenerator(name = "generator")
    private int id;

    @Column(name = "key")
    private String unicode;
}

