package com.ironsource.p053a;

import android.net.Uri;
import android.util.Log;
import com.ironsource.p055c.C4947b;
import com.ironsource.p055c.C4950c;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.a.b */
public final class C4924b {

    /* renamed from: a */
    private C4926c f21935a;

    /* renamed from: b */
    C4922a f21936b;

    /* renamed from: c */
    private C4927d f21937c;

    /* renamed from: d */
    private ExecutorService f21938d;

    /* renamed from: com.ironsource.a.b$a */
    class C4925a implements Runnable {

        /* renamed from: b */
        private /* synthetic */ String f21939b;

        C4925a(String str) {
            this.f21939b = str;
        }

        public final void run() {
            try {
                C4950c cVar = new C4950c();
                ArrayList arrayList = new ArrayList(C4924b.this.f21936b.f21928f);
                if ("POST".equals(C4924b.this.f21936b.f21925c)) {
                    cVar = C4947b.m22703a(C4924b.this.f21936b.f21923a, this.f21939b, arrayList);
                } else if ("GET".equals(C4924b.this.f21936b.f21925c)) {
                    String str = C4924b.this.f21936b.f21923a;
                    String str2 = this.f21939b;
                    Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
                    C4947b.C4948a.C4949a aVar = new C4947b.C4948a.C4949a();
                    aVar.f21968b = build.toString();
                    aVar.f21970d = str2;
                    aVar.f21969c = "GET";
                    aVar.mo20553a(arrayList);
                    cVar = C4947b.m22702a(aVar.mo20554a());
                }
                C4924b bVar = C4924b.this;
                bVar.mo20423a("response status code: " + cVar.f21974a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C4924b(C4922a aVar, C4926c cVar) {
        if (aVar != null) {
            C4927d dVar = aVar.f21926d;
            if (dVar != null) {
                this.f21936b = aVar;
                this.f21935a = cVar;
                this.f21937c = dVar;
                this.f21938d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    /* renamed from: b */
    private static void m22676b(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20423a(String str) {
        if (this.f21936b.f21927e) {
            Log.d("EventsTracker", str);
        }
    }

    /* renamed from: a */
    public final void mo20424a(String str, Map<String, Object> map) {
        mo20423a(String.format(Locale.ENGLISH, "%s %s", new Object[]{str, map.toString()}));
        if (this.f21936b.f21924b && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m22676b(hashMap, this.f21935a.mo20426a());
            m22676b(hashMap, map);
            this.f21938d.submit(new C4925a(this.f21937c.mo20427a(hashMap)));
        }
    }
}
