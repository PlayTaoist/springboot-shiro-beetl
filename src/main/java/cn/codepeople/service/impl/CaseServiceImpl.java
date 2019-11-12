/**
 * @Title: CaseServiceImpl.java
 * @Package cn.codepeople.service.impl
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:16:01
 * @version V1.0
 */

package cn.codepeople.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codepeople.entity.CaseEntity;
import cn.codepeople.mapper.CaseMapper;
import cn.codepeople.service.CaseService;

/**
 * @ClassName: CaseServiceImpl
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年10月31日 下午7:16:01 
 */
@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	private CaseMapper caseMapper;
	/*
	 * <p>Title: insertCase</p>
	 * <p>Description: </p>
	 * @Author 刘仁
	 * @DateTime 2019年10月31日 下午7:19:23
	 * @param caseEntity
	 * @return 
	 * @see cn.codepeople.service.CaseService#insertCase(cn.codepeople.entity.CaseEntity) 
	 */
	
	@Override
	public void insertCase(CaseEntity caseEntity) {
		
		caseMapper.insertSelective(caseEntity);
	}

}
