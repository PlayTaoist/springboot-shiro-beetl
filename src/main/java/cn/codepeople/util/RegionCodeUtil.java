/**
 * @Title: RegionCodeUtil.java
 * @Package cn.codepeople.util
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:21:48
 * @version V1.0
 */

package cn.codepeople.util;

import cn.codepeople.entity.RegionDTO;

/**
 * @ClassName: RegionCodeUtil
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:21:48 
 */

public class RegionCodeUtil {

	public static RegionDTO getRegionCodeByName(String typename) {
		RegionDTO dto = new RegionDTO();
		switch (typename) {
		case "海口市":
			dto.setRegionCode("460101");
			dto.setPid("p_001");
			break;
		case "三亚市":
			dto.setRegionCode("460201");
			dto.setPid("p_002");
			break;
		case "三沙市":
			dto.setRegionCode("460300");
			dto.setPid("p_003");
			break;
		case "儋州市":
			dto.setRegionCode("460400");
			dto.setPid("p_004");
			break;
		case "五指山市":
			dto.setRegionCode("469001");
			dto.setPid("p_005");
			break;
		case "琼海市":
			dto.setRegionCode("469002");
			dto.setPid("p_006");
			break;
		case "文昌市":
			dto.setRegionCode("469005");
			dto.setPid("p_007");
			break;
		case "万宁市":
			dto.setRegionCode("469006");
			dto.setPid("p_008");
			break;
		case "东方市":
			dto.setRegionCode("469007");
			dto.setPid("p_009");
			break;
		case "定安县":
			dto.setRegionCode("469021");
			dto.setPid("p_010");
			break;
		case "屯昌县":
			dto.setRegionCode("469022");
			dto.setPid("p_011");
			break;
		case "澄迈县":
			dto.setRegionCode("469023");
			dto.setPid("p_012");
			break;
		case "临高县":
			dto.setRegionCode("469024");
			dto.setPid("p_013");
			break;
		case "白沙县":
			dto.setRegionCode("469025");
			dto.setPid("p_014");
			break;
		case "昌江县":
			dto.setRegionCode("469026");
			dto.setPid("p_015");
			break;
		case "乐东县":
			dto.setRegionCode("469027");
			dto.setPid("p_016");
			break;
		case "陵水县":
			dto.setRegionCode("469028");
			dto.setPid("p_017");
			break;
		case "保亭县":
			dto.setRegionCode("469029");
			dto.setPid("p_018");
			break;
		case "琼中县":
			dto.setRegionCode("469030");
			dto.setPid("p_019");
			break;
		case "洋浦经济区":
			dto.setRegionCode("460194");
			dto.setPid("p_020");
			break;
		case "三亚产业园":
			dto.setRegionCode("460291");
			dto.setPid("p_021");
			break;
		case "海口秀英区":
			dto.setRegionCode("460105");
			dto.setPid("p_022");
			break;
		case "海口龙华区":
			dto.setRegionCode("460106");
			dto.setPid("p_023");
			break;
		case "海口琼山区":
			dto.setRegionCode("460107");
			dto.setPid("p_024");
			break;
		case "海口美兰区":
			dto.setRegionCode("460108");
			dto.setPid("p_025");
			break;
		case "海口桂林洋":
			dto.setRegionCode("460192");
			dto.setPid("p_026");
			break;
		case "海口保税区":
			dto.setRegionCode("460193");
			dto.setPid("p_027");
			break;
		case "海口高新区":
			dto.setRegionCode("460191");
			dto.setPid("p_028");
			break;
		default:
			break;
		}
		
		return dto;
	}
}
