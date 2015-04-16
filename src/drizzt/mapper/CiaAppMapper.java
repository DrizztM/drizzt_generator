package drizzt.mapper;

import drizzt.model.CiaApp;
import drizzt.model.CiaAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaAppMapper {
    int countByExample(CiaAppExample example);

    int deleteByExample(CiaAppExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaApp record);

    int insertSelective(CiaApp record);

    List<CiaApp> selectByExample(CiaAppExample example);

    CiaApp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaApp record, @Param("example") CiaAppExample example);

    int updateByExample(@Param("record") CiaApp record, @Param("example") CiaAppExample example);

    int updateByPrimaryKeySelective(CiaApp record);

    int updateByPrimaryKey(CiaApp record);

    List<CiaApp> selectPage(CiaAppExample example);
}