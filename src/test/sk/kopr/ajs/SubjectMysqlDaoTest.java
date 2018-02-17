package test.sk.kopr.ajs;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import sk.kopr.ajs.Factory;
import sk.kopr.ajs.SubjectDao;
import sk.kopr.ajs.SubjectExist_Exception;

public class SubjectMysqlDaoTest {

	private static SubjectDao subjectDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		subjectDao = Factory.INSTANCE.getSubjectDao();
	}
	
	@Test
	public void addSubject() throws SubjectExist_Exception {
		int countBefore = subjectDao.countSubjects();
		
		String uuid = subjectDao.addSubject("KOPR " + Math.random());
		
		int countAfter = subjectDao.countSubjects();
		
		subjectDao.removeSubject(uuid);
		
		System.out.println("UUID: " + uuid);
		
		assertEquals(countBefore,countAfter - 1);
	}

}
