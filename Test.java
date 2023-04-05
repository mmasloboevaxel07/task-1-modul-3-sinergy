package third_modul.first;

public class Test {
    public static void main(String[] args) {
        /* Пробовал создать экземпляр меча используя класс Plastic, но джава, как и должно было быть, не дала.
         Не стал тут оставлять этот экземпляр, чтобы можно было запустить. Делал так:
         Plastic plastic = new Plastic();
         Sword<Plastic> sword = new Sword<>(plastic);
        */

        // Создайте меч используя steel
        Steel steel = new Steel();
        Sword<Steel> sword = new Sword<>(steel);

        // Выведите на экран прошёл ли меч проверку прочности.
        System.out.println(sword.isDurable() ? "Меч прошел проверку на прочность" : "Меч не прошел проверку на прочность");
    }
}
