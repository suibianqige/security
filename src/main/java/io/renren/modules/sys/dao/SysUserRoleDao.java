package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.SysUserRoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户与角色对应关系
 *
 */
@Repository
public interface SysUserRoleDao extends BaseDao<SysUserRoleEntity> {
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);
}
