package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import com.iab.omid.library.ironsrc.p049b.C4878a;
import com.iab.omid.library.ironsrc.p049b.C4881c;
import com.iab.omid.library.ironsrc.p049b.C4885f;
import com.iab.omid.library.ironsrc.p051d.C4897e;
import com.iab.omid.library.ironsrc.p052e.C4899a;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.C4902a;
import com.iab.omid.library.ironsrc.publisher.C4903b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.adsession.a */
public class C4876a extends AdSession {

    /* renamed from: a */
    private static final Pattern f21779a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final AdSessionContext f21780b;

    /* renamed from: c */
    private final AdSessionConfiguration f21781c;

    /* renamed from: d */
    private final List<C4881c> f21782d = new ArrayList();

    /* renamed from: e */
    private C4899a f21783e;

    /* renamed from: f */
    private AdSessionStatePublisher f21784f;

    /* renamed from: g */
    private boolean f21785g = false;

    /* renamed from: h */
    private boolean f21786h = false;

    /* renamed from: i */
    private String f21787i;

    /* renamed from: j */
    private boolean f21788j;

    /* renamed from: k */
    private boolean f21789k;

    C4876a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f21781c = adSessionConfiguration;
        this.f21780b = adSessionContext;
        this.f21787i = UUID.randomUUID().toString();
        m22457c((View) null);
        this.f21784f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new C4902a(adSessionContext.getWebView()) : new C4903b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f21784f.mo20340a();
        C4878a.m22477a().mo20296a(this);
        this.f21784f.mo20344a(adSessionConfiguration);
    }

    /* renamed from: a */
    private C4881c m22454a(View view) {
        for (C4881c next : this.f21782d) {
            if (next.mo20307a().get() == view) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m22455a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 50 || !f21779a.matcher(str).matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: b */
    private void m22456b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: c */
    private void m22457c(View view) {
        this.f21783e = new C4899a(view);
    }

    /* renamed from: d */
    private void m22458d(View view) {
        Collection<C4876a> b = C4878a.m22477a().mo20297b();
        if (b != null && b.size() > 0) {
            for (C4876a next : b) {
                if (next != this && next.mo20265d() == view) {
                    next.f21783e.clear();
                }
            }
        }
    }

    /* renamed from: j */
    private void m22459j() {
        if (this.f21788j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: k */
    private void m22460k() {
        if (this.f21789k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    /* renamed from: a */
    public List<C4881c> mo20261a() {
        return this.f21782d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20262a(JSONObject jSONObject) {
        m22460k();
        getAdSessionStatePublisher().mo20352a(jSONObject);
        this.f21789k = true;
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (!this.f21786h) {
            m22456b(view);
            m22455a(str);
            if (m22454a(view) == null) {
                this.f21782d.add(new C4881c(view, friendlyObstructionPurpose, str));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo20263b() {
        m22459j();
        getAdSessionStatePublisher().mo20360g();
        this.f21788j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo20264c() {
        m22460k();
        getAdSessionStatePublisher().mo20362h();
        this.f21789k = true;
    }

    /* renamed from: d */
    public View mo20265d() {
        return (View) this.f21783e.get();
    }

    /* renamed from: e */
    public boolean mo20266e() {
        return this.f21785g && !this.f21786h;
    }

    public void error(ErrorType errorType, String str) {
        if (!this.f21786h) {
            C4897e.m22566a((Object) errorType, "Error type is null");
            C4897e.m22568a(str, "Message is null");
            getAdSessionStatePublisher().mo20345a(errorType, str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: f */
    public boolean mo20267f() {
        return this.f21785g;
    }

    public void finish() {
        if (!this.f21786h) {
            this.f21783e.clear();
            removeAllFriendlyObstructions();
            this.f21786h = true;
            getAdSessionStatePublisher().mo20359f();
            C4878a.m22477a().mo20300c(this);
            getAdSessionStatePublisher().mo20354b();
            this.f21784f = null;
        }
    }

    /* renamed from: g */
    public boolean mo20268g() {
        return this.f21786h;
    }

    public String getAdSessionId() {
        return this.f21787i;
    }

    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f21784f;
    }

    /* renamed from: h */
    public boolean mo20269h() {
        return this.f21781c.isNativeImpressionOwner();
    }

    /* renamed from: i */
    public boolean mo20270i() {
        return this.f21781c.isNativeMediaEventsOwner();
    }

    public void registerAdView(View view) {
        if (!this.f21786h) {
            C4897e.m22566a((Object) view, "AdView is null");
            if (mo20265d() != view) {
                m22457c(view);
                getAdSessionStatePublisher().mo20363i();
                m22458d(view);
            }
        }
    }

    public void removeAllFriendlyObstructions() {
        if (!this.f21786h) {
            this.f21782d.clear();
        }
    }

    public void removeFriendlyObstruction(View view) {
        if (!this.f21786h) {
            m22456b(view);
            C4881c a = m22454a(view);
            if (a != null) {
                this.f21782d.remove(a);
            }
        }
    }

    public void start() {
        if (!this.f21785g) {
            this.f21785g = true;
            C4878a.m22477a().mo20298b(this);
            this.f21784f.mo20341a(C4885f.m22515a().mo20333d());
            this.f21784f.mo20346a(this, this.f21780b);
        }
    }
}
