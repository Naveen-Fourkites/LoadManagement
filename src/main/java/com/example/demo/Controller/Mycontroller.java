package com.example.demo.Controller;


import com.example.demo.Repository.LoadRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

    private final LoadRepository loadRepository;

    public Mycontroller(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }




    @RequestMapping("/LoadsData")
    public String getLoaddata(Model model){

        model.addAttribute("Loaddata",loadRepository.findAll());


        return "LoadsData/list";

    }
}
