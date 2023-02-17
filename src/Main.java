

public class Main {


    public static void main(String[] args) {
        Employee[] employees1 = new Employee[10];

        employees1[0] = new Employee("Иван", "Петрович", "Сидоров", 1, 100_000);
        employees1[1] = new Employee("Пётр", "Семёнович", "Чижов", 1, 90_000);
        employees1[2] = new Employee("Вера", "Петровна", "Разина", 1, 60_000);
        employees1[3] = new Employee("Екатерина", "Владимировна", "Кузьмина", 2, 65_000);
        employees1[4] = new Employee("Александр", "Николаевич", "Валько", 3, 80_000);
        employees1[5] = new Employee("Татьяна", "Павлона", "Конкина", 3, 85_000);
        employees1[6] = new Employee("Иван", "Степанович", "Сизов", 4, 65_000);
        employees1[7] = new Employee("Евгений", "Сергеевич", "Петров", 4, 50_000);
        employees1[8] = new Employee("Светлана", "Михайловна", "Правдина", 5, 92_000);
        employees1[9] = new Employee("Михаил", "Петрович", "Зотов", 5, 75_000);


        Employee.listOfAllEmployees(employees1);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц составляет: " + Employee.amountOfSalaries(employees1) + " рублей");
        System.out.println();
        System.out.println("Среднее значение зарплат сотрудников составляет: " + Employee.averageSalary(employees1) + " рублей");
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.minWage(employees1));
        System.out.println();
        System.out.println("Сотрудник с максимальной зарплатой: " + Employee.maxWage(employees1));
        System.out.println();

        //Индексация зарплаты на пять %
        for (Employee e : employees1) {
            e.salaryIndexation(5);
        }
        System.out.println();
        System.out.println("После индексации зарплаты");
        Employee.listOfAllEmployees(employees1);
        System.out.println();


        //Номер отдела
        int numberDepartment = 3;

        int arraySize2 = Employee.arraySize(employees1, numberDepartment);
        Employee[] employees2 = Employee.departments(employees1, arraySize2, numberDepartment);
        System.out.println();
        System.out.println("Сотрудник " + numberDepartment + " отдела с минимальной зарплатой: " + Employee.minWage(employees2));
        System.out.println();
        System.out.println("Сотрудник " + numberDepartment + " отдела с максимальной зарплатой: " + Employee.maxWage(employees2));
        System.out.println();
        System.out.println("Сумма затрат на зарплаты " + numberDepartment + " отдела в месяц составляет: " + Employee.amountOfSalaries(employees2) + " рублей");
        System.out.println();
        System.out.println("Среднее значение зарплат сотрудников " + numberDepartment + " отдела составляет: " + Employee.averageSalary(employees2) + " рублей");
        System.out.println();

        //Печать сотрдников отдела

        System.out.println("Список сотрудников " + numberDepartment + " отдела");
        Employee.listDepartmentEmployees(employees2);

        //Индексация зарплаты на пять %
        for (Employee e : employees2) {
            e.salaryIndexation(5);
        }
        System.out.println();
        System.out.println("Список сотрудников " + numberDepartment + " отдела после индексации зарплаты");
        Employee.listDepartmentEmployees(employees2);

        System.out.println();
        int Threshold = 65000;
        System.out.println("Список сотрудников, получающих зарплату меньше чем " + Threshold + " рублей.");
        int arraySize3 = Employee.arraySizeLess(employees1, Threshold);
        if (arraySize3 == 0) {
            System.out.println("Таких сотрудников нет");
        } else {
            Employee[] employees3 = Employee.lessPaidEmployees(employees1, arraySize3, Threshold);
            Employee.listOfAllEmployees(employees3);
        }
        System.out.println();
        System.out.println("Список сотрудников, получающих зарплату больше чем " + Threshold + " рублей.");
        int arraySize4 = Employee.arraySizeMore(employees1, Threshold);
        if (arraySize4 == 0) {
            System.out.println("Таких сотрудников нет");
        } else {
            Employee[] employees4 = Employee.morePaidEmployees(employees1, arraySize4, Threshold);
            Employee.listOfAllEmployees(employees4);
        }

    }
}


