public class Main27 {
    public static void main(String[] args) {
        int result = (int) (Math.random() *100 +1);
            if (result>=10 && result <=100){
                String result1 = String.format("Случайное число: %s", result);
                System.out.println(result1);
            } else{
                System.out.println("условие не выполнено");
            }

    }
}
