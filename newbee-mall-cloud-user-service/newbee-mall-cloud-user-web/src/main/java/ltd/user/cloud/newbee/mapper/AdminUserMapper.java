package ltd.user.cloud.newbee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ltd.user.cloud.newbee.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

/**
* @author LXL
* @description 针对表【tb_newbee_mall_admin_user】的数据库操作Mapper
* @createDate 2023-03-21 21:50:59
* @Entity ltd.user.cloud.newbee.entity.AdminUser
*/
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    /**
     * 登陆方法
     *
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    AdminUser selectByPrimaryKey(Long adminUserId);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}




