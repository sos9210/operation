package org.operation.step4;

import org.operation.step3.Moja;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //클래스타입 반환하는 방법1
        Class<Book> bookClass = Book.class;

        //클래스타입 반환하는 방법2
        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        //클래스타입 반환하는 방법3
        Class<?> aClass1 = Class.forName("org.operation.step4.Book");

        //애노테이션 접근
        Arrays.stream(MyBook.class.getAnnotations()).forEach(System.out::println);

        //생성자를 이용한 인스턴스 생성
        Class<?> bookClass1 = Class.forName("org.operation.step4.Book");
        Constructor<?> constructor = bookClass1.getConstructor(String.class);   //String타입의 파라미터를 갖는 생성자
        //Constructor<?> constructor = bookClass1.getConstructor(null);   //기본생성자
        Book book1 = (Book)constructor.newInstance("안녕");
        System.out.println(book1.d);

        //해당 필드가 속하는 인스턴스를 파라미터로 넘겨준다.
        //A는 static변수이기 때문에 get(null)로 넘긴다.
        Field A = Book.class.getDeclaredField("A");
        System.out.println(A.get(null));
        A.set(null,"AAA");
        System.out.println(A.get(null));

        //a는 특정한 인스턴스를 거쳐야만 값을 가져오고 설정할 수 있다.
        //private으로 선언되어있기때문에 setAccessible(true)를 해줘야한다.
        Field a = Book.class.getDeclaredField("a");
        a.setAccessible(true);
        System.out.println(a.get(book1));
        a.set(book1,"aaaaaaaa");
        System.out.println(a.get(book1));

        //invoke(메서드가 속한 인스턴스, 메서드의 파라미터...); 메서드를 실행한다.
        //마찬가지로 private으로 선언되어있기때문에 setAccessible(true)를 해줘야한다.
        Method f = Book.class.getDeclaredMethod("f");
        f.setAccessible(true);
        f.invoke(book1);

        //파라미터를 가진 메서드를 실행하려면 getDeclaredMethod(메서드명,파라미터타입 .... );
        //invoke(메서드가 속한 인스턴스, 파라미터에 넘길 값.....)
        Method sum = Book.class.getDeclaredMethod("sum",int.class, int.class);
        int invoke = (int) sum.invoke(book1, 10, 20);
        System.out.println(invoke);
    }
}
