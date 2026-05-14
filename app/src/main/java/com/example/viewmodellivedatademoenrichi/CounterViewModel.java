package com.example.viewmodellivedatademoenrichi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

    private final MutableLiveData<Integer> hcCountLiveData = new MutableLiveData<>();
    private final MutableLiveData<String> hcStatusLiveData = new MutableLiveData<>();

    public CounterViewModel() {
        hcCountLiveData.setValue(0);
        hcStatusLiveData.setValue("Compteur initialisé");
    }

    public void hcIncrement() {
        Integer current = hcCountLiveData.getValue();
        if (current != null) {
            hcCountLiveData.setValue(current + 1);
            hcStatusLiveData.setValue("Incrémenté → " + (current + 1));
        }
    }

    public void hcDecrement() {
        Integer current = hcCountLiveData.getValue();
        if (current != null) {
            hcCountLiveData.setValue(current - 1);
            hcStatusLiveData.setValue("Décrémenté → " + (current - 1));
        }
    }

    public void hcReset() {
        hcCountLiveData.setValue(0);
        hcStatusLiveData.setValue("Compteur réinitialisé");
    }

    public void hcIncrementFromBackground() {
        new Thread(() -> {
            Integer current = hcCountLiveData.getValue();
            if (current != null) {
                hcCountLiveData.postValue(current + 1);
                hcStatusLiveData.postValue("Incrémenté depuis background → " + (current + 1));
            }
        }).start();
    }

    public LiveData<Integer> getHcCount() {
        return hcCountLiveData;
    }

    public LiveData<String> getHcStatus() {
        return hcStatusLiveData;
    }
}