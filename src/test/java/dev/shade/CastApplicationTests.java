package dev.shade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import dev.shade.cast.CastApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CastApplication.class)
@WebAppConfiguration
public class CastApplicationTests {

	@Test
	public void contextLoads() {
	}

}
