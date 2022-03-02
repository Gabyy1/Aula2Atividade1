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
		
	
	




