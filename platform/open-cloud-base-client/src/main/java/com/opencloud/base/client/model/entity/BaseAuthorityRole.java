package com.opencloud.base.client.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.opencloud.common.mybatis.base.entity.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 系统权限-角色关联
 * @author liuyadu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@TableName("base_authority_role")
public class BaseAuthorityRole extends AbstractEntity {
    /**
     * 权限ID
     */
    @TableId("authority_id")
    private Long authorityId;

    /**
     * 角色ID
     */
    @TableId("role_id")
    private Long roleId;

    /**
     * 过期时间:null表示长期
     */
    private Date expireTime;

    private static final long serialVersionUID = 1L;
}
