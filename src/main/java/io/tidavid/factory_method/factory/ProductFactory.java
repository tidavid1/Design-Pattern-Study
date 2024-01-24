package io.tidavid.factory_method.factory;

import io.tidavid.factory_method.product.Product;
import java.util.Map;

public abstract class ProductFactory {

    public Map<String, String> getDetail() {
        Product product = createProduct();
        return product.getDetail();
    }

    public int getPrice(int quantity) {
        Product product = createProduct();
        return product.getPrice(quantity);
    }

    protected abstract Product createProduct();

}
