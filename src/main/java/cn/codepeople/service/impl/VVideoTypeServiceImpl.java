/**
 * @Title: VideoTypeServiceImpl.java
 * @Package cn.codepeople.service.impl
 * @Description: 
 * Copyright: Copyright (c) 2019 www.codepeople.cn Inc. All rights reserved. 
 * Website: www.codepeople.cn
 * 注意：本内容仅限于海南科澜技术信息有限公司内部传阅，禁止外泄以及用于其他的商业目 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:05:33
 * @version V1.0
 */

package cn.codepeople.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codepeople.entity.VVideo;
import cn.codepeople.entity.VVideotype;
import cn.codepeople.mapper.VVideoMapper;
import cn.codepeople.mapper.VVideotypeMapper;
import cn.codepeople.service.VVideoTypeService;
import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName: VideoTypeServiceImpl
 * @Description: 
 * @Author 刘仁
 * @DateTime 2019年11月11日 下午4:05:33 
 */
@Service
@Slf4j
public class VVideoTypeServiceImpl implements VVideoTypeService {

	@Autowired
	private VVideotypeMapper vMapper;
	@Autowired
	private VVideoMapper videoMapper;
	/*
	 * <p>Title: findOneByRegionCode</p>
	 * <p>Description: </p>
	 * @Author 刘仁
	 * @DateTime 2019年11月11日 下午4:32:51
	 * @param string
	 * @return 
	 * @see cn.codepeople.service.VVideoTypeService#findOneByRegionCode(java.lang.String) 
	 */
	
	@Override
	public void findOneByRegionCode(VVideotype entity,Map<String,Object> map) {
		// 获取区域编号
		//根据区域编号和项目名称获取信息
		VVideotype queryEntity = new VVideotype();
		queryEntity.setTypename(entity.getTypename().trim());
		queryEntity.setRegioncode(entity.getRegioncode());
		VVideotype vo = vMapper.selectOne(queryEntity);
		//如果查询到该信息就不做操作，如果查询不到该信息就添加进去
		if (vo == null) {
			//添加该信息其ID按照自增标准添加
				entity.setId("dx_" + (getVideoTypeMaxId() +1));
				//获取所有电信的数据的ID,然后排序。找到最大的然后+1
				entity.setUpdateTime(new Date());
				entity.setCreatetime(new Date());
				entity.setDeleted(false);
				log.info("=======>插入数据库v_videotype");
				vMapper.insert(entity);
			
		}else {
			VVideo video = new VVideo();
			video.setTypename(entity.getTypename());
			video.setTypeid(vo.getId());
			video.setVideoname(map.get("监控点名称").toString());
			video.setOperatorshorthand("dianxin");
			VVideo result_video = videoMapper.selectOne(video);
			video.setUpdateTime(new Date());
			video.setCreatetime(new Date());
			video.setDeleted(false);
			video.setVideoname(map.get("监控点名称").toString());
			video.setEnabled(true);
			video.setSortnumber(1L);
			video.setOnline(true);
			video.setGroupid("297eaffd658dec7b01658e050ad8000a");
			video.setCameratype("0");
			video.setEncoderuuid(map.get("通道编号").toString());
			video.setMemo(map.get("项目名称").toString());//备注
			video.setTypename(map.get("项目名称").toString());
			video.setOperatorshorthand("dianxin");
			if (result_video == null) {
				video.setId("dx_" + (getVideoMaxId() + 1));
				video.setTypeid(vo.getId());
				log.info("=======>插入数据库v_video");
				videoMapper.insert(video);
			}else {
				log.info("=======>更新数据库v_video");
				videoMapper.updateByPrimaryKeySelective(video);
			}
		}
	}

	public int getVideoMaxId() {
		Integer maxId=0;
		List<VVideo> listVideo = videoMapper.selectListVideo();
		List<Integer> listId = new ArrayList<>();
		if (listVideo.size()>0) {
			for (VVideo vVideo : listVideo) {
				listId.add(Integer.valueOf(vVideo.getId().substring(3)));
			}
			maxId = (Integer) Collections.max(listId);
		}
		log.info("=======>Video电信摄像头最大ID{}",maxId);
		return Integer.valueOf(maxId);
	}

	public int getVideoTypeMaxId() {
		Integer maxId=0;
		List<VVideotype> listVideo = vMapper.selectListVO();
		List<Integer> listId = new ArrayList<>();
		if (listVideo.size()>0) {
			for (VVideotype vVideo : listVideo) {
				listId.add(Integer.valueOf(vVideo.getId().substring(3)));
			}
			maxId = (Integer) Collections.max(listId);
		}
		log.info("=======>VideoType电信摄像头最大ID{}",maxId);
		return Integer.valueOf(maxId);
	}
}
