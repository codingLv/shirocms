package com.cms.dao;

import com.cms.bean.Knowledge_point;
import com.cms.bean.Knowledge_pointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Knowledge_pointMapper {
    long countByExample(Knowledge_pointExample example);

    int deleteByExample(Knowledge_pointExample example);

    int deleteByPrimaryKey(Integer knowledgeId);

    int insert(Knowledge_point record);

    int insertSelective(Knowledge_point record);

    List<Knowledge_point> selectByExample(Knowledge_pointExample example);

    Knowledge_point selectByPrimaryKey(Integer knowledgeId);
    
    List<Knowledge_point> selectByExample_WithSubjectAndGrade(Knowledge_pointExample example);

    Knowledge_point selectByPrimaryKey_WithSubjectAndGrade(Integer knowledgeId);

    int updateByExampleSelective(@Param("record") Knowledge_point record, @Param("example") Knowledge_pointExample example);

    int updateByExample(@Param("record") Knowledge_point record, @Param("example") Knowledge_pointExample example);

    int updateByPrimaryKeySelective(Knowledge_point record);

    int updateByPrimaryKey(Knowledge_point record);
}