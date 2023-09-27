public class VacationCalculationService {
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonthCount = 0;
        int balance = 0;

        for(int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                vacationMonthCount++;
                balance = balance  - expenses;
                balance = balance / 3;


            } else {
                balance = balance + income - expenses;
            }
        }
        return vacationMonthCount;
    }
}
