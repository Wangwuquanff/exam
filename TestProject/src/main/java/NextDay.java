import java.util.Scanner;

/**
 * Created by Davion on 2018/8/4.
 */
public class NextDay {

    public static void main(String[] args) {
        System.out.print("请输入日期：");
        Scanner scan = new Scanner(System.in);
        String info = scan.nextLine();
        TheNextDay(info);
    }
    public static void TheNextDay(String ccdata){
        String[] Array = ccdata.split("-");
        int year = Integer.parseInt(Array[0]);
        int month = Integer.parseInt(Array[1]);
        int day=Integer.parseInt(Array[2]);
        String mmonth=null;
        String dday=null;
        if(year%4==0&&year%100!=0||year%400==0){
            if(month>=1 && month<=12){
                if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12){
                    if( day<31 && day>=1){
                        day += 1;
                    }else if(day==31){
                        day = 1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }

                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
                if(month==2){
                    if( day<29 && day>=1){
                        day += 1;
                    }else if(day==29){
                        day = 1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }
                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
                if(month==4 || month==6 || month==9 || month==11){
                    if( day<30 && day>=1){
                        day += 1;
                    }else if(day==30){
                        day = 1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }
                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
            }
            else{
                System.out.println("你输入的日期不存在");
                System.exit(0);
            }
        }
        else{
            if(month>=1 && month<=12){
                if(month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12){
                    if( day<31 && day>=1){
                        day += 1;
                    }else if(day==31){
                        day = 1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
                if(month==2){
                    if( day<28 && day>=1){
                        day += 1;
                    }else if(day==28){
                        day = 01;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }
                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
                if(month==4 || month==6 || month==9 || month==11){
                    if( day<30 && day>=1){
                        day += 1;
                    }else if(day==30){
                        day = 1;
                        month++;
                        if(month>12){
                            month=1;
                            year++;
                        }
                    }else{
                        System.out.println("你输入的日期不存在");
                        System.exit(0);
                    }
                    mmonth = String.valueOf(month);
                    dday = String.valueOf(day);
                    if(day<10){
                        dday = "0"+day;
                    }
                    if(month<10){
                        mmonth = "0"+month;
                    }
                    System.out.println("下一天为："+year+"-"+mmonth+"-"+dday);
                    System.exit(0);
                }
            }
            else{
                System.out.println("你输入的日期不存在");
                System.exit(0);
            }
        }
    }
}
