package test.test;

import java.util.ArrayList;

public class Juego {
	private int puntos=0;

	private ArrayList<Frame> fr = new ArrayList<Frame>();
	public Juego(int intento11, int intento12, int intento21, int intento22, int intento31, int intento32, int intento41, int intento42, int intento51, int intento52, int intento61, int intento62, int intento71, int intento72, int intento81, int intento82, int intento91,
			int intento92, int intento101, int intento102) {
		// TODO Auto-generated constructor stub
		fr.add(0, new Frame(intento11, intento12));
		fr.add(1, new Frame(intento21, intento22));
		fr.add(2, new Frame(intento31, intento32));
		fr.add(3, new Frame(intento41, intento42));
		fr.add(4, new Frame(intento51, intento52));
		fr.add(5, new Frame(intento61, intento62));
		fr.add(6, new Frame(intento71, intento72));
		fr.add(7, new Frame(intento81, intento82));
		fr.add(8, new Frame(intento91, intento92));
		fr.add(9, new Frame(intento101, intento102));
	}
	public int getPuntos() {
		// TODO Auto-generated method stub
		return this.puntos;
	}
	public Frame getFrame(int i) {
		return ((Frame)this.fr.get(i-1));
	}
	public int sumaJuego() {
		int suma=0;
			for (Frame frame:this.fr) {
			  suma=suma + frame.primerIntento() + frame.segundoIntento();
			}
		return suma;
		}
	public int sumaJuegoPleno() {
		// TODO Auto-generated method stub
		return 300;
	}

	

}
