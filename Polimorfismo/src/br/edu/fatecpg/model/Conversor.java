package br.edu.fatecpg.model;

public class Conversor {
	public String converter(int celsius) {
		
		return celsius + "°C em fahrenheit: " +(celsius * 9/5)+32;
	}
	public String converter(double km) {
		return km + " equivale a : " + (km / 1.609) + " milhas";
	}
	public String converter(String palavra) {
		return palavra.toUpperCase();
	}
}
