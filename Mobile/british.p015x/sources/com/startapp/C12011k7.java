package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.sdk.omsdk.AdVerification;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.startapp.k7 */
/* compiled from: Sta */
public class C12011k7 {

    /* renamed from: a */
    public final C12039m f53200a;

    /* renamed from: b */
    public final C11974j f53201b;

    /* renamed from: c */
    public final C11780a6 f53202c;

    /* renamed from: d */
    public final AtomicBoolean f53203d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f53204e = new AtomicBoolean();

    public C12011k7(WebView webView) {
        C12039m b = C12118p.m52733b(webView);
        this.f53200a = b;
        webView.getContext();
        this.f53201b = C12118p.m52726a(b);
        this.f53202c = null;
    }

    /* renamed from: a */
    public void mo45499a() {
        C12039m mVar = this.f53200a;
        if (mVar != null) {
            C11972id idVar = (C11972id) mVar;
            if (!idVar.f53130g) {
                idVar.f53127d.clear();
                if (!idVar.f53130g) {
                    idVar.f53126c.clear();
                }
                idVar.f53130g = true;
                C11973ie.f53134a.mo45464a(idVar.f53128e.mo20421c(), "finishSession", new Object[0]);
                C11931gd gdVar = C11931gd.f53013c;
                boolean b = gdVar.mo45387b();
                gdVar.f53014a.remove(idVar);
                gdVar.f53015b.remove(idVar);
                if (b && !gdVar.mo45387b()) {
                    C12117oe a = C12117oe.m52725a();
                    a.getClass();
                    C12471za zaVar = C12471za.f55206h;
                    zaVar.getClass();
                    Handler handler = C12471za.f55208j;
                    if (handler != null) {
                        handler.removeCallbacks(C12471za.f55210l);
                        C12471za.f55208j = null;
                    }
                    zaVar.f55211a.clear();
                    C12471za.f55207i.post(new C11789ab(zaVar));
                    C12170rd rdVar = C12170rd.f54116d;
                    rdVar.f54117a = false;
                    rdVar.f54118b = false;
                    rdVar.f54119c = null;
                    C11932ge geVar = a.f53988d;
                    geVar.f53016a.getContentResolver().unregisterContentObserver(geVar);
                }
                idVar.f53128e.mo20419b();
                idVar.f53128e = null;
            }
        }
    }

    /* renamed from: b */
    public void mo45502b() {
        if (this.f53201b != null && this.f53203d.compareAndSet(false, true)) {
            C11974j jVar = this.f53201b;
            C12000je.m52521b(jVar.f53135a);
            C12000je.m52522c(jVar.f53135a);
            if (!jVar.f53135a.mo45460c()) {
                try {
                    jVar.f53135a.mo45457a();
                } catch (Exception unused) {
                }
            }
            if (jVar.f53135a.mo45460c()) {
                C11972id idVar = jVar.f53135a;
                if (!idVar.f53132i) {
                    C11973ie.f53134a.mo45464a(idVar.f53128e.mo20421c(), "publishImpressionEvent", new Object[0]);
                    idVar.f53132i = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
        }
    }

    /* renamed from: c */
    public boolean mo45503c() {
        return this.f53200a != null;
    }

    /* renamed from: d */
    public void mo45504d() {
        if (this.f53201b != null && this.f53204e.compareAndSet(false, true)) {
            C11974j jVar = this.f53201b;
            C12000je.m52518a(jVar.f53135a);
            C12000je.m52522c(jVar.f53135a);
            C11972id idVar = jVar.f53135a;
            if (!idVar.f53133j) {
                C11973ie.f53134a.mo45464a(idVar.f53128e.mo20421c(), "publishLoadedEvent", new Object[0]);
                idVar.f53133j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: e */
    public void mo45505e() {
        C12039m mVar = this.f53200a;
        if (mVar != null) {
            mVar.mo45457a();
        }
    }

    public C12011k7(Context context, AdVerification adVerification, boolean z) {
        C12039m b = C12118p.m52732b(context, adVerification, z);
        this.f53200a = b;
        this.f53201b = C12118p.m52726a(b);
        this.f53202c = z ? C12118p.m52731b(b) : null;
    }

    /* renamed from: a */
    public void mo45500a(View view) {
        C12039m mVar = this.f53200a;
        if (mVar != null) {
            C11972id idVar = (C11972id) mVar;
            if (!idVar.f53130g) {
                C12000je.m52519a((Object) view, "AdView is null");
                if (idVar.mo45459b() != view) {
                    idVar.f53127d = new C12116od(view);
                    idVar.f53128e.mo20413a();
                    Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(C11931gd.f53013c.f53014a);
                    if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                        for (T t : unmodifiableCollection) {
                            if (t != idVar && t.mo45459b() == view) {
                                t.f53127d.clear();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo45501a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        C12456yd ydVar;
        C12039m mVar = this.f53200a;
        if (mVar != null) {
            C11972id idVar = (C11972id) mVar;
            if (!idVar.f53130g) {
                if (view != null) {
                    Iterator<C12456yd> it = idVar.f53126c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ydVar = null;
                            break;
                        }
                        ydVar = it.next();
                        if (ydVar.f55182a.get() == view) {
                            break;
                        }
                    }
                    if (ydVar == null) {
                        idVar.f53126c.add(new C12456yd(view, friendlyObstructionPurpose, (String) null));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FriendlyObstruction is null");
            }
        }
    }
}
