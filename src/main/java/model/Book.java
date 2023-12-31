package model;

public class Book {

    private String title;
    private String author;
    private String genre;

    // Maybe we could add summary, number of pages, date of release, category
    // Pending
    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    // getters & setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String showInfo() {
        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre;
    }
}
