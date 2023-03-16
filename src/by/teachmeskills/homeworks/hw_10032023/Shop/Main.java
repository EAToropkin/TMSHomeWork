package by.teachmeskills.homeworks.hw_10032023.Shop;

import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EmptyProductListException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityNotFoundException;

public class Main {
    public static void main(String[] args) throws EmptyProductListException, EntityAlreadyExistsException, EntityNotFoundException {

        Shop shop = new Shop("Десяточка");

        shop.addProduct(new Products(123, "Гречка", 60));
        shop.addProduct(new Products(456, "Рис", 80));
        shop.addProduct(new Products(77, "Хлеб", 20));

        shop.getAllProduct();
        shop.sortProduct();
        System.out.println("После сортировки");
        shop.getAllProduct();
        shop.deleteProduct(456);
        System.out.println("После удаления");
        shop.getAllProduct();

        shop.editProduct(new Products(123, "Батон", 80));
        System.out.println("После редактирования");
        shop.getAllProduct();
    }
}
