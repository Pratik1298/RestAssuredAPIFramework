package ToolShopAPIModels.Reponse;

public class ProductImageResponse {

    private String id;
    private String byName;
    private String byUrl;
    private String sourceName;
    private String sourceUrl;
    private String fileName;
    private String title;

    public ProductImageResponse() {
    }

    public ProductImageResponse(String id, String byName, String byUrl, String sourceName,
                        String sourceUrl, String fileName, String title) {
        this.id = id;
        this.byName = byName;
        this.byUrl = byUrl;
        this.sourceName = sourceName;
        this.sourceUrl = sourceUrl;
        this.fileName = fileName;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getByName() {
        return byName;
    }

    public void setByName(String byName) {
        this.byName = byName;
    }

    public String getByUrl() {
        return byUrl;
    }

    public void setByUrl(String byUrl) {
        this.byUrl = byUrl;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
