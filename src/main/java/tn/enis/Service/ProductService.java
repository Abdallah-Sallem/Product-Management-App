package tn.enis.Service;

import org.springframework.stereotype.Service;
import tn.enis.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<ProductDto> products = new ArrayList<>();

    public void add(ProductDto product) {
        products.add(product);
    }

    public List<ProductDto> getAll() {
        return products;
    }

    public void delete(int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void update(int index, ProductDto newProduct) {
        if (index >= 0 && index < products.size()) {
            products.set(index, newProduct);
        }
    }

    public ProductDto get(int index) {
        return products.get(index);
    }

    public double getTotal() {
        return products.stream()
                .mapToDouble(ProductDto::getTotal)
                .sum();
    }
}
