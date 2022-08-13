public class Main {
    public static void main(String[] args) {
        Thread timer = new Thread(new RunnableTimer(){
            @Override
            public void run() {
                try {
                    for (int i = 0; i< 1000000; i++){
                        System.out.println(1);
                        Thread.sleep(1000);
                        }
                } catch (Exception e) {

                }
            }
        });
        timer.start();
        Thread timer2 = new Thread(new RunnableTimer(){
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (true){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        });
        timer2.start();
    }
}
