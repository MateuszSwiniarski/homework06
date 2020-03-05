package com.rodzyn.homework06.controller;

import com.rodzyn.homework06.service.MailService;
import com.rodzyn.homework06.service.MovieService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

@Aspect
@RestController
public class MailApi {

    private MailService mailService;

    @Autowired
    public MailApi(MailService mailService) {
        this.mailService = mailService;
    }

    @Autowired
    private MovieService movieService;

    public String getText(){
        int size = movieService.getMovieList().size()-1;
        String name = movieService.getMovieList().get(size).getName();
        int year = movieService.getMovieList().get(size).getYear();
        String productionType = movieService.getMovieList().get(size).getProductionType();
        String text = "To list added new film. " + '\n'
                + " Title: " + name + '\n'
                + "Year production: " + year + '\n'
                + "Type of move: " + productionType + '\n';
        return text;
    }

    @Before("@annotation(SendMail)")
    @GetMapping("/sendmail")
    public String sendMail() throws MessagingException {
        mailService.sendMail("eirdo@interia.pl",
                "test",
                getText(), true);
        return "wysłano";
    }
}
