package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaAuthMapper;
import drizzt.model.CiaAuth;
import drizzt.model.CiaAuthExample;

@Service
public class CiaAuthService{
	
	@Resource
	private CiaAuthMapper CiaAuthMapper;
	
	public void addCiaAuth(CiaAuth ciaAuth) {
		CiaAuthMapper.insertSelective(ciaAuth);
	}
	
	public void delCiaAuthById(Integer id) {
		CiaAuthMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaAuth(CiaAuth ciaAuth) {
		CiaAuthMapper.updateByPrimaryKeySelective(ciaAuth);
	}
	
	public CiaAuth getCiaAuthById(Integer id) {
		return CiaAuthMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaAuth> getPageCiaAuth(CiaAuthExample ciaAuthExample) {
		return CiaAuthMapper.selectPage(ciaAuthExample);
	}
	
	public int countCiaAuth(CiaAuthExample ciaAuthExample) {
		return CiaAuthMapper.countByExample(ciaAuthExample);
	}
}
