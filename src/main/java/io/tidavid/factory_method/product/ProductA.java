package io.tidavid.factory_method.product;

import java.util.HashMap;
import java.util.Map;

public class ProductA implements Product {

    private static final int PRICE = 100;

    private static final Map<String, String> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put("Name", "ProductA");
        MAP.put("Price", String.valueOf(PRICE));
    }

    @Override
    public Map<String, String> getDetail() {
        return MAP;
    }

    @Override
    public int getPrice(int quantity) {
        return PRICE * quantity;
    }
}
