package guru.springframework.jdbc;

import guru.springframework.jdbc.repositories.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SdjpaJdbcApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Test
	void contextLoads() {
		assertNotNull(authorRepository);
	}
}
