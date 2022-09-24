package p005a4;

import android.database.Cursor;
import java.util.Map;
import p005a4.C0073b0;

/* renamed from: a4.p */
/* compiled from: SQLiteEventStore */
final /* synthetic */ class C0103p implements C0073b0.C0075b {

    /* renamed from: a */
    private final Map f249a;

    private C0103p(Map map) {
        this.f249a = map;
    }

    /* renamed from: a */
    public static C0073b0.C0075b m396a(Map map) {
        return new C0103p(map);
    }

    public Object apply(Object obj) {
        return C0073b0.m285C(this.f249a, (Cursor) obj);
    }
}
