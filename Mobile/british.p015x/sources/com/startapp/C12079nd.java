package com.startapp;

import com.startapp.C12398vd;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.nd */
/* compiled from: Sta */
public abstract class C12079nd extends C12398vd {

    /* renamed from: c */
    public final HashSet<String> f53336c;

    /* renamed from: d */
    public final JSONObject f53337d;

    /* renamed from: e */
    public final long f53338e;

    public C12079nd(C12398vd.C12400b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f53336c = new HashSet<>(hashSet);
        this.f53337d = jSONObject;
        this.f53338e = j;
    }

    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
