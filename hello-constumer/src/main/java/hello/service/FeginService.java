package hello.service;

import io.swagger.annotations.ApiParam;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.service.impl.FeignServiceImpl;

@Service
@FeignClient(value="hello-server",fallback=FeignServiceImpl.class)
public interface FeginService {
	
	@RequestMapping(value="/server/test",method = RequestMethod.GET)
	public String hello(@RequestParam("id") int id);
}
