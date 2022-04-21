package Classes;

import java.util.Date;

public class TvSeries extends Video{
    private int seasons;

    public TvSeries(String name, String genre, Date date, int seasons) {
        super(name, genre, date);
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
