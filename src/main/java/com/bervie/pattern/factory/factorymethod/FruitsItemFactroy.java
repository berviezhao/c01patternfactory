package com.bervie.pattern.factory.factorymethod;

import com.bervie.pattern.factory.FruitsItem;
import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class FruitsItemFactroy implements IItemFactory {
    @Override
    public IItem create() {
        System.out.println("这是水果的专有创建工厂，水果流程专业");
        return new FruitsItem();
    }
}
