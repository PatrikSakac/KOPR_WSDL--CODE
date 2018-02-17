package sk.kopr.ajs;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public enum Factory {

	INSTANCE;

	String url = "jdbc:mysql://localhost:3306/ajs?useUnicode=true&useJDBCCompliantTimezoneShift=true&serverTimezone=UTC&nullNamePatternMatchesAll=true";
	String username = "kopr";
	String password = "kopr";

	private JdbcTemplate jdbcTemplate;

	private SubjectDao subjectDao;

	private Factory() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser(username);
		dataSource.setPassword(password);
		dataSource.setURL(url);

		jdbcTemplate = new JdbcTemplate(dataSource);
		subjectDao = new SubjectMysqlDao(jdbcTemplate);
	}

	public SubjectDao getSubjectDao() {
		return subjectDao;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
