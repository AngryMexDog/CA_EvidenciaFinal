package modelo;

public class IMC {
	
	private double peso; //n1
	private double altura; //n2
	private double imc;
	
	///PARSEAR ENTRADAS DE INDEX.JSP A TIPO DOUBLE
	public IMC (String n1, String n2) {
		this.setPeso(Double.parseDouble(n1));
		this.setAltura(Double.parseDouble(n2));
	}
	
	
	///////SET Y GET DE peso
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	///////SET Y GET DE altura
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	///////SET Y GET DE imc
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	///METODO CALCULAR IMC
	//requiere que el input sea parseado a double
	public void calcularIMC() {
		double m = this.getPeso()/(this.getAltura() * this.getAltura());
		this.setImc(m);		
	}
}
