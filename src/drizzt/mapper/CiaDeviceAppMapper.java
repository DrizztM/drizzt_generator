package drizzt.mapper;

import drizzt.model.CiaDeviceApp;
import drizzt.model.CiaDeviceAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaDeviceAppMapper {
    int countByExample(CiaDeviceAppExample example);

    int deleteByExample(CiaDeviceAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaDeviceApp record);

    int insertSelective(CiaDeviceApp record);

    List<CiaDeviceApp> selectByExample(CiaDeviceAppExample example);

    CiaDeviceApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaDeviceApp record, @Param("example") CiaDeviceAppExample example);

    int updateByExample(@Param("record") CiaDeviceApp record, @Param("example") CiaDeviceAppExample example);

    int updateByPrimaryKeySelective(CiaDeviceApp record);

    int updateByPrimaryKey(CiaDeviceApp record);

    List<CiaDeviceApp> selectPage(CiaDeviceAppExample example);
}