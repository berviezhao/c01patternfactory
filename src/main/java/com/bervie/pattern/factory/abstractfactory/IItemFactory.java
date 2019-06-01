package com.bervie.pattern.factory.abstractfactory;

import com.bervie.pattern.factory.IItem;

/**
 *  抽象工厂-顶级接口
 *  要求所有的子工厂实现这个顶级工厂
 *  (一个品牌/类型的抽象)
 * Author:Bervie
 * Date:2019-06-01
 */
public interface IItemFactory {
    IItem createItem();
    I3DModel create3DModel();
    IPicture createPicture();
}
