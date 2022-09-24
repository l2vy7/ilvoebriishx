package com.appnext.core.adswatched.database;

import android.content.Context;
import androidx.room.C1198h;
import androidx.room.C1199i;

public abstract class AdWatchedDatabase extends C1199i {
    private static final String DB_NAME = "AdWatchDatabase_Impl.db";
    private static volatile AdWatchedDatabase instance;

    protected AdWatchedDatabase() {
    }

    private static AdWatchedDatabase create(Context context) {
        return C1198h.m6591a(context, AdWatchedDatabase.class, DB_NAME).mo5921d();
    }

    public static synchronized AdWatchedDatabase getInstance(Context context) {
        AdWatchedDatabase adWatchedDatabase;
        synchronized (AdWatchedDatabase.class) {
            if (instance == null) {
                instance = create(context);
            }
            adWatchedDatabase = instance;
        }
        return adWatchedDatabase;
    }

    public abstract C3171a adWatchedDao();
}
