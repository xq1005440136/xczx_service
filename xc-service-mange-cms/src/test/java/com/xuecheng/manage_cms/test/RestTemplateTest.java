package com.xuecheng.manage_cms.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RestTemplateTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void getDataUrl(){
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:31001/config/getModel/5a791725dd573c3574ee333f", String.class);

        System.out.println(forEntity.getBody());

    }
}
