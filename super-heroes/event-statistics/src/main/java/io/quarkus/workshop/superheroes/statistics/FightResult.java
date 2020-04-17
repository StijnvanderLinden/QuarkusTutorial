package io.quarkus.workshop.superheroes.statistics;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.time.Instant;

@RegisterForReflection
public class FightResult {

    private long id;
    private Instant fightDate;
    private String winnerName;
    private int winnerLevel;
    private String winnerPicture;
    private String loserName;
    private int loserLevel;
    private String loserPicture;
    private String winnerTeam;
    private String loserTeam;

    // Getters and Setters
}
