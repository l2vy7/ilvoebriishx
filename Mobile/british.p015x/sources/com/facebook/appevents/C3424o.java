package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3481f0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077f3.C5261a;
import p083g3.C5338c;

/* renamed from: com.facebook.appevents.o */
/* compiled from: SessionEventsState */
class C3424o {

    /* renamed from: a */
    private List<C3392c> f12882a = new ArrayList();

    /* renamed from: b */
    private List<C3392c> f12883b = new ArrayList();

    /* renamed from: c */
    private int f12884c;

    /* renamed from: d */
    private C3459b f12885d;

    /* renamed from: e */
    private String f12886e;

    /* renamed from: f */
    private final int f12887f = 1000;

    public C3424o(C3459b bVar, String str) {
        this.f12885d = bVar;
        this.f12886e = str;
    }

    /* renamed from: f */
    private void m11447f(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = C5338c.m24048a(C5338c.C5340b.CUSTOM_APP_EVENTS, this.f12885d, this.f12886e, z, context);
            if (this.f12884c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.mo11244Y(jSONObject);
        Bundle y = graphRequest.mo11258y();
        if (y == null) {
            y = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            y.putString("custom_events", jSONArray2);
            graphRequest.mo11248c0(jSONArray2);
        }
        graphRequest.mo11246a0(y);
    }

    /* renamed from: a */
    public synchronized void mo11856a(C3392c cVar) {
        if (this.f12882a.size() + this.f12883b.size() >= 1000) {
            this.f12884c++;
        } else {
            this.f12882a.add(cVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo11857b(boolean z) {
        if (z) {
            this.f12882a.addAll(this.f12883b);
        }
        this.f12883b.clear();
        this.f12884c = 0;
    }

    /* renamed from: c */
    public synchronized int mo11858c() {
        return this.f12882a.size();
    }

    /* renamed from: d */
    public synchronized List<C3392c> mo11859d() {
        List<C3392c> list;
        list = this.f12882a;
        this.f12882a = new ArrayList();
        return list;
    }

    /* renamed from: e */
    public int mo11860e(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f12884c;
            C5261a.m23779d(this.f12883b);
            this.f12883b.addAll(this.f12882a);
            this.f12882a.clear();
            JSONArray jSONArray = new JSONArray();
            for (C3392c next : this.f12883b) {
                if (!next.mo11815f()) {
                    C3481f0.m11609T("Event with invalid checksum: %s", next.toString());
                } else if (z || !next.mo11812b()) {
                    jSONArray.put(next.mo11813c());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m11447f(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }
}
