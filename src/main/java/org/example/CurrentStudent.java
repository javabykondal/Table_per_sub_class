package org.example;

import javax.persistence.*;

@Entity
@Table(name = "cuurentStudent")
@PrimaryKeyJoinColumn(name = "mysid")

public class CurrentStudent extends Student{

    @Column(name = "FeeBal")
    private int feebal;
    @Column(name = "Trainie")
    private String Trainer;
    @Column(name = "Timings")
    private  String Time;

    public CurrentStudent(int feebal, String trainer, String time) {
        this.feebal = feebal;
        Trainer = trainer;
        Time = time;
    }

    public CurrentStudent(String roll, String name, int feebal, String trainer, String time) {
        super(roll, name);
        this.feebal = feebal;
        Trainer = trainer;
        Time = time;
    }

    public CurrentStudent(int id, String roll, String name, int feebal, String trainer, String time) {
        super(id, roll, name);
        this.feebal = feebal;
        Trainer = trainer;
        Time = time;
    }

    public int getFeebal() {
        return feebal;
    }

    public void setFeebal(int feebal) {
        this.feebal = feebal;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "CurrentStudent{" +
                "feebal=" + feebal +
                ", Trainer='" + Trainer + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}
