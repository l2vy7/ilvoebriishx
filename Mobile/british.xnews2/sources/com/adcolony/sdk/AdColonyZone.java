package com.adcolony.sdk;

import com.adcolony.sdk.C2978z;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

public class AdColonyZone {
    public static final int BANNER = 1;
    public static final int INTERSTITIAL = 0;
    @Deprecated
    public static final int NATIVE = 2;

    /* renamed from: l */
    static final int f10568l = 0;

    /* renamed from: m */
    static final int f10569m = 1;

    /* renamed from: n */
    static final int f10570n = 5;

    /* renamed from: o */
    static final int f10571o = 6;

    /* renamed from: a */
    private String f10572a;

    /* renamed from: b */
    private String f10573b;

    /* renamed from: c */
    private int f10574c = 5;

    /* renamed from: d */
    private int f10575d;

    /* renamed from: e */
    private int f10576e;

    /* renamed from: f */
    private int f10577f;

    /* renamed from: g */
    private int f10578g;

    /* renamed from: h */
    private int f10579h;

    /* renamed from: i */
    private int f10580i;

    /* renamed from: j */
    private boolean f10581j;

    /* renamed from: k */
    private boolean f10582k;

    AdColonyZone(String str) {
        this.f10572a = str;
    }

    /* renamed from: a */
    private int m9391a(int i) {
        if (C2684a.m9411e() && !C2684a.m9409c().mo9693D() && !C2684a.m9409c().mo9694E()) {
            return i;
        }
        m9395c();
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9521b() {
        return this.f10574c == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9522c(int i) {
        this.f10574c = i;
    }

    public int getPlayFrequency() {
        return m9391a(this.f10578g);
    }

    public int getRemainingViewsUntilReward() {
        return m9391a(this.f10576e);
    }

    public int getRewardAmount() {
        return m9391a(this.f10579h);
    }

    public String getRewardName() {
        return m9392a(this.f10573b);
    }

    public int getViewsPerReward() {
        return m9391a(this.f10577f);
    }

    public String getZoneID() {
        return m9392a(this.f10572a);
    }

    public int getZoneType() {
        return this.f10575d;
    }

    public boolean isRewarded() {
        return this.f10582k;
    }

    public boolean isValid() {
        return m9394a(this.f10581j);
    }

    /* renamed from: c */
    private void m9395c() {
        new C2978z.C2979a().mo10088a("The AdColonyZone API is not available while AdColony is disabled.").mo10090a(C2978z.f11949i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9520b(int i) {
        this.f10580i = i;
    }

    /* renamed from: a */
    private boolean m9394a(boolean z) {
        if (C2684a.m9411e() && !C2684a.m9409c().mo9693D() && !C2684a.m9409c().mo9694E()) {
            return z;
        }
        m9395c();
        return false;
    }

    /* renamed from: a */
    private String m9392a(String str) {
        return m9393a(str, "");
    }

    /* renamed from: a */
    private String m9393a(String str, String str2) {
        if (C2684a.m9411e() && !C2684a.m9409c().mo9693D() && !C2684a.m9409c().mo9694E()) {
            return str;
        }
        m9395c();
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9519a(C2714c0 c0Var) {
        JSONObject b = c0Var.mo9608b();
        JSONObject g = C2976x.m10335g(b, "reward");
        this.f10573b = C2976x.m10337i(g, "reward_name");
        this.f10579h = C2976x.m10332e(g, "reward_amount");
        this.f10577f = C2976x.m10332e(g, "views_per_reward");
        this.f10576e = C2976x.m10332e(g, "views_until_reward");
        this.f10582k = C2976x.m10329c(b, "rewarded");
        this.f10574c = C2976x.m10332e(b, IronSourceConstants.EVENTS_STATUS);
        this.f10575d = C2976x.m10332e(b, SessionDescription.ATTR_TYPE);
        this.f10578g = C2976x.m10332e(b, "play_interval");
        this.f10572a = C2976x.m10337i(b, "zone_id");
        boolean z = true;
        if (this.f10574c == 1) {
            z = false;
        }
        this.f10581j = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9518a() {
        return this.f10580i;
    }
}
