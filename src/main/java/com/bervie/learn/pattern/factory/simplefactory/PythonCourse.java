package com.bervie.learn.pattern.factory.simplefactory;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:BerveiZhao
 * @Date:2019-05-29
 */
public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("学习Python课程");
    }
}
