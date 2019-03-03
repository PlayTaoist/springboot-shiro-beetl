/**   
 * @author lr
 * @date 2019年3月3日 下午2:28:53 
 * @version V1.0.0   
 */
package cn.codepeople.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String password;
    private String perms;
}
