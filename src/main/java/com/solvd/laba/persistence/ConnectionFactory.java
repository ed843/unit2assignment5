package com.solvd.laba.persistence;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionFactory {
    Connection getConnection() throws SQLException;
    DatabaseDialect getDialect();
}