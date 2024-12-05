package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+" : start() 호출 전");
        helloThread.run();  // 그냥 메서드 호출한게 되는거
        System.out.println(Thread.currentThread().getName()+" : start() 호출 후");

        System.out.println(Thread.currentThread().getName()+" : main() end");
    }
}
