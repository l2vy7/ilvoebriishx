package com.startapp;

import android.content.Context;
import android.net.Uri;
import com.ironsource.sdk.p288c.C11539d;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.startapp.c0 */
/* compiled from: Sta */
public class C11810c0 {

    /* renamed from: a */
    public final Context f52637a;

    /* renamed from: b */
    public final List<AppPresenceDetails> f52638b;

    /* renamed from: c */
    public final Runnable f52639c = new C11811a();

    /* renamed from: com.startapp.c0$a */
    /* compiled from: Sta */
    public class C11811a implements Runnable {
        public C11811a() {
        }

        public void run() {
            C11810c0 c0Var = C11810c0.this;
            c0Var.getClass();
            try {
                c0Var.mo45178b();
            } catch (Throwable th) {
                C5004d4.m22887a(th);
            }
        }
    }

    public C11810c0(Context context, List<AppPresenceDetails> list) {
        this.f52638b = list;
        this.f52637a = context;
    }

    /* renamed from: a */
    public void mo45177a() {
        ComponentLocator.m23305a(this.f52637a).mo21229p().execute(this.f52639c);
    }

    /* renamed from: b */
    public final void mo45178b() {
        String c;
        String str;
        List<AppPresenceDetails> list = this.f52638b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (AppPresenceDetails next : list) {
            if (!next.mo46153e() && (c = next.mo46151c()) != null) {
                try {
                    str = Uri.parse(c).getQueryParameter(C11539d.f51879a);
                } catch (Throwable th) {
                    C5004d4.m22887a(th);
                    str = null;
                }
                if (str != null) {
                    if (next.mo46152d()) {
                        arrayList2.add("d=" + str);
                    } else {
                        arrayList3.add("d=" + str);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(C5055a.m23144a((List<String>) arrayList2, "false", "true"));
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(C5055a.m23144a((List<String>) arrayList3, "false", "false"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() != 0) {
                Context context = this.f52637a;
                TrackingParams a = new TrackingParams().mo46182a("APP_PRESENCE");
                if (!str2.equalsIgnoreCase("")) {
                    C5015nb.m22915a(context, 4, "Sending impression", true);
                    C5055a.m23163b(context, str2, a);
                }
            }
        }
    }
}
