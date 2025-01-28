public class ZaraEmployeesBonus {
    public static int[][] initializeData(int employees) {
        int[][] salaryAndService = new int[employees][2];
        for (int i = 0; i < employees; i++) {
            salaryAndService[i][0] = (int) (Math.random() * 90000) + 10000;
            salaryAndService[i][1] = (int) (Math.random() * 10) + 1;
        }
        return salaryAndService;
    }

    public static int[][] findNewSalaryAndBonus(int[][] salaryAndService) {
        int[][] newSalaryAndBonus = new int[salaryAndService.length][2];
        for (int i = 0; i < salaryAndService.length; i++) {
            int years = salaryAndService[i][1];
            int salary = salaryAndService[i][0];
            int bonus = years > 5 ? (int) (salary * 0.05) : (int) (salary * 0.02);
            newSalaryAndBonus[i][0] = salary + bonus;
            newSalaryAndBonus[i][1] = bonus;
        }
        return newSalaryAndBonus;
    }

    public static void displaySummary(int[][] salaryAndService, int[][] newSalaryAndBonus) {
        int oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;
        System.out.println("Employee No.\tOld Salary\tYears of Service\tNew Salary\tBonus");
        for (int i = 0; i < salaryAndService.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n", i + 1, salaryAndService[i][0], salaryAndService[i][1], newSalaryAndBonus[i][0], newSalaryAndBonus[i][1]);
            oldSalarySum += salaryAndService[i][0];
            newSalarySum += newSalaryAndBonus[i][0];
            totalBonus += newSalaryAndBonus[i][1];
        }
        System.out.printf("Total\t\t%d\t\t\t\t\t\t%d\t\t%d\n", oldSalarySum, newSalarySum, totalBonus);
    }

    public static void main(String[] args) {
        int employees = 10;
        int[][] salaryAndService = initializeData(employees);
        int[][] newSalaryAndBonus = findNewSalaryAndBonus(salaryAndService);
        displaySummary(salaryAndService, newSalaryAndBonus);
    }
}
