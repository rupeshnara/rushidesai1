import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by desair4 on 12/19/2016.
 */
public class JdbcIntro {

    /*
     * Steps:
     * 1. Connect to a data source, like a database
     * 2. Send queries and update statements to the database
     * 3. Retrieve and process the results received from the database in answer to your query
     */
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/bank";
        String user = "admin";
        String password = "admin";

        try {

            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT VERSION()");
            printResult(rs);

            rs = st.executeQuery("SELECT * FROM USER");
            printResult(rs);


        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcIntro.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        PreparedStatement pst = null;
        /*try {

            String author = "Trygve Gulbranssen";
            con = DriverManager.getConnection(url, user, password);

//            pst = con.prepareStatement("SELECT * FROM USER VALUES(?)");
//            pst = con.prepareStatement("INSERT INTO Authors(Name) VALUES(?)");
            pst.setString(1, author);
            pst.executeUpdate();

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(JdbcIntro.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {

            try {

                if (pst != null) {
                    pst.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {

                Logger lgr = Logger.getLogger(JdbcIntro.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        }*/
    }

    private static void printResult(ResultSet rs) throws SQLException {
        if (rs.next()) {

            System.out.println(rs.getString(1));
        }
    }
}
