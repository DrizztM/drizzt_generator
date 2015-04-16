package drizzt.mapper;

import drizzt.model.CiaAuthSn;
import drizzt.model.CiaAuthSnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaAuthSnMapper {
    int countByExample(CiaAuthSnExample example);

    int deleteByExample(CiaAuthSnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaAuthSn record);

    int insertSelective(CiaAuthSn record);

    List<CiaAuthSn> selectByExample(CiaAuthSnExample example);

    CiaAuthSn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaAuthSn record, @Param("example") CiaAuthSnExample example);

    int updateByExample(@Param("record") CiaAuthSn record, @Param("example") CiaAuthSnExample example);

    int updateByPrimaryKeySelective(CiaAuthSn record);

    int updateByPrimaryKey(CiaAuthSn record);

    List<CiaAuthSn> selectPage(CiaAuthSnExample example);
}