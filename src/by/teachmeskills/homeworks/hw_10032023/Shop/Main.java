package by.teachmeskills.homeworks.hw_10032023.Shop;

import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EmptyProductListException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityNotFoundException;

import java.util.Arrays;

public class Main {

    private static void addProduct(Shop shop, Product product) {
        try {
            shop.addProduct(product);
            System.out.println("Продукт = " + product.getName() + " добавлен");
        } catch (Exception e) {
            System.out.println("Ошибка добавления продукта " + product.getName() + " c id " + product.getProductId() + ": " + e.getMessage());
        }
    }

    private static void editProduct(Shop shop, Product product) {
        try {
            shop.editProduct(product);
            System.out.println("Продукт c id " + product.getProductId() + " отредактирован");
        } catch (Exception e) {
            System.out.println("Ошибка добавления продукта = " + product.getName() + ": " + e.getMessage());
        }
    }

    private static void getAllProduct(Shop shop) {
        try {
            shop.getAllProduct();
        } catch (Exception e) {
            System.out.println("Ошибка вывода списка продуктов " + e.getMessage());
        }
    }

    private static void sortProduct(Shop shop) {
        try {
            shop.sortProduct();
        } catch (Exception e) {
            System.out.println("Ошибка сортировки списка продуктов " + e.getMessage());
        }
    }

    private static void deleteProduct(Shop shop, int idProduct) {
        try {
            shop.deleteProduct(idProduct);
            System.out.println("Продукт c id " + idProduct + " удален");
        } catch (Exception e) {
            System.out.println("Ошибка удаления продукта с id " + idProduct + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) throws EmptyProductListException, EntityAlreadyExistsException, EntityNotFoundException {

        Shop shop = new Shop("Десяточка");

        addProduct(shop, new Product(456, "Рис", 80));
        addProduct(shop, new Product(123, "Хлеб", 20));
        addProduct(shop, new Product(123, "Гречка", 60));
        addProduct(shop, new Product(123, "Гречка", 60));

        System.out.println("До сортировки");
        getAllProduct(shop);
        sortProduct(shop);
        System.out.println("После сортировки");
        getAllProduct(shop);
        deleteProduct(shop, 456);
        System.out.println("После удаления");
        getAllProduct(shop);

        editProduct(shop, new Product(123, "Батон", 80));
        System.out.println("После редактирования");
        getAllProduct(shop);
    }
}
