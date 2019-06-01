package com.bervie;

import com.bervie.pattern.factory.BookItem;
import com.bervie.pattern.factory.FruitsItem;
import com.bervie.pattern.factory.IItem;
import com.bervie.pattern.factory.simplefactory.ItemFactory;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SimpleFactoryTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        ItemFactory itemFactory = new ItemFactory();
        //IItem item = itemFactory.create("book");
        //IItem item = itemFactory.item("com.bervie.pattern.factory.BookItem");
        IItem item = itemFactory.item(BookItem.class);
        item.fistRecordTime();
        item = itemFactory.item(FruitsItem.class);
        item.fistRecordTime();
    }
}
