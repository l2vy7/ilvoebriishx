package com.ironsource.mediationsdk.p275a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4983j;
import com.ironsource.environment.p057b.C4960b;
import com.ironsource.mediationsdk.C11232E;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.p276a.C11308a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C11432q;
import com.ironsource.mediationsdk.sdk.C11445e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p054b.C4943a;
import com.ironsource.p054b.C4944b;
import com.ironsource.p054b.C4945c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p303e8.C12691c;

/* renamed from: com.ironsource.mediationsdk.a.b */
public abstract class C11284b {

    /* renamed from: A */
    int[] f50657A;

    /* renamed from: B */
    int[] f50658B;

    /* renamed from: C */
    int[] f50659C;

    /* renamed from: D */
    private int[] f50660D;

    /* renamed from: E */
    private Map<String, String> f50661E = new HashMap();

    /* renamed from: F */
    Map<String, String> f50662F = new HashMap();

    /* renamed from: G */
    int f50663G;

    /* renamed from: H */
    String f50664H;

    /* renamed from: I */
    String f50665I;

    /* renamed from: J */
    Set<Integer> f50666J;

    /* renamed from: K */
    C11290e f50667K;

    /* renamed from: L */
    private IronSourceSegment f50668L;

    /* renamed from: M */
    private C11432q f50669M;

    /* renamed from: N */
    private final Object f50670N = new Object();

    /* renamed from: a */
    public boolean f50671a;

    /* renamed from: b */
    private int f50672b = 1;

    /* renamed from: c */
    public boolean f50673c = false;

    /* renamed from: d */
    private int f50674d = 100;

    /* renamed from: e */
    private int f50675e = 5000;

    /* renamed from: f */
    public boolean f50676f = true;

    /* renamed from: g */
    private int f50677g = 90000;

    /* renamed from: h */
    private int f50678h = 1024;

    /* renamed from: i */
    private int f50679i = 5;

    /* renamed from: j */
    private String f50680j = "supersonic_sdk.db";

    /* renamed from: k */
    private String f50681k = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: l */
    private String f50682l = IronSourceConstants.EVENTS_PLACEMENT_NAME;

    /* renamed from: m */
    private final String f50683m = "abt";

    /* renamed from: n */
    private final String f50684n = "mt";

    /* renamed from: o */
    boolean f50685o = false;

    /* renamed from: p */
    public String f50686p = "";

    /* renamed from: q */
    C4943a f50687q;

    /* renamed from: r */
    private C11283a f50688r;

    /* renamed from: s */
    ArrayList<C11308a> f50689s;

    /* renamed from: t */
    int f50690t;

    /* renamed from: u */
    String f50691u;

    /* renamed from: w */
    Context f50692w;

    /* renamed from: x */
    int f50693x = 100;

    /* renamed from: y */
    private int f50694y = 5000;

    /* renamed from: z */
    int f50695z = 1;

    /* renamed from: com.ironsource.mediationsdk.a.b$a */
    public enum C11285a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        f50700e(8);
        

        /* renamed from: f */
        int f50702f;

