package com.bervie.learn.pattern.factory.simplefactory;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA
 *
 * @Author:BerveiZhao
 * @Date:2019-05-29
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
       /* ICourse course = new JavaCourse();
        course.record();
*/
        CourseFactory factory = new CourseFactory();

        //ICourse c1 = factory.create("JavaCourse");

        ICourse c1 = factory.create(JavaCourse.class);
        c1.record();

        Calendar.getInstance();

    }
}
