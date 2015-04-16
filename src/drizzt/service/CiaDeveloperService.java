package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaDeveloperMapper;
import drizzt.model.CiaDeveloper;
import drizzt.model.CiaDeveloperExample;

@Service
public class CiaDeveloperService{
	
	@Resource
	private CiaDeveloperMapper CiaDeveloperMapper;
	
	public void addCiaDeveloper(CiaDeveloper ciaDeveloper) {
		CiaDeveloperMapper.insertSelective(ciaDeveloper);
	}
	
	public void delCiaDeveloperById(Integer id) {
		CiaDeveloperMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaDeveloper(CiaDeveloper ciaDeveloper) {
		CiaDeveloperMapper.updateByPrimaryKeySelective(ciaDeveloper);
	}
	
	public CiaDeveloper getCiaDeveloperById(Integer id) {
		return CiaDeveloperMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaDeveloper> getPageCiaDeveloper(CiaDeveloperExample ciaDeveloperExample) {
		return CiaDeveloperMapper.selectPage(ciaDeveloperExample);
	}
	
	public int countCiaDeveloper(CiaDeveloperExample ciaDeveloperExample) {
		return CiaDeveloperMapper.countByExample(ciaDeveloperExample);
	}
}
