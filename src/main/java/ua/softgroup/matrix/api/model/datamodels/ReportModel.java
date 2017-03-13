package ua.softgroup.matrix.api.model.datamodels;


import java.io.Serializable;
import java.time.LocalDate;

public class ReportModel implements Serializable, DataModel {
    private static final long serialVersionUID = 1L;

    private long id;

    private String text;

    private boolean checked;

    private LocalDate date;

    private int workTime;

    private int rate;

    private double coefficient;

    private String currency;

    private byte[] attachment;

    public ReportModel() {
    }

    public ReportModel(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public ReportModel(long id, String text, boolean checked, LocalDate date, int workTime) {
        this.id = id;
        this.text = text;
        this.checked = checked;
        this.date = date;
        this.workTime = workTime;
    }

    public ReportModel(String text, LocalDate now, byte[] attachment) {
        this.text = text;
        this.date = now;
        this.attachment = attachment;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
                ", checked=" + checked +
                ", date=" + date +
                ", workTime=" + workTime +
                ", rate=" + rate +
                ", coefficient=" + coefficient +
                ", currency='" + currency + '\'' +
                '}';
    }
}