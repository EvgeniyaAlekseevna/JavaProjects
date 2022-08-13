package main;

public class Main1 {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("001");
        employees.add("002");
        employees.add("003");
        employees.add("004");
        employees.add("005");
        employees.add("006");
        employees.remove("005");
        employees.remove(2);
        employees.remove("025");

        for (int i = 1; i <=100; i++){
            employees.add("Сотрудник"+ i);
        }

        for (int i =0; i< employees.getSize();i++) {
            System.out.println(employees.get(i));
        }
    }
}
