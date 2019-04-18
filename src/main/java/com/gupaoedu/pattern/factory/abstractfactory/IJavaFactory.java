package com.gupaoedu.pattern.factory.abstractfactory;

import com.gupaoedu.pattern.factory.ICourse;
import com.gupaoedu.pattern.factory.JavaCourse;

public class IJavaFactory implements IAllFactory {

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }
}
