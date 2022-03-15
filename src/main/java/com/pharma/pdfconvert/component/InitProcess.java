package com.pharma.pdfconvert.component;

import com.pharma.pdfconvert.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class InitProcess {

    @Autowired()
    private  ConvertService convertService;

    @PostConstruct
    public void init()  {
        this.convertService.convertPdf();
    }


}
