package io.renren.modules.job.dao;

import io.renren.modules.sys.dao.BaseDao;
import io.renren.modules.job.entity.ScheduleJobEntity;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 定时任务
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月1日 下午10:29:57
 */
@Repository
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);

	/**
	 * 更新单个
	 */
	int updateOne();
}
