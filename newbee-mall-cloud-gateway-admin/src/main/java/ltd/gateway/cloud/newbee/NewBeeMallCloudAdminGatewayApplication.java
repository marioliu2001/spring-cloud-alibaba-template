package ltd.gateway.cloud.newbee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName: NewBeeMallCloudAdminGatewayApplication
 * Description:
 *
 * @Author Mario liu
 * @Create 2023/3/21 21:23
 * @Version 0.0.1
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NewBeeMallCloudAdminGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewBeeMallCloudAdminGatewayApplication.class, args);
    }
}
