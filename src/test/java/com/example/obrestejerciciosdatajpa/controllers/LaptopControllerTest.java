package com.example.obrestejerciciosdatajpa.controllers;

import com.example.obrestejerciciosdatajpa.entities.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LaptopControllerTest {
//    private TestRestTemplate testRestTemplate;
//    private RestTemplateBuilder restTemplateBuilder;
//    private int port;
//
//    @BeforeEach
//    void setUp() {
////        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
////        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
//    }
//
//    @Test
//    void findAll() {
//        ResponseEntity<Laptop[]> response = testRestTemplate.getForEntity("/api/books", Laptop[].class);
//
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        assertEquals(200, response.getStatusCodeValue());
//        List<Laptop> books = Arrays.asList(response.getBody());
//        System.out.println(books.size());
//    }
//
//    @Test
//    void findOneById() {
//        ResponseEntity<Laptop> response = testRestTemplate.getForEntity("/api/books/1", Laptop.class);
//
//        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//    }
//
//    @Test
//    void create() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//        String json = """
//                {\s
//                        "brand": "MacBook 12",
//                        "model": "Pro",
//                        "processor": "A2",
//                        "price": 1200.99
//                }
//                """;
//
//        HttpEntity<String> request = new HttpEntity<>(json, headers);
//        ResponseEntity<Laptop> response = testRestTemplate.exchange("/api/books", HttpMethod.POST, request, Laptop.class);
//
//        Laptop result = response.getBody();
//        assertEquals(1L, result.getId());
//        assertEquals("Fuego y Sangre", result.getBrand());
//    }
}