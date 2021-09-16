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
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("\n=== Test 02 => findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);

        for (Seller s : sellers){
            System.out.println(s);
        }

        System.out.println("\n=== Test 03 => findAll ===");
        sellers = sellerDao.findAll();

        for (Seller s : sellers){
            System.out.println(s);
        }

        System.out.println("\n=== Test 04 => insert ===");
        Seller newSeller = new Seller(null, "Peter", "peter@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== Test 05 => update ===");
        seller = sellerDao.findById(8);
        seller.setName("Peter Brown");
        sellerDao.update(seller);
        System.out.println("Update complete!");
    }
}
