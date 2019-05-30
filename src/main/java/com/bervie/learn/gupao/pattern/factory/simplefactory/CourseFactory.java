package com.bervie.learn.gupao.pattern.factory.simplefactory;

/**
 * Created with IntelliJ IDEA
 * 工程封装
 * @Author:BerveiZhao
 * @Date:2019-05-29
 */
public class CourseFactory {
    /*public  ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else{
            return null;
        }
    }*/

    /*public ICourse create(String classcname){
        try {
            if (StringUtils.isNotBlank(classcname)){
                return (ICourse) Class.forName(classcname).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/
    public ICourse create(Class clazz){
        try {
            if (clazz != null){
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
