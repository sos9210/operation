package org.operation.step2;

//ByteBuddy를 먼저 실행하고
// 그다음 sout으로 pullout을 실행하면 바이트코드가 조작돼서 출력된다.
public class Masulsa {
    public static void main(String[] args) {

/*       //이 방법은 클래스로드 순서에 너무 의존적이기때문에 다른곳에서 Moja를 호출하면 이 방식은 적절하지 않다.
        ClassLoader classLoader = Masulsa.class.getClassLoader();
        TypePool typePool = TypePool.Default.of(classLoader);
        try {
            new ByteBuddy().redefine(typePool.describe("org.operation.step2.Moja").resolve(), ClassFileLocator.ForClassLoader.of(classLoader))
                    .method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("D:\\study\\study-code-operation\\target\\classes\\"));
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

//        try {
//            new ByteBuddy().redefine(org.operation.step2.Moja.class).method(ElementMatchers.named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("D:\\study\\study-code-operation\\target\\classes\\"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(new Moja().pullOut());
    }
}
