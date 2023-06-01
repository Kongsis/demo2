package com.example.demo2.entity;

import javax.persistence.*;

@Entity
@Table(name = "nation_table") // table 이름 지정
public class NationEntity {
    @Id // pk 컬럼 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 적용
    private Long id;

    // column 추가
    @Column(length = 50, nullable = false, unique = true) // not null
    private String nationName;

    @Column
    private int population;
}
