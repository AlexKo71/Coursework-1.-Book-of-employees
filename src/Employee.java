public class Employee {
    private String firstName;
    private String surName;
    private String lastName;
    private int department;
    private int salary;
    static int countId = 0;

    public Employee(int salary) {
        this.salary = salary;
        countId++;
    }


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
    }

    @Override
    public String toString() {
        return "Фамилия, Имя, Отчество: " + lastName + " " + firstName + " " + surName + "; " + department + " отдел; Зарплата: " +
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

    public static int minimum(Employee[] employee) {
        int minIndex = 0;
        for (int i = 0; i < employee.length; i++) {
            if (i != (employee.length - 1) && employee[minIndex].salary > employee[i + 1].salary) {
                minIndex = i + 1;
            } else {
                if (employee[minIndex].salary > employee[i].salary) minIndex = i;
            }
        }
        return minIndex;
    }

    public static int maxWage(Employee[] employee) {
        int maxIndex = 0;
        for (int i = 0; i < employee.length; i++) {
            if (i != (employee.length - 1) && employee[maxIndex].salary < employee[i + 1].salary) {
                maxIndex = i + 1;
            } else {
                if (employee[maxIndex].salary < employee[i].salary) {
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    public void salaryIndexation(int byPercent) {
        int increase = salary * byPercent / 100;
        salary += increase;
    }


}


