package io.tidavid.factory_method;

import static org.assertj.core.api.Assertions.assertThat;

import io.tidavid.factory_method.factory.ProductAFactory;
import io.tidavid.factory_method.factory.ProductBFactory;
import io.tidavid.factory_method.factory.ProductFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Factory Method Example")
class FactoryMethodTest {

    @Test
    void testProductAFactory() {
        // Arrange
        ProductFactory factory = new ProductAFactory();
        int expectedQuantity = 1;
        // Act
        var actualProductDetail = factory.getDetail();
        var actualProductPrice = factory.getPrice(expectedQuantity);
        // Assert
        assertThat(actualProductDetail)
            .hasFieldOrPropertyWithValue("Name", "ProductA")
            .hasFieldOrPropertyWithValue("Price", String.valueOf(actualProductPrice))
            .doesNotContainKey("Region");
    }

    @Test
    void testProductBFactory() {
        // Arrange
        ProductFactory factory = new ProductBFactory();
        int expectedQuantity = 1;
        // Act
        var actualProductDetail = factory.getDetail();
        var actualProductPrice = factory.getPrice(expectedQuantity);
        // Assert
        assertThat(actualProductDetail)
            .hasFieldOrPropertyWithValue("Name", "ProductB")
            .hasFieldOrPropertyWithValue("Price", String.valueOf(actualProductPrice))
            .hasFieldOrPropertyWithValue("Region", "USA");
    }
}