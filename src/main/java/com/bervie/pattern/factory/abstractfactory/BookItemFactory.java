package com.bervie.pattern.factory.abstractfactory;

import com.bervie.pattern.factory.BookItem;
import com.bervie.pattern.factory.IItem;

/**
 * Created with IntelliJ IDEA
 * Author:Bervie
 * Date:2019-06-01
 */
public class BookItemFactory implements IItemFactory {
    @Override
    public IItem createItem() {
        return new BookItem();
    }

    @Override
    public I3DModel create3DModel() {
        return new Book3DModel();
    }

    @Override
    public IPicture createPicture() {
        return new BookPicture();
    }
}
