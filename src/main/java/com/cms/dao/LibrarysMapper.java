package com.cms.dao;

import com.cms.bean.Librarys;
import com.cms.bean.LibrarysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LibrarysMapper {
    long countByExample(LibrarysExample example);

    int deleteByExample(LibrarysExample example);

    int deleteByPrimaryKey(Integer libraryId);

    int insert(Librarys record);

    int insertSelective(Librarys record);

    List<Librarys> selectByExample(LibrarysExample example);

    Librarys selectByPrimaryKey(Integer libraryId);

    int updateByExampleSelective(@Param("record") Librarys record, @Param("example") LibrarysExample example);

    int updateByExample(@Param("record") Librarys record, @Param("example") LibrarysExample example);

    int updateByPrimaryKeySelective(Librarys record);

    int updateByPrimaryKey(Librarys record);
}