package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class RedesController {
	public RedesController() {
		super();

	  }
	
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	
    public void readProcess(String ip) {
    	String os = System.getProperty("os.name");
    	String IP = "";
    	String IF = "";
    	
    	if (os.contains("Windows")) {
    		IP = "ipconfig" + ip;
    		}
    	
    	if (os.contains("Linux")) {
    	    IF = "ifconfig" + ip;
    	}
    	
    	try {
    		Process p = Runtime.getRuntime().exec(ip);
    		InputStream fluxo = p.getInputStream();
    		InputStreamReader leitor = new InputStreamReader(fluxo);
    		BufferedReader buffer = new BufferedReader(leitor);
    		String linha = buffer.readLine();
    		while (linha != null) {
    			System.out.println(linha);
    			linha = buffer.readLine();
    		}
    		buffer.close();
    		leitor.close();
    		fluxo.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	}
    
    public void readTraceRoute(String ping) {
    	String os = System.getProperty("os.name");
    	String pingw = "";
    	String pingl = "";
    	
    	if (os.contains("Windows")) {
    		pingw = "PING -4 -n 10";
    		}
    	
    	if (os.contains("Linux")) {
    	    pingl = "ping -4 -c 10";
    	}
    	try {
    		Process p = Runtime.getRuntime().exec(ping);
    		InputStream fluxo = p.getInputStream();
    		InputStreamReader leitor = new InputStreamReader(fluxo);
    		BufferedReader buffer = new BufferedReader(leitor);
    		String linha = buffer.readLine();
    		while (linha != null) {
    			System.out.println(linha);
    			linha = buffer.readLine();
    		}
    		buffer.close();
    		leitor.close();
    		fluxo.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    	}
    
  
	
	}
		
	
	




