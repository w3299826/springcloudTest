package hello.service.impl;

import org.springframework.stereotype.Service;

import hello.service.FeginService;
@Service
public class FeignServiceImpl implements FeginService {

    @Override
    public String hello(int id) {
        // TODO Auto-generated method stub
        return "err";
    }

}
