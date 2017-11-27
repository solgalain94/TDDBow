package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
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
	@Test
	public void testValorMayorPrimerintento() {
		Frame fr= new Frame(2,11);
		Assert.assertFalse("El número debe ser menor a 10",fr.verificar(fr.primerIntento()));
	}
	@Test
	public void testValorMayorSegundoIntento() {
		Frame fr= new Frame(12,2);
		Assert.assertFalse("El número debe ser menor a 10",fr.verificar(fr.segundoIntento()));
	}

}
