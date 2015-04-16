package drizzt.mapper;

import drizzt.model.CiaFreeLimit;
import drizzt.model.CiaFreeLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaFreeLimitMapper {
    int countByExample(CiaFreeLimitExample example);

    int deleteByExample(CiaFreeLimitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaFreeLimit record);

    int insertSelective(CiaFreeLimit record);

    List<CiaFreeLimit> selectByExample(CiaFreeLimitExample example);

    CiaFreeLimit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaFreeLimit record, @Param("example") CiaFreeLimitExample example);

    int updateByExample(@Param("record") CiaFreeLimit record, @Param("example") CiaFreeLimitExample example);

    int updateByPrimaryKeySelective(CiaFreeLimit record);

    int updateByPrimaryKey(CiaFreeLimit record);

    List<CiaFreeLimit> selectPage(CiaFreeLimitExample example);
}