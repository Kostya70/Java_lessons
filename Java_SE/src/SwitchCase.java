public class SwitchCase {
    public static void main(String[] args) {
        String nameMonth = "март";
        switch (nameMonth){
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.println("зима");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.println("весна");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.println("лето");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.println("осень");
            default:
                System.out.println("нет такого месяца");
        }

    }
}

//        int month = 8;
//        switch (month){
//            case 1:
//                System.out.println("Январь");
//                break;
//            case 2:
//                System.out.println("Февраль");
//                break;
//            case 3:
//                System.out.println("Март");
//                break;
//            case 4:
//                System.out.println("Апрель");
//                break;
//            case 5:
//                System.out.println("Май");
//                break;
//            case 6:
//                System.out.println("Июнь");
//                break;
//            case 7:
//                System.out.println("Июль");
//                break;
//            case 8:
//                System.out.println("Август");
//                break;
//            case 9:
//                System.out.println("Сентябрь");
//                break;
//            case 10:
//                System.out.println("Октябрь");
//                break;
//            case 11:
//                System.out.println("Ноябрь");
//                break;
//            case 12:
//                System.out.println("декабрь");
//                break;
//            default:
//                System.out.println("Неизвестный месяц");



//        if (month == 1){
//            System.out.println("Январь");
//        }
//        else if (month == 2){
//            System.out.println("Февраль");
//        }
//        else if (month == 3){
//            System.out.println("Март");
//        }
//        else if (month == 4){
//            System.out.println("Апрель");
//        }
//        else if (month == 5){
//            System.out.println("Май");
//        }
//        else if (month == 6){
//            System.out.println("Июнь");
//        }
//        else if (month == 7){
//            System.out.println("Июль");
//        }
//        else if (month == 8){
//            System.out.println("Август");
//        }
//        else if (month == 9){
//            System.out.println("Сентябрь");
//        }
//        else if (month == 10){
//            System.out.println("Октябрь");
//        }
//        else if (month == 11){
//            System.out.println("Ноябрь");
//        }
//        else if (month == 12){
//            System.out.println("Декабрь");
//        }

