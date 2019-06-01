package com.bervie.pattern.factory;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class BookItem implements IItem {
    @Override
    public void fistRecordTime() {
        System.out.println("图书第一次入库时间");
    }
}
