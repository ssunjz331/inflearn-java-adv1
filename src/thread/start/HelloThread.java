package thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" : run");  // main 스레드가 실행하는게 아니다.
    }
}
