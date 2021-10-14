package com.example.lab_a1_a2_android_tejinder_c0792806.model;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class ProviderhaveProducts {

    @Embedded
    public Provider provider;

    @Relation(
            parentColumn = "providerID", entityColumn = "productProviderID"
    )

    public List<Product> products;

}
