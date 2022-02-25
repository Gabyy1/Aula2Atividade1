package view;

import controller.RedesController;

public class Principal {

	public static void main(String[] args) {
		
		RedesController redesCont = new RedesController();
		String os = redesCont.os();
		
		System.out.println(os);

	}

}
