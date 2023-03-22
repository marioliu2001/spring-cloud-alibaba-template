package ltd.user.cloud.newbee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: NewBeeMallCloudUserServiceApplication
 * Description:
 *
 * @Author Mario liu
 * @Create 2023/3/21 21:19
 * @Version 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("ltd.user.cloud.newbee.mapper")
public class NewBeeMallCloudUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewBeeMallCloudUserServiceApplication.class, args);
    }
}
