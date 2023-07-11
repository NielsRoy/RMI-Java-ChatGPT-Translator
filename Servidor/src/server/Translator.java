package server;

import java.rmi.Remote;

public interface Translator extends Remote{
	
	public String translate(String lgOrigin, String text, String lgTarget) throws Exception;

}
