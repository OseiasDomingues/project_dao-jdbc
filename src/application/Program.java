package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {


        Department department = new Department(1, "Cars");
        Seller seller = new Seller(1, "Joan", "joan@gmail.com", new Date(), 3000.00, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}
