package com.naruto.AtictiveGroup.controller;


import com.naruto.AtictiveGroup.ninja.Ninja;
import com.naruto.AtictiveGroup.ninja.NinjaRegisterDate;
import com.naruto.AtictiveGroup.ninja.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @PostMapping
    @Transactional
    public void CriaNinja (@RequestBody NinjaRegisterDate data){
        ninjaRepository.save( new Ninja(data));
    }


}
