package com.facebook.internal;

import android.content.Intent;
import com.facebook.C3448e;
import com.facebook.C3642m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.d */
/* compiled from: CallbackManagerImpl */
public final class C3474d implements C3448e {

    /* renamed from: b */
    private static Map<Integer, C3475a> f13033b = new HashMap();

    /* renamed from: a */
    private Map<Integer, C3475a> f13034a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    /* compiled from: CallbackManagerImpl */
    public interface C3475a {
        /* renamed from: a */
        boolean mo11930a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    /* compiled from: CallbackManagerImpl */
    public enum C3476b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        

        /* renamed from: b */
        private final int f13045b;

        private C3476b(int i) {
            this.f13045b = i;
        }

        /* renamed from: d */
        public int mo11931d() {
            return C3642m.m12285k() + this.f13045b;
        }
    }

    /* renamed from: a */
    private static synchronized C3475a m11578a(Integer num) {
        C3475a aVar;
        synchronized (C3474d.class) {
            aVar = f13033b.get(num);
        }
        return aVar;
    }

    /* renamed from: c */
    public static synchronized void m11579c(int i, C3475a aVar) {
        synchronized (C3474d.class) {
            C3489g0.m11687i(aVar, "callback");
            if (!f13033b.containsKey(Integer.valueOf(i))) {
                f13033b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: d */
    private static boolean m11580d(int i, int i2, Intent intent) {
        C3475a a = m11578a(Integer.valueOf(i));
        if (a != null) {
            return a.mo11930a(i2, intent);
        }
        return false;
    }

    /* renamed from: b */
    public void mo11929b(int i, C3475a aVar) {
        C3489g0.m11687i(aVar, "callback");
        this.f13034a.put(Integer.valueOf(i), aVar);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        C3475a aVar = this.f13034a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo11930a(i2, intent);
        }
        return m11580d(i, i2, intent);
    }
}
