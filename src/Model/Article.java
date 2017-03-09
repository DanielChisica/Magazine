/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;

/**
 *
 * @author EAN
 */
public class Article {

    public Article(String title, String bodyText, Image image) {
        this.title = title;
        this.bodyText = bodyText;
        this.image = image;
    }
    
    private String title;
    private String bodyText;
    private Image image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    
    
}
