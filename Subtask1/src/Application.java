import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException {

        // Examples of creating a new database instance and sending queries
        Database foo = Database.getInstance();
        foo.query("Select * from positions;");
        while (foo.rs.next()) {
            System.out.println(foo.rs.getInt(1) + " " + foo.rs.getString(2) + " " + foo.rs.getInt(3));
        }
        Database bar = Database.getInstance();
        bar.query("Select id from employees Order by id desc limit 1;");
        while (bar.rs.next()) {
            System.out.println(bar.rs.getInt(1));
        }
    }
}
