package cn.ivan.athenamonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanqi
 * @date 2019-11-02
 */
@SpringBootApplication
@EnableAdminServer
public class AthenaMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AthenaMonitorApplication.class, args);
    }

}
