package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext417Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext417Application.class })
public class CucumberSpingConfiguration {}
