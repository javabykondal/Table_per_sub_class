package org.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "weekTable")
@PrimaryKeyJoinColumn(name = "myweekid")
public class WeklyStudent  extends CurrentStudent{
    @Column(name = "WeekNAmes")
    private String weekName;
    @Column(name = "weekItems")
    private  String WeekTime;


    public WeklyStudent(int feebal, String trainer, String time, String weekName, String weekTime) {
        super(feebal, trainer, time);
        this.weekName = weekName;
        WeekTime = weekTime;
    }

    public WeklyStudent(String roll, String name, int feebal, String trainer, String time, String weekName, String weekTime) {
        super(roll, name, feebal, trainer, time);
        this.weekName = weekName;
        WeekTime = weekTime;
    }

    public WeklyStudent(int id, String roll, String name, int feebal, String trainer, String time, String weekName, String weekTime) {
        super(id, roll, name, feebal, trainer, time);
        this.weekName = weekName;
        WeekTime = weekTime;
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    public String getWeekTime() {
        return WeekTime;
    }

    public void setWeekTime(String weekTime) {
        WeekTime = weekTime;
    }

    @Override
    public String toString() {
        return "WeklyStudent{" +
                "weekName='" + weekName + '\'' +
                ", WeekTime='" + WeekTime + '\'' +
                '}';
    }
}
