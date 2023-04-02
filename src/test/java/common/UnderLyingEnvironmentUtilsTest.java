package common;

import common.utils.UnderLyingEnvironmentUtils;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static assertions.Assert.isEqual;
import static org.assertj.core.api.Assertions.assertThat;


public class UnderLyingEnvironmentUtilsTest {

    private final String expected = InetAddress.getLocalHost().getHostName();

    public UnderLyingEnvironmentUtilsTest() throws UnknownHostException {
    }

    @Test
    public void getEnvironmentName() {
        isEqual(UnderLyingEnvironmentUtils.getComputerName(), expected);
    }


}
