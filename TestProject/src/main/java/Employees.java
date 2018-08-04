import java.util.Scanner;

/**
 * Created by Davion on 2018/8/4.
 */
public class Employees {

    public static void main(String[] args) {
        String  salary;
        double lastsalary;
        System.out.print("请输入工资：");
        Scanner scan = new Scanner(System.in);
        salary = scan.nextLine();
        lastsalary = selfValue(salary);
        System.out.println("索要缴纳的税费为："+lastsalary);
    }

    public static double selfValue(String msalary){ // 个人所得税具体计算
        int salary;
        double sefValue;
        salary = Integer.parseInt(msalary);
        if(salary<=1500){
            sefValue = salary*0.03;
        }else if(salary>=1500 && salary<4500){
            sefValue = 1500*0.03+(salary-1500)*0.1;
        }else if(salary>=4500 && salary<9000){
            sefValue = 1500*0.03+3000*0.1+(salary-4500)*0.2;
        }else if(salary>=9000 && salary<35000){
            sefValue = 1500*0.03+3000*0.1+4500*0.2+(salary-9000)*0.25;
        }else if(salary>=35000 && salary<55000){
            sefValue = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+(salary-35000)*0.3;
        }else if(salary>=55000 && salary<80000){
            sefValue = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3 +(salary-55000)*0.35;
        }else{
            sefValue = 1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3 +25000*0.35+(salary-80000)*0.45;
        }
        return sefValue;
    }
}
