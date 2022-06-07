package springbootcourse.albin.squeed.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.stream.IntStream;

@SpringBootApplication
public class FizzbuzzApplication {
	private static Logger LOG = LoggerFactory.getLogger(FizzbuzzApplication.class);

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {
			IntStream.range(1, 100).forEach(number -> {
				String output = "";

				output +=  (number % 3)  == 0 ? "Fizz" : "";
				output +=  (number % 5)  == 0 ? "Buzz" : "";

				LOG.info(output.isEmpty() ? String.valueOf(number) : output);
			});

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzbuzzApplication.class, args);
	}

}
