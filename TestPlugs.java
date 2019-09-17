package electricalSockets;


/*
 * Test different brands of plugs.
 */
public final class TestPlugs{

	public static void main (String args[]){
		testGermanToUKAdapter();
		testUKToGermanAdapter();
	}


	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testGermanToUKAdapter(){
		/* create a germany plug connector (brand: zest) */
		GermanPlugConnector plug = new ZestPlug();
		/* create a UK socket */
		UKElectricalSocket socket = new UKElectricalSocket();
		/* create an adapter */
		UKPlugConnector ukAdapter = new GermanToUKPlugConnectorAdapter(plug);
		/* use this adapter in a UK socket */
		socket.plugIn(ukAdapter);
		
	}

	/*	
	 *	Test Method for testing GermanToUK Adapter.
	 */
	public static void testUKToGermanAdapter(){
		/* create a uk plug connector (brand: furutech) */
		FurutechPlug plug2 = new FurutechPlug();
		/* create a UK socket */
		UKElectricalSocket socket2 = new UKElectricalSocket();
		/* create an adapter */
		GermanToUKPlugConnectorAdapter germanAdapter = new GermanToUKPlugConnectorAdapter(plug2);
		/* use this adapter in a UK socket */
		socket2.plugIn(germanAdapter);
	}
}
