package cn.codepeople.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.codepeople.entity.VVideo;

public interface VVideoMapper extends BaseMapper<VVideo>{
    int deleteByPrimaryKey(String id);

    int insertSelective(VVideo record);

    VVideo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(VVideo record);

    int updateByPrimaryKey(VVideo record);

	/**
	 * @Title: selectListVideo
	 * @Description: 
	 * @Author 刘仁
	 * @DateTime 2019年11月12日 下午5:46:32
	 * @return 
	 */
	List<VVideo> selectListVideo();
}