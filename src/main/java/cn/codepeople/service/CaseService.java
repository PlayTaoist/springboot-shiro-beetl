/**
 * @Title: CaseService.java
 * @Package cn.codepeople.service
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:15:37
 * @version V1.0
 */

package cn.codepeople.service;

import cn.codepeople.entity.CaseEntity;

/**
 * @ClassName: CaseService
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:15:37 
 */

public interface CaseService {

	/**
	 * @Title: insertCase
	 * @Description: 
	 * @Author 刘仁
	 * @DateTime 2019年10月31日 下午7:19:15
	 * @param caseEntity
	 * @return 
	 */
	void insertCase(CaseEntity caseEntity);

}
