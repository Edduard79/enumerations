public class Tester {
    public Tester(){
    }
    public enum Months{
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public static void main(String[] args){
        Months[] num1 = Months.values();

        for(int i = 0; i < 12; i++){
            Months month = num1[i];

            System.out.println(month + (month.toString().endsWith("y") ? " ends with y" : " doesn't end with y"));

        }

        

    }
}
