package springbootcourse.albin.squeed.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@SpringBootApplication
public class CliApplication {

	private static Logger LOG = LoggerFactory.getLogger(CliApplication.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
		return restTemplateBuilder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms", HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
			});

			Objects.requireNonNull(rooms.getBody()).forEach(room ->
				LOG.info(room.toString())
			);

		};
	}
	public static void main(String[] args) {
		SpringApplication.run(CliApplication.class, args);
	}

}
