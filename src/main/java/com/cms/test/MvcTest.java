package com.cms.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cms.bean.Grade;
import com.cms.bean.Knowledge_point;
import com.cms.bean.Subject;
import com.cms.bean.Video;
import com.github.pagehelper.PageInfo;

/**
 * 使用Spring测试模块中的测试请求功能，测试crud请求的正确性
 * @author 微软中国
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springMvc.xml"})
public class MvcTest {
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求,获取处理结果
    MockMvc mockmvc;
    @Before
    public void initMockMvc(){
        mockmvc = MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testPage() throws Exception{
        //模拟请求拿到返回值
        MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get("/subjects").param("page_num", "1")).andReturn();

        PageInfo pageInfo = (PageInfo)result.getRequest().getAttribute("pageInfo");
       System.out.println("当前页码:"+pageInfo.getPageNum());
        System.out.println("总页码："+pageInfo.getPages());
        System.out.println("总记录数:"+pageInfo.getTotal());
       System.out.println("连续显示的页码："+pageInfo.getNavigatepageNums().length);

        //获取数据
		/*List<Subject> list = pageInfo.getList();
		for(Subject sub : list){
			System.out.println(sub.getSubjectName());
		}*/

		/*List<Grade> list = pageInfo.getList();
		for(Grade grade : list){
			System.out.println(grade.getGradeName());
		}*/

		/*List<Knowledge_point> list = pageInfo.getList();
		for(Knowledge_point grade : list){
			System.out.println(grade.getKnowledgeName());
		}*/
		/*List<Video> list = pageInfo.getList();
		for(Video grade : list){
			System.out.println(grade.getVideoName());
		}*/
    }
}
