package org.operation.step3;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

import static net.bytebuddy.matcher.ElementMatchers.named;


//VM Option설정 필요
//클래스 로더가 클래스를 읽어들일때 javaagent를 거쳐서 클래스 로딩할때 적용된다
// (클래스 파일이 바뀌는방식은 아니고 클래스파일을 읽어들이면서 변경된다)
public class MasulsaAgent {
    public static void premain(String agentArgs, Instrumentation inst) {
        new AgentBuilder.Default()
                .type(ElementMatchers.any())
                .transform((builder, typeDescription, classLoader, javaModule) ->
                        builder.method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))).installOn(inst);
    }


}
