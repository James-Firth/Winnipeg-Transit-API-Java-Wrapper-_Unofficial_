package test;

import main.firth_wpgtransit_wrapper.Stop;

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
public class StopTest {

    @Test
    public void createWithGoodInput() {
        Stop tmp = new Stop(10064, "Test", "NB", null, null);

        Assert.assertNotNull(tmp);

    }

}
