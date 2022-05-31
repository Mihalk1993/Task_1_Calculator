public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

//      Далее ввводим конструкцию try...catch, так как предстоит операция деления.
//      Деление на ноль приведет к падению программы с ArithmeticException. Ловим его.
//      Также можно применить условный оператор и проверять, не равен ли делитель нулю.

        try {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("\nОшибка! Деление на ноль.");
        } finally {
            System.out.println("\nСпасибо!");
        }

    }
}
