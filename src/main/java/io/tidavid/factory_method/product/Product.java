package io.tidavid.factory_method.product;

import java.util.Map;

public interface Product {

    Map<String, String> getDetail();

    int getPrice(int quantity);
}
