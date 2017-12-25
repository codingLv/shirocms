package com.cms.test;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cms.bean.Knowledge_point;
import com.cms.bean.Library_details;
import com.cms.bean.Library_detailsExample;
import com.cms.bean.Librarys;
import com.cms.bean.LibrarysExample;
import com.cms.bean.Video;
import com.cms.dao.AuthorityMapper;
import com.cms.dao.GradeMapper;
import com.cms.dao.Knowledge_pointMapper;
import com.cms.dao.Library_detailsMapper;
import com.cms.dao.LibrarysMapper;
import com.cms.dao.SubjectMapper;
import com.cms.dao.UserMapper;
import com.cms.dao.VideoMapper;


/**
 * 测试dao层
 * 使用spring测试模块：通过spring-test.jar
 * 使用@ContextConfiguration指定spring配置文件的位置
 * 直接autowired要使用的组件即可
 * @author 微软中国
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestMapperDao {
    @Autowired
    GradeMapper grademapper;
    @Autowired
    VideoMapper videomapper;
    @Autowired
    SubjectMapper subjectmapper;
    @Autowired
    Knowledge_pointMapper knowledge_pointMapper;
    @Autowired
    SqlSession sqlsession;
    @Autowired
    UserMapper usermapper;
    @Autowired
    AuthorityMapper authority;
    @Autowired
    LibrarysMapper librarymapper;
    @Autowired
    Library_detailsMapper libraryDeatilmapper;
    @Test
    public void CRUD(){
        //Subject sub = new Subject(null, "物理", 5, null, null);
        //subjectmapper.insertSelective(sub);
        //System.out.println(videomapper.selectByPrimaryKey_WithKonwledgeAndSubjectAndGrade(10010));
        //System.out.println(subjectmapper.selectByPrimaryKey_WithGrade(10010).getGrade().getGradeName());
        //System.out.println(knowledge_pointMapper.selectByPrimaryKey_WithSubjectAndGrade(10010).toString());
        //SubjectExample subExample = new SubjectExample();
        //subExample.or().andGradeIdEqualTo(1);
        //System.out.println(subjectmapper.selectByExample_WithGrade(subExample));
        //SubjectMapper mapper = sqlsession.getMapper(SubjectMapper.class);
//		Knowledge_pointExample kExample = new Knowledge_pointExample();
//		kExample.or().andSubjectIdEqualTo(10054);
//		System.out.println(knowledge_pointMapper.selectByExample_WithSubjectAndGrade(kExample));

        //UserExample example = new UserExample();
        //example.or().andUserEqualTo("zxc");

//		AuthorityExample example = new AuthorityExample();
//		example.or().andRoleIdEqualTo(4);
//		System.out.println(authority.selectByExample(example).toString());
        //VideoExample example = new VideoExample();
        //example.or().andGradeIdEqualTo(1);
        //System.out.println(usermapper.selectByExampleWithRole(null));

//		LibrarysExample example = new LibrarysExample();
//		example.or().andLibraryIdBetween(639, 810);
//		List<Librarys> librarys = librarymapper.selectByExample(example);
//		for(Librarys lib :librarys){
//		  int libID = lib.getLibraryId();
//		  int parentId = lib.getLibraryCategoryId();
//		  String name = lib.getTitle();
//		  int sort = lib.getSort();
//		  String pic = lib.getThumbDefault();
//		  Knowledge_point know = new Knowledge_point();
//		  know.setKnowledgeId(libID);
//		  know.setKnowledgeName(name);
//		  know.setSubjectId(parentId);
//		  know.setSort(sort);
//		  know.setPicture(pic);
//		  knowledge_pointMapper.insertSelective(know);
//		}

//        Library_detailsExample example = new Library_detailsExample();
//        example.or().andLibraryDetailIdBetween(508, 1426);
//        List<Library_details> libraryDeatils = libraryDeatilmapper.selectByExample(example);
//        for(Library_details lib : libraryDeatils){
//            int parentId = lib.getLibraryId();
//            String name = lib.getDramatitle();
//            String videSrc = lib.getVideo();
//            int sort = lib.getDetailSort();
//            String code = lib.getCode();
//            Video video = new Video();
//            video.setVideoName(name);
//            video.setClarity("1080");
//            video.setKnowledgeId(parentId);
//            video.setSort(sort);
//            video.setVideoSrc(videSrc);
//            video.setDuration("2h");
//            video.setPicture(code);
//            video.setIntroduction("...");
//            videomapper.insertSelective(video);
//        }
        System.out.println(librarymapper.selectByExample(null));
    }
}
