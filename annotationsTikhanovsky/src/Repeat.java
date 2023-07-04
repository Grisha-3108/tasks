import java.lang.annotation.Repeatable;

class Repeat{
    @Repeatable(Repeats.class)
    public @interface Rep {
        int time() default 0;
        int priority() default 1;
        String description() default "Some description";
    }
    public @interface Repeats {
        Rep[] value();
    }
}

