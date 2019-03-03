/**   
 * @author lr
 * @date 2019年3月3日 下午2:39:22 
 * @version V1.0.0   
 */
package cn.codepeople.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codepeople.entity.User;
import cn.codepeople.mapper.UserMapper;
import cn.codepeople.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
