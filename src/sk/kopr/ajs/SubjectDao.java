package sk.kopr.ajs;

public interface SubjectDao {

	public String addSubject(String name) throws SubjectExist_Exception;
	
	public void removeSubject(String uuid);
	
	public int countSubjects();
	
	public String getUUID(String name);
}
