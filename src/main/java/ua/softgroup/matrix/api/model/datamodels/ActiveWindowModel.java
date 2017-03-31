package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by vadimboitsov on 3/28/17.
 */
public class ActiveWindowModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private String windowTitle;

    private LocalTime startTime;

    private int workingPeriodSeconds;

    public ActiveWindowModel(String windowTitle, LocalTime startTime, int workingPeriodSeconds) {
        this.windowTitle = windowTitle;
        this.startTime = startTime;
        this.workingPeriodSeconds = workingPeriodSeconds;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public int getWorkingPeriodSeconds() {
        return workingPeriodSeconds;
    }

    public void setWorkingPeriodSeconds(int workingPeriodSeconds) {
        this.workingPeriodSeconds = workingPeriodSeconds;
    }

    @Override
    public String toString() {
        return "ActiveWindowModel{" +
                "windowTitle='" + windowTitle + '\'' +
                ", startTime=" + startTime +
                ", workingPeriodSeconds=" + workingPeriodSeconds +
                '}';
    }
}
