package com.diwalioffer;

import java.util.List;

import com.diwalioffer.data.ResultList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiwaliBogoOffer {

    public ResultList getProductsWithMaximumDiscount(List<Integer> products) {

        Collections.sort(products, Collections.reverseOrder());
        
        List<Integer> productsSelected = new ArrayList<>();
        List<Integer> productsDiscounted = new ArrayList<>();

        for(int i=0;i<products.size();i++){
            productsSelected.add(products.get(i));
            if(i+1 < products.size()){
                i++;
                productsDiscounted.add(products.get(i));
            }
        }
        return new ResultList(productsSelected, productsDiscounted);
    }
    
    public static void main(String[] args) {
        DiwaliBogoOffer diwaliBogoOffer = new DiwaliBogoOffer();

        List<Integer> inputProducts = Arrays.asList(10,20,30,40,50,60);
        ResultList result = diwaliBogoOffer.getProductsWithMaximumDiscount(inputProducts);

        System.out.println(result);

        List<Integer> inputProducts1 = Arrays.asList(10,20,30,40,50,50, 60);

        ResultList result1 = diwaliBogoOffer.getProductsWithMaximumDiscount(inputProducts1);

        System.out.println(result1);
    }
}
