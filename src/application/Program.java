package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>(); // lista de numeros inteiros (nao aceita tipos primitivos)
		
		
		listInt.add(2);
		
		List<String> list = new ArrayList<String>();
		
		
		list.add("Maria");
		list.add("Joao");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Pedro"); // adcionou na posição 2
		
		
		System.out.println(list.size());
		
		for(String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("--------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
	}

}
