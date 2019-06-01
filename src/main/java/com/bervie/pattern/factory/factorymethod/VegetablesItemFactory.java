package com.bervie.pattern.factory.factorymethod;

import com.bervie.pattern.factory.IItem;
import com.bervie.pattern.factory.VegetablesItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class VegetablesItemFactory  implements IItemFactory {
    @Override
    public IItem create() {
        System.out.println("这里是蔬菜专有工厂，蔬菜流水线工作");
        return new VegetablesItem();
    }
}
