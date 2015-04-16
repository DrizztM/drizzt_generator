package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaAuthBindingMapper;
import drizzt.model.CiaAuthBinding;
import drizzt.model.CiaAuthBindingExample;

@Service
public class CiaAuthBindingService{
	
	@Resource
	private CiaAuthBindingMapper CiaAuthBindingMapper;
	
	public void addCiaAuthBinding(CiaAuthBinding ciaAuthBinding) {
		CiaAuthBindingMapper.insertSelective(ciaAuthBinding);
	}
	
	public void delCiaAuthBindingById(Integer id) {
		CiaAuthBindingMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaAuthBinding(CiaAuthBinding ciaAuthBinding) {
		CiaAuthBindingMapper.updateByPrimaryKeySelective(ciaAuthBinding);
	}
	
	public CiaAuthBinding getCiaAuthBindingById(Integer id) {
		return CiaAuthBindingMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaAuthBinding> getPageCiaAuthBinding(CiaAuthBindingExample ciaAuthBindingExample) {
		return CiaAuthBindingMapper.selectPage(ciaAuthBindingExample);
	}
	
	public int countCiaAuthBinding(CiaAuthBindingExample ciaAuthBindingExample) {
		return CiaAuthBindingMapper.countByExample(ciaAuthBindingExample);
	}
}
