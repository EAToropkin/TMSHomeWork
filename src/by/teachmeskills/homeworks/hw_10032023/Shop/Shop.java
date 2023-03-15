package by.teachmeskills.homeworks.hw_10032023.Shop;

import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EmptyProductListException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;


public class Shop {
    private String nameShop;
    private static List<Products> listProducts;

    public Shop(String nameShop) {
        this.nameShop = nameShop;
    }

    {
        listProducts = new ArrayList<>();
    }

    static class Products {
        private int id;
        private String name;
        private int price;

        public Products(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    public static void checkIsEmpty() throws EmptyProductListException {
        if (listProducts.isEmpty()) {
            throw new EmptyProductListException("No products found");
        }
    }

    public static void addProduct(Products product) throws EntityAlreadyExistsException {
        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            if (item.id == product.id) {
                throw new EntityAlreadyExistsException("The product exists");
            }
        }
        listProducts.add(product);
    }

    public static void getAllProduct() throws EmptyProductListException {
        checkIsEmpty();

        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            System.out.println("Product id " + item.id + ", name " + item.name + ", price " + item.price);
        }
    }

    public static void deleteProduct(int idProduct) throws EmptyProductListException, EntityNotFoundException {
        checkIsEmpty();
        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            if (item.id == idProduct) {
                listProducts.remove(i);
                return;
            }
        }
        throw new EntityNotFoundException("Product with id " + idProduct + " not found");
    }

    public static void editProduct(Products product) throws EmptyProductListException, EntityNotFoundException {
        checkIsEmpty();
        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            if (item.id == product.id) {
                listProducts.set(i, product);
                return;
            }
        }
        throw new EntityNotFoundException("Product with id " + product.id + " not found");
    }

    public static void sortProduct() throws EmptyProductListException {
        checkIsEmpty();
        boolean isSorted = false;
        Products itemFirst;
        Products itemNext;
        Products itemTmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < listProducts.size() - 1; i++) {
                itemFirst = listProducts.get(i);
                itemNext = listProducts.get(i + 1);

                if (itemNext.price < itemFirst.price) {
                    isSorted = false;
                    itemTmp = itemFirst;
                    itemFirst = itemNext;
                    itemNext = itemTmp;
                    listProducts.set(i, itemFirst);
                    listProducts.set(i + 1, itemNext);
                }
            }
        }
    }
}

