package com.bervie.pattern.factory.factorymethod;

import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IItemFactory factory = new BookItemFactroy();
        IItem item = factory.create();
        item.fistRecordTime();
        item = new FruitsItemFactroy().create();
        item.fistRecordTime();
        item = new VegetablesItemFactory().create();
        item.fistRecordTime();


    }
}
