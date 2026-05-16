package ThucHanhJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegativeNumberInStrings {

    public static void timSoAm(String str) {

        Pattern pattern = Pattern.compile("-\\d+");

        Matcher matcher = pattern.matcher(str);

        int dem = 0;

        System.out.println("Cac so nguyen am trong chuoi:");

        while (matcher.find()) {

            System.out.println(matcher.group());

            dem++;
        }

        System.out.println("So luong so am: " + dem);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Nhap chuoi: ");

            String str = sc.nextLine();

            timSoAm(str);
        }
    }
}