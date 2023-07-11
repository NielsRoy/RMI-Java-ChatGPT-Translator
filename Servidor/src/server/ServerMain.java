package server;

//import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {

	public static void main(String[] args){
		try {
			TranslatorImpl server = new TranslatorImpl();
			Registry registry = LocateRegistry.createRegistry(1099);
			registry.bind("Translator", server);
			//String rmiObjectName = "rmi://localhost/translator";
			//Naming.rebind(rmiObjectName, server);
			System.out.println("Servidor remoto corriendo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//Iniciar el servicio de nombres desde consola en la carpeta bin del proyecto
	//con el comando: start rmiregistry
}
