package Classes;

import java.util.Date;

abstract public class Video {
    private String name;
    private String genre;
    private Date date;

    public Video(String name, String genre, Date date) {
        this.name = name;
        this.genre = genre;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
