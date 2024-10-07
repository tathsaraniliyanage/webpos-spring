package lk.ijse.gdse.webposspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Prabodha Thathsarani
 * @date 10/5/24
 * @project webpos-spring
 **/

@RestController
@RequestMapping("api/v1/health")
public class HealthCheckController {
    @GetMapping
    public String healthCheck(){
        System.out.println("healthcheck invoked");
        return "Health Check OK";
    }
}
