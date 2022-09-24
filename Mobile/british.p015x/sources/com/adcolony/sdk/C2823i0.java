package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.C2788h0;
import com.adcolony.sdk.C2838l;
import com.adcolony.sdk.C2978z;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.i0 */
class C2823i0 {

    /* renamed from: e */
    static final String f11467e = "payload";

    /* renamed from: f */
    static final String f11468f = "request_type";

    /* renamed from: g */
    private static C2823i0 f11469g;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C2788h0 f11470a;

    /* renamed from: b */
    private final Executor f11471b = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2838l.C2840b f11472c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f11473d = false;

    /* renamed from: com.adcolony.sdk.i0$a */
    class C2824a implements ADCFunction.Consumer<C2838l.C2840b> {

        /* renamed from: a */
        final /* synthetic */ C2838l.C2840b[] f11474a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f11475b;

        C2824a(C2838l.C2840b[] bVarArr, CountDownLatch countDownLatch) {
            this.f11474a = bVarArr;
            this.f11475b = countDownLatch;
        }

        /* renamed from: a */
        public void accept(C2838l.C2840b bVar) {
            this.f11474a[0] = bVar;
            this.f11475b.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.i0$b */
    class C2825b implements ADCFunction.Consumer<C2838l.C2840b> {
        C2825b() {
        }

        /* renamed from: a */
        public void accept(C2838l.C2840b bVar) {
        }
    }

    /* renamed from: com.adcolony.sdk.i0$c */
    class C2826c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ADCFunction.Consumer f11478a;

        /* renamed from: b */
        final /* synthetic */ long f11479b;

        C2826c(ADCFunction.Consumer consumer, long j) {
            this.f11478a = consumer;
            this.f11479b = j;
        }

        public void run() {
            this.f11478a.accept(C2823i0.this.f11473d ? C2823i0.this.f11472c : C2912s.m10038b().mo9969a(C2823i0.this.f11470a, this.f11479b));
        }
    }

    C2823i0() {
    }

    /* renamed from: d */
    static C2823i0 m9743d() {
        if (f11469g == null) {
            synchronized (C2823i0.class) {
                if (f11469g == null) {
                    f11469g = new C2823i0();
                }
            }
        }
        return f11469g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9768e() {
        this.f11473d = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9764a(C2788h0 h0Var) {
        this.f11470a = h0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2838l.C2840b mo9766b() {
        return mo9759a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2838l.C2840b mo9767c() {
        return this.f11472c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r0 = r3.optString(f11468f);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9763a(com.adcolony.sdk.C2714c0 r3) {
        /*
            r2 = this;
            com.adcolony.sdk.h0 r0 = r2.f11470a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            org.json.JSONObject r3 = r3.mo9608b()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r0 = "payload"
            org.json.JSONObject r3 = r3.optJSONObject(r0)
            if (r3 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r0 = "request_type"
            java.lang.String r0 = r3.optString(r0)
            com.adcolony.sdk.h0 r1 = r2.f11470a
            com.adcolony.sdk.h0$a r1 = r1.mo9673b(r0)
            if (r1 == 0) goto L_0x0026
            r2.m9739a(r0, r3, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2823i0.mo9763a(com.adcolony.sdk.c0):void");
    }

    /* renamed from: a */
    private void m9739a(String str, JSONObject jSONObject, C2788h0.C2789a aVar) {
        try {
            ContentValues a = m9738a(jSONObject, aVar);
            C2912s.m10038b().mo9973a(aVar.mo9681h(), a);
            C2912s.m10038b().mo9971a(aVar, a);
            mo9768e();
        } catch (NullPointerException | NumberFormatException | JSONException e) {
            e.printStackTrace();
            C2978z.C2979a aVar2 = new C2978z.C2979a();
            C2978z.C2979a a2 = aVar2.mo10088a("Error parsing event:" + str + " ").mo10088a(jSONObject.toString());
            a2.mo10088a("Schema version: " + this.f11470a.mo9672b() + " ").mo10088a(" e: ").mo10088a(e.toString()).mo10090a(C2978z.f11948h);
        }
    }

    /* renamed from: a */
    static ContentValues m9738a(JSONObject jSONObject, C2788h0.C2789a aVar) throws JSONException, NumberFormatException, NullPointerException {
        ContentValues contentValues = new ContentValues();
        for (C2788h0.C2790b next : aVar.mo9674a()) {
            if (jSONObject.has(next.mo9684b())) {
                Object obj = jSONObject.get(next.mo9684b());
                if (obj instanceof Boolean) {
                    contentValues.put(next.mo9684b(), (Boolean) obj);
                } else if (obj instanceof Long) {
                    contentValues.put(next.mo9684b(), (Long) obj);
                } else if (obj instanceof Double) {
                    contentValues.put(next.mo9684b(), (Double) obj);
                } else if (obj instanceof Number) {
                    Number number = (Number) obj;
                    if (number.doubleValue() != ((double) number.longValue()) || !"INTEGER".equalsIgnoreCase(next.mo9685c())) {
                        contentValues.put(next.mo9684b(), Double.valueOf(number.doubleValue()));
                    } else {
                        contentValues.put(next.mo9684b(), Long.valueOf(number.longValue()));
                    }
                } else if (obj instanceof String) {
                    contentValues.put(next.mo9684b(), (String) obj);
                }
            }
        }
        return contentValues;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2838l.C2840b mo9759a(long j) {
        C2838l.C2840b[] bVarArr = new C2838l.C2840b[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo9762a((ADCFunction.Consumer<C2838l.C2840b>) new C2824a(bVarArr, countDownLatch), j);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return bVarArr[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9760a() {
        mo9761a((ADCFunction.Consumer<C2838l.C2840b>) new C2825b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9761a(ADCFunction.Consumer<C2838l.C2840b> consumer) {
        mo9762a(consumer, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9762a(ADCFunction.Consumer<C2838l.C2840b> consumer, long j) {
        if (this.f11470a == null) {
            consumer.accept(null);
        } else if (this.f11473d) {
            consumer.accept(this.f11472c);
        } else {
            try {
                this.f11471b.execute(new C2826c(consumer, j));
            } catch (RejectedExecutionException e) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a("ADCOdtEventsListener.calculateFeatureVectors failed with: " + e.toString()).mo10090a(C2978z.f11950j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9765a(C2838l.C2840b bVar) {
        this.f11472c = bVar;
        this.f11473d = true;
    }
}
