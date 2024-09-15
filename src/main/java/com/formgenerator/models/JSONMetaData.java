package com.formgenerator.models;

public class JSONMetaData {

    public String text = "{ 'type':'string', 'title':'Text'}";
    public String textarea = "{'type':'string', 'title':'Text Area'}";
    public String checkbox = "{ 'type':'string', 'title':'CheckBox'}";
    public String radiobutton = "{'type':'string', 'title':'Radio Button'}";
    public String dropdown = "{ 'type':'string', 'title':'Drop Down List'}";
    public String datepicker = "{ 'type':'datetime', 'title':'Date Picker','format': 'datetime'}";

    public String textAreaOption = "{ 'type':'textarea'}";
    public String checkboxOption = "{ 'type':'checkbox'}";
    public String radiobuttonOption = "{ 'type':'radio'}";
    public String datepickerOption = "{ 'type':'datetime'}";


    public String properties = " \"properties\": {";
    public String options = " \"options\": { \"fields\": {";

    public String getDropdownOption() {
        return dropdownOption;
    }

    public String dropdownOption = "{ 'type':'select'}";

    public String getText() {
        return text;
    }

    public String getTextarea() {
        return textarea;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public String getRadiobutton() {
        return radiobutton;
    }

    public String getDropdown() {
        return dropdown;
    }

    public String getDatepicker() {
        return datepicker;
    }

    public String getTextAreaOption() {
        return textAreaOption;
    }

    public String getCheckboxOption() {
        return checkboxOption;
    }

    public String getRadiobuttonOption() {
        return radiobuttonOption;
    }

    public String getDatepickerOption() {
        return datepickerOption;
    }

}
