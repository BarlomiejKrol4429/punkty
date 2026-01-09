package com.example.punkty;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel  extends ViewModel {
    private MutableLiveData<Integer> punkty;

    public MutableLiveData<Integer> getPunkty() {
        if(punkty == null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        return punkty;
    }

    public void setPunkty(MutableLiveData<Integer> punkty) {
        if(punkty == null){
            punkty = new MutableLiveData<>();
            punkty.setValue(0);
        }
        this.punkty = punkty;
    }
    public void addPunkty(int p){
        int currentPunkty = getPunkty().getValue();
        punkty.setValue(currentPunkty+p);
    }
}
