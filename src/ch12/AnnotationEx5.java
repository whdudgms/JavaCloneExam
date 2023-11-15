package ch12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd="160101",hhmmss = "235959"))
public class AnnotationEx5 {
    public static void main(String[] args){
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()=" + anno.testedBy());
        System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        System.out.println("anno.textDate().hhmmss()=" + anno.testDate().hhmmss());
    }
}




@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;
    String testedBy();

    String[] testTools() default "JUnit";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}



@Retention(RetentionPolicy.RUNTIME)
@interface  DateTime{
    String yymmdd();
    String hhmmss();
}


enum  TestType {FIRST,FINAL}
