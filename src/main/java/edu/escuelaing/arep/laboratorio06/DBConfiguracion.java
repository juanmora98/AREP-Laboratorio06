package edu.escuelaing.arep.laboratorio06;

import java.sql.SQLException;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;


@Component
public class DBConfiguracion {
	
	@Value("${spring.datasource.url}")
	private String dBUrl;
	@Value("${spring.datasource.username}")
	private String dBUserName;
	@Value("${spring.datasource.password}")
	private String dBPassword;
	
	@Bean
	public DataSource dataSource() throws SQLException {
		if (dBUrl == null || dBUrl.isEmpty()) {
			return new HikariDataSource();
		} else {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(dBUrl);
			config.setUsername(dBUserName);
			config.setPassword(dBPassword);
			config.setMaximumPoolSize(5);
			return new HikariDataSource(config);
		}
	}
	
}
