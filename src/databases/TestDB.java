package databases;

import java.io.IOException;
import java.sql.SQLException;

public class TestDB {

    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        ConnectToSqlDB.connectToSqlDatabase();
    }

}
