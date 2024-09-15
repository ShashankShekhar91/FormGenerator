package com.formgenerator.controllers;


import com.formgenerator.bussinessLogic.Utils;
import com.formgenerator.entity.FormEntityRepo;
import com.formgenerator.models.FormName;
import com.formgenerator.models.JSONMetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.formgenerator.models.FormData;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    FormEntityRepo formEntityRepo;

    @Autowired
    Utils utils;

    //PAGES
    private String CREATED = "created";
    private String LIST = "list";

    @RequestMapping(value = "/createForm", method = RequestMethod.POST)
    public String createForm(@ModelAttribute  FormData formData, Model model) {
        utils.generateJSON(formData, formEntityRepo);
        List<String> names = retrieveListofForms();
        model.addAttribute("properties", formData.getSchema() );
        model.addAttribute("options",formData.getOptions() );
        return CREATED;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listForms(Model model) {
        List<String> listofForms = this.retrieveListofForms();
        model.addAttribute("list", listofForms);
        return LIST;
    }

    @RequestMapping(value = "/renderForm", method = RequestMethod.POST)
    public String listForms(@ModelAttribute FormName formName, Model model) {
        List<FormData> fullList = formEntityRepo.findAll();
        Optional<FormData> formData = fullList.stream().filter(x -> x.getName().equals(formName.getList())).findFirst();

        if(formData.isPresent()) {
            model.addAttribute("properties",  formData.get().getSchema() );
            model.addAttribute("options",formData.get().getOptions() );

            return CREATED;
        }else {
            return LIST;
        }
    }

    public List<String> retrieveListofForms() {
        List<FormData> fullList = formEntityRepo.findAll();
        List<String> formNames = fullList.stream().map(FormData::getName).collect(Collectors.toList());
        return formNames;
    }
}
