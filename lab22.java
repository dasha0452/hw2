import java.util.regex.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
    Scanner b = new Scanner(System.in);
    String str_2 = b.nextLine();
    if (str_2.length()<8){
        System.out.println("Пароль ненадёжен");
        return;
    }
    Pattern p = Pattern.compile("^[a-z\\d_A-Z]*$");
    Matcher m = p.matcher(str_2);
    if(!m.find()){
        System.out.println("Пароль ненадёжен");
        return;
    }
    Pattern o = Pattern.compile("\\d");
    Matcher i = o.matcher(str_2);
    if(!i.find()){
        System.out.println("Пароль ненадёжен");
        return;
    }
    Pattern h = Pattern.compile("[a-z]");
    Matcher u = h.matcher(str_2);
    if (!u.find()){
        System.out.println("Пароль ненадёжен");
        return;
    }
    Pattern q = Pattern.compile("[A-Z]");
    Matcher z = q.matcher(str_2);
    if (!z.find()){
        System.out.println("Пароль ненадёжен");
        return;
    }
    System.out.println("Пароль надёжен");
    }
}
