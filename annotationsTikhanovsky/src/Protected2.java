import java.lang.annotation.*;
@Repeat.Rep(time = 1, priority = 2, description = "Des 1")
@Repeat.Rep(time = 1, priority = 3, description = "Des 2")
public class Protected2 {
    public Repeat.Rep[] getAnno(){
        Class<Protected2> pr = Protected2.class;
        Repeat.Rep[] annotations = pr.getAnnotationsByType(Repeat.Rep.class);
        return annotations;
    }
}
