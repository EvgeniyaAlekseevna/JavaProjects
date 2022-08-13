package main;

public class MainMan {
    public static void main(String[] args) {
        String sourseData = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";

        String[] words = sourseData.replace(",","").split(" ");
        System.out.println(words[1] + ' ' + words[11] + ' ' + words[3]);

        String name = sourseData.substring(4, 8);
        String post = sourseData.substring(54, 65);
        String ageString = sourseData.substring(14, 16);
        int age = Integer.parseInt(ageString);
        String heightString = sourseData.substring(32, 37);
        double height = Double.parseDouble(heightString);
        Man man = new Man(name, post, age, height);
        System.out.println(man.getName()+ " " +man.getPost() +" " +man.getAge()+" "+man.getHeight() );


    }
}
