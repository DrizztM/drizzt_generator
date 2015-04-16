package drizzt.mapper;

import drizzt.model.CiaSuggest;
import drizzt.model.CiaSuggestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaSuggestMapper {
    int countByExample(CiaSuggestExample example);

    int deleteByExample(CiaSuggestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaSuggest record);

    int insertSelective(CiaSuggest record);

    List<CiaSuggest> selectByExample(CiaSuggestExample example);

    CiaSuggest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaSuggest record, @Param("example") CiaSuggestExample example);

    int updateByExample(@Param("record") CiaSuggest record, @Param("example") CiaSuggestExample example);

    int updateByPrimaryKeySelective(CiaSuggest record);

    int updateByPrimaryKey(CiaSuggest record);

    List<CiaSuggest> selectPage(CiaSuggestExample example);
}