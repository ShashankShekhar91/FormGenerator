package com.formgenerator.models;



import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Lazy;


@Entity
@Table(name="Forms")
public class FormData {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    String id;
    @Column(name = "formname")
    public String name;
    @Column(name = "text")
    public String text;
    @Column(name = "textarea")
    public String textarea;
    @Column(name = "checkbox")
    public String checkbox;
    @Column(name = "radiobutton")
    public String radiobutton;
    @Column(name = "dropdown")
    public String dropdown;
    @Column(name = "datepicker")
    public String datepicker;
    @Column(name = "schema", length = 10000)
    public String schema;
    @Column(name = "options", length = 10000)
    public String options;
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    public String getRadiobutton() {
        return radiobutton;
    }

    public void setRadiobutton(String radiobutton) {
        this.radiobutton = radiobutton;
    }

    public String getDropdown() {
        return dropdown;
    }

    public void setDropdown(String dropdown) {
        this.dropdown = dropdown;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public void setDatepicker(String datepicker) {
        this.datepicker = datepicker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public FormData() {
    }

    @Override
    public String toString() {
        return "FormData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", textarea='" + textarea + '\'' +
                ", checkbox='" + checkbox + '\'' +
                ", radiobutton='" + radiobutton + '\'' +
                ", dropdown='" + dropdown + '\'' +
                ", datepicker='" + datepicker + '\'' +
                ", schema='" + schema + '\'' +
                ", options='" + options + '\'' +
                '}';
    }
}
