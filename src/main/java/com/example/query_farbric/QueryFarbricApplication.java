package com.example.query_farbric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;

@SpringBootApplication
@EnableElasticsearchAuditing
public class QueryFarbricApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueryFarbricApplication.class, args);
	}

}
