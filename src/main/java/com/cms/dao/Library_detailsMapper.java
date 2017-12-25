package com.cms.dao;

import com.cms.bean.Library_details;
import com.cms.bean.Library_detailsExample;
import com.cms.bean.Library_detailsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Library_detailsMapper {
    long countByExample(Library_detailsExample example);

    int deleteByExample(Library_detailsExample example);

    int deleteByPrimaryKey(Integer libraryDetailId);

    int insert(Library_detailsWithBLOBs record);

    int insertSelective(Library_detailsWithBLOBs record);

    List<Library_detailsWithBLOBs> selectByExampleWithBLOBs(Library_detailsExample example);

    List<Library_details> selectByExample(Library_detailsExample example);

    Library_detailsWithBLOBs selectByPrimaryKey(Integer libraryDetailId);

    int updateByExampleSelective(@Param("record") Library_detailsWithBLOBs record, @Param("example") Library_detailsExample example);

    int updateByExampleWithBLOBs(@Param("record") Library_detailsWithBLOBs record, @Param("example") Library_detailsExample example);

    int updateByExample(@Param("record") Library_details record, @Param("example") Library_detailsExample example);

    int updateByPrimaryKeySelective(Library_detailsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Library_detailsWithBLOBs record);

    int updateByPrimaryKey(Library_details record);
}