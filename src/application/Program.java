package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {




        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 01 => findById ===");
        Seller sellerById = sellerDao.findById(1);
        System.out.println(sellerById);

        System.out.println("\n=== Test 02 => findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        for (Seller s : sellers){
            System.out.println(s);
        }



    }
}
