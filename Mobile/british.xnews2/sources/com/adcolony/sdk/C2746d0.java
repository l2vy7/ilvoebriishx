package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.adcolony.sdk.C2978z;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.adcolony.sdk.d0 */
class C2746d0 {

    /* renamed from: a */
    private ArrayList<C2784f0> f10738a = new ArrayList<>();

    /* renamed from: b */
    private HashMap<Integer, C2784f0> f10739b = new HashMap<>();

    /* renamed from: c */
    private int f10740c = 2;

    /* renamed from: d */
    private HashMap<String, ArrayList<C2750e0>> f10741d = new HashMap<>();

    /* renamed from: e */
    private JSONArray f10742e = C2976x.m10301a();

    /* renamed from: f */
    private int f10743f = 1;

    /* renamed from: com.adcolony.sdk.d0$a */
    class C2747a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f10744a;

        C2747a(Context context) {
            this.f10744a = context;
        }

        public void run() {
            JSONObject b = C2684a.m9409c().mo9733t().mo9413b();
            JSONObject b2 = C2976x.m10319b();
            C2976x.m10313a(b, "os_name", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            C2976x.m10313a(b2, "filepath", C2684a.m9409c().mo9738y().mo9905a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C2976x.m10315a(b2, "info", b);
            C2976x.m10323b(b2, "m_origin", 0);
            C2976x.m10323b(b2, "m_id", C2746d0.m9575a(C2746d0.this));
            C2976x.m10313a(b2, "m_type", "Controller.create");
            try {
                new C2951u0(this.f10744a, 1, false).mo10031a(true, new C2714c0(b2));
            } catch (RuntimeException e) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a(e.toString() + ": during WebView initialization.").mo10088a(" Disabling AdColony.").mo10090a(C2978z.f11949i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.d0$b */
    class C2748b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f10746a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f10747b;

        C2748b(String str, JSONObject jSONObject) {
            this.f10746a = str;
            this.f10747b = jSONObject;
        }

        public void run() {
            C2746d0.this.mo9647a(this.f10746a, this.f10747b);
        }
    }

    C2746d0() {
    }

    /* renamed from: a */
    static /* synthetic */ int m9575a(C2746d0 d0Var) {
        int i = d0Var.f10743f;
        d0Var.f10743f = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9650b(String str, C2750e0 e0Var) {
        synchronized (this.f10741d) {
            ArrayList arrayList = this.f10741d.get(str);
            if (arrayList != null) {
                arrayList.remove(e0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public HashMap<Integer, C2784f0> mo9651c() {
        return this.f10739b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo9652d() {
        int i = this.f10740c;
        this.f10740c = i + 1;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo9653e() {
        synchronized (this.f10738a) {
            for (int size = this.f10738a.size() - 1; size >= 0; size--) {
                this.f10738a.get(size).mo9659a();
            }
        }
        JSONArray jSONArray = null;
        if (this.f10742e.length() > 0) {
            jSONArray = this.f10742e;
            this.f10742e = C2976x.m10301a();
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("m_type");
                    if (jSONObject.getInt("m_origin") >= 2) {
                        C2916s0.m10063a((Runnable) new C2748b(string, jSONObject));
                    } else {
                        mo9647a(string, jSONObject);
                    }
                } catch (JSONException e) {
                    new C2978z.C2979a().mo10088a("JSON error from message dispatcher's updateModules(): ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9646a(String str, C2750e0 e0Var) {
        ArrayList arrayList = this.f10741d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10741d.put(str, arrayList);
        }
        arrayList.add(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<C2784f0> mo9649b() {
        return this.f10738a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9645a() {
        Context b;
        C2794i c = C2684a.m9409c();
        if (!c.mo9693D() && !c.mo9694E() && (b = C2684a.m9407b()) != null) {
            C2916s0.m10063a((Runnable) new C2747a(b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2784f0 mo9644a(C2784f0 f0Var) {
        synchronized (this.f10738a) {
            int c = f0Var.mo9662c();
            if (c <= 0) {
                c = f0Var.mo9663d();
            }
            this.f10738a.add(f0Var);
            this.f10739b.put(Integer.valueOf(c), f0Var);
        }
        return f0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2784f0 mo9643a(int i) {
        synchronized (this.f10738a) {
            C2784f0 f0Var = this.f10739b.get(Integer.valueOf(i));
            if (f0Var == null) {
                return null;
            }
            this.f10738a.remove(f0Var);
            this.f10739b.remove(Integer.valueOf(i));
            f0Var.mo9661b();
            return f0Var;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9647a(String str, JSONObject jSONObject) {
        synchronized (this.f10741d) {
            ArrayList arrayList = this.f10741d.get(str);
            if (arrayList != null) {
                C2714c0 c0Var = new C2714c0(jSONObject);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((C2750e0) it.next()).mo9550a(c0Var);
                    } catch (RuntimeException e) {
                        new C2978z.C2979a().mo10087a((Object) e).mo10090a(C2978z.f11950j);
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9648a(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("m_id")) {
                int i = this.f10743f;
                this.f10743f = i + 1;
                jSONObject.put("m_id", i);
            }
            if (!jSONObject.has("m_origin")) {
                jSONObject.put("m_origin", 0);
            }
            int i2 = jSONObject.getInt("m_target");
            if (i2 == 0) {
                synchronized (this) {
                    this.f10742e.put(jSONObject);
                }
                return;
            }
            C2784f0 f0Var = this.f10739b.get(Integer.valueOf(i2));
            if (f0Var != null) {
                f0Var.mo9660a(jSONObject);
            }
        } catch (JSONException e) {
            new C2978z.C2979a().mo10088a("JSON error in ADCMessageDispatcher's sendMessage(): ").mo10088a(e.toString()).mo10090a(C2978z.f11950j);
        }
    }
}
