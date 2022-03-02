package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Principal {

	 public static void main (String []args) {
		 RedesController redesCont = new RedesController();
		 
		 int option = 0 ;
				 do {
					 option = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Mostrar Adaptadores de rede com IPv4\n" +
				                                                                 "2 - Mostrar média de ping\n " +
							                                                     "3 - Sair"));
				 
		 switch(option) {
		 case 1:

			    String ip = "ipconfig";
		        redesCont.readProcess(ip);
		        break;
		        
		 case 2 :
			 
			  String ping = "PING -4 -n 10 www.google.com.br";
	          redesCont.readTraceRoute(ping);
			  break;
			  
		 case 3 :
			 JOptionPane.showInputDialog(null, "Encerrando"); 
			 
	     break;
	     
		 }
		 
	 } while (option != 3);
		 
			
	
	 }
}




