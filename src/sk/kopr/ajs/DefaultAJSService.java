package sk.kopr.ajs;

import javax.jws.WebService;

@WebService(
	endpointInterface="sk.kopr.ajs.AJSPort",
	targetNamespace="http://localhost:8080/ajs?wsdl",
	serviceName="AJSService",
	portName="AJSPort",
	wsdlLocation="./ajs.wsdl"
)
public class DefaultAJSService {

	 public AddSubjectResponse addSubject(AddSubjectRequest parameters) throws SubjectExist_Exception
	 {
		 AddSubjectResponse response = new AddSubjectResponse();
		 String uuid = Factory.INSTANCE.getSubjectDao().addSubject(parameters.subjectName);
		 response.setSubjectUUID(uuid);
		 return response;
	 }
			 
}
