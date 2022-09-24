package com.appnext.base.p022a.p023a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.appnext.base.C3117a;
import com.appnext.base.p022a.C3118a;
import com.appnext.base.p026b.C3125a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appnext.base.a.a.a */
public class C3119a {

    /* renamed from: bS */
    private static C3119a f12197bS;

    /* renamed from: bT */
    private static C3118a f12198bT;

    /* renamed from: bR */
    private AtomicInteger f12199bR = new AtomicInteger(0);

    /* renamed from: bU */
    private SQLiteDatabase f12200bU;

    /* renamed from: com.appnext.base.a.a.a$1 */
    static /* synthetic */ class C31201 {

        /* renamed from: bV */
        static final /* synthetic */ int[] f12201bV;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appnext.base.a.a.a$a[] r0 = com.appnext.base.p022a.p023a.C3119a.C3121a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12201bV = r0
                com.appnext.base.a.a.a$a r1 = com.appnext.base.p022a.p023a.C3119a.C3121a.DatabaseOrDiskFull     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12201bV     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appnext.base.a.a.a$a r1 = com.appnext.base.p022a.p023a.C3119a.C3121a.Global     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p022a.p023a.C3119a.C31201.<clinit>():void");
        }
    }

    /* renamed from: com.appnext.base.a.a.a$a */
    public enum C3121a {
        Global,
        DatabaseOrDiskFull
    }

    private C3119a(Context context) {
        f12198bT = C3118a.m10554a(context);
    }

    /* renamed from: L */
    public static C3119a m10555L() {
        if (f12197bS == null) {
            synchronized (C3119a.class) {
                if (f12197bS == null) {
                    f12197bS = new C3119a(C3125a.getContext().getApplicationContext());
                }
            }
        }
        return f12197bS;
    }

    /* renamed from: a */
    public static void m10556a(C3121a aVar, Throwable th) {
        try {
            int i = C31201.f12201bV[aVar.ordinal()];
            if (i == 1 || i == 2) {
                C3117a.m10553a("DatabaseManager$onError", th);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: M */
    public final SQLiteDatabase mo10538M() {
        if (this.f12199bR.incrementAndGet() == 1) {
            this.f12200bU = f12198bT.getWritableDatabase();
        }
        return this.f12200bU;
    }

    /* renamed from: N */
    public final void mo10539N() {
        try {
            if (this.f12199bR.decrementAndGet() == 0) {
                this.f12200bU.close();
            }
        } catch (Throwable unused) {
        }
    }
}
