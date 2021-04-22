package example;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
public class ExampleApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ExampleApp.class)
				.bannerMode(Banner.Mode.OFF)
				.web(WebApplicationType.REACTIVE)
				.run(args);
    }
}
