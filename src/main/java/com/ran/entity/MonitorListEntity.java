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
 * @date 2018/5/11 下午6:05
 */
@Entity
public class MonitorListEntity {

    @Id
    private int datekey;
    @Column
    private int roomNight;
    @Column
    private int crossIncome;
    @Column
    private int highStarRoomNight;
    @Column
    private int highStarCrossIncome;
    @Column
    private int intentionUniqueVisitor;
    @Column
    private double intentionPayRate;
    @Column
    private int payUserCnt;
    @Column
    private double closeLoseRate;
    @Column
    private double hasHouseRate;
    @Column
    private double originalLoseRate;
    @Column
    private double factLoseRate;
    @Column
    private int competitionSituation;

    public MonitorListEntity(int datekey, int roomNight, int crossIncome, int highStarRoomNight,
        int highStarCrossIncome, int intentionUniqueVisitor, double intentionPayRate,
        int payUserCnt, double closeLoseRate, double hasHouseRate, double originalLoseRate,
        double factLoseRate, int competitionSituation) {
        this.datekey = datekey;
        this.roomNight = roomNight;
        this.crossIncome = crossIncome;
        this.highStarRoomNight = highStarRoomNight;
        this.highStarCrossIncome = highStarCrossIncome;
        this.intentionUniqueVisitor = intentionUniqueVisitor;
        this.intentionPayRate = intentionPayRate;
        this.payUserCnt = payUserCnt;
        this.closeLoseRate = closeLoseRate;
        this.hasHouseRate = hasHouseRate;
        this.originalLoseRate = originalLoseRate;
        this.factLoseRate = factLoseRate;
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

    public int getCrossIncome() {
        return crossIncome;
    }

    public void setCrossIncome(int crossIncome) {
        this.crossIncome = crossIncome;
    }

    public int getHighStarRoomNight() {
        return highStarRoomNight;
    }

    public void setHighStarRoomNight(int highStarRoomNight) {
        this.highStarRoomNight = highStarRoomNight;
    }

    public int getHighStarCrossIncome() {
        return highStarCrossIncome;
    }

    public void setHighStarCrossIncome(int highStarCrossIncome) {
        this.highStarCrossIncome = highStarCrossIncome;
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

    public int getPayUserCnt() {
        return payUserCnt;
    }

    public void setPayUserCnt(int payUserCnt) {
        this.payUserCnt = payUserCnt;
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

    public double getOriginalLoseRate() {
        return originalLoseRate;
    }

    public void setOriginalLoseRate(double originalLoseRate) {
        this.originalLoseRate = originalLoseRate;
    }

    public double getFactLoseRate() {
        return factLoseRate;
    }

    public void setFactLoseRate(double factLoseRate) {
        this.factLoseRate = factLoseRate;
    }

    public int getCompetitionSituation() {
        return competitionSituation;
    }

    public void setCompetitionSituation(int competitionSituation) {
        this.competitionSituation = competitionSituation;
    }

    @Override public String toString() {
        return "MonitorListEntity{" + "datekey=" + datekey + ", roomNight=" + roomNight
            + ", crossIncome=" + crossIncome + ", highStarRoomNight=" + highStarRoomNight
            + ", highStarCrossIncome=" + highStarCrossIncome + ", intentionUniqueVisitor="
            + intentionUniqueVisitor + ", intentionPayRate=" + intentionPayRate + ", payUserCnt="
            + payUserCnt + ", closeLoseRate=" + closeLoseRate + ", hasHouseRate=" + hasHouseRate
            + ", originalLoseRate=" + originalLoseRate + ", factLoseRate=" + factLoseRate
            + ", competitionSituation=" + competitionSituation + '}';
    }
}
