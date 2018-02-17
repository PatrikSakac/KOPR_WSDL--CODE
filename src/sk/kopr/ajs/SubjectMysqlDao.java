package sk.kopr.ajs;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class SubjectMysqlDao implements SubjectDao {

	private JdbcTemplate template;

	public SubjectMysqlDao(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public String addSubject(String name) throws SubjectExist_Exception {
		if(getUUID(name) != null)
			throw new SubjectExist_Exception("Subject already exist!", new SubjectExist());

		String sql = "INSERT INTO subject (name) VALUES (?);";
		template.update(sql, new Object[] { name });

		return getUUID(name);
	}

	@Override
	public void removeSubject(String uuid) {

		String sql = "DELETE FROM subject WHERE uuid = ?;";
		template.update(sql, new Object[] { uuid });
	}

	@Override
	public int countSubjects() {
		String sql = "SELECT count(*) FROM subject;";
		return template.queryForInt(sql);
	}

	@Override
	public String getUUID(String name) {
		String sql = "SELECT uuid FROM subject WHERE name = ?;";
		try {
			Object result = template.queryForObject(sql, new Object[] { name }, String.class);
			return (String) result;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

}
