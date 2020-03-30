package is.hi.flugleit;

import java.sql.*;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:sqlite:./database.sqlite3";

    Connection conn;
    PreparedStatement pstmt;

    Database() {
        conn = DriverManager.getConnection(DB_URL);
    }
}
