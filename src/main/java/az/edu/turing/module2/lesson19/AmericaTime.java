package az.edu.turing.module2.lesson19;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AmericaTime {
    public static void main(String[] args) {
        // Amerika'nın New York (Eastern Time Zone) saat dilimi
        ZoneId zoneId = ZoneId.of("America/New_York");

        // Şu anki tarih ve saat
        ZonedDateTime currentTime = ZonedDateTime.now(zoneId);

        // Tarih ve saati uygun bir formatta yazdır
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Amerika (New York) saati: " + formattedTime);
    }
}
