package p005a4;

import android.database.sqlite.SQLiteDatabase;
import p005a4.C0073b0;

/* renamed from: a4.y */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0112y implements C0073b0.C0075b {

    /* renamed from: a */
    private final String f260a;

    private C0112y(String str) {
        this.f260a = str;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m407a(String str) {
        return new C0112y(str);
    }

    public Object apply(Object obj) {
        return C0073b0.m288R(this.f260a, (SQLiteDatabase) obj);
    }
}
