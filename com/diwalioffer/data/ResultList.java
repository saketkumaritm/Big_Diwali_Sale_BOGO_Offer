package com.diwalioffer.data;

import java.util.List;

public class ResultList {

    List<Integer> productsSelected;
    List<Integer> productsDiscounted;

    public ResultList(List<Integer> productsSelected, List<Integer> productsDiscountd) {
        this.productsSelected = productsSelected;
        this.productsDiscounted = productsDiscountd;
    }

    @Override
    public String toString() {
        return String.format("Discounted items (Free) %s \nPayable Items: %s", productsDiscounted, productsSelected);
    }
}
