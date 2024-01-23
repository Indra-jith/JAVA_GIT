public class switch_case {
    public static void main(String[] args) {
        //days of week
        //can be used instead of spamming if else's
        // int n = 2;
        // switch(n){
        //     case 1: System.out.println("Monday");
        //     break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wednesday");
        //     break;
        //     case 4: System.out.println("Thursday");
        //     break;
        //     case 5: System.out.println("Friday");
        //     break;
        //     case 6: System.out.println("Saturday");
        //     break;
        //     default:System.out.println("Sunday");
        //     break;
        // }
                                                   //UPDATE//
        // --latest way (update) -> can do with String
        // SHORTER ig
        String day = "Friday";
        String output="";
        switch(day)
        {
            case "Monday" , "Tuesday": output = "Class from 7-9 PM"; //and can be used later aswell
            System.out.println("Class from 7-9 PM");
            break;
            case "Wednesday":System.out.println("Class from 7-8 PM");
            break;
            //NOTE -> with arrow no need of break case "Wednesday"->System
            // but apply in every case
            default:System.out.println("No class! LETSGO!");
        }

        System.out.println(output); //like this
    }
}
