package Calculadora;

public class CalSimple extends Calculadora implements ICalSimple {
	protected double resultado = 0;
	
	public CalSimple(double operador, double operando) {
		super(operador, operando);
	}
	
	public CalSimple() {}
	
	@Override
	public String setTitulo () {
		String titulo = "C A L C U L A D O R A  S I M P L E";
		return titulo;
	}

	@Override
	public double Sumar(double operador, double operando) {
		resultado = operador + operando;
		return resultado;
	}

	@Override
	public double Restar(double operador, double operando) {
		resultado = operador - operando;
		return resultado;
	}

	@Override
	public double Multiplicar(double operador, double operando) {
		resultado = operador * operando;
		return resultado;
	}

	@Override
	public double Divivir(double operador, double operando) {
		resultado = operador / operando;
		return resultado;
	}
}

