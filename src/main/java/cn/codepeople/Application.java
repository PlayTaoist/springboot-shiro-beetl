/**   
 * @author lr
 * @date 2019年2月27日 上午9:31:20 
 * @version V1.0.0   
 */
package cn.codepeople;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cn.codepeople.mapper.**")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
