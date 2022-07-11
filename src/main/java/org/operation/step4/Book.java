package org.operation.step4;

@MyAnnotation
public class Book {
    public static String A = "A";
    private String a = "a";
    private static String b = "BOOK";
    private static final String c = "BOOK";
    public String d = "d";
    protected String e = "e";

    public Book() {
    }
    public Book(String d) {
        this.d = d;
    }
    public Book(String a, String d, String e) {
        this.a = a;
        this.d = d;
        this.e = e;
    }

    private void f() {
        System.out.println("F");
    }
    public void g() {
        System.out.println("g");
    }
    public int h() {
        return 100;
    }

    public int sum(int left, int right){
        return left+right;
    }
}
