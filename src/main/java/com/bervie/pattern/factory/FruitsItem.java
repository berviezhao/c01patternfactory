package com.bervie.pattern.factory;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class FruitsItem implements IItem{
    @Override
    public void fistRecordTime() {
        System.out.println("水果被第一次记录");
    }
}
