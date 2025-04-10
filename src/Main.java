//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("ФИО_1", 1, 151000);
        employees[1] = new Employee("ФИО_2", 2, 75000);
        employees[2] = new Employee("ФИО_3", 3, 85500);
        employees[3] = new Employee("ФИО_4", 4, 65000);
        employees[4] = new Employee("ФИО_5", 5, 95500);
        employees[5] = new Employee("ФИО_6", 1, 120000);
        employees[6] = new Employee("ФИО_7", 2, 78000);
        employees[7] = new Employee("ФИО_8", 3, 83000);
        employees[8] = new Employee("ФИО_9", 4, 61000);
        employees[9] = new Employee("ФИО_10", 5, 90500);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        System.out.println();

        int totalSalary = calculateSummSalary(employees);
        System.out.println("Сумма трат на з/п составила: " + totalSalary);

        System.out.println();

        int minSal = calculateMinSalary(employees);
        System.out.println("Минимальная з/п за месяц составила: " + minSal);

        System.out.println();

        int maxSal = calculateMaxSalary(employees);
        System.out.println("Максимальная з/п за месяц составила: " + maxSal);

        System.out.println();

        System.out.println("Сотрудник с минимальной ЗП:");

        System.out.println(findEmployeeWithMinSalary(employees));

        System.out.println();

        System.out.println("Сотрудник с максимальной ЗП:");

        System.out.println(findEmployeeWithMaxSalary(employees));

        System.out.println();

        float avgSal = calculateAvgSalary(employees);
        System.out.println("Средняя з/п за месяц составила: " + avgSal);

        System.out.println();

        printName(employees);
    }

    public static int calculateSummSalary(Employee[] employees) {
        int sum = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                sum += emp.getSalary();
            }
        }
        return sum;
    }

    public static int calculateMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            int salaryEmployee = emp.getSalary();
            if (salaryEmployee > maxSalary) {
                maxSalary = salaryEmployee;
            }
        }
        return maxSalary;
    }

    public static int calculateMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee emp : employees) {
            int salaryEmployee = emp.getSalary();
            if (salaryEmployee < minSalary) {
                minSalary = salaryEmployee;
            }
        }
        return minSalary;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee min = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }


    public static float calculateAvgSalary(Employee[] employees) {
        int sum = calculateSummSalary(employees);
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName() != null) {
                count++;
            }
        }
        float avg = (float) sum / count;
        return avg;
    }

    private static void printName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}