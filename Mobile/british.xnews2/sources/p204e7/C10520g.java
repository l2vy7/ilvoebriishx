package p204e7;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: e7.g */
/* compiled from: HeartBeatInfoStorage */
class C10520g {

    /* renamed from: c */
    private static C10520g f49046c;

    /* renamed from: d */
    private static final SimpleDateFormat f49047d = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    private final SharedPreferences f49048a;

    /* renamed from: b */
    private final SharedPreferences f49049b;

    private C10520g(Context context) {
        this.f49048a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f49049b = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C10520g m48256a(Context context) {
        C10520g gVar;
        synchronized (C10520g.class) {
            if (f49046c == null) {
                f49046c = new C10520g(context);
            }
            gVar = f49046c;
        }
        return gVar;
    }

    /* renamed from: b */
    static boolean m48257b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f49047d;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean mo42651c(long j) {
        return mo42652d("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean mo42652d(String str, long j) {
        if (!this.f49048a.contains(str)) {
            this.f49048a.edit().putLong(str, j).apply();
            return true;
        } else if (!m48257b(this.f49048a.getLong(str, -1), j)) {
            return false;
        } else {
            this.f49048a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
