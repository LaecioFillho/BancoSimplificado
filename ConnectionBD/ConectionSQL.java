package ConnectionBD;

//import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;


public class  ConectionSQL{

    private static final String url = "jdbc:mysql://localhost:3306/XXXXXXX";
    private static final String user = "root";

    private static Connection con;

    public Connection getConectando() {

        try {
            if (con == null) {
                con = DriverManager.getConnection(url, user, "");
                return con;
            } else {
                return null;
            }
        } catch (Exception e) {
            System.out.println("Não conectou ao Banco de Dados!");
            e.printStackTrace();
            return null;
        }
    }

}
