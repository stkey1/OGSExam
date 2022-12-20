package stkey;

import java.sql.*;

/**
 * @author stkey
 * @customize
 * @add
 * @components
 * @throws
 * @return
 * @since 20.12.2022
 */
public class PostgreSQLJDBC {
    private static final String TABLE_ITEM = "data"; //Tablo Adı
    private static final String ITEM_ID = "id";
    private static final String ITEM_NAME = "name";
    private static final String ITEM_PLATE = "plate";
    private static final String ITEM_TYPE = "cartype";
    private static final String ITEM_CLASS = "carclasss";
    private static final String ITEM_BALANCE = "carbalance";
    private static final String ITEM_OK = "ItemId";
    private static final String ITEM_DATE = "date";


    public void postgre(Integer id, String name, String plate, String type, String carclass, Integer balance, String ok) {
        // String url = "jdbc:postgresql://localhost:5433/postgresql";
        String user = "postgres";
        String password = "123";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(Constants.url, user, password);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO " + "data" + " VALUES(" + id + ",'" + name + "','" + plate + "','"
                    + type + "','" + carclass + "'," + balance + ",'" + ok + "')";
            System.out.println(statement.executeUpdate(sql) + " kayıt eklendi.");
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex);
        }
    }

    public static Connection getConnection() {
        String user = "postgres";
        String password = "123";
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(Constants.url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void getData(Connection connection) {

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(SqlConstants.SQL_DATA_SELECT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getDataSelect(Connection connection) {

        try {
            Statement statement = connection.createStatement();
            // SELECT SORGULARI İCIN EXEQUTE_QUERY KULLANILIR
            ResultSet rs = statement.executeQuery(SqlConstants.SQL_DATA_SELECT);
            int carid;
            String carname;
            String carplate;
            String cartype;
            String carclass;
            int carbalance;
            String carok;
            while (rs.next()) {
                carid = rs.getInt(1);
                carname = rs.getString(2);
                carplate = rs.getString(3);
                cartype = rs.getString(4);
                carclass = rs.getString(5);
                carbalance = rs.getInt(6);
                carok = rs.getString(7);

                System.out.println("carId: " + carid + "\tcarname: " + carname + "\tcarplate: " + carplate + "\tcartype: " + cartype
                        + "\tcarclass: " + carclass + "\tcarbalance: " + carbalance + "\tcarok: " + carok);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



