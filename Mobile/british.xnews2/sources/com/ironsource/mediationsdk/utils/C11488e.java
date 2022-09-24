package com.ironsource.mediationsdk.utils;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11347b;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.utils.e */
public final class C11488e {

    /* renamed from: a */
    public Map<String, Integer> f51559a;

    /* renamed from: b */
    private Map<String, Integer> f51560b;

    /* renamed from: c */
    public IronSourceLoggerManager f51561c;

    /* renamed from: d */
    private Map<String, String> f51562d;

    /* renamed from: e */
    private String f51563e;

    /* renamed from: f */
    private Timer f51564f = null;

    /* renamed from: g */
    C11487d f51565g;

    /* renamed from: com.ironsource.mediationsdk.utils.e$a */
    class C11489a extends TimerTask {
        C11489a() {
        }

        public final void run() {
            C11488e eVar = C11488e.this;
            synchronized (eVar) {
                try {
                    for (String b : eVar.f51559a.keySet()) {
                        eVar.mo44547b(b);
                    }
                    eVar.f51565g.mo44026g();
                    eVar.mo44545a();
                } catch (Exception e) {
                    eVar.f51561c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "onTimerTick", e);
                }
            }
        }
    }

    public C11488e(String str, C11487d dVar) {
        this.f51563e = str;
        this.f51565g = dVar;
        this.f51559a = new HashMap();
        this.f51560b = new HashMap();
        this.f51562d = new HashMap();
        this.f51561c = IronSourceLoggerManager.getLogger();
        mo44545a();
    }

    /* renamed from: c */
    private void m51257c(String str, int i) {
        this.f51560b.put(str, Integer.valueOf(i));
        this.f51562d.put(str, m51260f());
        IronSourceUtils.m51228o(ContextProvider.getInstance().getApplicationContext(), m51263i(str), i);
        IronSourceUtils.m51230q(ContextProvider.getInstance().getApplicationContext(), m51264j(str), m51260f());
    }

    /* renamed from: d */
    private int m51258d(String str) {
        if (!m51260f().equalsIgnoreCase(m51261g(str))) {
            mo44547b(str);
        }
        return m51262h(str);
    }

    /* renamed from: e */
    private static Date m51259e() {
        Random random = new Random();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, random.nextInt(10));
        gregorianCalendar.set(13, random.nextInt(60));
        gregorianCalendar.set(14, random.nextInt(1000));
        gregorianCalendar.add(5, 1);
        return gregorianCalendar.getTime();
    }

    /* renamed from: f */
    private static String m51260f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: g */
    private String m51261g(String str) {
        if (this.f51562d.containsKey(str)) {
            return this.f51562d.get(str);
        }
        String l = IronSourceUtils.m51225l(ContextProvider.getInstance().getApplicationContext(), m51264j(str), m51260f());
        this.f51562d.put(str, l);
        return l;
    }

    /* renamed from: h */
    private int m51262h(String str) {
        if (this.f51560b.containsKey(str)) {
            return this.f51560b.get(str).intValue();
        }
        int i = IronSourceUtils.m51222i(ContextProvider.getInstance().getApplicationContext(), m51263i(str), 0);
        this.f51560b.put(str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: i */
    private static String m51263i(String str) {
        return str + "_counter";
    }

    /* renamed from: j */
    private static String m51264j(String str) {
        return str + "_day";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44545a() {
        Timer timer = this.f51564f;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f51564f = timer2;
        timer2.schedule(new C11489a(), m51259e());
    }

    /* renamed from: a */
    public final void mo44546a(C11347b bVar) {
        synchronized (this) {
            try {
                String d = mo44550d(bVar);
                if (this.f51559a.containsKey(d)) {
                    m51257c(d, m51258d(d) + 1);
                }
            } catch (Exception e) {
                this.f51561c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "increaseShowCounter", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo44547b(String str) {
        this.f51560b.put(str, 0);
        this.f51562d.put(str, m51260f());
        IronSourceUtils.m51228o(ContextProvider.getInstance().getApplicationContext(), m51263i(str), 0);
        IronSourceUtils.m51230q(ContextProvider.getInstance().getApplicationContext(), m51264j(str), m51260f());
    }

    /* renamed from: b */
    public final boolean mo44548b(C11347b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo44550d(bVar);
                if (!this.f51559a.containsKey(d)) {
                    return false;
                }
                if (m51260f().equalsIgnoreCase(m51261g(d))) {
                    return false;
                }
                if (this.f51559a.get(d).intValue() <= m51262h(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f51561c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "shouldSendCapReleasedEvent", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo44549c(C11347b bVar) {
        synchronized (this) {
            boolean z = false;
            try {
                String d = mo44550d(bVar);
                if (!this.f51559a.containsKey(d)) {
                    return false;
                }
                if (this.f51559a.get(d).intValue() <= m51258d(d)) {
                    z = true;
                }
                return z;
            } catch (Exception e) {
                this.f51561c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "isCapped", e);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public String mo44550d(C11347b bVar) {
        return this.f51563e + "_" + bVar.f50934f + "_" + bVar.mo44185j();
    }
}
