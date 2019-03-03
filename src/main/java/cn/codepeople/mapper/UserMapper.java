/**   
 * @author lr
 * @date 2019年3月3日 下午2:30:25 
 * @version V1.0.0   
 */
package cn.codepeople.mapper;

import cn.codepeople.entity.User;

public interface UserMapper {

    public User findByName(String name);
    
    public User selectByPrimaryKey(Integer id);
}
