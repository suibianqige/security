package io.renren.modules.job.dao;

import io.renren.modules.sys.dao.BaseDao;
import io.renren.modules.job.entity.ScheduleJobLogEntity;
import org.springframework.stereotype.Repository;

/**
 * 定时任务日志
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月1日 下午10:30:02
 */
@Repository
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
