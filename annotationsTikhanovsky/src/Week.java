@MainWeek.WeekDay(2)
public class Week extends MainWeek{
    public int printDay(){
        Class<Week> ref = Week.class;
        WeekDay d = ref.getAnnotation(WeekDay.class);
        System.out.println(d);
        return d.value();
    }
}