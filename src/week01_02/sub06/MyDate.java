package week01_02.sub06;

import java.util.GregorianCalendar;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid(){
        GregorianCalendar gc = new GregorianCalendar();

        String result = "";
        result = year + "년" + month + "월 " + day + "은";

        if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8|| month == 10 || month == 12){
            if (day > 31){
                result = result + "유효하지 않은 날짜 입니다.";
            }
            else {
                result = result + "유효한 날짜 입니다.";
            }
        }
        else if (month == 2){
            if (gc.isLeapYear(year)){
                if (day > 28){
                    result = result + "유효하지 않은 날짜 입니다.";
                }
                else {
                    result = result + "유효한 날짜 입니다.";
                }
            }
            else {
                if (day > 29){
                    result = result + "유효하지 않은 날짜 입니다.";
                }
                else {
                    result = result + "유효한 날짜 입니다.";
                }
            }
        }
        else {
            if (day > 30){
                result = result + "유효하지 않은 날짜 입니다.";
            }
            else {
                result = result + "유효한 날짜 입니다.";
            }
        }

        return result;
    }
}
