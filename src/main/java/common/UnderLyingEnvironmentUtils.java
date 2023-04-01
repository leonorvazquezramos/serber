package common;

import common.annotations.DocumentedClass;
import common.annotations.DocumentedMethod;
import java.util.logging.Logger;

@DocumentedClass(
        description = "static methods to interact with underlying computer and SO"
)
public class UnderLyingEnvironmentUtils {
    private static final Logger log = Logger.getLogger(UnderLyingEnvironmentUtils.class.getName());

    @DocumentedMethod(
            description = "retrieves host name",
            returns = String.class
    )
    public static String getComputerName() {
        String name = null;
        name = getComputerNameUnix();
        if(name == null) {
            name = getComputerNameWindows();
        }
        return name;
    }

    private static String getComputerNameUnix() {
        log.info("attempting retrieval from Unix");
        if(System.getenv("HOSTNAME") != null) {
            log.info("environment variable HOSTNAME is not null: it will be used");
            return System.getenv("HOSTNAME");
        } else {
            log.info("environment variable HOSTNAME is null");
            return null;
        }
    }

    private static String getComputerNameWindows() {
        if(System.getenv("COMPUTERNAME") != null) {
            return System.getenv("COMPUTERNAME");
        } else {
            return null;
        }
    }

}
