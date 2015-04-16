package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaPaySnMapper;
import drizzt.model.CiaPaySn;
import drizzt.model.CiaPaySnExample;

@Service
public class CiaPaySnService{
	
	@Resource
	private CiaPaySnMapper CiaPaySnMapper;
	
	public void addCiaPaySn(CiaPaySn ciaPaySn) {
		CiaPaySnMapper.insertSelective(ciaPaySn);
	}
	
	public void delCiaPaySnById(Integer id) {
		CiaPaySnMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaPaySn(CiaPaySn ciaPaySn) {
		CiaPaySnMapper.updateByPrimaryKeySelective(ciaPaySn);
	}
	
	public CiaPaySn getCiaPaySnById(Integer id) {
		return CiaPaySnMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaPaySn> getPageCiaPaySn(CiaPaySnExample ciaPaySnExample) {
		return CiaPaySnMapper.selectPage(ciaPaySnExample);
	}
	
	public int countCiaPaySn(CiaPaySnExample ciaPaySnExample) {
		return CiaPaySnMapper.countByExample(ciaPaySnExample);
	}
}
