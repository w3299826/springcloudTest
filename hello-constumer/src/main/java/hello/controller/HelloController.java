package hello.controller;

import hello.service.FeginService;
import hello.service.HelloService;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("constumer")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@Autowired
	private FeginService feginService;
	
	
	@ApiOperation(value="获取项目组Sonar对应的Url信息", notes="根据id获取项目组Sonar对应的Url信息")// 使用该注解描述接口方法信息
	@GetMapping("/cost")
	public List<String> hello(){
        return helloService.consumer();
	}
}
