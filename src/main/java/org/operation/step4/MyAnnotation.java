package org.operation.step4;

import java.lang.annotation.*;

//RetentionPolicy.SOURCE : 소스 코드(.java)까지 남아있는다.
//RetentionPolicy.CLASS : 클래스 파일(.class)까지 남아있는다.(=바이트 코드)
//RetentionPolicy.RUNTIME : 런타임까지 남아있는다.(=사실상 안 사라진다.)
@Retention(RetentionPolicy.RUNTIME) //애노테이션의 라이프사이클
@Target({ElementType.TYPE, ElementType.FIELD})  //접근 가능한 위치
@Inherited //상속이 가능한 애노테이션(부모의 애노테이션에 접근가능하다)
public @interface MyAnnotation {
    //value라는 이름으로 옵션을 사용하면 애노테이션을 사용할때 값만 넣고 value는 명시적으로 생략가능하다
    String name() default "aaaaa";
    int number() default 100;

}
