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
	
	@Test(expected=Error.class)
	public void testValorMayorPrimerintento() {
		Frame fr= new Frame(12,1);
	}
	@Test(expected=Error.class)
	public void testValorMayorSegundointento() {
		Frame fr= new Frame(1,12);
	}
	@Test(expected=Error.class)
	public void testValorMenorPrimerintento() {
		Frame fr= new Frame(-10,11);
	}
	@Test(expected=Error.class)
	public void testValorMenorSegundointento() {
		Frame fr= new Frame(1,-12);
	}
	@Test
	public void testPleno() {
		Frame fr = new Frame(10,0);
		assertTrue(fr.verificoPleno());
		}
	}
