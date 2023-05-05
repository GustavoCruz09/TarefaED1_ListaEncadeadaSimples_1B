package view;

import model.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		for(int i = 100 ; i < 115 ; i++) {
			if(l.isEmpty()) {
				l.addFirst(i + 100);
			} else if (l.size() <= 4) {
				try {
					l.addLast(i + 50);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					System.out.println(l.get(0));
					l.removeFirst();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		int tamanho = l.size();
		System.out.println("\nLista Final (" + tamanho + ")");

		for(int i = 0; i < tamanho ; i++) {
			try {
				System.out.println(l.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
