public class Array {
    public static void main(String[] args) {
//        String[] namesOfMpnths = new String[12];
//        namesOfMpnths[0] = "Январь";
//        namesOfMpnths[1] = "Февраль";
//        namesOfMpnths[2] = "Март";
//        namesOfMpnths[3] = "Апрель";
//        namesOfMpnths[4] = "Май";
//        namesOfMpnths[5] = "Июнь";
//        namesOfMpnths[6] = "Июль";
//        namesOfMpnths[7] = "Август";
//        namesOfMpnths[8] = "Сентябрь";
//        namesOfMpnths[9] = "Октябрь";
//        namesOfMpnths[10] = "Ноябрь";
//        namesOfMpnths[11] = "Декабрь";
////        for (int i = 0; i < 12; i++){
//        for (int i = 0; i < namesOfMpnths.length; i++){ // так не буду выходить за пределы массива
//                System.out.print(namesOfMpnths[i]);
//                if (i < namesOfMpnths.length - 1){
//                    System.out.print(", ");
//                }else {
//                    System.out.print(".");
//                }
//
//            }

//        int[] numbers = {1,2,3,4,5,6,7,8,9,};
//        for (int i = 0; i < numbers.length; i++){
////            if (i < numbers.length - 1){
//                System.out.println(numbers[i]);
////            }
//        }
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}

