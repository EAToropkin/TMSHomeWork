package by.teachmeskills.homeworks.hw_10032023.Shop;

import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EmptyProductListException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityAlreadyExistsException;
import by.teachmeskills.homeworks.hw_10032023.Shop.exceptions.EntityNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
    private String nameShop;
    private static List<Products> listProducts;

    public Shop(String nameShop) {
        this.nameShop = nameShop;
        this.listProducts = new ArrayList<>();
    }

    public static void checkIsEmpty() throws EmptyProductListException {
        if (listProducts.isEmpty()) {
            throw new EmptyProductListException("No products found");
        }
    }

    public static void addProduct(Products product) throws EntityAlreadyExistsException {
        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            if (item.getProductId() == product.getProductId()) {
                throw new EntityAlreadyExistsException("The product exists");
            }
        }
        listProducts.add(product);
    }

    public static void getAllProduct() throws EmptyProductListException {
        checkIsEmpty();
        listProducts.forEach((item) -> System.out.println("Product id " + item.getProductId() + ", name " + item.getName() + ", price " + item.getPrice()));
    }

    public static void deleteProduct(int idProduct) throws EmptyProductListException, EntityNotFoundException {
        checkIsEmpty();

        for (int i = 0; i < listProducts.size(); i++) {
            Products item = listProducts.get(i);
            if (item.getProductId() == idProduct) {
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
            if (item.getProductId() == product.getProductId()) {
                listProducts.set(i, product);
                return;
            }
        }
        throw new EntityNotFoundException("Product with id " + product.getProductId() + " not found");
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

                if (itemNext.getPrice() < itemFirst.getPrice()) {
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

