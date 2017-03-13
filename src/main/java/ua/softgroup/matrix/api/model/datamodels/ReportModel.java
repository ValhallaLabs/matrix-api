package ua.softgroup.matrix.api.model.datamodels;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class ReportModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private long id;

    private String text;

    private long projectId; //TODO for removing

    private boolean checked;

    private LocalDate date; //TODO think about this

    private int workTime;

    private byte[] attachment;

    public ReportModel() {
    }

    public ReportModel(long id, String text, long projectId, boolean checked, LocalDate date, int workTime) {
        this.id = id;
        this.text = text;
        this.projectId = projectId;
        this.checked = checked;
        this.date = date;
        this.workTime = workTime;
    }

    public ReportModel(String text, LocalDate now, byte[] attachment) {
        this.text = text;
        this.date = now;
        this.attachment = attachment;
    }

    public ReportModel(Long currentReportId, String text, Long currentProjectId) {
        this.id = currentReportId;
        this.text = text;
        this.projectId = currentProjectId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "ReportModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", projectId=" + projectId +
                ", checked=" + checked +
                ", date=" + date +
                ", workTime=" + workTime +
                ", attachment=" + Arrays.toString(attachment) +
                '}';
    }
}