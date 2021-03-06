import java.sql.*;

public class Database {

    private static Database instance; // Declaring a static instance of a database

    static Connection con;
    static Statement stmt;
    static ResultSet rs;

    // Constructor for connecting to the database
    private Database() throws SQLException {
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Company", "postgres",
                "root");
    }

    // Method for creating a new instance of a database
    public static Database getInstance() throws SQLException {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    // Method for making queries to the database
    public void query(String sql) throws SQLException {
        stmt = con.createStatement();
        rs = stmt.executeQuery(sql);
        stmt.close();
    }
}