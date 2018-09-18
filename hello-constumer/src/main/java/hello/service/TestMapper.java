package hello.service;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {

    public List<String> getinfo();
}
