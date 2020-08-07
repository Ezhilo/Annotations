import jdk.nashorn.internal.objects.annotations.Getter;

import java.lang.annotation.Annotation;
import java.util.Arrays;
@MyAnnotation
public class Sample {

    public static void main(String[] args) {

        Sample sample = new Sample();
        Class aClass = sample.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(Arrays.toString(annotations));

    }
}
