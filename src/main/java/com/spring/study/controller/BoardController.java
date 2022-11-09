package com.spring.study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.study.service.BoardService;
import com.spring.study.dto.Board;

import javax.inject.Inject;
import java.util.List;

@Controller
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Inject
    BoardService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String boardList(Model model) throws Exception {
        logger.info("list");

        model.addAttribute("list", service.list());

        return "list";
    }

    @RequestMapping(value = "/home")
    public String homepage(){
        return "home";
    }
}
