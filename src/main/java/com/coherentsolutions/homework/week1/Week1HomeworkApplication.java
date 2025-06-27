package com.coherentsolutions.homework.week1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Application for Week 1 Homework: Basic AI Text Responder
 * 
 * This application demonstrates:
 * - Spring Boot + Spring AI integration
 * - REST API design for AI text generation
 * - Configuration management for AI models
 * - Error handling patterns for external API calls
 * - Structured logging for AI applications
 * 
 * Learning Objectives:
 * - Understand Spring AI framework architecture
 * - Practice OpenAI API integration via Spring AI
 * - Implement REST endpoints for AI services
 * - Configure external API parameters
 * - Handle AI service errors gracefully
 * 
 * @author Student Name
 * @version 1.0
 * @see com.coherentsolutions.homework.week1.controller.TextGeneratorController
 * @see com.coherentsolutions.homework.week1.service.TextGeneratorService
 */
@SpringBootApplication
public class Week1HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week1HomeworkApplication.class, args);
    }
}