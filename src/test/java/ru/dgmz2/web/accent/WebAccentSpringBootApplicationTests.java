package ru.dgmz2.web.accent;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebAccentSpringBootApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class WebAccentSpringBootApplicationTests {
//	@Value("${myconf}")
//	private String config;

	@Test
	public void contextLoads() {
	}

	@Test
	public void config() {
//		Assert.assertEquals(config, "11111111111");
	}

}
