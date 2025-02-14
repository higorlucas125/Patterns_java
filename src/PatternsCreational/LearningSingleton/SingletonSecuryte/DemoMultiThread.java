package PatternsCreational.LearningSingleton.SingletonSecuryte;


public class DemoMultiThread {

    public static void main(String[] args) {
        System.out.println("Se você vir o mesmo valor, então o singleton foi reutilizado (yay!)" + "\n" +
                "Se você vir valores diferentes, então dois singletons foram criados (booo!!)" + "\n\n" +
                "RESULTADO:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
