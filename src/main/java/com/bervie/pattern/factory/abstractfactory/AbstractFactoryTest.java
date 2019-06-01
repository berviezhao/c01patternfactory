package com.bervie.pattern.factory.abstractfactory;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IItemFactory factory = new BookItemFactory();
        factory.create3DModel().create3DModel();
        factory.createItem().fistRecordTime();
        factory.createPicture().createPicture();

        factory = new FruitsItemFactory();
        factory.createPicture().createPicture();
        factory.createItem().fistRecordTime();
        factory.create3DModel().create3DModel();
    }
}
