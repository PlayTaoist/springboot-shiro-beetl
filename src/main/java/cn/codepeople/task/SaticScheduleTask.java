/**
 * @Title: SaticScheduleTask.java
 * @Package cn.codepeople.task
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午3:37:02
 * @version V1.0
 */

package cn.codepeople.task;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import cn.codepeople.entity.RegionDTO;
import cn.codepeople.entity.VVideotype;
import cn.codepeople.service.VVideoTypeService;
import cn.codepeople.util.RegionCodeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: SaticScheduleTask
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午3:37:02 
 */
@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
@Slf4j
public class SaticScheduleTask {
	
	@Autowired
	private VVideoTypeService vService;
	
	@Scheduled(cron = "0/5 * * * * ?")
	private void execlImportTasks() {
		ExcelReader reader = ExcelUtil.getReader(FileUtil.file("D:/电信工地监控点位.xls"));
		List<Map<String,Object>> readAll = reader.readAll();
		for (int i = 0; i < readAll.size(); i++) {
			log.info("第{}行：{}",i,readAll.get(i));
			Map<String,Object> map = readAll.get(i);
			VVideotype entity = new VVideotype();
			entity.setSortnumber(String.valueOf(i));
			entity.setTypename(map.get("项目名称").toString());
			entity.setDeleted(true);
			entity.setDescription(map.get("项目名称").toString());
			entity.setGroupid("297eaffd658dec7b01658e050ad8000a");
			entity.setCarrieroperator("电信");
			entity.setOperatortelephone("10000");
			entity.setOperatorshorthand("dianxin");
			entity.setSortnum(0);
			RegionDTO regionCode = RegionCodeUtil.getRegionCodeByName(map.get("区域").toString());
			entity.setRegioncode(regionCode.getRegionCode());
			entity.setParenttype(regionCode.getPid());
			vService.findOneByRegionCode(entity,map);
		}
		
    }
	
	
}
