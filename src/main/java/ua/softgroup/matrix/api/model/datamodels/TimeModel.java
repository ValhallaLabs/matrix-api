package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class TimeModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private int totalTime;

    private int todayTime;

    private LocalTime todayStartTime;

    private double idlePercent;

    public TimeModel(int totalTime, int todayTime, double idlePercent) {
        this.totalTime = totalTime;
        this.todayTime = todayTime;
        this.idlePercent = idlePercent;
    }

    public TimeModel(int totalTime, int todayTime, LocalTime todayStartTime, double idlePercent) {
        this.totalTime = totalTime;
        this.todayTime = todayTime;
        this.todayStartTime = todayStartTime;
        this.idlePercent = idlePercent;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTodayTime() {
        return todayTime;
    }

    public void setTodayTime(int todayTime) {
        this.todayTime = todayTime;
    }

    public LocalTime getTodayStartTime() {
        return todayStartTime;
    }

    public void setTodayStartTime(LocalTime todayStartTime) {
        this.todayStartTime = todayStartTime;
    }

    public double getIdlePercent() {
        return idlePercent;
    }

    public void setIdlePercent(double idlePercent) {
        this.idlePercent = idlePercent;
    }

    @Override
    public String toString() {
        return "TimeModel{" +
                "totalTime=" + totalTime +
                ", todayTime=" + todayTime +
                ", todayStartTime=" + todayStartTime +
                ", idlePercent=" + idlePercent +
                '}';
    }
}
