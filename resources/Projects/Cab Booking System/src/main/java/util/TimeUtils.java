/*  ================================================================================================ */
/*          Author: Rachit Sharma  |  Project: Cab Booking System | Date: 2025-06-12                */
/*  ================================================================================================ */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils
{
    public static String getCurrentTimestamp()
    {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return now.format(formatter);
    }
}
