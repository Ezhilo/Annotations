import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
@MyAnnotation(name = "Name1")
public class Sample {

    public static void main(String[] args) {

        Operations(Sample.class);

    }

      private static void Operations(Class aClass) {

        Annotation annotation = aClass.getAnnotation(MyAnnotation.class);
        MyAnnotation annotation1 = (MyAnnotation) annotation;
        String name = annotation1.name();
        System.out.println(name);

        Annotation[] annotations = aClass.getAnnotations();
        Arrays.stream(annotations).forEach(System.out::println);

        System.out.println(Arrays.toString(annotations));

        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);


    }

    @MyMethodAnnotation
    public void simpleMethod(){

    }
}
