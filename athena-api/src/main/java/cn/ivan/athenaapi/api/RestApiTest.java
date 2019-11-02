package cn.ivan.athenaapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanqi
 * @date 2019-11-02 20:23
 */
@RestController
public class RestApiTest {

    @GetMapping("test/v1/ping")
    public String ping(){
        return "pong";
    }

}
