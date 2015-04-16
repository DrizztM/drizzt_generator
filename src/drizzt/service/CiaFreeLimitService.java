package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaFreeLimitMapper;
import drizzt.model.CiaFreeLimit;
import drizzt.model.CiaFreeLimitExample;

@Service
public class CiaFreeLimitService{
	
	@Resource
	private CiaFreeLimitMapper CiaFreeLimitMapper;
	
	public void addCiaFreeLimit(CiaFreeLimit ciaFreeLimit) {
		CiaFreeLimitMapper.insertSelective(ciaFreeLimit);
	}
	
	public void delCiaFreeLimitById(Integer id) {
		CiaFreeLimitMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaFreeLimit(CiaFreeLimit ciaFreeLimit) {
		CiaFreeLimitMapper.updateByPrimaryKeySelective(ciaFreeLimit);
	}
	
	public CiaFreeLimit getCiaFreeLimitById(Integer id) {
		return CiaFreeLimitMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaFreeLimit> getPageCiaFreeLimit(CiaFreeLimitExample ciaFreeLimitExample) {
		return CiaFreeLimitMapper.selectPage(ciaFreeLimitExample);
	}
	
	public int countCiaFreeLimit(CiaFreeLimitExample ciaFreeLimitExample) {
		return CiaFreeLimitMapper.countByExample(ciaFreeLimitExample);
	}
}
