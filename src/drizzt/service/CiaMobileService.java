package drizzt.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import drizzt.mapper.CiaMobileMapper;
import drizzt.model.CiaMobile;
import drizzt.model.CiaMobileExample;

@Service
public class CiaMobileService{
	
	@Resource
	private CiaMobileMapper CiaMobileMapper;
	
	public void addCiaMobile(CiaMobile ciaMobile) {
		CiaMobileMapper.insertSelective(ciaMobile);
	}
	
	public void delCiaMobileByMobileNumber(String mobileNumber) {
		CiaMobileMapper.deleteByPrimaryKey(mobileNumber);
	}
	
	public void updateCiaMobile(CiaMobile ciaMobile) {
		CiaMobileMapper.updateByPrimaryKeySelective(ciaMobile);
	}
	
	public CiaMobile getCiaMobileByMobileNumber(String mobileNumber) {
		return CiaMobileMapper.selectByPrimaryKey(mobileNumber);
	}
	
	public List<CiaMobile> getPageCiaMobile(CiaMobileExample ciaMobileExample) {
		return CiaMobileMapper.selectPage(ciaMobileExample);
	}
	
	public int countCiaMobile(CiaMobileExample ciaMobileExample) {
		return CiaMobileMapper.countByExample(ciaMobileExample);
	}
}
