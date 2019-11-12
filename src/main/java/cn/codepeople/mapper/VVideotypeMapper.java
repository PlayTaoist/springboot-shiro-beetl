package cn.codepeople.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.codepeople.entity.VVideotype;

public interface VVideotypeMapper extends BaseMapper<VVideotype>{

	/**
	 * @Title: selectListVO
	 * @Description: 
	 * @Author 刘仁
	 * @DateTime 2019年11月12日 下午4:35:42
	 * @return 
	 */
	List<VVideotype> selectListVO();
  
}