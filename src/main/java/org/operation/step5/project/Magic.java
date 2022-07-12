package org.operation.step5.project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //인터페이스 , 클래스 , 이넘
@Retention(RetentionPolicy.SOURCE)
public @interface Magic {

}
