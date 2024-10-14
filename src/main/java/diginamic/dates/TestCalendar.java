package diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23,59,30);
        Date date = cal.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate = format.format(date);
        System.out.println(formatDate);

        Calendar cal1 = Calendar.getInstance();
        Date date1 = cal1.getTime();

        SimpleDateFormat format1 = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss");
        String formatDate1= format1.format(date1);
        System.out.println(formatDate1);

        SimpleDateFormat formatFr = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", Locale.FRENCH);
        String formatDateFr = formatFr.format(date1);
        System.out.println("Date en français : " + formatDateFr);

        SimpleDateFormat formatDe = new SimpleDateFormat("EEEE yyyy/MM/dd HH:mm:ss", Locale.GERMANY);
        String formatDateDe = formatDe.format(date1);
        System.out.println("Date en Allemand: " + formatDateDe);

        SimpleDateFormat formatCh = new SimpleDateFormat("EEEE yyyy/MM/dd HH:mm:ss", Locale.CHINA);
        String formatDateCh = formatCh.format(date1);
        System.out.println("Date ne chnois: " + formatDateCh);

        SimpleDateFormat formatRu = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm:ss", new Locale("ru", "RU"));
        String formatDateRu = formatRu.format(date1);
        System.out.println("Date en Russe: " + formatDateRu);





    }
}


