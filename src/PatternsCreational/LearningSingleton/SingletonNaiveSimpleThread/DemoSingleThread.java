package PatternsCreational.LearningSingleton.SingletonNaiveSimpleThread;


public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("Se você vir o mesmo valor, então o singleton foi reutilizado (yay!)" + "\n" +
                "Se você vir valores diferentes, então dois singletons foram criados (booo!!)" + "\n\n" +
                "RESULTADO:" + "\n");

        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

    }

}
