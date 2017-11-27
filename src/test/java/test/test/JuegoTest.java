package test.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JuegoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJuego() {
		Frame fr1= new Frame(2,3); //5
		Frame fr2= new Frame(4,2); //6
		Frame fr3= new Frame(3,4); //7
		Frame fr4= new Frame(2,1); //3
		Frame fr5= new Frame(3,5); //8
		Frame fr6= new Frame(5,4); //9
		Frame fr7= new Frame(5,4); //9
		Frame fr8= new Frame(6,3); //9
		Frame fr9= new Frame(4,3); //7
		Frame fr10= new Frame(4,5); //9
		Juego juego= new Juego(fr1.primerIntento(), fr1.segundoIntento(),fr2.primerIntento(), fr2.segundoIntento(), fr3.primerIntento(),
				fr3.segundoIntento(), fr4.primerIntento(), fr4.segundoIntento(), fr5.primerIntento(), fr5.segundoIntento(), fr6.primerIntento(), fr6.segundoIntento(),
				fr7.primerIntento(), fr7.segundoIntento(),fr8.primerIntento(), fr8.segundoIntento(),fr9.primerIntento(), fr9.segundoIntento(), fr10.primerIntento(), fr10.segundoIntento());
		assertEquals(72, juego.getPuntos());
	 
	}

}
