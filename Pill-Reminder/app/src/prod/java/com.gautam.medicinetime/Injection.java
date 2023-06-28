package com.samrudh.medicinetime;

import android.content.Context;
import androidx.annotation.NonNull;


import com.samrudh.medicinetime.data.source.MedicineRepository;
import com.samrudh.medicinetime.data.source.local.MedicinesLocalDataSource;


/**
 * Created by wa on 13/05/17.
 */

public class Injection {

    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}