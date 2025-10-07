package com.spring_boot.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

    @Autowired
    private Team team;
    public static  String PlayersInTeam(){
        return "player playing in team";
    }
}
