package br.com.antonioricart.blog.model;

import java.time.LocalDate;

public class Post {

    private String author;
    private String title;
    private String text;
    private LocalDate publish_date;
    private LocalDate created_date;

    public Post(String author, String title, String text){
        this.author = author;
        this.title = title;
        this.text = text;
        this.created_date = LocalDate.now();
        this.publish_date = null;
    }

    public void publish(){
        this.publish_date = LocalDate.now();
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param created_date the created_date to set
     */
    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    /**
     * @param publish_date the publish_date to set
     */
    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the created_date
     */
    public LocalDate getCreated_date() {
        return created_date;
    }

    /**
     * @return the publish_date
     */
    public LocalDate getPublish_date() {
        return publish_date;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author +'\'' +
                ", title='" + title + '\'' +
                ", text=" + text + '\'' +
                ", created_date='" + created_date + '\'' +
                ", publish_date='" + publish_date + '\'' +
                '}';
    }

}