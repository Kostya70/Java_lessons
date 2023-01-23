public class ForEach {
    public static void main(String[] args) {
//        String[] names = {"Helen", "Max", "John", "Jim"};
//        for (int i = 0; i < names.length; i++){            деа подсказывает о реплейсе для фор альт энтер комбинация
//            System.out.println(names[i]);
//        }
//        for (String name : names) {
//            System.out.println(name);
//        }

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers [i] = i + 100;
        }
        for (int number : numbers) {
            System.out.println(number);
            
        }
    }
}
