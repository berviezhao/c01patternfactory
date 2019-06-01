package com.bervie.pattern.factory.factorymethod;

import com.bervie.pattern.factory.BookItem;
import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class BookItemFactroy  implements IItemFactory {
    @Override
    public IItem create() {
        System.out.println("这是图书专有创建工厂，拥有标准的图书创建流程");
        return new BookItem();
    }
}
