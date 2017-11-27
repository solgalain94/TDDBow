package test.test;

public class Frame {
	private int puntos=0;
	private int primerIntento;
	private int segundoIntento;
	public Frame(int primerIntento, int segundoIntento) {
		// TODO Auto-generated constructor stub
		if (primerIntento>10 || segundoIntento>10) {
			Error valorNoValido= new Error("Valor inválido");
			throw valorNoValido;
		}
		this.primerIntento=primerIntento;
		this.segundoIntento=segundoIntento;
	}
	public int primerIntento() {
		return this.primerIntento;
	}
	public int segundoIntento() {
		return this.segundoIntento;
	}
	public int getPuntos() {
		return this.puntos;
	}
	public  void sumaPuntaje(int primero, int segundo) {
		this.puntos=primero+segundo;
	}
	public boolean verificar(int valorIntento) {
		// TODO Auto-generated method stub
		boolean retorno=true;
		if (valorIntento>10){
			retorno= false;
		}
		return retorno;
	}

}
