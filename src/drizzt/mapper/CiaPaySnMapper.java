package drizzt.mapper;

import drizzt.model.CiaPaySn;
import drizzt.model.CiaPaySnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaPaySnMapper {
    int countByExample(CiaPaySnExample example);

    int deleteByExample(CiaPaySnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaPaySn record);

    int insertSelective(CiaPaySn record);

    List<CiaPaySn> selectByExample(CiaPaySnExample example);

    CiaPaySn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaPaySn record, @Param("example") CiaPaySnExample example);

    int updateByExample(@Param("record") CiaPaySn record, @Param("example") CiaPaySnExample example);

    int updateByPrimaryKeySelective(CiaPaySn record);

    int updateByPrimaryKey(CiaPaySn record);

    List<CiaPaySn> selectPage(CiaPaySnExample example);
}