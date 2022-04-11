package Assignment1;

public class ZellerAlgorithm {

    public static String findDay(int day,int month,int year){
         yearValue(year,month);
        int firstTwo = year/100;
        int lastTwo = year%100;

        int m = shiftedMonthValue(month);

        m = (13*(m+1)/5);

        int x = (m+(firstTwo/4)+(lastTwo/4)+day+lastTwo-(2*firstTwo))%7;

        return findDayName(x);
    }

    public static String findDayName(int x) {
        String day="Null";
            if(x<0){
                x+=7;
            }

            if(x==0){
                return day="Saturday";
            }
            else if (x==1){
                return day ="Sunday";
            }
            else if(x==2){
                return day ="Monday";
            }
            else if (x==3){
                return day ="Tuesday";
            }
            else if(x==4){
                return day ="Wednesday";
            }
            else if(x==5){
                return day ="Thursday";
            }
            else return day ="Friday";

        }



    public static int shiftedMonthValue(int month) {
         if(month==1 || month==2){
             return month+12;
         } else return month;
    }

    public static int yearValue(int year, int month) {
         if(month==1 || month==2){
             return (year-1);
         } else return year;
    }

}
