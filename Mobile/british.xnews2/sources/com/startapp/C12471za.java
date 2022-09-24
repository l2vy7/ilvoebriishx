package com.startapp;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import com.iab.omid.library.startio.walking.C4921b;
import com.startapp.C12018kd;
import com.startapp.C12036ld;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.za */
/* compiled from: Sta */
public class C12471za implements C12036ld.C12037a {

    /* renamed from: h */
    public static C12471za f55206h = new C12471za();

    /* renamed from: i */
    public static Handler f55207i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static Handler f55208j = null;

    /* renamed from: k */
    public static final Runnable f55209k = new C12474c();

    /* renamed from: l */
    public static final Runnable f55210l = new C12475d();

    /* renamed from: a */
    public List<C12473b> f55211a = new ArrayList();

    /* renamed from: b */
    public int f55212b;

    /* renamed from: c */
    public final List<C12116od> f55213c = new ArrayList();

    /* renamed from: d */
    public C12351td f55214d = new C12351td();

    /* renamed from: e */
    public C12018kd f55215e = new C12018kd();

    /* renamed from: f */
    public C12061md f55216f = new C12061md(new C11809be());

    /* renamed from: g */
    public long f55217g;

    /* renamed from: com.startapp.za$a */
    /* compiled from: Sta */
    public interface C12472a extends C12473b {
        /* renamed from: b */
        void mo46863b(int i, long j);
    }

    /* renamed from: com.startapp.za$b */
    /* compiled from: Sta */
    public interface C12473b {
        /* renamed from: a */
        void mo46864a(int i, long j);
    }

