package com.api.igor.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.api.igor.data.entity.BlogEntity;

import org.springframework.jdbc.core.RowMapper;

public class BlogRowMapper implements RowMapper<BlogEntity> {

    @Override
    public BlogEntity mapRow(ResultSet resultSet, int row) throws SQLException {
        return new BlogEntity(resultSet.getLong("ID"), resultSet.getString("TITLE"), resultSet.getString("HEADER"),
                resultSet.getString("BODY"), resultSet.getString("FOOTER"), resultSet.getArray("IMG"));
    }

}
