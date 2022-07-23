public class Stopwatch implements Runnable { // Thread olabilmesi icin runnable interface'i implement edilmeli
    private Thread thread;
    private String threadName;

    public Stopwatch(String threadName){
        this.threadName = threadName;
        System.out.println("Thread initialized: "+ threadName);
    }

    @Override
    public void run() {
        // Bu metod altindaki kodlar thread seklinde calisir
        System.out.println("Running: " + threadName);
        // Kod alani
        try {
            for(int i = 0; i < 10 ; i++)
                System.out.println(threadName + " : " + i);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("interrupted: " + threadName);
        }
        System.out.println("Thread finished: " + threadName);
        thread.run();
    }
    public void start(){
        System.out.println("Thread starting");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
