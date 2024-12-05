package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+" : start() 호출 전");
        helloThread.start();    // start()는 스레드에 스택 공간을 할당하면서 스레드를 시작하는 아주 특별한 메서드이다.
        System.out.println(Thread.currentThread().getName()+" : start() 호출 후");

        System.out.println(Thread.currentThread().getName()+" : main() end");
    }
}
