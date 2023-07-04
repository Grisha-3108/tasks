import java.lang.annotation.*;

public class MainWeek {
    @Inherited
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface WeekDay{
        int value() default 1;
    }
}


