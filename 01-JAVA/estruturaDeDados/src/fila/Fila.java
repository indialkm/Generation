package fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
	
	Queue<Integer> fila = new LinkedList<Integer>();

	fila.add(4);
	fila.add(5);
	fila.add(7);
	fila.add(9);
	fila.add(10);
	
	System.out.print(fila);
	System.out.print(fila.peek());
	
	
	}
}