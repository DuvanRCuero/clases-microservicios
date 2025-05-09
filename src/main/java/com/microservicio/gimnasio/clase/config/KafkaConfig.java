package com.microservicio.gimnasio.clase.config;

import com.microservicio.gimnasio.clase.dto.OcupacionClase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaConfig {
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate(ProducerFactory<String,
            String> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}