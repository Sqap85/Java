public class Main {
    public static void main(String[] args) {

        // Farklı boyutlarda pizza nesneleri oluşturuluyor.
        Pizza mix = new MixPizza(Size.SMALL);
        Pizza sicilian = new SicilianPizza(Size.LARGE);

        // Pizza türündeki nesneleri bir diziye ekleme.
        Pizza[] pizzas = {mix, sicilian};
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }

        // sicilian.Make();
        // sicilian nesnesi Pizza türünde olduğu için Make() metoduna erişim sağlanamaz.
        // Ancak, downcasting ile erişim sağlanabilir.

        // 1. Yöntem: Yeni bir değişkene atayarak.
        SicilianPizza sicilianPizza = (SicilianPizza) sicilian;
        sicilianPizza.Make();

        // 2. Yöntem: Direkt cast ederek (tek satırda).
        ((SicilianPizza) sicilian).Make();
    }
}
