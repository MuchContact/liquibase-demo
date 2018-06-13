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
    @GenericGenerator(strategy = "native", name = "generator", parameters = {@org.hibernate.annotations.Parameter(name = "sequence", value = SchemaConst.DLSYS_ + "seq_id_001")})
    private int id;

    @Column(name = "unikey")
    private String unicode;
}

