package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFrame() {
		Frame fr= new Frame(2,5);
		fr.sumaPuntaje(fr.primerIntento(),fr.segundoIntento());
		assertEquals(7,fr.getPuntos());
	}

}
