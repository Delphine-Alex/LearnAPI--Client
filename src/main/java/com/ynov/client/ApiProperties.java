package com.ynov.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.ynov.productapi")
public class ApiProperties {
	
	//sera associé au préfix et au nom de l'attirubut don com.ynov.productApi.url
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	} 
	
	

}
