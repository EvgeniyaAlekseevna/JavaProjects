package main;

public class Main {
    public static void main(String[] args) {
        String [] employees = {
                "Никита",
                "Игорь",
                "Ольга",
                "Василий",
                "Максим"
        };
        String[] second = new String[employees.length+1];
        for (int i =0; i< employees.length; i++) {
            second[i] = employees[i];
        }
        second [second.length-1]="Иван";
        employees=second;

        employees[1]=null;
        String[] newNames = new String[employees.length-1];
        for (int i = 0, j =0; i< employees.length; i++){
            if (employees[i] != null){
                newNames[j]=employees[i];
                j++;
            }
        }
        employees=newNames;

        for (String name: employees){
            System.out.println(name);
        }

    }
}
