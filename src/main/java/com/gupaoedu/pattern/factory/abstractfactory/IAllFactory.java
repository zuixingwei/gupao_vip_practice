package com.gupaoedu.pattern.factory.abstractfactory;

import com.gupaoedu.pattern.factory.ICourse;

public interface IAllFactory {

    INote createNote();

    IVideo createVideo();

    ICourse createCourse();
}
