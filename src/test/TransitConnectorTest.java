package test;

import main.firth_wpgtransit_wrapper.TransitConnector;

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
public class TransitConnectorTest {

    @Test
    public void createWithGoodInput() {

        TransitConnector tmp = TransitConnector.buildTransitConnector("FAKEAPIKEY_GOES_HERE");
        Assert.assertNotNull(tmp);

    }
}
