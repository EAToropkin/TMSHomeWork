package by.teachmeskills.homeworks.hw_10032023.Shop;

import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EmptyProductListException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityNotFoundException;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop("Десяточка");

        try {
            shop.addProduct(new Product(456, "Рис", 80));
            shop.addProduct(new Product(456, "Рис", 80));
            shop.addProduct(new Product(123, "Хлеб", 20));
            shop.addProduct(new Product(123, "Гречка", 60));
            shop.addProduct(new Product(123, "Гречка", 60));

            System.out.println("До сортировки");
            shop.getAllProduct();
            shop.sortProduct();
            System.out.println("После сортировки");
            shop.getAllProduct();
            shop.deleteProduct(456);
            System.out.println("После удаления");
            shop.getAllProduct();

            shop.editProduct(new Product(123, "Батон", 80));
            shop.getAllProduct();
        } catch (EntityAlreadyExistsException e) {
            System.out.println("Ошибка добавления продукта: " + e.getMessage());
        } catch (EntityNotFoundException e) {
            System.out.println("Ошибка удаления продукта: " + e.getMessage());
        } catch (EmptyProductListException e) {
            System.out.println("Ошибка сортировки списка продуктов: " + e.getMessage());
        }
    }
}