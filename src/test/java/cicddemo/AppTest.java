package cicddemo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testVersion() {

		App obj = new App();
		Assert.assertNotNull(obj.getVersion());

	}
}
