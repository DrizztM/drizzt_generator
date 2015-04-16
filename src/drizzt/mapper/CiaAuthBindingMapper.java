package drizzt.mapper;

import drizzt.model.CiaAuthBinding;
import drizzt.model.CiaAuthBindingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CiaAuthBindingMapper {
    int countByExample(CiaAuthBindingExample example);

    int deleteByExample(CiaAuthBindingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CiaAuthBinding record);

    int insertSelective(CiaAuthBinding record);

    List<CiaAuthBinding> selectByExample(CiaAuthBindingExample example);

    CiaAuthBinding selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CiaAuthBinding record, @Param("example") CiaAuthBindingExample example);

    int updateByExample(@Param("record") CiaAuthBinding record, @Param("example") CiaAuthBindingExample example);

    int updateByPrimaryKeySelective(CiaAuthBinding record);

    int updateByPrimaryKey(CiaAuthBinding record);

    List<CiaAuthBinding> selectPage(CiaAuthBindingExample example);
}