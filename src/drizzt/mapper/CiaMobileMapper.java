package drizzt.mapper;

import drizzt.model.CiaMobile;
import drizzt.model.CiaMobileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaMobileMapper {
    int countByExample(CiaMobileExample example);

    int deleteByExample(CiaMobileExample example);

    int deleteByPrimaryKey(String mobileNumber);

    int insert(CiaMobile record);

    int insertSelective(CiaMobile record);

    List<CiaMobile> selectByExample(CiaMobileExample example);

    CiaMobile selectByPrimaryKey(String mobileNumber);

    int updateByExampleSelective(@Param("record") CiaMobile record, @Param("example") CiaMobileExample example);

    int updateByExample(@Param("record") CiaMobile record, @Param("example") CiaMobileExample example);

    int updateByPrimaryKeySelective(CiaMobile record);

    int updateByPrimaryKey(CiaMobile record);

    List<CiaMobile> selectPage(CiaMobileExample example);
}