package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;
import java.util.List;

/**
 * @author Vadim Boitsov <sg.vadimbojcov@gmail.com>
 */
public class CheckPointModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private long order; // just an order of checkpoint

    private String screenshotWindowTitle;

    private byte[] screenshot;

    private String keyboardLogs;

    private double mouseFootage;

    private List<ActiveWindowModel> activeWindows;

    private int idleTime;

    public CheckPointModel(long order, String screenshotWindowTitle, byte[] screenshot, String keyboardLogs,
                           double mouseFootage, List<ActiveWindowModel> activeWindows, int idleTime) {
        this.order = order;
        this.screenshotWindowTitle = screenshotWindowTitle;
        this.screenshot = screenshot;
        this.keyboardLogs = keyboardLogs;
        this.mouseFootage = mouseFootage;
        this.activeWindows = activeWindows;
        this.idleTime = idleTime;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public String getScreenshotWindowTitle() {
        return screenshotWindowTitle;
    }

    public void setScreenshotWindowTitle(String screenshotWindowTitle) {
        this.screenshotWindowTitle = screenshotWindowTitle;
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

    public List<ActiveWindowModel> getActiveWindows() {
        return activeWindows;
    }

    public void setActiveWindows(List<ActiveWindowModel> activeWindows) {
        this.activeWindows = activeWindows;
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
                ", screenshotWindowTitle='" + screenshotWindowTitle + '\'' +
                ", screenshot=" + (screenshot !=  null) +
                ", keyboardLogs='" + keyboardLogs + '\'' +
                ", mouseFootage=" + mouseFootage +
                ", activeWindows=" + activeWindows +
                ", idleTime=" + idleTime +
                '}';
    }
}
