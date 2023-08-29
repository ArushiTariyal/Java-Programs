public class ParallelRunningThreads {
    public static void main(String[] args) {
        Runnable r1 = ()->{
            for(int i = 0; i<=10; i++){
                System.out.println("Thread 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };
        Runnable r2 = ()->{
            for(int i = 0; i<=10; i++){
                System.out.println("Thread 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
    }
}