    /* renamed from: com.startapp.za$c */
    /* compiled from: Sta */
    public class C12474c implements Runnable {
        public void run() {
            String str;
            Boolean bool;
            C12471za zaVar = C12471za.f55206h;
            zaVar.f55212b = 0;
            zaVar.f55213c.clear();
            for (T t : Collections.unmodifiableCollection(C11931gd.f53013c.f53015b)) {
                t.getClass();
            }
            zaVar.f55217g = System.nanoTime();
            C12018kd kdVar = zaVar.f55215e;
            kdVar.getClass();
            C11931gd gdVar = C11931gd.f53013c;
            if (gdVar != null) {
                for (T t2 : Collections.unmodifiableCollection(gdVar.f53015b)) {
                    View b = t2.mo45459b();
                    if (t2.mo45460c()) {
                        String str2 = t2.f53131h;
                        if (b != null) {
                            if (Build.VERSION.SDK_INT < 19 || b.isAttachedToWindow()) {
                                if (b.hasWindowFocus()) {
                                    kdVar.f53222h.remove(b);
                                    bool = Boolean.FALSE;
                                } else if (kdVar.f53222h.containsKey(b)) {
                                    bool = kdVar.f53222h.get(b);
                                } else {
                                    Map<View, Boolean> map = kdVar.f53222h;
                                    Boolean bool2 = Boolean.FALSE;
                                    map.put(b, bool2);
                                    bool = bool2;
                                }
                                if (bool.booleanValue()) {
                                    str = "noWindowFocus";
                                } else {
                                    HashSet hashSet = new HashSet();
                                    View view = b;
                                    while (true) {
                                        if (view == null) {
                                            kdVar.f53218d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                        String a = C12062me.m52612a(view);
                                        if (a != null) {
                                            str = a;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "notAttached";
                            }
                            if (str == null) {
                                kdVar.f53219e.add(str2);
                                kdVar.f53215a.put(b, str2);
                                for (C12456yd next : t2.f53126c) {
                                    View view2 = (View) next.f55182a.get();
                                    if (view2 != null) {
                                        C12018kd.C12019a aVar = kdVar.f53216b.get(view2);
                                        if (aVar != null) {
                                            aVar.f53225b.add(t2.f53131h);
                                        } else {
                                            kdVar.f53216b.put(view2, new C12018kd.C12019a(next, t2.f53131h));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                kdVar.f53220f.add(str2);
                                kdVar.f53217c.put(str2, b);
                                kdVar.f53221g.put(str2, str);
                            }
                        } else {
                            kdVar.f53220f.add(str2);
                            kdVar.f53221g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            C12480zd zdVar = zaVar.f55214d.f54781b;
            if (zaVar.f55215e.f53220f.size() > 0) {
                Iterator<String> it = zaVar.f55215e.f53220f.iterator();
                while (it.hasNext()) {
                    String next2 = it.next();
                    JSONObject a2 = zdVar.mo45338a((View) null);
                    View view3 = zaVar.f55215e.f53217c.get(next2);
                    C11893ee eeVar = zaVar.f55214d.f54780a;
                    String str3 = zaVar.f55215e.f53221g.get(next2);
                    if (str3 != null) {
                        JSONObject a3 = eeVar.mo45338a(view3);
                        WindowManager windowManager = C12377ud.f54853a;
                        try {
                            a3.put("adSessionId", next2);
                        } catch (JSONException e) {
                            Log.e("OMIDLIB", "Error with setting ad session id", e);
                        }
                        try {
                            a3.put("notVisibleReason", str3);
                        } catch (JSONException e2) {
                            Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                        }
                        C12377ud.m53547a(a2, a3);
                    }
                    C12377ud.m53545a(a2);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next2);
                    C12061md mdVar = zaVar.f55216f;
                    mdVar.f53307b.mo45176a(new C12020ke(mdVar, hashSet2, a2, nanoTime));
                }
            }
            if (zaVar.f55215e.f53219e.size() > 0) {
                JSONObject a4 = zdVar.mo45338a((View) null);
                zdVar.mo45339a((View) null, a4, zaVar, true, false);
                C12377ud.m53545a(a4);
                C12061md mdVar2 = zaVar.f55216f;
                mdVar2.f53307b.mo45176a(new C12080ne(mdVar2, zaVar.f55215e.f53219e, a4, nanoTime));
            } else {
                C12061md mdVar3 = zaVar.f55216f;
                mdVar3.f53307b.mo45176a(new C11910fe(mdVar3));
            }
            C12018kd kdVar2 = zaVar.f55215e;
            kdVar2.f53215a.clear();
            kdVar2.f53216b.clear();
            kdVar2.f53217c.clear();
            kdVar2.f53218d.clear();
            kdVar2.f53219e.clear();
            kdVar2.f53220f.clear();
            kdVar2.f53221g.clear();
            kdVar2.f53223i = false;
            long nanoTime2 = System.nanoTime() - zaVar.f55217g;
            if (zaVar.f55211a.size() > 0) {
                for (C12473b next3 : zaVar.f55211a) {
                    next3.mo46864a(zaVar.f55212b, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
                    if (next3 instanceof C12472a) {
                        ((C12472a) next3).mo46863b(zaVar.f55212b, nanoTime2);
                    }
                }
            }
        }
    }

    /* renamed from: com.startapp.za$d */
    /* compiled from: Sta */
    public class C12475d implements Runnable {
        public void run() {
            Handler handler = C12471za.f55208j;
            if (handler != null) {
                handler.post(C12471za.f55209k);
                C12471za.f55208j.postDelayed(C12471za.f55210l, 200);
            }
        }
    }

    /* renamed from: a */
    public final void mo46861a(View view, C12036ld ldVar, JSONObject jSONObject, C4921b bVar, boolean z) {
        ldVar.mo45339a(view, jSONObject, this, bVar == C4921b.PARENT_VIEW, z);
    }

    /* renamed from: a */
    public void mo46862a(View view, C12036ld ldVar, JSONObject jSONObject, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        if (C12062me.m52612a(view) == null) {
            C12018kd kdVar = this.f55215e;
            C4921b bVar = kdVar.f53218d.contains(view) ? C4921b.PARENT_VIEW : kdVar.f53223i ? C4921b.OBSTRUCTION_VIEW : C4921b.UNDERLYING_VIEW;
            if (bVar != C4921b.UNDERLYING_VIEW) {
                JSONObject a = ldVar.mo45338a(view);
                C12377ud.m53547a(jSONObject, a);
                C12018kd kdVar2 = this.f55215e;
                if (kdVar2.f53215a.size() == 0) {
                    str = null;
                } else {
                    String str2 = kdVar2.f53215a.get(view);
                    if (str2 != null) {
                        kdVar2.f53215a.remove(view);
                    }
                    str = str2;
                }
                if (str != null) {
                    WindowManager windowManager = C12377ud.f54853a;
                    try {
                        a.put("adSessionId", str);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    C12018kd kdVar3 = this.f55215e;
                    if (kdVar3.f53222h.containsKey(view)) {
                        kdVar3.f53222h.put(view, Boolean.TRUE);
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    try {
                        a.put("hasWindowFocus", Boolean.valueOf(z4));
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    this.f55215e.f53223i = true;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    C12018kd kdVar4 = this.f55215e;
                    C12018kd.C12019a aVar = kdVar4.f53216b.get(view);
                    if (aVar != null) {
                        kdVar4.f53216b.remove(view);
                    }
                    if (aVar != null) {
                        WindowManager windowManager2 = C12377ud.f54853a;
                        C12456yd ydVar = aVar.f53224a;
                        JSONArray jSONArray = new JSONArray();
                        for (String put : aVar.f53225b) {
                            jSONArray.put(put);
                        }
                        try {
                            a.put("isFriendlyObstructionFor", jSONArray);
                            a.put("friendlyObstructionClass", ydVar.f55183b);
                            a.put("friendlyObstructionPurpose", ydVar.f55184c);
                            a.put("friendlyObstructionReason", ydVar.f55185d);
                        } catch (JSONException e3) {
                            Log.e("OMIDLIB", "Error with setting friendly obstruction", e3);
                        }
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mo46861a(view, ldVar, a, bVar, z || z3);
                }
                this.f55212b++;
            }
        }
    }

    /* renamed from: a */
    public void mo46860a() {
        if (f55208j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f55208j = handler;
            handler.post(f55209k);
            f55208j.postDelayed(f55210l, 200);
        }
    }
}
