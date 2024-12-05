package thread.start;

public class DaemonThreadMain extends Thread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : main() start");
        DaemonThreadMain daemonThreadMain = new DaemonThreadMain();
        daemonThreadMain.setDaemon(true); // 데몬 스레드 여부
        daemonThreadMain.start();
        System.out.println(Thread.currentThread().getName()+" : main() end");
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+": run()");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+": run() end");
    }
}
