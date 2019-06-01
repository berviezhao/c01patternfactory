package com.bervie.pattern.factory.simplefactory;

import com.bervie.pattern.factory.BookItem;
import com.bervie.pattern.factory.FruitsItem;
import com.bervie.pattern.factory.IItem;
import com.bervie.pattern.factory.VegetablesItem;

public class SimpleFactoryTest {
    public static void main (String[] args){
        ItemFactory itemFactory = new ItemFactory();
        //IItem item = itemFactory.create("book");
        //IItem item = itemFactory.item("com.bervie.pattern.factory.BookItem");
        IItem item = itemFactory.item(BookItem.class);
        item.fistRecordTime();
        item = itemFactory.item(FruitsItem.class);
        item.fistRecordTime();
        item = itemFactory.item(VegetablesItem.class);
        item.fistRecordTime();
    }
}
