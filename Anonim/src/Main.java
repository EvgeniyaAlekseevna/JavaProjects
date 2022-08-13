public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return " Отчёт за " + countOfMonths + " месяцев.";
            }
        },12);
        MyCounter counter= new MyCounter();
        director.force(counter,12);
    }


}
