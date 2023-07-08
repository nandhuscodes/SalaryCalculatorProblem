import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] workingHourPerDay = new int[7];
        int salary = 0, sumOfHours = 0;
        for(int i = 0; i < 7; i++) {
            workingHourPerDay[i] = scanner.nextInt();
            sumOfHours += workingHourPerDay[i];
            salary += workingHourPerDay[i]*100;
            if(workingHourPerDay[i]>8){
                salary += (workingHourPerDay[i] - 8)*15;
            }
        }
        if(sumOfHours-(workingHourPerDay[0]+workingHourPerDay[6])>40){
            salary += (sumOfHours-(workingHourPerDay[0]+workingHourPerDay[6])-40)*25;
        }
        if(workingHourPerDay[0] > 0){
            salary += workingHourPerDay[0]*50;
        }
        if(workingHourPerDay[6] > 0){
            salary += workingHourPerDay[6]*25;
        }
        System.out.println(salary);
    }
}
