package com.api.igor.data.entity;

import java.sql.Array;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Salvatore Parascandola
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("blogs")
public class BlogEntity {

    @Id
    Long id;

    @Column("TITLE")
    String title;

    @Column("HEADER")
    String header;
    
    @Column("BODY")
    String body;

    @Column("footer")
    String footer;

    @Column("img")
    Array img;
}
