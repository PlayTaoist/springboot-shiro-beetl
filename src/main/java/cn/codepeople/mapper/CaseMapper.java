/**
 * @Title: CaseMapper.java
 * @Package cn.codepeople.mapper
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:14:41
 * @version V1.0
 */

package cn.codepeople.mapper;

import cn.codepeople.entity.CaseEntity;

/**
 * @ClassName: CaseMapper
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:14:41 
 */

public interface CaseMapper {

	/**
	 * @Title: insertCase
	 * @Description: 
	 * @Author 刘仁
	 * @DateTime 2019年10月31日 下午7:20:21
	 * @param caseEntity
	 * @return 
	 */
	
	void insertSelective(CaseEntity caseEntity);

}
