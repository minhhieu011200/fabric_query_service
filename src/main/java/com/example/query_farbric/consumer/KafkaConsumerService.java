package com.example.query_farbric.consumer;

import java.util.List;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import com.example.query_farbric.entities.Category;
import com.example.query_farbric.entities.Entities;
import com.example.query_farbric.entities.EventType;
import com.example.query_farbric.entities.Product;
import com.example.query_farbric.service.CategoryQueryService;
import com.example.query_farbric.service.ICategoryQueryService;
import com.example.query_farbric.service.IProductQueryService;
import com.example.query_farbric.service.ProductQueryService;
import com.example.query_farbric.util.Constant;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class KafkaConsumerService {

	@Autowired
	ICategoryQueryService categoryQueryService;

	@Autowired
	IProductQueryService productQueryService;
	
	@KafkaListener(topics = "test", groupId = "fsdfdfdsfsf")
	public void listen(ConsumerRecord<String, String> records) {
		try {

			String message = records.value();
			log.info("Received message: " + message);

			// Process each message
			ObjectMapper objectMapper = new ObjectMapper();
			EventType<String> messageObj = objectMapper.readValue(message, EventType.class);

			if (messageObj.getEventType().equals(Constant.EVENT_ADD_CATEGORY)||messageObj.getEventType().equals(Constant.EVENT_UPDATE_CATEGORY)) {
				Category category = objectMapper.readValue(messageObj.getPayload(), Category.class);
					categoryQueryService.save(category);
			}
			else if (messageObj.getEventType().equals(Constant.EVENT_ADD_PRODUCT)) {
				Product product = objectMapper.readValue(messageObj.getPayload(), Product.class);
				productQueryService.save(product);
			}



		} catch (Exception e) {
			// Handle the exception
			System.err.println("Error processing batch: " + e.getMessage());
			// You may decide not to acknowledge the message, leaving it uncommitted
		}
	}
}
