package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaAppMapper;
import drizzt.model.CiaApp;
import drizzt.model.CiaAppExample;

@Service
public class CiaAppService{
	
	@Resource
	private CiaAppMapper CiaAppMapper;
	
	public void addCiaApp(CiaApp ciaApp) {
		CiaAppMapper.insertSelective(ciaApp);
	}
	
	public void delCiaAppById(Integer id) {
		CiaAppMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaApp(CiaApp ciaApp) {
		CiaAppMapper.updateByPrimaryKeySelective(ciaApp);
	}
	
	public CiaApp getCiaAppById(Integer id) {
		return CiaAppMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaApp> getPageCiaApp(CiaAppExample ciaAppExample) {
		return CiaAppMapper.selectPage(ciaAppExample);
	}
	
	public int countCiaApp(CiaAppExample ciaAppExample) {
		return CiaAppMapper.countByExample(ciaAppExample);
	}
}
