package ToolShopAPIModels.Reponse;

import ToolShopAPIModels.Reponse.BrandResponse;
import ToolShopAPIModels.Reponse.CategoryResponse;
import ToolShopAPIModels.Reponse.ProductImageResponse;

import java.math.BigDecimal;

public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private boolean isLocationOffer;
    private boolean isRental;
    private String co2Rating;
    private boolean inStock;
    private boolean isEcoFriendly;
    private ProductImageResponse productImage;
    private CategoryResponse category;
    private BrandResponse brand;

    public ProductResponse() {
    }

    public ProductResponse(String id, String name, String description, BigDecimal price,
                   boolean isLocationOffer, boolean isRental, String co2Rating,
                   boolean inStock, boolean isEcoFriendly, ProductImageResponse productImage,
                   CategoryResponse category, BrandResponse brand) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isLocationOffer = isLocationOffer;
        this.isRental = isRental;
        this.co2Rating = co2Rating;
        this.inStock = inStock;
        this.isEcoFriendly = isEcoFriendly;
        this.productImage = productImage;
        this.category = category;
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isLocationOffer() {
        return isLocationOffer;
    }

    public void setLocationOffer(boolean locationOffer) {
        isLocationOffer = locationOffer;
    }

    public boolean isRental() {
        return isRental;
    }

    public void setRental(boolean rental) {
        isRental = rental;
    }

    public String getCo2Rating() {
        return co2Rating;
    }

    public void setCo2Rating(String co2Rating) {
        this.co2Rating = co2Rating;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean isEcoFriendly() {
        return isEcoFriendly;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        isEcoFriendly = ecoFriendly;
    }

    public ProductImageResponse getProductImage() {
        return productImage;
    }

    public void setProductImage(ProductImageResponse productImage) {
        this.productImage = productImage;
    }

    public CategoryResponse getCategory() {
        return category;
    }

    public void setCategory(CategoryResponse category) {
        this.category = category;
    }

    public BrandResponse getBrand() {
        return brand;
    }

    public void setBrand(BrandResponse brand) {
        this.brand = brand;
    }
}
