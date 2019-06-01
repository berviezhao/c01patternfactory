package com.bervie.pattern.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class BookPicture implements IPicture{

    @Override
    public void createPicture() {
        System.out.println("图书专有图片创建");
    }
}
