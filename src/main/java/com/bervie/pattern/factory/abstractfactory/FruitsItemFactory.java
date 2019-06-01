package com.bervie.pattern.factory.abstractfactory;

import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class FruitsItemFactory implements IItemFactory {
    @Override
    public IItem createItem() {
        return null;
    }

    @Override
    public I3DModel create3DModel() {
        return null;
    }

    @Override
    public IPicture createPicture() {
        return null;
    }
}
