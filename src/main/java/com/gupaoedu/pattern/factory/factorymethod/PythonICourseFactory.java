package com.gupaoedu.pattern.factory.factorymethod;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.PythonCourse;

public class PythonICourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
