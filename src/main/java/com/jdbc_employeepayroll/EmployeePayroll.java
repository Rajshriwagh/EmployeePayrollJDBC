package com.jdbc_employeepayroll;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayroll {
	public List<EmployeePayrollData> readEmployeePayrollData() {
        String jdbcUrl = "jdbc:mysql://localhost:3306/employee_payroll1";
        String username = "root";
        String password = "root";
        List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
        try {
            System.out.println("Connecting to database " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee_payroll1 ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employeeId = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                double salary = resultSet.getDouble("Salary");
                LocalDate startDate = resultSet.getDate("Start_date").toLocalDate();
                employeePayrollDataList.add(new EmployeePayrollData(employeeId, name, salary, startDate));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeePayrollDataList;
    }
}
