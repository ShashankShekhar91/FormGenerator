package com.formgenerator.bussinessLogic;

import com.formgenerator.entity.FormEntityRepo;
import com.formgenerator.models.FormData;
import com.formgenerator.models.JSONMetaData;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer implements Utils {

    public void generateJSON(FormData formData, FormEntityRepo formEntityRepo) {

        JSONMetaData jsonMetaData = new JSONMetaData();
        String schema = this.getSchema(formData);
        schema = schema.substring(0, schema.length() - 1);
        //schema = jsonMetaData.properties + schema + "}";
        schema = "{" + schema + "}";

        String options = this.getOptions(formData);
        options = options.substring(0, options.length() - 1);
        //options = jsonMetaData.options + options + "'buttons':{
        //                                'submit':{}
        //                            }}";
        options = "{"+ options + "}";

        formData.setOptions(options);
        formData.setSchema(schema);

        FormData forInserted = formEntityRepo.save(formData);
    }

    public String getSchema(FormData formData) {
        int textCount = Integer.valueOf(formData.getText());
        int textareacount = Integer.valueOf(formData.getTextarea());
        int checkboxCount = Integer.valueOf(formData.getCheckbox());
        int dateCount = Integer.valueOf(formData.getDatepicker());
        int radioCount = Integer.valueOf(formData.getRadiobutton());
        int dropDownList = Integer.valueOf(formData.getDropdown());
        String res = "";
        JSONMetaData jsonMetaData = new JSONMetaData();
        int i=0;
        while(i<textCount) {
            res += "'text"+i +"':" + jsonMetaData.getText() + ",";
            i++;
        }

        i=0;
        while(i<textareacount) {
            res += "'textarea"+i +"':" +jsonMetaData.getTextarea() + ",";
            i++;
        }

        i=0;
        while(i<checkboxCount) {
            res += "'checkbox"+i +"':" + jsonMetaData.getCheckbox() + ",";
            i++;
        }

        i=0;
        while(i<dateCount) {
            res += "'date"+i +"':"+jsonMetaData.getDatepicker() + ",";
            i++;
        }

        i=0;
        while(i<radioCount) {
            res += "'radio"+i +"':"+jsonMetaData.getRadiobutton() + ",";
            i++;
        }

        i=0;
        while(i<dropDownList) {
            res += "'dropdown"+i +"':"+jsonMetaData.getDropdown() + ",";
            i++;
        }
        return res;
    }

    public String getOptions(FormData formData) {
        int textareacount = Integer.valueOf(formData.getTextarea());
        int checkboxCount = Integer.valueOf(formData.getCheckbox());
        int dateCount = Integer.valueOf(formData.getDatepicker());
        int radioCount = Integer.valueOf(formData.getRadiobutton());
        int dropDownList = Integer.valueOf(formData.getDropdown());
        String res = "";
        JSONMetaData jsonMetaData = new JSONMetaData();
        int i=0;
        while(i<textareacount) {
            res += "'textarea"+i +"':" + jsonMetaData.getTextAreaOption() + ",";
            i++;
        }

        i=0;
        while(i<checkboxCount) {
            res += "'checkbox"+i +"':" +  jsonMetaData.getCheckboxOption() + ",";
            i++;
        }

        i=0;
        while(i<dateCount) {
            res += "'date"+i +"':"+ jsonMetaData.getDatepickerOption() + ",";
            i++;
        }

        i=0;
        while(i<radioCount) {
            res += "'radio"+i +"':"+ jsonMetaData.getRadiobuttonOption() + ",";
            i++;
        }

        i=0;
        while(i<dropDownList) {
            res += "'dropdown"+i +"':"+ jsonMetaData.getDropdownOption() + ",";
            i++;
        }
        return res;
    }
}
