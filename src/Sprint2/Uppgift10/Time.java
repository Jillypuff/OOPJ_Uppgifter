package Sprint2.Uppgift10;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Time {

    public Time(){
        writeTime("asdf");
    }

    public void writeTime(String city){
        ZoneId zoneId = ZoneId.of("Europe/Stockholm");
        LocalDateTime localDateTime = LocalDateTime.now(zoneId);
        System.out.println(localDateTime);
    }

    public static void main(String[] args) {
        new Time();
    }
}
