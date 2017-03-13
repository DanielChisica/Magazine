/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * The class Article contains the structure of a magazine article 
 * @author Daniel Jiménez Chísica
 * @since 12 March 2017
 */
public class Article {
    private String title;
    private String bodyText;
    private String urlImage;
    
    /**
     * The constructor of the article receives, its title, its body text and the
     * URL of the article image
     * @param title The name of the article
     * @param bodyText The content of an article
     * @param urlImage The URL with the image location that is going to be
     * placed in the article
     */
    public Article(String title, String bodyText, String urlImage) {
        this.title = title;
        this.bodyText = bodyText;
        this.urlImage = urlImage;
    }
    
    /**
     * Returns the title of an article
     * @return String of the article title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the name of the article
     * @param title String with its name
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * Returns the content of the article
     * @return The String with the content of the article
     */
    public String getBodyText() {
        return bodyText;
    }
    
    /**
     * Sets the content of the article
     * @param bodyText The String with the input content of the article
     */
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }
    
    /**
     * Returns the URL of the article image
     * @return String with URL location
     */
    public String getUrlImage() {
        return urlImage;
    }
    
    /**
     * Sets the URL of the article image
     * @param urlImage String with URL location of the image
     */
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
    
}
