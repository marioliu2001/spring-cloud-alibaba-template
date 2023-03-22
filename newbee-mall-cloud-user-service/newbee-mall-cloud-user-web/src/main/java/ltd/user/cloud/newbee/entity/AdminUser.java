package ltd.user.cloud.newbee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName tb_newbee_mall_admin_user
 */
@TableName(value ="tb_newbee_mall_admin_user")
@Data
public class AdminUser implements Serializable {
    /**
     * 管理员id
     */
    @TableId(type = IdType.AUTO)
    private Long adminUserId;

    /**
     * 管理员登陆名称
     */
    private String loginUserName;

    /**
     * 管理员登陆密码
     */
    private String loginPassword;

    /**
     * 管理员显示昵称
     */
    private String nickName;

    /**
     * 是否锁定 0未锁定 1已锁定无法登陆
     */
    private Integer locked;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}