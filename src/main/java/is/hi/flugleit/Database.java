package is.hi.flugleit;

import java.sql.*;

public class Database {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:sqlite:./database.sqlite3";

    protected Connection conn;
    protected PreparedStatement pstmt;

    public Database() { 
        try {
            conn = DriverManager.getConnection(DB_URL);
        } 
        catch (java.sql.SQLException e) {

        }
    }
}
