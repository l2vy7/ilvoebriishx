package com.appnext.core.p034ra.database;

import androidx.room.C1176a;
import androidx.room.C1185f;
import androidx.room.C1199i;
import androidx.room.C1205k;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.HashMap;
import java.util.HashSet;
import p085h1.C5372c;
import p085h1.C5376g;
import p090i1.C5436b;
import p090i1.C5437c;

/* renamed from: com.appnext.core.ra.database.RecentAppsDatabase_Impl */
public final class RecentAppsDatabase_Impl extends RecentAppsDatabase {

    /* renamed from: eX */
    private volatile C3230b f12412eX;

    public final void clearAllTables() {
        super.assertNotMainThread();
        C5436b writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.mo21890G("DELETE FROM `RecentApp`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.mo21895V("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.mo21898n0()) {
                writableDatabase.mo21890G("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public final C1185f createInvalidationTracker() {
        return new C1185f(this, new HashMap(0), new HashMap(0), "RecentApp");
    }

    /* access modifiers changed from: protected */
    public final C5437c createOpenHelper(C1176a aVar) {
        return aVar.f5418a.mo5959a(C5437c.C5439b.m24415a(aVar.f5419b).mo21905c(aVar.f5420c).mo21904b(new C1205k(aVar, new C1205k.C1206a(1) {
            public final void createAllTables(C5436b bVar) {
                bVar.mo21890G("CREATE TABLE IF NOT EXISTS `RecentApp` (`recentAppPackage` TEXT NOT NULL, `storeDate` TEXT NOT NULL, `sent` INTEGER NOT NULL, PRIMARY KEY(`recentAppPackage`, `storeDate`))");
                bVar.mo21890G("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo21890G("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e1eb051e9230fda8568d681a1d3cf00b')");
            }

            public final void dropAllTables(C5436b bVar) {
                bVar.mo21890G("DROP TABLE IF EXISTS `RecentApp`");
                if (RecentAppsDatabase_Impl.this.mCallbacks != null) {
                    int size = RecentAppsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) RecentAppsDatabase_Impl.this.mCallbacks.get(i)).mo5926b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final void onCreate(C5436b bVar) {
                if (RecentAppsDatabase_Impl.this.mCallbacks != null) {
                    int size = RecentAppsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) RecentAppsDatabase_Impl.this.mCallbacks.get(i)).mo5925a(bVar);
                    }
                }
            }

            public final void onOpen(C5436b bVar) {
                C5436b unused = RecentAppsDatabase_Impl.this.mDatabase = bVar;
                RecentAppsDatabase_Impl.this.internalInitInvalidationTracker(bVar);
                if (RecentAppsDatabase_Impl.this.mCallbacks != null) {
                    int size = RecentAppsDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) RecentAppsDatabase_Impl.this.mCallbacks.get(i)).mo5927c(bVar);
                    }
                }
            }

            public final void onPostMigrate(C5436b bVar) {
            }

            public final void onPreMigrate(C5436b bVar) {
                C5372c.m24190a(bVar);
            }

            /* access modifiers changed from: protected */
            public final C1205k.C1207b onValidateSchema(C5436b bVar) {
                HashMap hashMap = new HashMap(3);
                hashMap.put("recentAppPackage", new C5376g.C5377a("recentAppPackage", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
                hashMap.put("storeDate", new C5376g.C5377a("storeDate", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
                hashMap.put("sent", new C5376g.C5377a("sent", "INTEGER", true, 0, (String) null, 1));
                C5376g gVar = new C5376g("RecentApp", hashMap, new HashSet(0), new HashSet(0));
                C5376g a = C5376g.m24198a(bVar, "RecentApp");
                if (gVar.equals(a)) {
                    return new C1205k.C1207b(true, (String) null);
                }
                return new C1205k.C1207b(false, "RecentApp(com.appnext.core.ra.database.RecentApp).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
        }, "e1eb051e9230fda8568d681a1d3cf00b", "52c6c70fcfd3ff556a2b04d53ac85ff8")).mo21903a());
    }

    public final C3230b recentAppDao() {
        C3230b bVar;
        if (this.f12412eX != null) {
            return this.f12412eX;
        }
        synchronized (this) {
            if (this.f12412eX == null) {
                this.f12412eX = new C3231c(this);
            }
            bVar = this.f12412eX;
        }
        return bVar;
    }
}
