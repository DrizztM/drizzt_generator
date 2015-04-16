package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaDeviceAppMapper;
import drizzt.model.CiaDeviceApp;
import drizzt.model.CiaDeviceAppExample;

@Service
public class CiaDeviceAppService{
	
	@Resource
	private CiaDeviceAppMapper CiaDeviceAppMapper;
	
	public void addCiaDeviceApp(CiaDeviceApp ciaDeviceApp) {
		CiaDeviceAppMapper.insertSelective(ciaDeviceApp);
	}
	
	public void delCiaDeviceAppById(Integer id) {
		CiaDeviceAppMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaDeviceApp(CiaDeviceApp ciaDeviceApp) {
		CiaDeviceAppMapper.updateByPrimaryKeySelective(ciaDeviceApp);
	}
	
	public CiaDeviceApp getCiaDeviceAppById(Integer id) {
		return CiaDeviceAppMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaDeviceApp> getPageCiaDeviceApp(CiaDeviceAppExample ciaDeviceAppExample) {
		return CiaDeviceAppMapper.selectPage(ciaDeviceAppExample);
	}
	
	public int countCiaDeviceApp(CiaDeviceAppExample ciaDeviceAppExample) {
		return CiaDeviceAppMapper.countByExample(ciaDeviceAppExample);
	}
}
