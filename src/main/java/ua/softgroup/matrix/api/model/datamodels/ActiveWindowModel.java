package ua.softgroup.matrix.api.model.datamodels;

import java.time.LocalDateTime;

/**
 * Created by vadimboitsov on 3/28/17.
 */
public class ActiveWindowModel {
    private static final long serialVersionUID = 1L;

    private String windowTitle;

    private LocalDateTime startTime;

    private int workingPeriodSeconds;

    public ActiveWindowModel(String windowTitle, LocalDateTime startTime, int workingPeriodSeconds) {
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
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
