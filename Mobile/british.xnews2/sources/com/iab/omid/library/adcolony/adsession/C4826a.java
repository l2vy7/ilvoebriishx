package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import com.iab.omid.library.adcolony.p042b.C4828a;
import com.iab.omid.library.adcolony.p042b.C4831c;
import com.iab.omid.library.adcolony.p042b.C4835f;
import com.iab.omid.library.adcolony.p044d.C4847e;
import com.iab.omid.library.adcolony.p045e.C4849a;
import com.iab.omid.library.adcolony.publisher.AdSessionStatePublisher;
import com.iab.omid.library.adcolony.publisher.C4852a;
import com.iab.omid.library.adcolony.publisher.C4853b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
public class C4826a extends AdSession {

    /* renamed from: k */
    private static final Pattern f21658k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final AdSessionContext f21659a;

    /* renamed from: b */
    private final AdSessionConfiguration f21660b;

    /* renamed from: c */
    private final List<C4831c> f21661c = new ArrayList();

    /* renamed from: d */
    private C4849a f21662d;

    /* renamed from: e */
    private AdSessionStatePublisher f21663e;

    /* renamed from: f */
    private boolean f21664f = false;

    /* renamed from: g */
    private boolean f21665g = false;

    /* renamed from: h */
    private String f21666h;

    /* renamed from: i */
    private boolean f21667i;

    /* renamed from: j */
    private boolean f21668j;

    C4826a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f21660b = adSessionConfiguration;
        this.f21659a = adSessionContext;
        this.f21666h = UUID.randomUUID().toString();
        m22234c((View) null);
        this.f21663e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4852a(adSessionContext.getWebView()) : new C4853b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21663e.mo20154a();
        C4828a.m22256a().mo20110a(this);
        this.f21663e.mo20158a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4831c m22231a(View view) {
        for (C4831c next : this.f21661c) {
            if (next.mo20121a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22232a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f21658k.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22233b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22234c(View view) {
        this.f21662d = new C4849a(view);
    }

    /* renamed from: d */
    private void m22235d(View view) {
        Collection<C4826a> b = C4828a.m22256a().mo20111b();
        if (b != null && b.size() > 0) {
            for (C4826a next : b) {
                if (next != this && next.mo20079d() == view) {
                    next.f21662d.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22236j() {
        if (this.f21667i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22237k() {
        if (this.f21668j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4831c> mo20075a() {
        return this.f21661c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20076a(JSONObject jSONObject) {
        m22237k();
        getAdSessionStatePublisher().mo20166a(jSONObject);
        this.f21668j = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f21665g) {
            m22233b(view);
            m22232a(str);
            if (m22231a(view) == null) {
                this.f21661c.add(new C4831c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20077b() {
        m22236j();
        getAdSessionStatePublisher().mo20174g();
        this.f21667i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20078c() {
        m22237k();
        getAdSessionStatePublisher().mo20176h();
        this.f21668j = true;
    }

    /* renamed from: d */
    public View mo20079d() {
        return (View) this.f21662d.get();
    }

    /* renamed from: e */
    public boolean mo20080e() {
        return this.f21664f && !this.f21665g;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f21665g) {
            C4847e.m22345a((Object) errorType, "Error type is null");
            C4847e.m22347a(str, "Message is null");
            getAdSessionStatePublisher().mo20159a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo20081f() {
        return this.f21664f;
    }

    public void finish() {
        if (!this.f21665g) {
            this.f21662d.clear();
            removeAllFriendlyObstructions();
            this.f21665g = true;
            getAdSessionStatePublisher().mo20173f();
            C4828a.m22256a().mo20114c(this);
            getAdSessionStatePublisher().mo20168b();
            this.f21663e = null;
        }
    }

    /* renamed from: g */
    public boolean mo20082g() {
        return this.f21665g;
    }

    public String getAdSessionId() {
        return this.f21666h;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f21663e;
    }

    /* renamed from: h */
    public boolean mo20083h() {
        return this.f21660b.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo20084i() {
        return this.f21660b.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f21665g) {
            C4847e.m22345a((Object) view, "AdView is null");
            if (mo20079d() != view) {
                m22234c(view);
                getAdSessionStatePublisher().mo20177i();
                m22235d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f21665g) {
            this.f21661c.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f21665g) {
            m22233b(view);
            C4831c a = m22231a(view);
            if (a != null) {
                this.f21661c.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f21664f) {
            this.f21664f = true;
            C4828a.m22256a().mo20112b(this);
            this.f21663e.mo20155a(C4835f.m22294a().mo20147d());
            this.f21663e.mo20160a(this, this.f21659a);
        }
    }
}
