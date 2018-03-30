package com.coilabs.mapper.data;

import com.coilabs.model.data.UserP;
import com.coilabs.model.data.UserPExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserPMapper {
    int countByExample(UserPExample example);

    int deleteByExample(UserPExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserP record);

    int insertSelective(UserP record);

    List<UserP> selectByExampleWithBLOBs(UserPExample example);

    List<UserP> selectByExample(UserPExample example);

    UserP selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByExampleWithBLOBs(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByExample(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByPrimaryKeySelective(UserP record);

    int updateByPrimaryKeyWithBLOBs(UserP record);

    int updateByPrimaryKey(UserP record);
}