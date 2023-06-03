package calculator;

import java.time.LocalDateTime;

public class LogConsole implements Ilog {
    @Override
    public void log(String message) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime + " " + message);
    }
}
