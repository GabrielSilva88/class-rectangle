package model;

public class Retangulo {
	/*
	Classe Retângulo:
	Crie uma classe Retangulo com os atributos largura e altura. 
	Implemente métodos para calcular a área e o perímetro do retângulo.
	*/
		// atributos
		private double largura;
		private double altura;
		
		// double largura, double altura não coloquei
		public double calcularArea() {			
			return largura * altura;
		}
				
				// double largura, double altura não precisa de parametro
		public double calcularPerimetro() {
			
			return 2 * (altura + largura);
			
		}
		
		// get e set.
		
		public double getLargura() {
			return largura;
		}

		public void setLargura(double largura) {
			this.largura = largura;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

}
