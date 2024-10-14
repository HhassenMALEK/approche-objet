package diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

       Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy ");
        String formatDate = format.format(date);
        System.out.println(formatDate);

        SimpleDateFormat format2 = new SimpleDateFormat("19/05/2016 29:59:30");
        String formatDate2 = format2.format(date);
        System.out.println(formatDate2);

        SimpleDateFormat format3 = new SimpleDateFormat("2016/05/19 29:59:30");
        String formatDate3 = format3.format(date);
        System.out.println(formatDate3);








    }
}
