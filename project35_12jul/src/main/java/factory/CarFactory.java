package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carFactory")
public class CarFactory {
	private Connection conn = null;
	private final DataSource dataSource;

	@Autowired
	public CarFactory(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getMyConnection() throws SQLException {
		conn = dataSource.getConnection();
		return conn;
	}
}
