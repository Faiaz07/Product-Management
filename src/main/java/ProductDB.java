import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB {

    Connection con = null;

    String url = "jdbc:postgresql://localhost:5432/product_system";
    String userName = "postgres";
    String password = "admin";
    public ProductDB() {
        try {
            con = DriverManager.getConnection(url,userName,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(Product p) {
        String addQuery =  "insert into product (name,type,place,warranty) values (?,?,?,?)";

        try {
            PreparedStatement queryStatement = con.prepareStatement(addQuery);
            queryStatement.setString(1,p.getName());
            queryStatement.setString(2,p.getType());
            queryStatement.setString(3,p.getPlace());
            queryStatement.setInt(4,p.getWarranty());
            queryStatement.execute();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
