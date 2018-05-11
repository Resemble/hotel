package com.ran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.entity
 * @Description:
 * @date 2018/5/11 下午12:11
 */
@Entity
public class DiagnosisScoreEntity {
    @Id
    private int datekey;
    @Column
    private int roomNight;
    @Column
    private int intentionUniqueVisitor;
    @Column
    private double intentionPayRate;
    @Column
    private double closeLoseRate ;
    @Column
    private double hasHouseRate;
    @Column
    private int competitionSituation;

    public DiagnosisScoreEntity(int datekey, int roomNight, int intentionUniqueVisitor,
        double intentionPayRate, double closeLoseRate, double hasHouseRate,
        int competitionSituation) {
        this.datekey = datekey;
        this.roomNight = roomNight;
        this.intentionUniqueVisitor = intentionUniqueVisitor;
        this.intentionPayRate = intentionPayRate;
        this.closeLoseRate = closeLoseRate;
        this.hasHouseRate = hasHouseRate;
        this.competitionSituation = competitionSituation;
    }

    public int getDatekey() {
        return datekey;
    }

    public void setDatekey(int datekey) {
        this.datekey = datekey;
    }

    public int getRoomNight() {
        return roomNight;
    }

    public void setRoomNight(int roomNight) {
        this.roomNight = roomNight;
    }

    public int getIntentionUniqueVisitor() {
        return intentionUniqueVisitor;
    }

    public void setIntentionUniqueVisitor(int intentionUniqueVisitor) {
        this.intentionUniqueVisitor = intentionUniqueVisitor;
    }

    public double getIntentionPayRate() {
        return intentionPayRate;
    }

    public void setIntentionPayRate(double intentionPayRate) {
        this.intentionPayRate = intentionPayRate;
    }

    public double getCloseLoseRate() {
        return closeLoseRate;
    }

    public void setCloseLoseRate(double closeLoseRate) {
        this.closeLoseRate = closeLoseRate;
    }

    public double getHasHouseRate() {
        return hasHouseRate;
    }

    public void setHasHouseRate(double hasHouseRate) {
        this.hasHouseRate = hasHouseRate;
    }

    public int getCompetitionSituation() {
        return competitionSituation;
    }

    public void setCompetitionSituation(int competitionSituation) {
        this.competitionSituation = competitionSituation;
    }

    @Override public String toString() {
        return "DiagnosisScoreEntity{" + "datekey=" + datekey + ", roomNight=" + roomNight
            + ", intentionUniqueVisitor=" + intentionUniqueVisitor + ", intentionPayRate="
            + intentionPayRate + ", closeLoseRate=" + closeLoseRate + ", hasHouseRate="
            + hasHouseRate + ", competitionSituation=" + competitionSituation + '}';
    }
}
