package assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:dbConfig.properties" })
public class Deatails {
	@Value("${DB.DriverClassName}")
	String DriverClassName;
	@Value("${DB.dburl}")
	String dburl;
	@Value("${DB.username}")
	String username;
	@Value("${DB.password}")
	String password;
	
	
	
	public String getDriverClassName() {
		return DriverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		DriverClassName = driverClassName;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	@Override
	public String toString() {
		return "Database \n[driverClassName=" + DriverClassName + "\n url=" + dburl + "\n username=" + username
				+ "\n password=" + password + "]";
	}
	
}
