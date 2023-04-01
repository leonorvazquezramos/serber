package common;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

public class Utils {

    private static final Logger log = Logger.getLogger(Utils.class.getName());

    public static String getComputerName() {
        String name = null;
        name = getComputerNameUnix();
        if(name == null) {
            name = getComputerNameWindows();
        }
        return name;
    }

    private static String getComputerNameUnix() {
        if(System.getenv("HOSTNAME") != null) {
            return System.getenv("HOSTNAME");
        } else {
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


    public static InetAddress getComputerIp() {
        InetAddress ip;
        log.info("instantiated ip");
        try {
            log.info("retrieving ip from system");
            ip = InetAddress.getByName(Utils.getComputerName());
            log.info("retrieved ip from system");
        } catch (
                UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return ip;
    }


}
