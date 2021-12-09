import java.sql.*;

public class JavaPostgreSql {
    public static Connection connect_db() throws SQLException {
        String url = "jdbc:postgresql://localhost:5433/JavaFx_Db";
        String user = "postgres";
        String password = "test123";
        return DriverManager.getConnection(url, user, password);
    }

    static String sector = "";
    static String location = "";
    static String mobile_no = "";
    static String ratings = "";
    static String roomtype = "";
    static String cost = "";

    public static void set_string(String s) {
        sector = s;
    }

    public static String get_String() {
        return sector;
    }

    public static void set_ratings(String s) {
        ratings = s;
    }

    public static String get_ratings() {
        return ratings;
    }

    public static void set_cost(String s) {
        cost = s;
    }

    public static String get_cost() {
        return cost;
    }

    public static void set_roomtype(String s) {
        roomtype = s;
    }

    public static String get_roomtype() {
        return roomtype;
    }

    public static void set_loc(String l) {
        location = l;
    }

    public static String get_loc() {
        return location;
    }

    public static void mobile_no(String l) {
        mobile_no = l;
    }

    public static String get_mobile_no() {
        return mobile_no;
    }

    public static String getcolleges(String b_name, String location) {
        String SQL = "SELECT * FROM education WHERE e_board = ? AND e_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("e_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("e_address") + "\n";
                System.out.println(rs.getString("e_name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getmalls(String locality) {
        String SQL = "SELECT * FROM mall WHERE m_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, locality);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("m_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("m_address") + "\n";
                count3 += rs.getString("m_time") + "\n";
                System.out.println(rs.getString("m_name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
            set_ratings(count3);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getcinema(String locality) {
        String SQL = "SELECT * FROM cinema WHERE cin_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, locality);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("cin_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("cin_address") + "\n";
                count3 += rs.getString("cin_web") + "\n";
                count4 += rs.getString("cin_cno") + "\n";
                System.out.println(rs.getString("cin_name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
            set_ratings(count3);
            set_roomtype(count4);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getbanks(String location, String name) {
        String SQL = "SELECT * FROM banks WHERE b_locality = ?" + "AND b_name = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, location);
            pstmt.setString(2, name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.toString());
                count += rs.getString("b_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("b_address") + "\n";
                count3 += rs.getString("b_cno") + "\n";
                System.out.println(rs.getString("b_name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getschools(String b_name, String location) {
        String SQL = "SELECT e_name,sector,e_address " + "FROM education " + "WHERE e_stream = ?"
                + "AND e_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("e_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("e_address") + "\n";
                System.out.println(rs.getString("e_name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String gethospitals(String city_name) throws SQLException {
        String SQL = "SELECT h_name,h_cno,h_address,sector FROM hospital WHERE h_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("h_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("h_address") + "\n";
                count3 += rs.getString("h_cno") + "\n";
            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getpolice(String city_name) throws SQLException {
        String SQL = "SELECT ps_locality,ps_cno,ps_address,sector FROM police_station WHERE ps_locality LIKE ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("ps_locality") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("ps_address") + "\n";
                count3 += rs.getString("ps_cno") + "\n";
            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getFlight(String From, String To) throws SQLException {
        String SQL = "SELECT * FROM flight WHERE fl_dep = ? AND fl_arr=?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, From);
            pstmt.setString(2, To);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("fl_airline") + "\n";
                count1 += rs.getString("fl_no") + "\n";
                count2 += rs.getString("fl_deptime") + "\n";
                count3 += rs.getString("fl_arrtime") + "\n";
            }
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
            System.out.println("---> c1 " + count1);
            System.out.println("---> c2 " + count2);
            System.out.println("---> c3 " + count3);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getaccomendation(String city_name, String type) throws SQLException {
        String SQL = "SELECT * FROM accomodation WHERE acc_locality = ? AND acc_type = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";
        String count5 = "";
        String count6 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name);
            pstmt.setString(2, type);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("acc_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("acc_address") + "\n";
                count3 += rs.getString("acc_cno") + "\n";
                count4 += rs.getString("acc_rating") + "\n";
                count5 += rs.getString("acc_roomtype") + "\n";
                count6 += rs.getString("acc_cost") + "\n";
            }
            System.out.println("--->>> " + count);
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
            set_ratings(count4);
            set_cost(count6);
            set_roomtype(count5);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getrestaurents(String city_name) throws SQLException {
        String SQL = "SELECT * FROM restaurant WHERE res_locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";
        String count5 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("res_name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("res_address") + "\n";
                count3 += rs.getString("res_cno") + "\n";
                count4 += rs.getString("res_rating") + "\n";
                count5 += rs.getString("res_type") + "\n";
            }
            System.out.println("--->>> " + count);
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
            set_ratings(count4);
            set_roomtype(count5);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getnamebanks() {
        String SQL = "SELECT DISTINCT b_name FROM banks ";
        String count = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("b_name") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getnameflight() {
        String SQL = "SELECT DISTINCT fl_arr  FROM flight";
        String count = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("fl_arr") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

}