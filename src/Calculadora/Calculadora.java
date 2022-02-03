package Calculadora;

public class Calculadora {
	protected double operando, operador;
	
	public Calculadora() {
		this.operador = 0;
		this.operando = 0;
	}
	
	public Calculadora(double operador, double operando) {
		super();
		this.operador = operador;
		this.operando = operando;
	}
	
	public double getOperador() {
		return operador;
	}
	
	public void setOperador(double operador) {
		this.operador = operador;
	}
	
	public double getOperando() {
		return operando;
	}
	
	public void setOperando(double operando) {
		this.operando = operando;
	}
	
	public String setTitulo () {
		String titulo = "C A L C U L A D O R A";
		return titulo;
	}
}
