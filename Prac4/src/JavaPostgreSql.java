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
    static String mobile_no= "";
    static String ratings= "";
    static String roomtype= "";
    static String cost= "";
    public static void set_string(String s){
        sector= s;
    }
    public static String get_String(){
        return sector;
    }
    public static void set_ratings(String s){
        ratings= s;
    }
    public static String get_ratings(){
        return ratings;
    }
    public static void set_cost(String s){
        cost= s;
    }
    public static String get_cost(){
        return cost;
    }
    public static void set_roomtype(String s){
        roomtype= s;
    }
    public static String get_roomtype(){
        return roomtype;
    }
    public static void set_loc(String l){
        location= l;
    }
    public static String get_loc(){
        return location;
    }
    public static void mobile_no(String l){
        mobile_no= l;
    }
    public static String get_mobile_no(){
        return mobile_no;
    }
    public static String getcolleges(String b_name,String location) {
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
    public static String getschools(String b_name,String location) {
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
    public static String gethospitals(String city_name) throws SQLException{
        String SQL = "SELECT h_name,g_cno,h_address,h_sector FROM hospital WHERE h_locality = ?";
        String count="";
        String count1="";
        String count2="";
        String count3="";
        try(Connection conn = connect_db();
        PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.setString(1, city_name);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                count+= rs.getString("h_name")+"\n";
                count1 += rs.getString("h_sector")+"\n";
                count2 += rs.getString("h_address")+"\n";
                count3 += rs.getString("g_cno")+"\n";
            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
        }
    catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
        return count;
    }
    public static String getpolice(String city_name) throws SQLException{
        String SQL = "SELECT ps_locality,ps_cno,ps_address,ps_sector FROM police_station WHERE ps_locality LIKE ?";
        String count="";
        String count1="";
        String count2="";
        String count3="";
        try(Connection conn = connect_db();
        PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.setString(1, city_name+"%");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                count+= rs.getString("ps_locality")+"\n";
                count1 += rs.getString("ps_sector")+"\n";
                count2 += rs.getString("ps_address")+"\n";
                count3 += rs.getString("ps_cno")+"\n";
            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
        }
    catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
        return count;
    }
    public static String getaccomendation(String city_name,String type) throws SQLException{
        String SQL = "SELECT * FROM accomodation WHERE acc_locality = ? AND acc_type = ?";
        String count="";
        String count1="";
        String count2="";
        String count3="";
        String count4="";
        String count5="";
        String count6="";
        try(Connection conn = connect_db();
        PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.setString(1, city_name);
            pstmt.setString(2, type);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                count+= rs.getString("acc_name")+"\n";
                count1 += rs.getString("acc_sector")+"\n";
                count2 += rs.getString("acc_address")+"\n";
                count3 += rs.getString("acc_cno")+"\n";
                count4 += rs.getString("acc_rating")+"\n";
                count5 += rs.getString("acc_roomtype")+"\n";
                count6 += rs.getString("acc_cost")+"\n";
            }
            System.out.println("--->>> "+count);
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
            set_ratings(count4);
            set_cost(count6);
            set_roomtype(count5);
        }
    catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
        return count;
    }

}