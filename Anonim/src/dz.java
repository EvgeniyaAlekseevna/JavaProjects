public class dz {
    public static void main(String[] args) {
        try{
            int [] array = new int [10];
            System.out.println(array[25]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("ошибка выхода за пределы массива");
        } finally {
            System.out.println("ты здесь");
        }
    }
}
