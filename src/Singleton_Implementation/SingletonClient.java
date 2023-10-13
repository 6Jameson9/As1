package Singleton_Implementation;

//клиентский класс:
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Проверка, что singleton1 и singleton2 - это один и тот же экземпляр.
        System.out.println(singleton1 == singleton2); // Должно вернуть true

        singleton1.showMessage();
    }
}
