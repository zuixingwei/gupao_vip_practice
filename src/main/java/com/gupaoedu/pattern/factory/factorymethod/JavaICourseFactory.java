package com.gupaoedu.pattern.factory.factorymethod;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.JavaCourse;

public class JavaICourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
