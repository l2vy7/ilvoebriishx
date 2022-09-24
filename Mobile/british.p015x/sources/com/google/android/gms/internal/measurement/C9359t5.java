package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p150t.C6077a;

/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9359t5 implements C9421x5 {

    /* renamed from: g */
    private static final Map f45458g = new C6077a();

    /* renamed from: h */
    public static final String[] f45459h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f45460a;

    /* renamed from: b */
    private final Uri f45461b;

    /* renamed from: c */
    private final ContentObserver f45462c;

    /* renamed from: d */
    private final Object f45463d = new Object();

    /* renamed from: e */
    private volatile Map f45464e;

    /* renamed from: f */
    private final List f45465f = new ArrayList();

    private C9359t5(ContentResolver contentResolver, Uri uri) {
        C9327r5 r5Var = new C9327r5(this, (Handler) null);
        this.f45462c = r5Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f45460a = contentResolver;
        this.f45461b = uri;
        contentResolver.registerContentObserver(uri, false, r5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C9359t5 m43653b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.t5> r0 = com.google.android.gms.internal.measurement.C9359t5.class
            monitor-enter(r0)
            java.util.Map r1 = f45458g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.t5 r2 = (com.google.android.gms.internal.measurement.C9359t5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.t5 r3 = new com.google.android.gms.internal.measurement.t5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9359t5.m43653b(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.t5");
    }

    /* renamed from: e */
    static synchronized void m43654e() {
        synchronized (C9359t5.class) {
            for (C9359t5 t5Var : f45458g.values()) {
                t5Var.f45460a.unregisterContentObserver(t5Var.f45462c);
            }
            f45458g.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19172a(String str) {
        return (String) mo38055c().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Map mo38055c() {
        Map map;
        Map map2 = this.f45464e;
        if (map2 == null) {
            synchronized (this.f45463d) {
                map2 = this.f45464e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C9390v5.m43754a(new C9312q5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f45464e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map mo38056d() {
        Map map;
        Cursor query = this.f45460a.query(this.f45461b, f45459h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C6077a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void mo38057f() {
        synchronized (this.f45463d) {
            this.f45464e = null;
            C4659n6.m21448d();
        }
        synchronized (this) {
            for (C9375u5 zza : this.f45465f) {
                zza.zza();
            }
        }
    }
}
