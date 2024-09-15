package com.formgenerator.bussinessLogic;

import com.formgenerator.entity.FormEntityRepo;
import com.formgenerator.models.FormData;

public interface Utils {
    public void generateJSON(FormData formData, FormEntityRepo formEntityRepo) ;
    public String getSchema(FormData formData) ;

    public String getOptions(FormData formData) ;
}
