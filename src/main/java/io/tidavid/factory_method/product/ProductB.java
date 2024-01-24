package io.tidavid.factory_method.product;

import java.util.HashMap;
import java.util.Map;

public class ProductB implements Product {

    private static final int PRICE = 10000;
    private static final Map<String, String> MAP;

    static {
        MAP = new HashMap<>();
        MAP.put("Name", "ProductB");
        MAP.put("Price", String.valueOf(PRICE));
        MAP.put("Region", "USA");
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
