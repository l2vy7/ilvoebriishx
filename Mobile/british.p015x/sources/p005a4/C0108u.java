package p005a4;

import android.database.Cursor;
import p005a4.C0073b0;

/* renamed from: a4.u */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0108u implements C0073b0.C0075b {

    /* renamed from: a */
    private static final C0108u f254a = new C0108u();

    private C0108u() {
    }

    /* renamed from: a */
    public static C0073b0.C0075b m403a() {
        return f254a;
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
