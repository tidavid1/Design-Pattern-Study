package io.tidavid.factory_method.factory;

import io.tidavid.factory_method.product.Product;
import io.tidavid.factory_method.product.ProductA;

public class ProductAFactory extends ProductFactory{

    @Override
    protected Product createProduct() {
        return new ProductA();
    }
}
