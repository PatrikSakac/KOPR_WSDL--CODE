package sk.kopr.ajs.klient;

public class Client {

	public static void main(String[] args) throws SubjectExist_Exception {
		
		String name = "KOPR " + Math.random();
		
		AJSService service = new AJSService();
		AJSPort port = service.getAJSPort();

		AddSubjectRequest request = new AddSubjectRequest();
		request.setSubjectName(name);

		AddSubjectResponse response = port.addSubject(request);

		System.out.println("id: " + response.getSubjectUUID());

		//test ci vyhodi spravnu exception
		port.addSubject(request);
	}

}
