package bubolo.world.entity.concrete;

import org.junit.BeforeClass;
import org.junit.Test;

import bubolo.world.entity.EntityTestCase;

public class ManTest
{
	static Man man;

	/**
	 * Constructs a Man object and sets the default parameters.
	 */
	@BeforeClass
	public static void setup()
	{
		man = new Man();
		EntityTestCase.setTestParams(man);
	}

	@Test
	public void Man()
	{
		assert (true);
	}
}