package org.operation.step4;

import org.operation.step3.Moja;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        //클래스타입 반환하는 방법1
        Class<Book> bookClass = Book.class;

        //클래스타입 반환하는 방법2
        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        //클래스타입 반환하는 방법3
        Class<?> aClass1 = Class.forName("org.operation.step4.Book");
    }
}
