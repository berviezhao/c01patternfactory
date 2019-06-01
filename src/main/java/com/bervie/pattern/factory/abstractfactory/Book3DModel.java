package com.bervie.pattern.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class Book3DModel implements I3DModel{
    @Override
    public void create3DModel() {
        System.out.println("图书专有3D模型创建");
    }
}
