package Classes;

import java.util.Date;

public class Movies extends Video{
    private double duration;
    private boolean oscars;

    public Movies(String name, String genre, Date date, double duration, boolean oscars) {
        super(name, genre, date);
        this.duration = duration;
        this.oscars = oscars;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isOscars() {
        return oscars;
    }

    public void setOscars(boolean oscars) {
        this.oscars = oscars;
    }
}
