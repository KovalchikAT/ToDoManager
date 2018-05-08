package com.kovalchyk_at.todomanager.Model;

/**
 * Created by Kovalchyk_AT on 22.03.2018.
 */

public class Position {
    private Integer positionId;
    private String positionName;
    private Integer positionLevel;
    private Integer positionCount;

    public Position() {
    }

    public Position(Integer positionId, String positionName, Integer positionLevel, Integer positionCount) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.positionLevel = positionLevel;
        this.positionCount = positionCount;
    }
}
