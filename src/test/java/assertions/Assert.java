package assertions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Assert {

    private static final Logger log = Logger.getLogger(Assert.class.getName());
    public static boolean isEqual(Object actual, Object expected) {
        if(actual.equals(expected)) {
            log.info("[" + actual + "] == [" + expected + "] ");
            return true;
        } else {
            log.info("[" + actual + "] != [" + expected + "] ");
            return false;
        }
    }
}
