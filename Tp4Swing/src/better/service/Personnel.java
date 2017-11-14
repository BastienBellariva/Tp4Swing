package better.service;

import better.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Personnel {

    private List<Employee> employees;
    static Personnel instance;
    private static final String PRINT_PATTERN = "%s gagne %.2f euros";

    public Personnel() {
        this.employees = new ArrayList<>();
    }

    public void ajouterEmploye(Employee employee) {
        this.employees.add(employee);
    }

    public Object[][] salaryArray()
    {
        Object[][] salAr = new Object[100][6];
        int cpt = 0;

        for (Employee employee: employees)
        {
            salAr[cpt][0] = employee.getType();
            salAr[cpt][1] = employee.getFirstname();
            salAr[cpt][2] = employee.getLastname();
            salAr[cpt][3] = employee.getAge();
            salAr[cpt][4] = employee.getEntryYear();
            salAr[cpt++][5] = employee.calculerSalaire();
        }

        return salAr;
    }

    public double salaireMoyen() {
        double total = 0;
        for (Employee employee: employees) {
            total += employee.calculerSalaire();
        }
        return total / employees.size();
    }

    public static Personnel getInstance()
    {
        if (instance == null)
        {
            instance = new Personnel();
        }

        return instance;
    }
}
