package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0093h0;

/* renamed from: a4.f0 */
/* compiled from: SchemaManager */
final /* synthetic */ class C0087f0 implements C0093h0.C0094a {

    /* renamed from: a */
    private static final C0087f0 f224a = new C0087f0();

    private C0087f0() {
    }

    /* renamed from: b */
    public static C0093h0.C0094a m363b() {
        return f224a;
    }

    /* renamed from: a */
    public void mo234a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
