/**   
 * @author lr
 * @date 2019年2月27日 上午10:01:04 
 * @version V1.0.0   
 */
package cn.codepeople.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.codepeople.entity.User;
import cn.codepeople.service.UserService;

public class UserRealm extends AuthorizingRealm{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private UserService userService;
    /*
     * Title: doGetAuthorizationInfo
     * Description: 执行授权逻辑
     * @param principals
     * @return 
     * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection) 
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // TODO Auto-generated method stub
        System.out.println("执行授权逻辑");
        SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();
        //authInfo.addStringPermission("sys:user:add");
        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        User entity = userService.selectByPrimaryKey(user.getId());
        authInfo.addStringPermission(entity.getPerms());
        LOGGER.info("授权完成");
        return authInfo;
    }

    /*
     * Title: doGetAuthenticationInfo
     *Description: 执行认证逻辑
     * @param token
     * @return
     * @throws AuthenticationException 
     * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) 
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        System.out.println("执行认证逻辑");
        UsernamePasswordToken  userToken =  (UsernamePasswordToken) token;
        
        User user = userService.findByName(userToken.getUsername());
        
        if (user==null) {
            return null;//会抛出UnknownAccountException异常
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), "");
    }

}
