package ToolShopAPIModels.Reponse;

public class CategoryResponse {

    private String id;
    private String name;
    private String slug;

    public CategoryResponse() {
    }

    public CategoryResponse(String id, String name, String slug) {
        this.id = id;
        this.name = name;
        this.slug = slug;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
