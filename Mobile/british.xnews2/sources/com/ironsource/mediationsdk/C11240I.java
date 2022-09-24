package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.I */
public final class C11240I {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C11236G>> f50464a = new ConcurrentHashMap<>();

    /* renamed from: b */
    String f50465b = "";

    /* renamed from: c */
    private String f50466c = "";

    /* renamed from: d */
    C11236G f50467d;

    /* renamed from: e */
    private final List<String> f50468e;

    /* renamed from: f */
    private final int f50469f;

    /* renamed from: g */
    private final Timer f50470g = new Timer();

    /* renamed from: com.ironsource.mediationsdk.I$b */
    class C11241b extends TimerTask {

        /* renamed from: b */
        private /* synthetic */ String f50471b;

        C11241b(String str) {
            this.f50471b = str;
        }

        public final void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.info("removing waterfall with id " + this.f50471b + " from memory");
                C11240I.this.f50464a.remove(this.f50471b);
                ironLog.info("waterfall size is currently " + C11240I.this.f50464a.size());
            } finally {
                cancel();
            }
        }
    }

    public C11240I(List<String> list, int i) {
        this.f50468e = list;
        this.f50469f = i;
    }

    /* renamed from: c */
    private synchronized boolean m50207c() {
        C11236G g;
        g = this.f50467d;
        return g != null && g.f50448p.equals(this.f50466c);
    }

    /* renamed from: d */
    private void m50208d() {
        Iterator<C11236G> it = mo43816a().iterator();
        while (it.hasNext()) {
            C11261V next = it.next();
            if (!next.equals(this.f50467d)) {
                next.mo43876d();
            }
        }
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C11236G> mo43816a() {
        CopyOnWriteArrayList<C11236G> copyOnWriteArrayList = this.f50464a.get(this.f50465b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final synchronized void mo43817a(C11236G g) {
        IronLog.INTERNAL.verbose("");
        C11236G g2 = this.f50467d;
        if (g2 != null) {
            g2.mo43876d();
        }
        this.f50467d = g;
    }

    /* renamed from: a */
    public final void mo43818a(CopyOnWriteArrayList<C11236G> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("updating new  waterfall with id " + str);
        m50208d();
        this.f50464a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f50466c)) {
            if (m50207c()) {
                ironLog.info("ad from previous waterfall " + this.f50466c + " is still showing - the current waterfall " + this.f50465b + " will be deleted instead");
                String str2 = this.f50465b;
                this.f50465b = this.f50466c;
                this.f50466c = str2;
            }
            this.f50470g.schedule(new C11241b(this.f50466c), (long) this.f50469f);
        }
        this.f50466c = this.f50465b;
        this.f50465b = str;
    }

    /* renamed from: b */
    public final boolean mo43819b() {
        return this.f50464a.size() > 5;
    }

    /* renamed from: b */
    public final synchronized boolean mo43820b(C11236G g) {
        boolean z;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (g != null) {
            if (this.f50467d != null) {
                if (g.mo43791c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f50467d.mo43926k().equals(g.mo43926k())) {
                    if ((g.mo43791c() == LoadWhileShowSupportState.NONE || this.f50468e.contains(g.mo43927l())) && this.f50467d.mo43927l().equals(g.mo43927l())) {
                    }
                }
            }
            z = false;
            if (z && g != null) {
                ironLog.info(g.mo43926k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        ironLog.info(g.mo43926k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
