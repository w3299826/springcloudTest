package hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	
    
        @Autowired
        private TestMapper testMapper;
    
    
    
	   @Autowired
	    RestTemplate restTemplate;

	    @HystrixCommand(fallbackMethod = "errorMsg")
	    public List<String> consumer() {
	        // 调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
	       
	        return testMapper.getinfo();
	    }

	    public String errorMsg() {
	        return "error!!!";
	    }
	
}
