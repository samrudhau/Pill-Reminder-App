package com.samrudh.medicinetime.alarm;

import com.samrudh.medicinetime.BasePresenter;
import com.samrudh.medicinetime.BaseView;
import com.samrudh.medicinetime.data.source.History;
import com.samrudh.medicinetime.data.source.MedicineAlarm;



public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
