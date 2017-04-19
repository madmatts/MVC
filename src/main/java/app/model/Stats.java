package app.model;

import org.joda.time.DateTime;

/**
 * Created by Matts on 19.04.2017.
 */
public class Stats {
    private double avg;
    private double max;
    private double min;
    private String timeStart;
    private String timeEnd;

    public Stats() {
        this.avg = 0;
        this.max = 0;
        this.min = 0;
        this.timeStart = DateTime.now().toDateTime().toString();
        this.timeEnd = null;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
