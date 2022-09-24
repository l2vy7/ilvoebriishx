package com.startapp;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyDataConfig;
import com.startapp.sdk.adsbase.remoteconfig.TelephonyMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.startapp.ma */
/* compiled from: Sta */
public class C12052ma {

    /* renamed from: a */
    public final Context f53282a;

    /* renamed from: b */
    public final C12071n3 f53283b;

    /* renamed from: c */
    public final C5069e f53284c;

    /* renamed from: d */
    public final C5001b2 f53285d;

    /* renamed from: e */
    public final C12462z2<TelephonyMetadata> f53286e;

    /* renamed from: f */
    public C12056c f53287f;

    /* renamed from: g */
    public final double f53288g = Math.random();

    /* renamed from: h */
    public volatile String f53289h = "e106";

    /* renamed from: com.startapp.ma$a */
    /* compiled from: Sta */
    public class C12053a implements Runnable {
        public C12053a() {
        }

        public void run() {
            C12052ma maVar = C12052ma.this;
            maVar.getClass();
            try {
                if (maVar.mo45542a() != null) {
                    C12056c a = maVar.mo45541a((Class<?>) SignalStrength.class);
                    if (a != null) {
                        a.mo45548a();
                    }
                }
            } catch (Throwable th) {
                if (maVar.mo45545a(8)) {
                    C5004d4.m22887a(th);
                }
            }
        }
    }

    /* renamed from: com.startapp.ma$b */
    /* compiled from: Sta */
    public class C12054b extends C12056c {

        /* renamed from: d */
        public final TelephonyCallback f53291d = new C12055a();

        /* renamed from: com.startapp.ma$b$a */
        /* compiled from: Sta */
        public class C12055a extends TelephonyCallback implements TelephonyCallback.ServiceStateListener, TelephonyCallback.SignalStrengthsListener {
            public C12055a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                C12054b.this.mo45552a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                C12052ma.this.mo45544a(signalStrength);
                C12054b.this.mo45552a(SignalStrength.class, signalStrength);
            }
        }

        public C12054b(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        /* renamed from: a */
        public void mo45548a() {
            this.f53294a.registerTelephonyCallback(C12052ma.this.f53283b, this.f53291d);
        }

        /* renamed from: b */
        public void mo45549b() {
            this.f53294a.unregisterTelephonyCallback(this.f53291d);
        }
    }

    /* renamed from: com.startapp.ma$c */
    /* compiled from: Sta */
    public abstract class C12056c {

        /* renamed from: a */
        public final TelephonyManager f53294a;

        /* renamed from: b */
        public final Class<?> f53295b;

        public C12056c(TelephonyManager telephonyManager, Class<?> cls) {
            this.f53294a = telephonyManager;
            this.f53295b = cls;
        }

        /* renamed from: a */
        public abstract void mo45548a();

        /* renamed from: a */
        public <T> void mo45552a(Class<T> cls, T t) {
            C12052ma maVar = C12052ma.this;
            maVar.getClass();
            try {
                TelephonyMetadata a = maVar.mo45542a();
                if (a != null) {
                    if (t != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        String simpleName = cls.getSimpleName();
                        if (a.mo46429a(simpleName).mo46425c()) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("timestamp", currentTimeMillis);
                            jSONObject.put(SessionDescription.ATTR_TYPE, simpleName);
                            jSONObject.put("data", t.toString());
                            String c = C5015nb.m22932c(jSONObject.toString());
                            C5069e.C5070a a2 = maVar.f53284c.edit();
                            a2.mo21101a(simpleName, c);
                            a2.f22385a.putString(simpleName, c);
                            a2.apply();
                        }
                    }
                }
            } catch (Throwable th) {
                if (maVar.mo45545a(2)) {
                    C5004d4.m22887a(th);
                }
            }
            if (cls.equals(this.f53295b)) {
                try {
                    mo45549b();
                } catch (Throwable th2) {
                    if (C12052ma.this.mo45545a(16)) {
                        C5004d4.m22887a(th2);
                    }
                }
            }
        }

        /* renamed from: b */
        public abstract void mo45549b();
    }

    /* renamed from: com.startapp.ma$d */
    /* compiled from: Sta */
    public class C12057d extends C12056c {

        /* renamed from: d */
        public final PhoneStateListener f53297d = new C12058a();

        /* renamed from: com.startapp.ma$d$a */
        /* compiled from: Sta */
        public class C12058a extends PhoneStateListener {
            public C12058a() {
            }

            public void onServiceStateChanged(ServiceState serviceState) {
                C12057d.this.mo45552a(ServiceState.class, serviceState);
            }

            public void onSignalStrengthsChanged(SignalStrength signalStrength) {
                C12052ma.this.mo45544a(signalStrength);
                C12057d.this.mo45552a(SignalStrength.class, signalStrength);
            }
        }

        public C12057d(TelephonyManager telephonyManager, Class<?> cls) {
            super(telephonyManager, cls);
        }

        /* renamed from: a */
        public void mo45548a() {
            this.f53294a.listen(this.f53297d, TsExtractor.TS_STREAM_TYPE_AIT);
        }

        /* renamed from: b */
        public void mo45549b() {
            this.f53294a.listen(this.f53297d, 0);
        }
    }

    public C12052ma(Context context, C12071n3 n3Var, C5069e eVar, C5001b2 b2Var, C12462z2<TelephonyMetadata> z2Var) {
        this.f53282a = context;
        this.f53283b = n3Var;
        this.f53284c = eVar;
        this.f53285d = b2Var;
        this.f53286e = z2Var;
    }

    /* renamed from: a */
    public final C12056c mo45541a(Class<?> cls) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f53282a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return new C12057d(telephonyManager, cls);
        }
        return new C12054b(telephonyManager, cls);
    }

    /* renamed from: b */
    public void mo45546b() {
        this.f53283b.execute(new C12053a());
    }

    /* renamed from: a */
    public final TelephonyMetadata mo45542a() {
        TelephonyMetadata call;
        if (!this.f53285d.mo20655c() || (call = this.f53286e.call()) == null || !call.mo46431c()) {
            return null;
        }
        return call;
    }

    /* renamed from: a */
    public boolean mo45545a(int i) {
        TelephonyMetadata a = mo45542a();
        if (a == null || this.f53288g >= a.mo46430b() || (a.mo46428a() & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo45544a(SignalStrength signalStrength) {
        if (signalStrength != null) {
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f53289h = String.valueOf(signalStrength.getLevel());
                } else {
                    this.f53289h = String.valueOf(SignalStrength.class.getMethod("getLevel", new Class[0]).invoke(signalStrength, new Object[0]));
                }
            } catch (NoSuchMethodException unused) {
                this.f53289h = "e104";
            } catch (Throwable unused2) {
                this.f53289h = "e105";
            }
        }
    }

    /* renamed from: a */
    public Map<String, String> mo45543a(C11882e4 e4Var) {
        List<String> a;
        TelephonyMetadata a2 = mo45542a();
        if (a2 == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = null;
        for (Map.Entry next : this.f53284c.getAll().entrySet()) {
            Object value = next.getValue();
            if (value instanceof String) {
                String str = (String) next.getKey();
                TelephonyDataConfig a3 = a2.mo46429a(str);
                if (a3.mo46425c() && (a = a3.mo46423a()) != null && a.contains(e4Var.f52899a)) {
                    String b = a3.mo46424b();
                    if (b != null) {
                        str = b;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, (String) value);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }
}
