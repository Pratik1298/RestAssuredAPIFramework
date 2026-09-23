package ToolShopAPIModels.Request;

public class ProductRequest {

    private String name;
    private String description;
    private double price;
    private String category_id;
    private String brand_id;
    private String product_image_id;
    private int is_location_offer;
    private int is_rental;
    private String co2_rating;

    public ProductRequest(String name, String description, double price, String category_id, String brand_id, String product_image_id, int is_location_offer, int is_rental, String co2_rating) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category_id = category_id;
        this.brand_id = brand_id;
        this.product_image_id = product_image_id;
        this.is_location_offer = is_location_offer;
        this.is_rental = is_rental;
        this.co2_rating = co2_rating;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getProduct_image_id() {
        return product_image_id;
    }

    public void setProduct_image_id(String product_image_id) {
        this.product_image_id = product_image_id;
    }

    public int getIs_location_offer() {
        return is_location_offer;
    }

    public void setIs_location_offer(int is_location_offer) {
        this.is_location_offer = is_location_offer;
    }

    public int getIs_rental() {
        return is_rental;
    }

    public void setIs_rental(int is_rental) {
        this.is_rental = is_rental;
    }

    public String getCo2_rating() {
        return co2_rating;
    }

    public void setCo2_rating(String co2_rating) {
        this.co2_rating = co2_rating;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category_id='" + category_id + '\'' +
                ", brand_id='" + brand_id + '\'' +
                ", product_image_id='" + product_image_id + '\'' +
                ", is_location_offer=" + is_location_offer +
                ", is_rental=" + is_rental +
                ", co2_rating='" + co2_rating + '\'' +
                '}';
    }
    public static class Builder {
        private String name;
        private String description;
        private double price;
        private String category_id;
        private String brand_id;
        private String product_image_id;
        private int is_location_offer;
        private int is_rental;
        private String co2_rating;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder categoryId(String category_id) {
            this.category_id = category_id;
            return this;
        }

        public Builder brandId(String brand_id) {
            this.brand_id = brand_id;
            return this;
        }

        public Builder productImageId(String product_image_id) {
            this.product_image_id = product_image_id;
            return this;
        }

        public Builder isLocationOffer(int is_location_offer) {
            this.is_location_offer = is_location_offer;
            return this;
        }

        public Builder isRental(int is_rental) {
            this.is_rental = is_rental;
            return this;
        }

        public Builder co2Rating(String co2_rating) {
            this.co2_rating = co2_rating;
            return this;
        }

        public ProductRequest build() {
            return new ProductRequest(name,description,price,category_id,brand_id,product_image_id,is_location_offer,is_rental,co2_rating);
        }
    }



}


