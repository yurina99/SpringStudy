package org.zerock.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try (Connection con =
				DriverManager.getConnection(
						"jdbc:mariadb://127.0.0.1:3306/yurina",
		                "yurina",
		                "yurina"
						))
		{
			log.info(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
