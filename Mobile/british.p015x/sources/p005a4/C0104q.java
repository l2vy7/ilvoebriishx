package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;

/* renamed from: a4.q */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0104q implements C0073b0.C0077d {

    /* renamed from: a */
    private final SQLiteDatabase f250a;

    private C0104q(SQLiteDatabase sQLiteDatabase) {
        this.f250a = sQLiteDatabase;
    }

    /* renamed from: b */
    public static C0073b0.C0077d m397b(SQLiteDatabase sQLiteDatabase) {
        return new C0104q(sQLiteDatabase);
    }

    /* renamed from: a */
    public Object mo231a() {
        return this.f250a.beginTransaction();
    }
}
