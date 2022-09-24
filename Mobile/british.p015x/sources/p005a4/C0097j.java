package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;
import p154t3.C6150m;

/* renamed from: a4.j */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0097j implements C0073b0.C0075b {

    /* renamed from: a */
    private final long f239a;

    /* renamed from: b */
    private final C6150m f240b;

    private C0097j(long j, C6150m mVar) {
        this.f239a = j;
        this.f240b = mVar;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m390a(long j, C6150m mVar) {
        return new C0097j(j, mVar);
    }

    public Object apply(Object obj) {
        return C0073b0.m289T(this.f239a, this.f240b, (SQLiteDatabase) obj);
    }
}
