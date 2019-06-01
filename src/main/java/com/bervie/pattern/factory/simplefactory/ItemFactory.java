package com.bervie.pattern.factory.simplefactory;

import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class ItemFactory {
    /*final static String BOOKNAME = "book";
    public IItem create(String name){
        if (BOOKNAME.equals(name)){
            return new BookItem();
        }else{
            return null;
        }
    }*/
    /*public  IItem item(String className){
        try {
            if(!StringUtils.isBlank(className)){
                return (IItem) Class.forName(className).newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
    public IItem item(Class clazz){
        try {
           if(null != clazz){
               System.out.println("这是统一创建工厂，你要创建的是"+clazz.getName());
               return (IItem) clazz.newInstance();
           }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
