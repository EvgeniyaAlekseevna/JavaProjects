public class MyCounter implements Counter{
    @Override
    public String report(int countOfMonths) {
        return " Отчёт за " + countOfMonths + " месяцев.";
    }
}
