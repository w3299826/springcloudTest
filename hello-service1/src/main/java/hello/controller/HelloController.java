package hello.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("server")
@Api("swaggerDemoController相关的api")
public class HelloController {
	
	
	@ApiOperation(value = "根据id", notes = "走")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String index(@ApiParam(value = "案件ID", required = true)@PathVariable int id) {
        return "Hello World";
    }
	
	@ApiOperation(value = "测试", notes = "测试",produces = "application/json")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String hello(@ApiParam(value = "案件ID", required = true)@RequestParam int id) {
	    return "Hello World";
	}
}
