package drizzt.mapper;

import drizzt.model.CiaAuth;
import drizzt.model.CiaAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaAuthMapper {
    int countByExample(CiaAuthExample example);

    int deleteByExample(CiaAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaAuth record);

    int insertSelective(CiaAuth record);

    List<CiaAuth> selectByExample(CiaAuthExample example);

    CiaAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaAuth record, @Param("example") CiaAuthExample example);

    int updateByExample(@Param("record") CiaAuth record, @Param("example") CiaAuthExample example);

    int updateByPrimaryKeySelective(CiaAuth record);

    int updateByPrimaryKey(CiaAuth record);

    List<CiaAuth> selectPage(CiaAuthExample example);
}