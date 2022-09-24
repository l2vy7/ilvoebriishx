package androidx.room;

import android.database.Cursor;
import java.util.List;
import p081g1.C5267a;
import p091i1.C5435a;
import p091i1.C5436b;
import p091i1.C5437c;

/* renamed from: androidx.room.k */
/* compiled from: RoomOpenHelper */
public class C1205k extends C5437c.C5438a {

    /* renamed from: b */
    private C1176a f5504b;

    /* renamed from: c */
    private final C1206a f5505c;

    /* renamed from: d */
    private final String f5506d;

    /* renamed from: e */
    private final String f5507e;

    /* renamed from: androidx.room.k$a */
    /* compiled from: RoomOpenHelper */
    public static abstract class C1206a {
        public final int version;

        public C1206a(int i) {
            this.version = i;
        }

        /* access modifiers changed from: protected */
        public abstract void createAllTables(C5436b bVar);

        /* access modifiers changed from: protected */
        public abstract void dropAllTables(C5436b bVar);

        /* access modifiers changed from: protected */
        public abstract void onCreate(C5436b bVar);

        /* access modifiers changed from: protected */
        public abstract void onOpen(C5436b bVar);

        /* access modifiers changed from: protected */
        public void onPostMigrate(C5436b bVar) {
        }

        /* access modifiers changed from: protected */
        public void onPreMigrate(C5436b bVar) {
        }

        /* access modifiers changed from: protected */
        public C1207b onValidateSchema(C5436b bVar) {
            validateMigration(bVar);
            return new C1207b(true, (String) null);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public void validateMigration(C5436b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* renamed from: androidx.room.k$b */
    /* compiled from: RoomOpenHelper */
    public static class C1207b {

        /* renamed from: a */
        public final boolean f5508a;

        /* renamed from: b */
        public final String f5509b;

        public C1207b(boolean z, String str) {
            this.f5508a = z;
            this.f5509b = str;
        }
    }

    public C1205k(C1176a aVar, C1206a aVar2, String str, String str2) {
        super(aVar2.version);
        this.f5504b = aVar;
        this.f5505c = aVar2;
        this.f5506d = str;
        this.f5507e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    private void m6611h(C5436b bVar) {
        if (m6614k(bVar)) {
            String str = null;
            Cursor c0 = bVar.mo21897c0(new C5435a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (c0.moveToFirst()) {
                    str = c0.getString(0);
                }
                c0.close();
                if (!this.f5506d.equals(str) && !this.f5507e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                c0.close();
                throw th;
            }
        } else {
            C1207b onValidateSchema = this.f5505c.onValidateSchema(bVar);
            if (onValidateSchema.f5508a) {
                this.f5505c.onPostMigrate(bVar);
                m6615l(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5509b);
        }
    }

    /* renamed from: i */
    private void m6612i(C5436b bVar) {
        bVar.mo21890G("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m6613j(C5436b bVar) {
        Cursor V = bVar.mo21895V("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (V.moveToFirst() && V.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            V.close();
        }
    }

    /* renamed from: k */
    private static boolean m6614k(C5436b bVar) {
        Cursor V = bVar.mo21895V("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (V.moveToFirst() && V.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            V.close();
        }
    }

    /* renamed from: l */
    private void m6615l(C5436b bVar) {
        m6612i(bVar);
        bVar.mo21890G(C1204j.m6610a(this.f5506d));
    }

    /* renamed from: b */
    public void mo5931b(C5436b bVar) {
        super.mo5931b(bVar);
    }

    /* renamed from: d */
    public void mo5932d(C5436b bVar) {
        boolean j = m6613j(bVar);
        this.f5505c.createAllTables(bVar);
        if (!j) {
            C1207b onValidateSchema = this.f5505c.onValidateSchema(bVar);
            if (!onValidateSchema.f5508a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f5509b);
            }
        }
        m6615l(bVar);
        this.f5505c.onCreate(bVar);
    }

    /* renamed from: e */
    public void mo5933e(C5436b bVar, int i, int i2) {
        mo5935g(bVar, i, i2);
    }

    /* renamed from: f */
    public void mo5934f(C5436b bVar) {
        super.mo5934f(bVar);
        m6611h(bVar);
        this.f5505c.onOpen(bVar);
        this.f5504b = null;
    }

    /* renamed from: g */
    public void mo5935g(C5436b bVar, int i, int i2) {
        boolean z;
        List<C5267a> c;
        C1176a aVar = this.f5504b;
        if (aVar == null || (c = aVar.f5421d.mo5930c(i, i2)) == null) {
            z = false;
        } else {
            this.f5505c.onPreMigrate(bVar);
            for (C5267a a : c) {
                a.mo6926a(bVar);
            }
            C1207b onValidateSchema = this.f5505c.onValidateSchema(bVar);
            if (onValidateSchema.f5508a) {
                this.f5505c.onPostMigrate(bVar);
                m6615l(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f5509b);
            }
        }
        if (!z) {
            C1176a aVar2 = this.f5504b;
            if (aVar2 == null || aVar2.mo5847a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f5505c.dropAllTables(bVar);
            this.f5505c.createAllTables(bVar);
        }
    }
}
