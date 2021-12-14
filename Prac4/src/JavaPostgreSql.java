import java.sql.*;
import java.util.ArrayList;

public class JavaPostgreSql {
    public static Connection connect_db() throws SQLException {
        String url = "jdbc:postgresql://localhost:5433/JavaFx_2";
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
    static String accomendation_id = "";

    public static void set_acco_id(String s) {
        accomendation_id = s;
    }

    public static String get_acco_id() {
        return accomendation_id;
    }

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

    public static ArrayList<String> name_table;

    public static void set_table_name(ArrayList<String> s) {
        name_table = s;
    }

    public static ArrayList<String> get_table_name() {
        return name_table;
    }

    public static String getcolleges(String b_name, String location) {
        String SQL = "SELECT * FROM education WHERE board = ? AND locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                System.out.println(rs.getString("name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getmalls(String locality) {
        String SQL = "SELECT * FROM mall WHERE locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, locality);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("time") + "\n";
                System.out.println(rs.getString("name") + "\t");

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
        String SQL = "SELECT * FROM cinema WHERE locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, locality);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("web") + "\n";
                count4 += rs.getString("cno") + "\n";
                System.out.println(rs.getString("name") + "\t");

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
        String SQL = "SELECT * FROM banks WHERE locality = ?" + "AND name = ?";
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
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("cno") + "\n";
                System.out.println(rs.getString("name") + "\t");

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
        String SQL = "SELECT name,sector,address " + "FROM education " + "WHERE stream = ?"
                + "AND locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, b_name);
            pstmt.setString(2, location);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                System.out.println(rs.getString("name") + "\t");

            }
            set_string(count1);
            set_loc(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String gethospitals(String city_name) throws SQLException {
        String SQL = "SELECT name,cno,address,sector FROM hospital WHERE locality = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("cno") + "\n";
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
        String SQL = "SELECT locality,cno,address,sector FROM police_station WHERE locality LIKE ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("locality") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("cno") + "\n";
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

    public static String getTrains(String From, String To) throws SQLException {
        String SQL = "SELECT * FROM train WHERE tr_dep = ? AND tr_arr=?";
        String count = "";
        String count1 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, From);
            pstmt.setString(2, To);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("tr_tno") + "\n";
                count1 += rs.getString("tr_deptime") + "\n";
            }
            set_string(count1);
            System.out.println("---> c1 " + count1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getBus(String No) throws SQLException {
        String SQL = "SELECT * FROM bus WHERE b_no = ?";
        String count = "";
        String count1 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, No);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("b_dep") + "\n";
                count1 += rs.getString("b_arr") + "\n";
            }
            set_string(count1);
            System.out.println("---> c1 " + count1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getaccomendation(String city_name, String type) throws SQLException {
        String SQL = "SELECT * FROM accomodation WHERE locality = ? AND type = ?";
        String count = "";
        String count1 = "";
        String count2 = "";
        String count3 = "";
        String count4 = "";
        String count5 = "";
        String count6 = "";
        String count7 = " ";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, city_name);
            pstmt.setString(2, type);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("cno") + "\n";
                count4 += rs.getString("rating") + "\n";
                count5 += rs.getString("roomtype") + "\n";
                count6 += rs.getString("cost") + "\n";
                count7 += rs.getString("id") + "\n";
            }
            System.out.println("--->>> " + count);
            set_string(count1);
            set_loc(count2);
            mobile_no(count3);
            set_ratings(count4);
            set_cost(count6);
            set_roomtype(count5);
            set_acco_id(count7);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getrestaurents(String city_name) throws SQLException {
        String SQL = "SELECT * FROM restaurant WHERE locality = ?";
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
                count += rs.getString("name") + "\n";
                count1 += rs.getString("sector") + "\n";
                count2 += rs.getString("address") + "\n";
                count3 += rs.getString("cno") + "\n";
                count4 += rs.getString("rating") + "\n";
                count5 += rs.getString("type") + "\n";
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
        String SQL = "SELECT DISTINCT name FROM banks ";
        String count = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("name") + "\n";
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

    public static String getnametrain() {
        String SQL = "SELECT DISTINCT tr_arr  FROM train";
        String count = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("tr_arr") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static String getbusno() {
        String SQL = "SELECT DISTINCT b_no  FROM bus";
        String count = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("b_no") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public static void getTablename() {
        String SQL = "SELECT table_name FROM information_schema.columns WHERE column_name = 'sector'";

        ArrayList<String> count = new ArrayList<String>();
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count.add(rs.getString("table_name"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        set_table_name(count);
    }

    public static String search(String name, String sector, String locality) {
        String SQL = "SELECT * FROM " + name + " WHERE ( sector = ? OR sector = ? OR sector = ? ) AND locality = ? ";
        String count2 = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, Integer.toString(Integer.parseInt(sector) + 1));
            pstmt.setString(2, Integer.toString(Integer.parseInt(sector) - 1));
            pstmt.setString(3, sector);
            pstmt.setString(4, locality);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count2 += rs.getString("name") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return count2;
    }

    public static String get_near_place(String name, String sector, String locality) {
        ArrayList<String> count = new ArrayList<String>();
        getTablename();
        count = get_table_name();
        String res = "";
        for (String action : count) {
            try {

                if (!action.equals(name)) {
                    res += search(action, sector, locality);
                    System.out.println("action " + action + "Locality: " + locality + " Sector: " + sector);
                } else {
                    continue;
                }
            } catch (Exception e) {
                System.out.println("--->> " + e.getMessage());
                continue;
            }
        }
        System.out.println("--->>> " + res);
        return res;
    }

    public static Boolean check_admin_credentials(String admin_cred) {
        String SQL = "SELECT * FROM users WHERE admin_cred = ?";
        String count = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, admin_cred);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("admin_cred") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (count.toString().length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void create_user(String username, String password, String email, String admin_cred) {
        String SQL = "INSERT INTO users (username, password, email, admin_cred) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.setString(4, admin_cred);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Boolean user_check(String username, String password) {
        String SQL = "SELECT * FROM users WHERE username = ? AND password = ?";
        String count = "";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                count += rs.getString("username") + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (count.toString().length() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void feedback(String name, String feedbacktext, int accomo_id, String imgstr) {
        String SQL = "INSERT INTO feedback (name,feedbacktext,accomo_id,imgstr) VALUES (?, ?, ?, ?)";
        try (Connection conn = connect_db(); PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, name);
            pstmt.setString(2, feedbacktext);
            pstmt.setInt(3, accomo_id);
            pstmt.setString(4, imgstr);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String feed_name = "";
    public static String feed_imgstr = "";
    public static String feed_feedback = "";

    public static void set_feed_name(String name) {
        feed_name = name;
    }

    public static String get_feed_name() {
        return feed_name;
    }

    public static void set_feed_imgstr(String imgstr) {
        feed_imgstr = imgstr;
    }

    public static String get_feed_imgstr() {
        return feed_imgstr;
    }

    public static void set_feed_feedback(String feedback) {
        feed_feedback = feedback;
    }

    public static String get_feed_feedback() {
        return feed_feedback;
    }

    public static void get_feedback(int id) {
        String SQL = "SELECT * FROM feedback WHERE accomo_id = " + id;
        String count = "";
        String count1 = "";
        String count2 = "";
        try (Connection conn = connect_db(); Statement pstmt = conn.createStatement()) {
            ResultSet rs = pstmt.executeQuery(SQL);
            while (rs.next()) {
                count += rs.getString("name") + "\n";
                count1 += rs.getString("imgstr") + "\n";
                count2 += rs.getString("feedbacktext") + "\n";
            }
            set_feed_name(count);
            set_feed_imgstr(count1);
            set_feed_feedback(count2);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(count);
    }

}