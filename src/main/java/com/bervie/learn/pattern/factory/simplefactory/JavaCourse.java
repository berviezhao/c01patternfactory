package com.bervie.learn.pattern.factory.simplefactory;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:BerveiZhao
 * @Date:2019-05-29
 */
public class JavaCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("学习java课程");
    }
}
