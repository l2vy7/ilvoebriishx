package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p323q7.C12864a;
import p325r7.C12868a;
import p325r7.C12869b;

/* renamed from: com.unity3d.scar.adapter.common.j */
/* compiled from: ScarAdapterBase */
public abstract class C12493j implements C12489f {

    /* renamed from: a */
    protected C12869b f55268a;

    /* renamed from: b */
    protected Map<String, C12864a> f55269b = new ConcurrentHashMap();

    /* renamed from: c */
    protected C12864a f55270c;

    /* renamed from: d */
    protected C12487d f55271d;

    /* renamed from: com.unity3d.scar.adapter.common.j$a */
    /* compiled from: ScarAdapterBase */
    class C12494a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f55272b;

        C12494a(Activity activity) {
            this.f55272b = activity;
        }

        public void run() {
            C12493j.this.f55270c.mo48006a(this.f55272b);
        }
    }

    public C12493j(C12487d dVar) {
        this.f55271d = dVar;
    }

    /* renamed from: a */
    public void mo46898a(Context context, String[] strArr, String[] strArr2, C12868a aVar) {
        this.f55268a.mo43456a(context, strArr, strArr2, aVar);
    }

    /* renamed from: b */
    public void mo46899b(Activity activity, String str, String str2) {
        C12864a aVar = this.f55269b.get(str2);
        if (aVar == null) {
            C12487d dVar = this.f55271d;
            dVar.handleError(C12485b.m53827f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f55270c = aVar;
        C12495k.m53835a(new C12494a(activity));
    }
}
