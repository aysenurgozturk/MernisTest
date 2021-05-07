package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong("78941012234"), 
				"AYSENUR", 
				"GOZTURK", 
				1999
				);
		System.out.println("Doðrulama : "+ (result ? "baþarýlý " : "baþarýsýz"));
	}

}
