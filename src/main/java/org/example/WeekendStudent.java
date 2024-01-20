package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "weekendTable")
@PrimaryKeyJoinColumn(name = "mys")
public class WeekendStudent extends CurrentStudent

{
    @Column(name = "wId")
    private int weekId;
    @Column(name = "WeeksName")
    private String WeekTime;


    public int getWeekId() {
        return weekId;
    }

    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }

    public WeekendStudent(int feebal, String trainer, String time, int weekId, String weekTime) {
        super(feebal, trainer, time);
        this.weekId = weekId;
        WeekTime = weekTime;
    }

    public WeekendStudent(String roll, String name, int feebal, String trainer, String time, int weekId, String weekTime) {
        super(roll, name, feebal, trainer, time);
        this.weekId = weekId;
        WeekTime = weekTime;
    }

    public WeekendStudent(int id, String roll, String name, int feebal, String trainer, String time, int weekId, String weekTime) {
        super(id, roll, name, feebal, trainer, time);
        this.weekId = weekId;
        WeekTime = weekTime;
    }

    public String getWeekTime() {
        return WeekTime;
    }

    public void setWeekTime(String weekTime) {
        WeekTime = weekTime;
    }

    @Override
    public String toString() {
        return "WeekendStudent{" +
                "weekId=" + weekId +
                ", WeekTime='" + WeekTime + '\'' +
                '}';
    }
}
