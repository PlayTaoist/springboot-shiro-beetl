/**   
 * @author lr
 * @date 2019年3月3日 下午8:59:35 
 * @version V1.0.0   
 */
package cn.codepeople.shiro;

import org.beetl.core.GroupTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibeetl.starter.BeetlTemplateCustomize;

@Configuration
public class BeetlConf {

    @Bean
    public BeetlTemplateCustomize beetlTemplateCustomize() {
        return new BeetlTemplateCustomize() {
            public void customize(GroupTemplate groupTemplate) {
                //将实现了shiro标签的beetl方法注册到groupTemplate里
                groupTemplate.registerFunctionPackage("so", new ShiroExt());
            }
        };
    }

 }
