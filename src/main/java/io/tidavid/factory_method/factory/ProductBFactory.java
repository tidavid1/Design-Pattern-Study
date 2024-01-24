package io.tidavid.factory_method.factory;

import io.tidavid.factory_method.product.Product;
import io.tidavid.factory_method.product.ProductB;

public class ProductBFactory extends ProductFactory {

    @Override
    protected Product createProduct() {
        return new ProductB();
    }
}
