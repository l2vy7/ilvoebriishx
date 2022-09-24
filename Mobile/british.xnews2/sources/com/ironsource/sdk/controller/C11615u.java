package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.p060e.C4976b;
import com.ironsource.sdk.service.C11748c;
import com.ironsource.sdk.service.C11752e;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.u */
public class C11615u {

    /* renamed from: f */
    static final String f52106f = "u";

    /* renamed from: a */
    private final String f52107a = "oneToken";

    /* renamed from: b */
    C11752e f52108b;

    /* renamed from: c */
    C11748c f52109c;

    /* renamed from: d */
    Context f52110d;

    /* renamed from: e */
    private C4976b f52111e;

    /* renamed from: com.ironsource.sdk.controller.u$a */
    static class C11616a {

        /* renamed from: a */
        String f52112a;

        /* renamed from: b */
        JSONObject f52113b;

        /* renamed from: c */
        String f52114c;

        /* renamed from: d */
        String f52115d;

        private C11616a() {
        }

        /* synthetic */ C11616a(byte b) {
            this();
        }
    }

    public C11615u(Context context, C11752e eVar) {
        this.f52108b = eVar;
        this.f52110d = context;
        this.f52109c = new C11748c();
        this.f52111e = new C4976b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo44778a() {
        JSONObject a = this.f52111e.mo20588a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a.get(next);
            if (obj instanceof String) {
                a.put(next, C4952a.C49531.m22717a((String) obj));
            }
        }
        return a;
    }
}
