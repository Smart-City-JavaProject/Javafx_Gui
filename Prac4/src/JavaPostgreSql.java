import java.sql.*;
public class JavaPostgreSql {
    public static Connection connect_db() throws SQLException{
        String url = "jdbc:postgresql://localhost:5433/gui_prac1";
        String user = "postgres";
        String password = "test123";
        return DriverManager.getConnection(url, user, password);
    }
    static String sector= "";
    static String location= "";
    public static void set_string(String s){
        sector= s;
    }
    public static String get_String(){
        return sector;
    }
    public static void set_loc(String l){
        location= l;
    }
    public static String get_loc(){
        return location;
    }
    public static String getActorCount(String b_name,String location) {
        String SQL = "SELECT e_name,sector,e_address "
                + "FROM education "
                + "WHERE e_board = ?"+"AND e_locality = ?";
        String count="";
        String count1="";
        String count2="";
        try (Connection conn = connect_db();
        PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count+=rs.getString("e_name")+"\n";
                count1+=rs.getString("sector")+"\n";
                count2+=rs.getString("e_address")+"\n";
                System.out.println(rs.getString("e_name") + "\t");
    
            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
    public static String getcollege(String b_name,String location) {
        String SQL = "SELECT e_name,sector,e_address "
                + "FROM education "
                + "WHERE e_stream = ?"+"AND e_locality = ?";
        String count="";
        String count1="";
        String count2="";
        try (Connection conn = connect_db();
        PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count+=rs.getString("e_name")+"\n";
                count1+=rs.getString("sector")+"\n";
                count2+=rs.getString("e_address")+"\n";
                System.out.println(rs.getString("e_name") + "\t");
    
            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

}