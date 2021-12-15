import java.net.MalformedURLException;
import java.net.URL;

public class Validate {
    public static Boolean validate_email(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        if (email.matches(emailRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean validate_contact(String cno) {
        String contactRegex = "^[0-9]{10}$";
        if (cno.matches(contactRegex)) {
            System.out.println("valid contact");
            return true;
        } else {
            System.out.println("invalid contact");
            return false;
        }
    }

    public static Boolean validate_info(String random_text) {
        String info_regex = "[a-zA-Z\\s]*";
        if (!random_text.matches(info_regex) || random_text.isEmpty()) {
            System.out.println("False Info");
            return false;
        } else {
            System.out.println("True Info");
            return true;
        }
    }

    public static Boolean validate_time(String time) {
        String timeRegex = "^[0-9]{2}:[0-9]{2}$";
        if (time.matches(timeRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean validate_sector(String sector) {
        String sectorRegex = "^[0-9]{1,2}[a-zA-Z]?$";
        if (sector.matches(sectorRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean priceRegex(String price) {
        String priceRegex = "\\d+";
        if (price.matches(priceRegex)) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean validate_location(String location) {
        String locationRegex = "[a-zA-Z]*";
        if (location.matches(locationRegex) && location.length() >= 3) {
            System.out.println("True location");
            return true;
        } else {
            System.out.println("False location");
            return false;
        }
    }

    public static Boolean validate_address(String address) {
        String addressRegex = "[a-zA-Z0-9\\s]*";
        if (address.matches(addressRegex) && address.length() >= 10) {
            System.out.println("True address");
            return true;
        } else {
            System.out.println("False address");
            return false;
        }
    }

    public static Boolean validate_rating(String rating) {
        String ratingRegex = "^[0-5]{1}.?[0-9]{1}?$";
        if (rating.matches(ratingRegex)) {
            System.out.println("True rating");
            return true;
        } else {
            System.out.println("False rating");
            return false;
        }
    }

    public static Boolean validate_url(String url) {
        String urlRegex = "((http?|https)://)?((W|w){3}.)?[a-zA-Z0-9]+\\.[a-zA-Z]+";
        if (url.matches(urlRegex)) {
            System.out.println("True url");
            return true;
        } else {
            System.out.println("False url");
            return false;
        }
    }

    public static void main(String[] args) throws MalformedURLException {
        System.out.println(validate_url("https://www.googles7.com"));
    }
}
