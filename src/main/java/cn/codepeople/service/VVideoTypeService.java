/**
 * @Title: VideoTypeService.java
 * @Package cn.codepeople.service.impl
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:04:53
 * @version V1.0
 */

package cn.codepeople.service;

import java.util.Map;

import cn.codepeople.entity.VVideotype;

/**
 * @ClassName: VideoTypeService
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:04:53 
 */

public interface VVideoTypeService {

	/**
	 * @Title: findOneByRegionCode
	 * @Description: 
	 * @Author 刘仁
	 * @DateTime 2019年11月11日 下午4:32:40
	 * @param entity
	 * @return 
	 */
	void findOneByRegionCode(VVideotype entity,Map<String,Object> map);

}
