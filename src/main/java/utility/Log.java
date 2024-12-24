package utility;

import java.util.logging.*;

public class Log {
    private static final Logger log = Logger.getLogger(Log.class.getName());

    public static void info(String message){
        log.info(message);
    }
    public static void warn(String message){
        log.warning(message);
    }
    public static void error(String message){
        log.severe(message);
    }

}
