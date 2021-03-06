package com.ontestautomation.workshops.wiremock.answers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;

import org.junit.Rule;
import org.junit.Test;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.ontestautomation.workshops.wiremock.answers.WireMockAnswers1;

public class WireMockAnswers1Tests {
	
	WireMockAnswers1 wma = new WireMockAnswers1();
	
	@Rule
	public WireMockRule wireMockRule = new WireMockRule(9876);
	
	@Test
	public void testExercise101() {
        
	    wma.setupStubExercise101();
	         
	    given().
	    when().
	        get("http://localhost:9876/exercise101").
	    then().
	    	log().
	    	body().
	    	and().
	        assertThat().
	        statusCode(200);
	}
	
	@Test
	public void testExercise102() {
        
	    wma.setupStubExercise102();
	         
	    given().
	    when().
	        get("http://localhost:9876/exercise102").
	    then().
	    	log().
	    	body().
	    	and().
	        assertThat().
	        contentType(ContentType.TEXT).
	        and().
	        body(equalTo("Exercise 102"));
	}

}
