package test;

import main.firth_wpgtransit_wrapper.Street;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Foo}.
 *
 * @author user@example.com (John Doe)
 */
public class StreetTest {

    @Test
    public void createWithGoodInput() {

        Street tmp = Street.buildStreet(10064, "TEST_ST", "AVE");
        Assert.assertNotNull(tmp);

    }
}
