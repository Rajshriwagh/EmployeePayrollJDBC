package com.jdbc_employeepayroll;
import java.sql.*;

public class EmployeePayrollJDBC {
	public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll1", "root", "root");

            //PreparedStatement pstmt = null;
            //String sql = "INSERT INTO Payroll_service (id,name,gender,salary,start) VALUES (?,?,?,?,?)";

            Statement statement = connection.createStatement();

           // PreparedStatement pstmt = connection.prepareStatement(sql);

// pstmt.setInt(1, 67);
// pstmt.setString(2, "Ganesh");
// pstmt.setString(3, "F");
// pstmt.setDouble(4, 50000.00);
// pstmt.setDate(5,java.sql.Date.valueOf("2013-09-04"));
// int affectedRows = pstmt.executeUpdate();
// System.out.println(affectedRows + " row(s) affected !!");

            /*pstmt.setInt(1, 45);
            pstmt.setString(2, "ankitKumar");
            pstmt.setString(3, "M");
            pstmt.setDouble(4, 50000.00);
            pstmt.setDate(5,java.sql.Date.valueOf("2013-09-04"));*/
            //int affectedRow = pstmt.executeUpdate();
           // System.out.println(affectedRow + " row(s) affected !!");


//exceute : Will return boolean true if query success else false.
// (Used for create table, insert, update & delete )


//compile => execute....
            statement.execute("insert into employee_payroll_service values('6','Ram','40000.00','2019-05-15' );");
            statement.execute("insert into employee_payroll_service values('7','Sachin','40000.00','2019-05-15');");

//compile =>execute...
//statement.executeUpdate("update employee_payroll set name='Ankit' where id=1;");

//statement.execute("delete from employee_payroll where id=6;");

// ResultSet result = statement.executeQuery("select * from employee_payroll;");
// while (result.next()) {
// System.out.println("Id: " + result.getInt(1));
// System.out.println("Name: " + result.getString(2));
// System.out.println("gender: " + result.getString(3));
// System.out.println("salary: " + result.getDouble(4));
// System.out.println("Date: " + result.getDate(5));
// }
            connection.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
