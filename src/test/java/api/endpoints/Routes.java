package api.endpoints;

public class Routes {
	
	public static String base_url = "https://utilipay-v2-api-preprod.azurewebsites.net";
	
	//EMS end points
	public static String auth_url = base_url + "/api/SecurityToken";
	public static String ems_vend = base_url + "/api/EMS/Vend";
	public static String confirm_transaction = base_url + "/api/EMS/ConfirmTransaction";
	public static String cancel_transaction = base_url + "/api/EMS/CancelTransaction";
	
	//Engineering end points
	public static String issue_credit_token = base_url + "/api/Engineering/IssueCreditToken?"
			+ "meterNumber=00000000018&supplyGroupCode=813"
			+ "&keyRevisionNumber=1&tariffIndex=1&transferAmount=100&ea=7&tct=2&"
			+ "ken=255&tokenTime=0&flags=0&subClass=1&allowKrnUpdate=true";

}
