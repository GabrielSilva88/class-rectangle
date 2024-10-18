package view;

import model.Retangulo;

public class MainRetangulo {
	/*	pacote model:
	 	Classe Retângulo:
	Crie uma classe Retangulo com os atributos largura e altura. Implemente métodos para calcular a área e o perímetro do retângulo.
		pacote view
	*/
	
	public static void main(String[] args) {

		Retangulo r = new Retangulo();

		r.setAltura(15.48);
		r.setLargura(7.25);

		//r.calcularArea(45, 120);

		System.out.println("Largura: " + r.getLargura() + "\nAltura: " + r.getAltura());

		System.out.println("Area calculada: " + r.calcularArea() + "\nPerimetro caculado: " + r.calcularPerimetro());
		

	}
}
