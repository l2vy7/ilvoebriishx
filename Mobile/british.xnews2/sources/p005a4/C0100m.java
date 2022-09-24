package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;

/* renamed from: a4.m */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0100m implements C0073b0.C0075b {

    /* renamed from: a */
    private final long f244a;

    private C0100m(long j) {
        this.f244a = j;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m393a(long j) {
        return new C0100m(j);
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f244a)}));
    }
}
