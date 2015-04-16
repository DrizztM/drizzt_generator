package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaAuthSnMapper;
import drizzt.model.CiaAuthSn;
import drizzt.model.CiaAuthSnExample;

@Service
public class CiaAuthSnService{
	
	@Resource
	private CiaAuthSnMapper CiaAuthSnMapper;
	
	public void addCiaAuthSn(CiaAuthSn ciaAuthSn) {
		CiaAuthSnMapper.insertSelective(ciaAuthSn);
	}
	
	public void delCiaAuthSnById(Integer id) {
		CiaAuthSnMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaAuthSn(CiaAuthSn ciaAuthSn) {
		CiaAuthSnMapper.updateByPrimaryKeySelective(ciaAuthSn);
	}
	
	public CiaAuthSn getCiaAuthSnById(Integer id) {
		return CiaAuthSnMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaAuthSn> getPageCiaAuthSn(CiaAuthSnExample ciaAuthSnExample) {
		return CiaAuthSnMapper.selectPage(ciaAuthSnExample);
	}
	
	public int countCiaAuthSn(CiaAuthSnExample ciaAuthSnExample) {
		return CiaAuthSnMapper.countByExample(ciaAuthSnExample);
	}
}
