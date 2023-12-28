package com.concertbuddy.concertbuddyconcert;

import com.concertbuddy.concertbuddyconcert.concert.ConcertRepository;
import com.concertbuddy.concertbuddyconcert.concert.ConcertService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConcertbuddyconcertApplicationTests {

	@Autowired
	private ConcertService service;

	@MockBean
	private ConcertRepository repository;

	@Test
	public void testCICDEndpointReturnCorrectString() {
		assertEquals(service.cicdTest(), "This endpoint is reserved for CI/CD demo. Changed for CI/CD demo.");
	}

}
