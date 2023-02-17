public class Employee {
    private final String firstName;
    private final String surName;
    private final String lastName;
    private int department;
    private int salary;
    private int id;
    private static int countId = 1;


    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String surName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        setId();
    }

    public void setId() {
        id = countId;
        countId++;
    }

    @Override
    public String toString() {
        return id + ": Фамилия, Имя, Отчество: " + lastName + " " + firstName + " " + surName + "; " + department + " отдел; Зарплата: " +
                +salary + " рублей.";
    }

    public static void listOfAllEmployees(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static int amountOfSalaries(Employee[] employee) {
        int amountSalaries = 0;
        for (Employee e : employee) {
            amountSalaries = amountSalaries + e.salary;
        }
        return amountSalaries;
    }

    public static int averageSalary(Employee[] employees) {
        int averageSalary = amountOfSalaries(employees) / (employees.length);
        return averageSalary;
    }

    public static Employee minWage(Employee[] employee) {
        int min = 0;
        for (int i = 1; i < employee.length; i++) {
            if (employee[min].salary > employee[i].salary) {
                min = i;
            }
        }
        return employee[min];
    }

    public static Employee maxWage(Employee[] employees) {
        int max = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[max].salary < employees[i].salary) {
                max = i;
            }
        }
        return employees[max];
    }

    public void salaryIndexation(int byPercent) {
        int increase = salary * byPercent / 100;
        salary += increase;
    }

    public static int arraySize(Employee[] employees, int number) {
        int arraySize = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == number) {
                arraySize++;
            }
        }
        return arraySize;
    }

    public static Employee[] departments(Employee[] employees, int arraySize, int number) {
        Employee[] departments = new Employee[arraySize];
        int k = 0;
        while (k < departments.length) {
            for (int s = 0; s < employees.length; s++) {
                if (employees[s].department == number) {
                    departments[k] = employees[s];
                    k++;
                }
            }
        }
        return departments;
    }

    public static void listDepartmentEmployees(Employee[] employee) {
        for (Employee value : employee) {
            System.out.println(value.id + ". " + value.lastName + " " + value.firstName + " " + value.surName + "; Зарплата: " +
                    +value.salary + " рублей.");
        }
    }

    public static int arraySizeLess(Employee[] employees, int threshold) {
        int arraySize = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary < threshold) {
                arraySize++;
            }
        }
        return arraySize;
    }

    public static int arraySizeMore(Employee[] employees, int threshold) {
        int arraySize = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary >= threshold) {
                arraySize++;
            }
        }
        return arraySize;
    }


    public static Employee[] lessPaidEmployees(Employee[] employees, int arraySize, int threshold) {
        Employee[] lessPaidEmployees = new Employee[arraySize];
        int k = 0;
        while (k < lessPaidEmployees.length) {
            for (int s = 0; s < employees.length; s++) {
                if (employees[s].salary < threshold) {
                    lessPaidEmployees[k] = employees[s];
                    k++;
                }
            }
        }
        return lessPaidEmployees;
    }

    public static Employee[] morePaidEmployees(Employee[] employees, int arraySize, int threshold) {
        Employee[] morePaidEmployees = new Employee[arraySize];
        int k = 0;
        while (k < morePaidEmployees.length) {
            for (int s = 0; s < employees.length; s++) {
                if (employees[s].salary >= threshold) {
                    morePaidEmployees[k] = employees[s];
                    k++;
                }
            }
        }
        return morePaidEmployees;
    }


}


