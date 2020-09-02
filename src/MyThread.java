public class MyThread extends Thread {

    private int threadNumber;

    public MyThread(int threadNumber) {

        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(threadNumber + " => " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
