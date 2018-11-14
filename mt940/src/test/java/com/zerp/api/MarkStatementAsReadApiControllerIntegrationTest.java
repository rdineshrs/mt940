package com.zerp.api;

import java.math.BigDecimal;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkStatementAsReadApiControllerIntegrationTest {

    @Autowired
    private MarkStatementAsReadApi api;

    @Test
    public void updateStatementAsReadTest() throws Exception {
        BigDecimal statementId = new BigDecimal();
        ResponseEntity<Void> responseEntity = api.updateStatementAsRead(statementId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
