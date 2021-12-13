import java.sql.*;

public class JavaSQLInsert {
    public static void insert_Banks(String name, String Address, String Sector, String cno, String location) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO banks (name, address, sector, cno, locality) VALUES ('" + name + "', '"
                    + Address + "', '" + Sector + "', '" + cno + "', '" + location + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void insert_education(String name, String locality, String Address, String cno, String sector,
            String type,
            String board, String stream) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO education (name, locality, address, cno, sector, type, board, stream) VALUES ('"
                    + name + "', '"
                    + locality + "', '" + Address + "', '" + cno + "', '" + sector + "', '" + type + "', '" + board
                    + "', '" + stream + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert_accomodation(String name, String locality, String Address, String cno, String sector,
            String type, String cost, String roomtype, String rating) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO accomodation (name, locality, address, cno, sector, type, cost, roomtype, rating) VALUES ('"
                    + name + "', '"
                    + locality + "', '" + Address + "', '" + cno + "', '" + sector + "', '" + type + "', '" + cost
                    + "', '" + roomtype + "', '" + rating + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void insert_cinema(String name, String address, String cno, String web, String locality,
            String sector) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO cinema (name,address,cno,web,locality,sector) VALUES ('" + name + "','" + address
                    + "','" + cno + "','" + web + "','" + locality + "','" + sector + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert_hospital(String name, String address, String cno, String locality, String sector) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO hospital (name,address,cno,locality,sector) VALUES ('" + name + "','" + address
                    + "','" + cno + "','" + locality + "','" + sector + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert_police_station(String name, String address, String cno, String locality, String sector) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO police_station (name,address,cno,locality,sector) VALUES ('" + name + "','"
                    + address
                    + "','" + cno + "','" + locality + "','" + sector + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert_mall(String name, String address, String time, String locality, String sector) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO mall (name,address,time,locality,sector) VALUES ('" + name + "','" + address
                    + "','" + time + "','" + locality + "','" + sector + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insert_restaurant(String name, String address, String cno, String locality, String sector,
            String rating, String type) {
        try {
            Connection con = JavaPostgreSql.connect_db();
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO restaurant (name,address,cno,locality,sector,rating,type) VALUES ('" + name
                    + "','" + address
                    + "','" + cno + "','" + locality + "','" + sector + "','" + rating + "','" + type + "')";
            stmt.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}