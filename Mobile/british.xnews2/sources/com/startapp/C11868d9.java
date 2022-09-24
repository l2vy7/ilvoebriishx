package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.C5055a;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.startapp.d9 */
/* compiled from: Sta */
public class C11868d9 {

    /* renamed from: k */
    public static final boolean f52858k = MetaData.f22407k.mo21179U();

    /* renamed from: a */
    public Handler f52859a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public long f52860b;

    /* renamed from: c */
    public Context f52861c;

    /* renamed from: d */
    public long f52862d;

    /* renamed from: e */
    public boolean f52863e;

    /* renamed from: f */
    public boolean f52864f;

    /* renamed from: g */
    public String[] f52865g;

    /* renamed from: h */
    public TrackingParams f52866h;

    /* renamed from: i */
    public AtomicBoolean f52867i = new AtomicBoolean(false);

    /* renamed from: j */
    public WeakReference<C11869a> f52868j = new WeakReference<>((Object) null);

    /* renamed from: com.startapp.d9$a */
    /* compiled from: Sta */
    public interface C11869a {
        void onSent(String str);
    }

    public C11868d9(Context context, String[] strArr, TrackingParams trackingParams, long j) {
        this.f52861c = C5009h0.m22893b(context);
        this.f52865g = strArr;
        this.f52866h = trackingParams;
        this.f52860b = j;
    }

    /* renamed from: a */
    public void mo45302a() {
        if (this.f52863e && this.f52864f) {
            this.f52859a.removeCallbacksAndMessages((Object) null);
            this.f52860b -= System.currentTimeMillis() - this.f52862d;
            this.f52864f = false;
        }
    }

    /* renamed from: b */
    public void mo45304b() {
        if (this.f52867i.get()) {
            return;
        }
        if (f52858k) {
            long j = this.f52860b;
            if (!this.f52864f) {
                this.f52864f = true;
                if (!this.f52863e) {
                    this.f52863e = true;
                }
                this.f52862d = System.currentTimeMillis();
                this.f52859a.postDelayed(new C11826c9(this), j);
                return;
            }
            return;
        }
        mo45305b((String) null, (JSONObject) null);
    }

    /* renamed from: a */
    public void mo45303a(String str, JSONObject jSONObject) {
        mo45305b(str, jSONObject);
        this.f52863e = false;
        this.f52859a.removeCallbacksAndMessages((Object) null);
        this.f52864f = false;
        this.f52862d = 0;
    }

    /* renamed from: b */
    public void mo45305b(String str, JSONObject jSONObject) {
        if (!this.f52867i.compareAndSet(false, true)) {
            return;
        }
        if (str == null) {
            Context context = this.f52861c;
            String[] strArr = this.f52865g;
            TrackingParams trackingParams = this.f52866h;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2 != null && !str2.equalsIgnoreCase("")) {
                        C5015nb.m22915a(context, 4, "Sending impression", true);
                        C5055a.m23163b(context, str2, trackingParams);
                    }
                }
            }
            C11869a aVar = (C11869a) this.f52868j.get();
            if (aVar != null) {
                String[] strArr2 = this.f52865g;
                String str3 = null;
                if (strArr2 != null && strArr2.length > 0) {
                    str3 = C5055a.m23143a(strArr2[0], (String) null);
                }
                aVar.onSent(str3);
                return;
            }
            return;
        }
        C5055a.m23151a(this.f52861c, this.f52865g, this.f52866h.mo46183a(), 0, str, jSONObject);
    }
}
