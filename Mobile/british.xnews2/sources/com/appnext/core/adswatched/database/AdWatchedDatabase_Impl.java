package com.appnext.core.adswatched.database;

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

public final class AdWatchedDatabase_Impl extends AdWatchedDatabase {

    /* renamed from: ez */
    private volatile C3171a f12279ez;

    public final C3171a adWatchedDao() {
        C3171a aVar;
        if (this.f12279ez != null) {
            return this.f12279ez;
        }
        synchronized (this) {
            if (this.f12279ez == null) {
                this.f12279ez = new C3172b(this);
            }
            aVar = this.f12279ez;
        }
        return aVar;
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        C5436b writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.mo21890G("DELETE FROM `AdWatched`");
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
        return new C1185f(this, new HashMap(0), new HashMap(0), "AdWatched");
    }

    /* access modifiers changed from: protected */
    public final C5437c createOpenHelper(C1176a aVar) {
        return aVar.f5418a.mo5959a(C5437c.C5439b.m24415a(aVar.f5419b).mo21905c(aVar.f5420c).mo21904b(new C1205k(aVar, new C1205k.C1206a(1) {
            public final void createAllTables(C5436b bVar) {
                bVar.mo21890G("CREATE TABLE IF NOT EXISTS `AdWatched` (`bannerId` TEXT NOT NULL, `auid` TEXT NOT NULL, PRIMARY KEY(`bannerId`, `auid`))");
                bVar.mo21890G("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.mo21890G("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '78dfff40d553309e5115594472f14b49')");
            }

            public final void dropAllTables(C5436b bVar) {
                bVar.mo21890G("DROP TABLE IF EXISTS `AdWatched`");
                if (AdWatchedDatabase_Impl.this.mCallbacks != null) {
                    int size = AdWatchedDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) AdWatchedDatabase_Impl.this.mCallbacks.get(i)).mo5926b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public final void onCreate(C5436b bVar) {
                if (AdWatchedDatabase_Impl.this.mCallbacks != null) {
                    int size = AdWatchedDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) AdWatchedDatabase_Impl.this.mCallbacks.get(i)).mo5925a(bVar);
                    }
                }
            }

            public final void onOpen(C5436b bVar) {
                C5436b unused = AdWatchedDatabase_Impl.this.mDatabase = bVar;
                AdWatchedDatabase_Impl.this.internalInitInvalidationTracker(bVar);
                if (AdWatchedDatabase_Impl.this.mCallbacks != null) {
                    int size = AdWatchedDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C1199i.C1201b) AdWatchedDatabase_Impl.this.mCallbacks.get(i)).mo5927c(bVar);
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
                HashMap hashMap = new HashMap(2);
                hashMap.put("bannerId", new C5376g.C5377a("bannerId", AdPreferences.TYPE_TEXT, true, 1, (String) null, 1));
                hashMap.put("auid", new C5376g.C5377a("auid", AdPreferences.TYPE_TEXT, true, 2, (String) null, 1));
                C5376g gVar = new C5376g("AdWatched", hashMap, new HashSet(0), new HashSet(0));
                C5376g a = C5376g.m24198a(bVar, "AdWatched");
                if (gVar.equals(a)) {
                    return new C1205k.C1207b(true, (String) null);
                }
                return new C1205k.C1207b(false, "AdWatched(com.appnext.core.adswatched.database.AdWatched).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
        }, "78dfff40d553309e5115594472f14b49", "e2de3c54f36f9aabd3896d5f33522662")).mo21903a());
    }
}
