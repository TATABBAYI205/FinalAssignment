package Question11;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private JdbcUtil() {
	};

	static { // static block in Driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	public static Connection getJdbcConnection() throws SQLException, IOException {
		// Take the data from properties file
		FileInputStream fis = new FileInputStream("D:\\JavaDeveloper\\JDBCStanderdApp\\application.properties");
		Properties properties = new Properties();
		properties.load(fis);

		// Step2. Establish connection
		Connection connection = DriverManager.getConnection(properties.getProperty("jdbc:mysql://localhost:3306/abbayi"),
				properties.getProperty("root"), properties.getProperty("Abbayi@2000"));
		System.out.println("CONNECTION object created...");
		return connection;
	}

	public static void cleanUp(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
		// Step6. Close the resources
		if (connection != null) {
			connection.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}

	}
}
