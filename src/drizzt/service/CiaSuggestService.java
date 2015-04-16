package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaSuggestMapper;
import drizzt.model.CiaSuggest;
import drizzt.model.CiaSuggestExample;

@Service
public class CiaSuggestService{
	
	@Resource
	private CiaSuggestMapper CiaSuggestMapper;
	
	public void addCiaSuggest(CiaSuggest ciaSuggest) {
		CiaSuggestMapper.insertSelective(ciaSuggest);
	}
	
	public void delCiaSuggestById(Integer id) {
		CiaSuggestMapper.deleteByPrimaryKey(id);
	}
	
	public void updateCiaSuggest(CiaSuggest ciaSuggest) {
		CiaSuggestMapper.updateByPrimaryKeySelective(ciaSuggest);
	}
	
	public CiaSuggest getCiaSuggestById(Integer id) {
		return CiaSuggestMapper.selectByPrimaryKey(id);
	}
	
	public List<CiaSuggest> getPageCiaSuggest(CiaSuggestExample ciaSuggestExample) {
		return CiaSuggestMapper.selectPage(ciaSuggestExample);
	}
	
	public int countCiaSuggest(CiaSuggestExample ciaSuggestExample) {
		return CiaSuggestMapper.countByExample(ciaSuggestExample);
	}
}
