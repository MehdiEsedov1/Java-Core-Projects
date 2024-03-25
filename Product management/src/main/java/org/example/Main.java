package org.example;

import jakarta.persistence.*;
import jdk.jfr.Name;
import org.example.entity.Branch;
import org.example.entity.Product;
import org.example.entity.ProductDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        ORM - Object Relational Mapping
        Entity, Table, Column
        EntityManagerFactory
        EntityManager
        EntityTransaction
        persistence.xml
        persist, find, merge, remove
        Embeddable - Embedded
        ElementCollection
        AttributeOverride
        JPQL
        NamedQuery
        NativeQuery
        MappedBy
        CascadeType
        FetchType - Lazy, Eager
        n+1 problem
         */

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        ProductDetails productDetails = ProductDetails.builder()
                .type("Technology")
                .size(15.6)
                .build();

        Branch koroglu = Branch.builder()
                .address("Koroglu")
                .number(106)
                .build();

        Branch elmler = Branch.builder()
                .address("Elmler")
                .number(108)
                .build();

//        List<Branch> branches = new ArrayList<>();
//        branches.add(koroglu);

//        Product product = Product.builder()
//                .name("Computer")
//                .price(BigDecimal.valueOf(2300))
//                .description("Perfect computer. Cpu - 5, Ram - 16, Gen - 12, Ssd - 512, Nvidia, Processor - I5")
//                .productDetails(productDetails)
//                .branches(List.of(koroglu, elmler))
//                .build();

//        Product product = entityManager.find(Product.class, 1L);
//        System.out.println(product);
//        product.setDescription("Super computer. 5th Gen");

        entityTransaction.begin();
        Query nativeQuery = entityManager.createNativeQuery("select * from Product", Product.class);
        List<Product> resultList = (List<Product>) nativeQuery.getResultList();
        System.out.println(resultList);
        entityTransaction.commit();

    }
}