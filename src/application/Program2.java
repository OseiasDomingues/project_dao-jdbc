package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== Test 01 => insert ===");
//        Department newDepartment = new Department(null, "---");
//        departmentDao.insert(newDepartment);
//        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== Test 02 => update ===");
        Department department = departmentDao.findById(7);
        department.setName("Games");
        departmentDao.update(department);
        System.out.println("Update complete!");

        System.out.println("\n=== Test 03 => delete ===");
        //departmentDao.deleteById(6);
        System.out.println("Delete complete!");

        System.out.println("\n=== Test 04 => findById ===");
        department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n=== Test 05 => findAll ===");

        List<Department> departments = departmentDao.findAll();

        for(Department d : departments){
            System.out.println(d);
        }











    }
}
