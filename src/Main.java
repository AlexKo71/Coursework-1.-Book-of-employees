public class Main {


    public static void main(String[] args) {
        Employee[] employees1 = new Employee[10];

        employees1[0] = new Employee("Иван", "Петрович", "Сидоров", 1, 100_000);
        employees1[1] = new Employee("Пётр", "Семёнович", "Чижов", 1, 90_000);
        employees1[2] = new Employee("Вера", "Петровна", "Разина", 2, 60_000);
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
        System.out.println("Среднее значение зарплат сотрудников составляет: " + Employee.averageSalary(employees1) + " рублей");
        System.out.println(Employee.minimum(employees1));
        System.out.println("Сотрудник с минимальной зарплатой: " + employees1[Employee.minimum(employees1)]);
        System.out.println("Сотрудник с максимальной зарплатой: " + employees1[Employee.maxWage(employees1)]);

        //Индексация зарплаты на пять %
        for (Employee e : employees1) {
            e.salaryIndexation(5);
        }
        System.out.println();
        System.out.println("После индексации зарплаты");
        Employee.listOfAllEmployees(employees1);

        //Найти номер отдела

        }

    }
