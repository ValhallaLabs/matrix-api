package ua.softgroup.matrix.api.model.datamodels;

import java.io.Serializable;

/**
 * @author Andrii Bei <sg.andriy2@gmail.com>
 */
public class InstructionsModel implements Serializable {
    private String name;
    private String content;
    public InstructionsModel(String name, String content) {
        this.name = name;
        this.content = content;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return this.getName();
    }
}
