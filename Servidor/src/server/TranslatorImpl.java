package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import api.ChatGPT;

public class TranslatorImpl extends UnicastRemoteObject implements Translator{
	ChatGPT chatGPT;
	
	public TranslatorImpl() throws RemoteException{
		
	}

	//Responde sin ningun texto adicional la traduccion de JA a ES de: おやすみなさい
	@Override
	public String translate(String lgOrigin, String text, String lgTarget) {
		chatGPT = new ChatGPT();
		String message = "Responde SIN NINGUN TEXTO ADICIONAL la traduccion de "+lgOrigin+" a "+lgTarget+" de: "+text;
		return chatGPT.request(message);
	}
}
