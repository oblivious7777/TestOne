package com.task.service;

import com.task.controller.userIn;
import com.task.dao.CategoryMapper;
import com.task.model.Category;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CRUD {
//查询
    public static void List(CategoryMapper categoryMapper) {
        List<Category> cs = categoryMapper.list();
        for (Category c : cs) {
            System.out.println(c.toString());
        }
    }
//添加
    public static void Add(CategoryMapper categoryMapper)  {
        Category category = new Category();
            category.setHome("python");
            category.setNo((int)(Math.random()*(9999-1000+1))+1000);//随机四位数
            category.setEntranceTime("2017-8-8");
            category.setName(userIn.nameIn());
            category.setSex("男");
            category.setAge(19);
            category.setqq(251312747);
            category.setSchool("'北京大学'");
            category.setCity("佛山");
            category.setMotto("编不出来了");
            categoryMapper.add(category);
        System.out.print("你添加的是第"+category.getId()+"条数据");
        }
//删除
    public static void Del(CategoryMapper categoryMapper){

        Category category = new Category();
        category.setId(32);
            if(categoryMapper.del(category)==1){
            System.out.print("True");
        }else{
            System.out.print("False");
        }

      }
//改名字
    public static void Upd(CategoryMapper categoryMapper){
    Category category = new Category();
    category.setId(26);
    category.setName("盖伦");
        if(categoryMapper.upd(category)==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


}
//根据姓名查人
    public static void SelOfName(CategoryMapper categoryMapper){
        Category category = new Category();
        category.setName("盖伦");
        List<Category> cs = categoryMapper.selName(category);
        for (Category c : cs) {
            System.out.println(c.toString());
        }
    }
//根据ID查人
    public static void SelOfId(CategoryMapper categoryMapper){
        Category category = new Category();
        category.setId(45);
        List<Category> cs = categoryMapper.selId(category);
        for (Category c : cs) {
            System.out.println(c.toString()); }
    }
//根据学号查人
    public static void SelOfNo(CategoryMapper categoryMapper){
        Category category = new Category();
        category.setNo(4994);
        List<Category> cs = categoryMapper.selNo(category);
        for (Category c : cs) {
            System.out.println(c.toString()); }
    }



}



