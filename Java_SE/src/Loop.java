public class Loop {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//            if (i == 5) {
//                break;
//            }
//        }
//вывести все четные числа от 0 до 1000
//        int i = 0;
//        while (i <= 1000){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }
//        int i = 0;
//        while (i <= 1000){
//                System.out.println(i);
//                i+= 2;
//            }
// условие должно быть выполнено хотя бы один раз
//       int a = 0;
//       do {
//           System.out.println("hi");
//       }while (a > 0);

//4 типа циклов while, do while,for,foreach.
// цикл for нужен чтобы выполнить действие определенное кол - во раз
//        for (int i = 1; i <= 1000; i++){
//            System.out.println(i);
//        }

        for (int i = 1000; i >= 0; i--){
            if (i % 3 == 0){
                System.out.println(i);
            }

        }

    }
}
