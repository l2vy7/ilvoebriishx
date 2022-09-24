package com.adcolony.sdk;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.adcolony.sdk.ADCFunction;
import com.adcolony.sdk.C2788h0;
import com.adcolony.sdk.C2838l;
import com.adcolony.sdk.C2978z;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.s */
class C2912s {

    /* renamed from: f */
    private static C2912s f11739f = null;

    /* renamed from: g */
    private static final String f11740g = "adc_events_db";

    /* renamed from: a */
    private final Executor f11741a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private SQLiteDatabase f11742b;

    /* renamed from: c */
    private boolean f11743c = false;

    /* renamed from: d */
    private C2915c f11744d;

    /* renamed from: e */
    private Set<String> f11745e = new HashSet();

    /* renamed from: com.adcolony.sdk.s$a */
    class C2913a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f11746a;

        /* renamed from: b */
        final /* synthetic */ ADCFunction.Consumer f11747b;

        /* renamed from: c */
        final /* synthetic */ Context f11748c;

        C2913a(JSONObject jSONObject, ADCFunction.Consumer consumer, Context context) {
            this.f11746a = jSONObject;
            this.f11747b = consumer;
            this.f11748c = context;
        }

        public void run() {
            C2788h0 a = C2788h0.m9600a(this.f11746a);
            if (a != null) {
                C2912s.this.m10034a(a, (ADCFunction.Consumer<C2788h0>) this.f11747b, this.f11748c);
            }
        }
    }

    /* renamed from: com.adcolony.sdk.s$b */
    class C2914b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11750a;

        /* renamed from: b */
        final /* synthetic */ ContentValues f11751b;

        C2914b(String str, ContentValues contentValues) {
            this.f11750a = str;
            this.f11751b = contentValues;
        }

        public void run() {
            C2912s.this.m10039b(this.f11750a, this.f11751b);
        }
    }

    /* renamed from: com.adcolony.sdk.s$c */
    interface C2915c {
        /* renamed from: a */
        void mo9745a();
    }

    C2912s() {
    }

    /* renamed from: b */
    public static C2912s m10038b() {
        if (f11739f == null) {
            synchronized (C2912s.class) {
                if (f11739f == null) {
                    f11739f = new C2912s();
                }
            }
        }
        return f11739f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9975c() {
        this.f11745e.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9972a(C2915c cVar) {
        this.f11744d = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9974a(JSONObject jSONObject, ADCFunction.Consumer<C2788h0> consumer) {
        Context applicationContext = C2684a.m9410d() ? C2684a.m9407b().getApplicationContext() : null;
        if (applicationContext != null && jSONObject != null) {
            try {
                this.f11741a.execute(new C2913a(jSONObject, consumer, applicationContext));
            } catch (RejectedExecutionException e) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a("ADCEventsRepository.open failed with: " + e.toString()).mo10090a(C2978z.f11950j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m10039b(String str, ContentValues contentValues) {
        C2845m.m9830a(str, contentValues, this.f11742b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m10034a(C2788h0 h0Var, ADCFunction.Consumer<C2788h0> consumer, Context context) {
        try {
            SQLiteDatabase sQLiteDatabase = this.f11742b;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                this.f11742b = context.openOrCreateDatabase(f11740g, 0, (SQLiteDatabase.CursorFactory) null);
            }
            if (this.f11742b.needUpgrade(h0Var.mo9672b())) {
                boolean a = m10037a(h0Var);
                this.f11743c = a;
                if (a) {
                    this.f11744d.mo9745a();
                }
            } else {
                this.f11743c = true;
            }
            if (this.f11743c) {
                consumer.accept(h0Var);
            }
        } catch (SQLiteException e) {
            new C2978z.C2979a().mo10088a("Database cannot be opened").mo10088a(e.toString()).mo10090a(C2978z.f11948h);
        }
        return;
    }

    /* renamed from: a */
    private boolean m10037a(C2788h0 h0Var) {
        return new C2833k(this.f11742b, h0Var).mo9785b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9971a(C2788h0.C2789a aVar, ContentValues contentValues) {
        String str;
        if (aVar != null && !this.f11745e.contains(aVar.mo9681h())) {
            this.f11745e.add(aVar.mo9681h());
            int d = aVar.mo9677d();
            long j = -1;
            C2788h0.C2793d i = aVar.mo9682i();
            if (i != null) {
                j = contentValues.getAsLong(i.mo9688a()).longValue() - i.mo9689b();
                str = i.mo9688a();
            } else {
                str = null;
            }
            C2845m.m9829a(d, j, str, aVar.mo9681h(), this.f11742b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9973a(String str, ContentValues contentValues) {
        if (this.f11743c) {
            try {
                this.f11741a.execute(new C2914b(str, contentValues));
            } catch (RejectedExecutionException e) {
                C2978z.C2979a aVar = new C2978z.C2979a();
                aVar.mo10088a("ADCEventsRepository.saveEvent failed with: " + e.toString()).mo10090a(C2978z.f11950j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2838l.C2840b mo9969a(C2788h0 h0Var, long j) {
        if (this.f11743c) {
            return C2838l.m9804a(h0Var, this.f11742b, this.f11741a, j);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo9970a() {
        this.f11743c = false;
        this.f11742b.close();
    }
}
