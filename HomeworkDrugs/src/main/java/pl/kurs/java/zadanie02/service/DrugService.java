package pl.kurs.java.zadanie02.service;

import pl.kurs.java.zadanie02.interfaces.DrugControler;
import pl.kurs.java.zadanie02.interfaces.IDealController;
import pl.kurs.java.zadanie02.interfaces.IDrugQuality;
import pl.kurs.java.zadanie02.model.Drug;
import pl.kurs.java.zadanie02.model.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class DrugService {
    private DrugControler qualityPerfect;
    private IDealController dealController;
    private IDrugQuality dragQuality;

    private Drug drug;

    public DrugService(DrugControler qualityPerfect, IDealController dealController, IDrugQuality dragQuality) {
        this.qualityPerfect = qualityPerfect;
        this.dealController = dealController;
        this.dragQuality = dragQuality;
    }

    public void checkQuality() {
        double quality = dragQuality.quality();

        if (quality > 70) {
            qualityPerfect.checkDrug();
            dealController.sell();
        } else {
            dealController.dontSell();
            throw new RuntimeException("źle");
        }
    }

    public DrugControler getQualityPerfect() {
        return qualityPerfect;
    }

    public void setQualityPerfect(DrugControler qualityPerfect) {
        this.qualityPerfect = qualityPerfect;
    }

    public IDealController getDealController() {
        return dealController;
    }

    public void setDealController(IDealController dealController) {
        this.dealController = dealController;
    }

    public IDrugQuality getDragQuality() {
        return dragQuality;
    }

    public void setDragQuality(IDrugQuality dragQuality) {
        this.dragQuality = dragQuality;
    }
}