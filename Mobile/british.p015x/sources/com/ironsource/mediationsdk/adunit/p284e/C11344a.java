package com.ironsource.mediationsdk.adunit.p284e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.p279c.p281b.C11325a;
import com.ironsource.mediationsdk.adunit.p282d.p283a.C11340c;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.adunit.e.a */
public final class C11344a<Smash extends C11340c<?>> {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f50918a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public String f50919b = "";

    /* renamed from: c */
    private String f50920c = "";

    /* renamed from: d */
    private C11340c<?> f50921d;

    /* renamed from: e */
    private final List<String> f50922e;

    /* renamed from: f */
    private final int f50923f;

    /* renamed from: g */
    private final Timer f50924g = new Timer();

    /* renamed from: h */
    private C11346b f50925h;

    /* renamed from: i */
    private final int f50926i = 5;

    /* renamed from: com.ironsource.mediationsdk.adunit.e.a$a */
    class C11345a extends TimerTask {

        /* renamed from: b */
        private /* synthetic */ String f50927b;

        C11345a(String str) {
            this.f50927b = str;
        }

        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.info("removing waterfall with id " + this.f50927b + " from memory");
                C11344a.this.f50918a.remove(this.f50927b);
                ironLog.info("waterfall size is currently " + C11344a.this.f50918a.size());
            } finally {
                cancel();
            }
        }
    }

    public C11344a(List<String> list, int i, C11346b bVar) {
        this.f50922e = list;
        this.f50923f = i;
        this.f50925h = bVar;
    }

    /* renamed from: b */
    private synchronized void m50693b() {
        C11340c<?> cVar = this.f50921d;
        if (cVar != null) {
            cVar.mo44169o();
        }
    }

    /* renamed from: c */
    private synchronized boolean m50694c() {
        C11340c<?> cVar;
        cVar = this.f50921d;
        return cVar != null && cVar.mo44170p() && this.f50921d.mo44168n().equals(this.f50920c);
    }

    /* renamed from: d */
    private void m50695d() {
        Iterator it = mo44172a().iterator();
        while (it.hasNext()) {
            C11340c cVar = (C11340c) it.next();
            if (!cVar.equals(this.f50921d)) {
                cVar.mo44169o();
            }
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<Smash> mo44172a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f50918a.get(this.f50919b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final void mo44173a(C11325a.C11326a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("updating new  waterfall with id " + str);
        m50695d();
        if (aVar == C11325a.C11326a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f50918a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f50920c)) {
                if (m50694c()) {
                    ironLog.info("ad from previous waterfall " + this.f50920c + " is still showing - the current waterfall " + this.f50919b + " will be deleted instead");
                    String str2 = this.f50919b;
                    this.f50919b = this.f50920c;
                    this.f50920c = str2;
                }
                this.f50924g.schedule(new C11345a(this.f50920c), (long) this.f50923f);
            }
        } else {
            this.f50918a.clear();
            this.f50918a.put(str, copyOnWriteArrayList);
        }
        this.f50920c = this.f50919b;
        this.f50919b = str;
        if (this.f50918a.size() > 5) {
            this.f50925h.mo44139a(this.f50918a.size());
        }
    }

    /* renamed from: a */
    public final synchronized void mo44174a(C11340c<?> cVar) {
        m50693b();
        this.f50921d = cVar;
    }

    /* renamed from: a */
    public final synchronized boolean mo44175a(C11325a.C11326a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState) {
        boolean z;
        z = true;
        if (aVar == C11325a.C11326a.AUTOMATIC_LOAD_WHILE_SHOW) {
            C11340c<?> cVar = this.f50921d;
            if (cVar != null) {
                if (cVar.mo44170p()) {
                    if ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f50921d.mo43926k().equals(str)) || loadWhileShowSupportState == LoadWhileShowSupportState.NONE || (this.f50922e.contains(str2) && this.f50921d.mo44167m().equals(str2))) {
                        z = false;
                    }
                }
            }
        }
        if (!z) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.info(str + " does not support load while show and will not be added to the auction request");
        }
        return z;
    }
}
