import java.lang.annotation.*;

public class Anno2{
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    public @interface TestAnno {
        int value() default 1;
    }
    @Repeatable(Anno2.Repeats.class)
    public @interface Rep {
        int v() default 1;
    }
    public @interface Repeats {
        Anno2.Rep[] value();
    }
}

@Anno2.TestAnno(2)
class Tanno {

    public int getValue(){
        Class<Tanno> ref = Tanno.class;
        Anno2.TestAnno d = ref.getAnnotation(Anno2.TestAnno.class);
        return d.value();
    }
}

@Anno2.TestAnno(4)
class T2anno extends Tanno {

}