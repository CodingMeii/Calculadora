package Calculadora;

public class CalAritmetica extends Calculadora implements ICalSimple, ICalAritmetica {
	protected double resultado = 0;
	
	public CalAritmetica(double operador, double operando) {
		super(operador, operando);
	}
	
	public CalAritmetica() {}
	
	@Override
	public String setTitulo () {
		String titulo = "C A L C U L A D O R A  A R I T M É T I C A";
		return titulo;
	}

	@Override
	public double Racionar(double operador, double operando) {
		resultado = Math.pow(operador, (1/operando));
		return resultado;
	}

	@Override
	public double Exponencial(double operador, double operando) {
		resultado = Math.pow(operador, operando);
		return resultado;
	}

	@Override
	public double Modulo(double operador, double operando) {
		resultado = operador % operando;
		return resultado;
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

