package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c */
public final class C8866c {

    /* renamed from: h */
    private static final ConcurrentHashMap<Uri, C8866c> f44427h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final String[] f44428i = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f44429a;

    /* renamed from: b */
    private final Uri f44430b;

    /* renamed from: c */
    private final ContentObserver f44431c;

    /* renamed from: d */
    private final Object f44432d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f44433e;

    /* renamed from: f */
    private final Object f44434f = new Object();

    /* renamed from: g */
    private final List<C8883e> f44435g = new ArrayList();

    private C8866c(ContentResolver contentResolver, Uri uri) {
        this.f44429a = contentResolver;
        this.f44430b = uri;
        this.f44431c = new C8876d(this, (Handler) null);
    }

    /* renamed from: a */
    public static C8866c m41634a(ContentResolver contentResolver, Uri uri) {
        ConcurrentHashMap<Uri, C8866c> concurrentHashMap = f44427h;
        C8866c cVar = concurrentHashMap.get(uri);
        if (cVar != null) {
            return cVar;
        }
        C8866c cVar2 = new C8866c(contentResolver, uri);
        C8866c putIfAbsent = concurrentHashMap.putIfAbsent(uri, cVar2);
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        cVar2.f44429a.registerContentObserver(cVar2.f44430b, false, cVar2.f44431c);
        return cVar2;
    }

    /* renamed from: e */
    private final Map<String, String> m41636e() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f44429a.query(this.f44430b, f44428i, (String) null, (String[]) null, (String) null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m41637f() {
        synchronized (this.f44434f) {
            for (C8883e zzk : this.f44435g) {
                zzk.zzk();
            }
        }
    }

    /* renamed from: c */
    public final Map<String, String> mo36856c() {
        Map<String, String> e = C4649f.m21404h("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m41636e() : this.f44433e;
        if (e == null) {
            synchronized (this.f44432d) {
                Map<String, String> map = this.f44433e;
                if (map == null) {
                    map = m41636e();
                    this.f44433e = map;
                }
            }
        }
        return e != null ? e : Collections.emptyMap();
    }

    /* renamed from: d */
    public final void mo36857d() {
        synchronized (this.f44432d) {
            this.f44433e = null;
        }
    }
}
