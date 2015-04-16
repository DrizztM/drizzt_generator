package drizzt.mapper;

import drizzt.model.CiaDeveloper;
import drizzt.model.CiaDeveloperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaDeveloperMapper {
    int countByExample(CiaDeveloperExample example);

    int deleteByExample(CiaDeveloperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaDeveloper record);

    int insertSelective(CiaDeveloper record);

    List<CiaDeveloper> selectByExample(CiaDeveloperExample example);

    CiaDeveloper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaDeveloper record, @Param("example") CiaDeveloperExample example);

    int updateByExample(@Param("record") CiaDeveloper record, @Param("example") CiaDeveloperExample example);

    int updateByPrimaryKeySelective(CiaDeveloper record);

    int updateByPrimaryKey(CiaDeveloper record);

    List<CiaDeveloper> selectPage(CiaDeveloperExample example);
}