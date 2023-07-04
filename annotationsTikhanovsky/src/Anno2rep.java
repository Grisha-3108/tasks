public class Anno2rep extends Anno2 {
    @Rep(v = 1)
    @Rep(v = 2)
    public int sum(int a, int b){
        Class<Anno2rep> pr = Anno2rep.class;
        Anno2.Rep[] annotations = pr.getAnnotationsByType(Anno2.Rep.class);
        return a + b + annotations[0].v();
    }
}