        private C11285a(int i) {
            this.f50702f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b */
    class C11286b implements Runnable {

        /* renamed from: b */
        private /* synthetic */ C11308a f50703b;

        C11286b(C11308a aVar) {
            this.f50703b = aVar;
        }

        public final void run() {
            C11308a aVar = this.f50703b;
            if (aVar != null) {
                C11284b bVar = C11284b.this;
                if (bVar.f50676f) {
                    aVar.mo44039a("eventSessionId", bVar.f50691u);
                    String connectionType = IronSourceUtils.getConnectionType(C11284b.this.f50692w);
                    if (C11284b.this.mo43998u(this.f50703b)) {
                        this.f50703b.mo44039a("connectionType", connectionType);
                    }
                    if (C11284b.this.mo43990j(connectionType, this.f50703b)) {
                        C11308a aVar2 = this.f50703b;
                        aVar2.mo44038a(C11284b.this.mo43971a(aVar2));
                    }
                    int q = C11284b.m50405q(this.f50703b.mo44037a());
                    if (q != C11285a.NOT_SUPPORTED.f50702f) {
                        this.f50703b.mo44039a(IronSourceConstants.EVENTS_AD_UNIT, Integer.valueOf(q));
                    }
                    C11284b.m50401e(C11284b.this, this.f50703b, IronSourceConstants.EVENTS_ERROR_REASON);
                    C11284b.m50401e(C11284b.this, this.f50703b, IronSourceConstants.EVENTS_EXT1);
                    if (!C11284b.this.f50662F.isEmpty()) {
                        for (Map.Entry next : C11284b.this.f50662F.entrySet()) {
                            if (!(this.f50703b.mo44042d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                this.f50703b.mo44039a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    C11284b bVar2 = C11284b.this;
                    C11308a aVar3 = this.f50703b;
                    boolean z = false;
                    if (aVar3 != null ? C11284b.m50404k(bVar2.f50657A) ? !bVar2.mo43989h(aVar3.mo44037a(), bVar2.f50657A) : C11284b.m50404k(bVar2.f50658B) ? bVar2.mo43989h(aVar3.mo44037a(), bVar2.f50658B) : true : false) {
                        if (C11284b.this.mo43997t(this.f50703b)) {
                            JSONObject d = this.f50703b.mo44042d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                this.f50703b.mo44039a(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C11284b.this.mo43996r(this.f50703b)));
                            }
                        }
                        if (!TextUtils.isEmpty(C11284b.this.mo43994o(this.f50703b.mo44037a())) && C11284b.this.mo43993n(this.f50703b)) {
                            C11308a aVar4 = this.f50703b;
                            aVar4.mo44039a(IronSourceConstants.EVENTS_PLACEMENT_NAME, C11284b.this.mo43994o(aVar4.mo44037a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(C11284b.this.f50692w);
                        if (firstSessionTimestamp != -1) {
                            this.f50703b.mo44039a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + this.f50703b.mo44037a() + ",\"timestamp\":" + this.f50703b.mo44040b() + "," + this.f50703b.mo44041c().substring(1)).replace(",", "\n"));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        C11284b.this.f50689s.add(this.f50703b);
                        C11284b.this.f50690t++;
                    }
                    boolean i = C11284b.m50404k(C11284b.this.f50659C) ? C11284b.this.mo43989h(this.f50703b.mo44037a(), C11284b.this.f50659C) : C11284b.this.mo43995p(this.f50703b);
                    C11284b bVar3 = C11284b.this;
                    if (!bVar3.f50685o && i) {
                        bVar3.f50685o = true;
                    }
                    if (bVar3.f50687q != null) {
                        if ((bVar3.f50690t >= bVar3.f50693x || bVar3.f50685o) && bVar3.f50671a) {
                            bVar3.m50406s();
                            return;
                        }
                        ArrayList<C11308a> arrayList = bVar3.f50689s;
                        if (arrayList != null && arrayList.size() >= bVar3.f50695z) {
                            z = true;
                        }
                        if (z || i) {
                            C11284b.this.mo43992m();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$c */
    class C11287c implements C4945c {

        /* renamed from: com.ironsource.mediationsdk.a.b$c$a */
        class C11288a implements Runnable {

            /* renamed from: b */
            private /* synthetic */ boolean f50706b;

            /* renamed from: c */
            private /* synthetic */ ArrayList f50707c;

            C11288a(boolean z, ArrayList arrayList) {
                this.f50706b = z;
                this.f50707c = arrayList;
            }

            public final void run() {
                if (this.f50706b) {
                    C11284b bVar = C11284b.this;
                    ArrayList<C11308a> a = bVar.f50687q.mo20534a(bVar.f50665I);
                    C11284b.this.f50690t = a.size() + C11284b.this.f50689s.size();
                    return;
                }
                IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                C11284b.this.mo43988g(this.f50707c);
            }
        }

        C11287c() {
        }

        /* renamed from: a */
        public final synchronized void mo20541a(ArrayList<C11308a> arrayList, boolean z) {
            C11284b.this.f50667K.mo44002a(new C11288a(z, arrayList));
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$d */
    class C11289d implements Comparator<C11308a> {
        C11289d() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C11308a) obj).mo44040b() >= ((C11308a) obj2).mo44040b() ? 1 : -1;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$e */
    class C11290e extends HandlerThread {

        /* renamed from: b */
        Handler f50710b;

        C11290e(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo44002a(Runnable runnable) {
            this.f50710b.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m50398a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    /* renamed from: b */
    private ArrayList<C11308a> m50399b(ArrayList<C11308a> arrayList, ArrayList<C11308a> arrayList2, int i) {
        ArrayList<C11308a> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new C11289d());
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.f50687q.mo20535a(arrayList4.subList(i, arrayList4.size()), this.f50665I);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    /* renamed from: e */
    static /* synthetic */ void m50401e(C11284b bVar, C11308a aVar, String str) {
        JSONObject d = aVar.mo44042d();
        if (d != null && d.has(str)) {
            try {
                String optString = d.optString(str, (String) null);
                if (optString != null) {
                    aVar.mo44039a(str, optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m50402f(String str) {
        C11283a aVar = this.f50688r;
        if (aVar == null || !aVar.mo43970c().equals(str)) {
            this.f50688r = C11291c.m50437a(str, this.f50663G);
        }
    }

    /* renamed from: k */
    static boolean m50404k(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* renamed from: q */
    protected static int m50405q(int i) {
        C11285a aVar;
        int i2 = C11285a.NOT_SUPPORTED.f50702f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = C11285a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = C11285a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = C11285a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = C11285a.f50700e;
        }
        return aVar.f50702f;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m50406s() {
        ArrayList<C11308a> b;
        this.f50685o = false;
        synchronized (this.f50670N) {
            b = m50399b(this.f50689s, this.f50687q.mo20534a(this.f50665I), this.f50694y);
            if (b.size() > 0) {
                this.f50689s.clear();
                this.f50687q.mo20536b(this.f50665I);
            }
        }
        if (b.size() > 0) {
            this.f50690t = 0;
            JSONObject b2 = C11445e.m51160a().mo44499b();
            try {
                IronSourceSegment ironSourceSegment = this.f50668L;
                if (ironSourceSegment != null) {
                    if (ironSourceSegment.getAge() > 0) {
                        b2.put(IronSourceSegment.AGE, this.f50668L.getAge());
                    }
                    if (!TextUtils.isEmpty(this.f50668L.getGender())) {
                        b2.put(IronSourceSegment.GENDER, this.f50668L.getGender());
                    }
                    if (this.f50668L.getLevel() > 0) {
                        b2.put(IronSourceSegment.LEVEL, this.f50668L.getLevel());
                    }
                    if (this.f50668L.getIsPaying() != null) {
                        b2.put(IronSourceSegment.PAYING, this.f50668L.getIsPaying().get());
                    }
                    if (this.f50668L.getIapt() > 0.0d) {
                        b2.put(IronSourceSegment.IAPT, this.f50668L.getIapt());
                    }
                    if (this.f50668L.getUcd() > 0) {
                        b2.put(IronSourceSegment.USER_CREATION_DATE, this.f50668L.getUcd());
                    }
                }
                C11432q qVar = this.f50669M;
                if (qVar != null) {
                    String str = qVar.f51437b;
                    if (!TextUtils.isEmpty(str)) {
                        b2.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.f50669M.f51438c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b2.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                try {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f50686p;
            if (!TextUtils.isEmpty(str2)) {
                b2.put("abt", str2);
            }
            String str3 = C11232E.m50103a().f50425o;
            if (!TextUtils.isEmpty(str3)) {
                b2.put("mt", str3);
            }
            Map<String, String> map = this.f50661E;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b2.has((String) next2.getKey())) {
                        b2.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            JSONObject a = C4983j.m22836a(new C4960b().f22012a);
            C12691c.m53983b(a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
            Iterator<String> keys2 = a.keys();
            while (keys2.hasNext()) {
                String next3 = keys2.next();
                b2.put(next3, a.get(next3));
            }
            String a2 = this.f50688r.mo43967a(b, b2);
            if (TextUtils.isEmpty(a2)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                mo43988g(b);
                return;
            }
            if (this.f50673c) {
                try {
                    a2 = Base64.encodeToString(C4952a.C49531.m22725b(a2), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            new C4944b(new C11287c()).execute(new Object[]{a2, this.f50688r.mo43966a(), b});
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo43971a(C11308a aVar) {
        return aVar.mo44037a() + 90000;
    }

    /* renamed from: a */
    public final void mo43972a(int i) {
        if (i > 0) {
            this.f50695z = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo43973a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f50665I, this.f50664H);
        this.f50664H = defaultEventsFormatterType;
        m50402f(defaultEventsFormatterType);
        this.f50688r.f50656h = IronSourceUtils.getDefaultEventsURL(context, this.f50665I, (String) null);
        this.f50687q = C4943a.m22681a(context, "supersonic_sdk.db", 5);
        mo43992m();
        this.f50657A = IronSourceUtils.getDefaultOptOutEvents(context, this.f50665I);
        this.f50658B = IronSourceUtils.getDefaultOptInEvents(context, this.f50665I);
        this.f50659C = IronSourceUtils.getDefaultTriggerEvents(context, this.f50665I);
        this.f50660D = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f50665I);
        this.f50668L = ironSourceSegment;
        this.f50692w = context;
    }

    /* renamed from: a */
    public final synchronized void mo43974a(C11432q qVar) {
        this.f50669M = qVar;
    }

    /* renamed from: a */
    public final void mo43975a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C11283a aVar = this.f50688r;
            if (aVar != null) {
                aVar.f50656h = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f50665I, str);
        }
    }

    /* renamed from: a */
    public final void mo43976a(Map<String, String> map) {
        this.f50661E.putAll(map);
    }

    /* renamed from: a */
    public final void mo43977a(int[] iArr, Context context) {
        this.f50657A = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f50665I, iArr);
    }

    /* renamed from: b */
    public final void mo43978b(int i) {
        if (i > 0) {
            this.f50693x = i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo43979b(C11308a aVar) {
        this.f50667K.mo44002a(new C11286b(aVar));
    }

    /* renamed from: b */
    public final void mo43980b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f50664H = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f50665I, str);
            m50402f(str);
        }
    }

    /* renamed from: b */
    public final void mo43981b(Map<String, String> map) {
        this.f50662F.putAll(map);
    }

    /* renamed from: b */
    public final void mo43982b(int[] iArr, Context context) {
        this.f50658B = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f50665I, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo43983c() {
        this.f50689s = new ArrayList<>();
        this.f50690t = 0;
        this.f50688r = C11291c.m50437a(this.f50664H, this.f50663G);
        C11290e eVar = new C11290e(this.f50665I + "EventThread");
        this.f50667K = eVar;
        eVar.start();
        C11290e eVar2 = this.f50667K;
        eVar2.f50710b = new Handler(eVar2.getLooper());
        this.f50691u = IronSourceUtils.getSessionId();
        this.f50666J = new HashSet();
        mo43991l();
    }

    /* renamed from: c */
    public final void mo43984c(int i) {
        if (i > 0) {
            this.f50694y = i;
        }
    }

    /* renamed from: c */
    public final void mo43985c(int[] iArr, Context context) {
        this.f50659C = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f50665I, iArr);
    }

    /* renamed from: d */
    public final void mo43986d() {
        m50406s();
    }

    /* renamed from: d */
    public final void mo43987d(int[] iArr, Context context) {
        this.f50660D = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f50665I, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo43988g(ArrayList<C11308a> arrayList) {
        if (arrayList != null) {
            synchronized (this.f50670N) {
                this.f50687q.mo20535a(arrayList, this.f50665I);
                this.f50690t = this.f50687q.mo20534a(this.f50665I).size() + this.f50689s.size();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo43989h(int i, int[] iArr) {
        if (!m50404k(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return m50404k(r1.f50660D) ? mo43989h(r3.mo44037a(), r1.f50660D) : r1.f50666J.contains(java.lang.Integer.valueOf(r3.mo44037a()));
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo43990j(java.lang.String r2, com.ironsource.mediationsdk.adunit.p276a.C11308a r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.f50660D     // Catch:{ all -> 0x002f }
            boolean r2 = m50404k(r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.mo44037a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.f50660D     // Catch:{ all -> 0x002f }
            boolean r2 = r1.mo43989h(r2, r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.f50666J     // Catch:{ all -> 0x002f }
            int r3 = r3.mo44037a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p275a.C11284b.mo43990j(java.lang.String, com.ironsource.mediationsdk.adunit.a.a):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo43991l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo43992m() {
        synchronized (this.f50670N) {
            this.f50687q.mo20535a(this.f50689s, this.f50665I);
            this.f50689s.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo43993n(C11308a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo43994o(int i);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo43995p(C11308a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo43996r(C11308a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo43997t(C11308a aVar) {
        return (aVar.mo44037a() == 14 || aVar.mo44037a() == 114 || aVar.mo44037a() == 514 || aVar.mo44037a() == 140 || aVar.mo44037a() == 40 || aVar.mo44037a() == 41 || aVar.mo44037a() == 50 || aVar.mo44037a() == 51 || aVar.mo44037a() == 52) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo43998u(C11308a aVar) {
        return (aVar.mo44037a() == 40 || aVar.mo44037a() == 41 || aVar.mo44037a() == 50 || aVar.mo44037a() == 51 || aVar.mo44037a() == 52) ? false : true;
    }
}
