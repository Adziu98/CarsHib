import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

public class main {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("adam");
    public static void main(String[] args) {
        String v = "Java";
        v.concat("Rządzi");
        System.out.println(v);
        System.out.println(v.concat("Rządzi"));

    }
}
