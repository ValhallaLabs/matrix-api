package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class CheckPointModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private long order; // just an order of checkpoint

    private byte[] screenshot;

    private String keyboardLogs;

    private double mouseFootage;

    private Map<String, Integer> windowsTimeMap;

    private int idleTime;

    public CheckPointModel(long order, byte[] screenshot, String keyboardLogs, double mouseFootage, Map<String, Integer> windowsTimeMap, int idleTime) {
        this.order = order;
        this.screenshot = screenshot;
        this.keyboardLogs = keyboardLogs;
        this.mouseFootage = mouseFootage;
        this.windowsTimeMap = windowsTimeMap;
        this.idleTime = idleTime;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public byte[] getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(byte[] screenshot) {
        this.screenshot = screenshot;
    }

    public String getKeyboardLogs() {
        return keyboardLogs;
    }

    public void setKeyboardLogs(String keyboardLogs) {
        this.keyboardLogs = keyboardLogs;
    }

    public double getMouseFootage() {
        return mouseFootage;
    }

    public void setMouseFootage(double mouseFootage) {
        this.mouseFootage = mouseFootage;
    }

    public Map<String, Integer> getWindowsTimeMap() {
        return windowsTimeMap;
    }

    public void setWindowsTimeMap(Map<String, Integer> windowsTimeMap) {
        this.windowsTimeMap = windowsTimeMap;
    }

    public int getIdleTime() {
        return idleTime;
    }

    public void setIdleTime(int idleTime) {
        this.idleTime = idleTime;
    }

    @Override
    public String toString() {
        return "CheckPointModel{" +
                "order=" + order +
                ", keyboardLogs='" + keyboardLogs + '\'' +
                ", mouseFootage=" + mouseFootage +
                ", windowsTimeMap=" + windowsTimeMap +
                ", idleTime=" + idleTime +
                '}';
    }
}
