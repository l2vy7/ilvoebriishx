package com.appnext.core;

import android.os.Handler;
import android.os.Looper;
import com.appnext.base.C3117a;
import com.appnext.core.C3180d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: com.appnext.core.a */
public final class C3164a {
    private ArrayList<?> ads = null;

    /* renamed from: cA */
    private String f12266cA = "";

    /* renamed from: cy */
    private Long f12267cy = 0L;
    /* access modifiers changed from: private */

    /* renamed from: cz */
    public ArrayList<C3180d.C3185a> f12268cz = new ArrayList<>();

    /* renamed from: m */
    private int f12269m = 0;
    private String placementID;

    /* renamed from: am */
    public final Long mo10737am() {
        return this.f12267cy;
    }

    /* renamed from: an */
    public final int mo10738an() {
        return this.f12269m;
    }

    /* renamed from: b */
    public final void mo10739b(int i) {
        this.f12269m = i;
    }

    /* renamed from: c */
    public final void mo10740c(ArrayList<?> arrayList) {
        mo10736a(arrayList, true);
    }

    public final ArrayList<?> getAds() {
        try {
            if (this.ads == null) {
                return null;
            }
            ArrayList<?> arrayList = new ArrayList<>();
            Iterator<?> it = this.ads.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    public final String getPlacementID() {
        return this.placementID;
    }

    /* renamed from: o */
    public final void mo10743o(String str) {
        this.f12266cA = str;
    }

    /* renamed from: p */
    public final synchronized void mo10744p(final String str) {
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    try {
                        synchronized (C3164a.this.f12268cz) {
                            ListIterator listIterator = C3164a.this.f12268cz.listIterator();
                            while (listIterator.hasNext()) {
                                ((C3180d.C3185a) listIterator.next()).error(str);
                                listIterator.remove();
                            }
                        }
                    } catch (Throwable th) {
                        C3117a.m10553a("AdContainer$notifyListenersError", th);
                    }
                }
            });
        } catch (Throwable th) {
            C3117a.m10553a("AdContainer$notifyListenersError", th);
        }
    }

    public final void setPlacementID(String str) {
        this.placementID = str;
    }

    /* renamed from: u */
    public final String mo10746u() {
        return this.f12266cA;
    }

    /* renamed from: a */
    public final void mo10735a(C3180d.C3185a aVar) {
        try {
            synchronized (this.f12268cz) {
                ListIterator<C3180d.C3185a> listIterator = this.f12268cz.listIterator();
                if (!(aVar == null || listIterator == null)) {
                    listIterator.add(aVar);
                }
            }
        } catch (Throwable th) {
            C3117a.m10553a("AdContainer$addListener", th);
        }
    }

    /* renamed from: a */
    public final void mo10736a(ArrayList<?> arrayList, boolean z) {
        this.ads = arrayList;
        if (z) {
            this.f12267cy = Long.valueOf(System.currentTimeMillis());
        }
    }
}
