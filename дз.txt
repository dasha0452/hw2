import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String str_1 = a.nextLine();
        Pattern p = Pattern.compile("(\\d\\d)/(\\d\\d)/(\\d\\d\\d\\d)");
        Matcher m = p.matcher(str_1);
        if (!m.find()) {
            System.out.println("Введённое выражение не соответствует заданному формату даты dd//mm/yyyy");
            return;
        }
        String day = m.group(1);
        String month = m.group(2);
        String year = m.group(3);
        int d = Integer.parseInt(day);
        int mm = Integer.parseInt(month);
        int y = Integer.parseInt(year);
//System.out.println(d);
//System.out.println(mm);
//System.out.println(y);
        if (d < 0 && d > 31) {
            System.out.println("Введённое выражение не является датой");
            return;
        }
        if (mm < 0 && mm > 12) {
            System.out.println("Введённое выражение не является датой");
            return;
        }

        if (y < 1900 && y > 9999) {
            System.out.println("Введённое выражение не является датой");
            return;
        }
        System.out.println("Введённое выражение является датой");


    }
}

