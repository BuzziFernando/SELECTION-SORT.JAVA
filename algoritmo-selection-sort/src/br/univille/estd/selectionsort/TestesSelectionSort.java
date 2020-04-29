package br.univille.estd.selectionsort;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TestesSelectionSort {

	
	@Test
	void exercicio01() {
		int a[] = {4,2,-9,78,8};
		int retorno[] = SelectionSort.exercicio01(a);
		int esperado[] = {-9,2,4,8,78};
		assertArrayEquals(esperado,retorno,"O vetor deve estar ordenado");
		int b[] = {0,2,1,1,2};
		retorno = SelectionSort.exercicio01(b);
		int esperado2[] = {0,1,1,2,2};
		assertArrayEquals(esperado2,retorno,"O vetor deve estar ordenado");
	}
	
	@Test
	void exercicio02() {
		int a[] = {4,2,-9,78,8};
		int retorno[] = SelectionSort.exercicio02(a);
		int esperado[] = {78,8,4,2,-9};
		assertArrayEquals(esperado,retorno,"O vetor deve estar ordenado");
		int b[] = {0,2,1,1,2};
		retorno = SelectionSort.exercicio02(b);
		int esperado2[] = {2,2,1,1,0};
		assertArrayEquals(esperado2,retorno,"O vetor deve estar ordenado");
	}
	
	@Test
	void exercicio03() {
		String entrada[] = {"b","c","a","z"};
		String retorno[] = SelectionSort.exercicio03(entrada);
		String esperado[] = {"a","b","c","z"};
		assertArrayEquals(esperado,retorno,"O vetor deve estar ordenado");
		String entrada2[] = {"k","m","e","b"};
		String retorno2[] = SelectionSort.exercicio03(entrada2);
		String esperado2[] = {"b","e","k","m"};
		assertArrayEquals(esperado2,retorno2,"O vetor deve estar ordenado");
	}
	
	@Test
	void exercicio04() {
		Produto entrada[] = {new Produto("Tenis Nike",299.99)
							,new Produto("Camisa Regata",79.99)
							,new Produto("Tenis Adida",227.99)
							,new Produto("Camisa Polo",99.99)};
		Produto retorno[] = SelectionSort.exercicio04(entrada);
		Produto esperado[] = {new Produto("Camisa Regata",79.99)
								,new Produto("Camisa Polo",99.99)
								,new Produto("Tenis Adida",227.99)
								,new Produto("Tenis Nike",299.99)};
		assertArrayEquals(esperado,retorno,"O vetor deve estar ordenado");
				
	}
	
	@Test
	void exercicio05() {
		Produto entrada[] = {new Produto("Tenis Nike",299.99)
							,new Produto("Camisa Regata",79.99)
							,new Produto("Tenis Adida",227.99)
							,new Produto("Camisa Polo",99.99)};
		Produto retorno[] = SelectionSort.exercicio05(entrada);
		Produto esperado[] = {   new Produto("Camisa Polo",99.99)
								,new Produto("Camisa Regata",79.99)
								,new Produto("Tenis Adida",227.99)
								,new Produto("Tenis Nike",299.99)};
		assertArrayEquals(esperado,retorno,"O vetor deve estar ordenado");
				
	}
	
}
