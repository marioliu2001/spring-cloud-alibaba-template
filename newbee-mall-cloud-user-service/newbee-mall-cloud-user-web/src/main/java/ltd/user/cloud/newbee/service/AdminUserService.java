package ltd.user.cloud.newbee.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ltd.user.cloud.newbee.entity.AdminUser;

/**
* @author LXL
* @description 针对表【tb_newbee_mall_admin_user】的数据库操作Service
* @createDate 2023-03-21 21:50:59
*/
public interface AdminUserService extends IService<AdminUser> {
    /**
     * 登录
     * @param userName
     * @param password
     * @return
     */
    String login(String userName, String password);

    /**
     * 获取用户信息
     *
     * @param loginUserId
     * @return
     */
    AdminUser getUserDetailById(Long loginUserId);

    /**
     * 修改当前登录用户的密码
     *
     * @param loginUserId
     * @param originalPassword
     * @param newPassword
     * @return
     */
    Boolean updatePassword(Long loginUserId, String originalPassword, String newPassword);

    /**
     * 修改当前登录用户的名称信息
     *
     * @param loginUserId
     * @param loginUserName
     * @param nickName
     * @return
     */
    Boolean updateName(Long loginUserId, String loginUserName, String nickName);

    /**
     * 登出接口
     * @param token
     * @return
     */
    Boolean logout(String token);
}
