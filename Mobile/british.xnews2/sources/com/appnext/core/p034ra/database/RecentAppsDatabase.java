package com.appnext.core.p034ra.database;

import android.content.Context;
import androidx.room.C1198h;
import androidx.room.C1199i;

/* renamed from: com.appnext.core.ra.database.RecentAppsDatabase */
public abstract class RecentAppsDatabase extends C1199i {
    private static final String DB_NAME = "RecentAppsDatabase_Impl.db";
    private static volatile RecentAppsDatabase instance;

    protected RecentAppsDatabase() {
    }

    private static RecentAppsDatabase create(Context context) {
        return C1198h.m6591a(context, RecentAppsDatabase.class, DB_NAME).mo5921d();
    }

    public static synchronized RecentAppsDatabase getInstance(Context context) {
        RecentAppsDatabase recentAppsDatabase;
        synchronized (RecentAppsDatabase.class) {
            if (instance == null) {
                instance = create(context);
            }
            recentAppsDatabase = instance;
        }
        return recentAppsDatabase;
    }

    public abstract C3230b recentAppDao();
}
