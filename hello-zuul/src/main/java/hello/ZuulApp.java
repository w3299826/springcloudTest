package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(ZuulApp.class, args);
	}
}
