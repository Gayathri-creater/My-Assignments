package week3.day1;

public class APIClient {
	
	public void sendRequest(String Endpoint) {
		System.out.println("Endpoint of the client: " + Endpoint );
	}
	public void sendRequest(String Endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint of the client: " + Endpoint);
		System.out.println("Request Body: " + requestBody );
		System.out.println("Request status:  " + requestStatus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		APIClient client = new APIClient();
		client.sendRequest("Server");
		client.sendRequest("Message from Server", "Message", true);
		
	

	}

}
