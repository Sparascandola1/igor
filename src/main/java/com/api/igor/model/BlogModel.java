package com.api.igor.model;

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
public class BlogModel {
    
    private Long id;
    private String title;
    private String header;
    private String body;
    private String footer;
    private String[] img;
}
