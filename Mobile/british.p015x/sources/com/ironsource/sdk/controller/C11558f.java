package com.ironsource.sdk.controller;

import com.ironsource.sdk.p287a.C11516a;
import com.ironsource.sdk.p287a.C11520d;
import com.ironsource.sdk.p287a.C11522f;
import com.ironsource.sdk.p295h.C11715c;
import com.ironsource.sdk.p299k.C11732b;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
final class C11558f {

    /* renamed from: a */
    long f51940a;

    /* renamed from: b */
    int f51941b;

    /* renamed from: c */
    int f51942c;

    /* renamed from: d */
    C11560b f51943d = C11560b.NONE;

    /* renamed from: e */
    private String f51944e;

    /* renamed from: f */
    private String f51945f;

    /* renamed from: g */
    private C11732b f51946g;

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public enum C11559a {
        ;
        

        /* renamed from: a */
        public static final int f51947a = 1;

        /* renamed from: b */
        public static final int f51948b = 2;

        /* renamed from: c */
        public static final int f51949c = 3;

        static {
            f51950d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m51462a() {
            return (int[]) f51950d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public enum C11560b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g */
        int f51958g;

        private C11560b(int i) {
            this.f51958g = i;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$c */
    class C11561c extends JSONObject {
        C11561c() {
            putOpt("controllerSourceStrategy", Integer.valueOf(C11558f.this.f51941b));
            putOpt("controllerSourceCode", Integer.valueOf(C11558f.this.f51943d.f51958g));
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$d */
    static /* synthetic */ class C11562d {

        /* renamed from: a */
        static final /* synthetic */ int[] f51960a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.C11558f.C11559a.m51462a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f51960a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.C11558f.C11559a.f51947a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f51960a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.C11558f.C11559a.f51948b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f51960a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.C11558f.C11559a.f51949c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C11558f.C11562d.<clinit>():void");
        }
    }

    C11558f(JSONObject jSONObject, String str, String str2, C11732b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f51941b = optInt;
        this.f51942c = optInt != 1 ? optInt != 2 ? C11559a.f51947a : C11559a.f51949c : C11559a.f51948b;
        this.f51944e = str;
        this.f51945f = str2;
        this.f51946g = bVar;
    }

    /* renamed from: b */
    private void m51451b(C11715c cVar) {
        if (!this.f51946g.mo45038b()) {
            this.f51946g.mo45036a(cVar, this.f51945f);
        }
    }

    /* renamed from: h */
    private C11715c m51452h() {
        return new C11715c(this.f51944e, "mobileController.html");
    }

    /* renamed from: i */
    private C11715c m51453i() {
        return new C11715c(this.f51944e, "next_mobileController.html");
    }

    /* renamed from: j */
    private C11715c m51454j() {
        return new C11715c(this.f51944e, "fallback_mobileController.html");
    }

    /* renamed from: k */
    private void m51455k() {
        try {
            C11715c h = m51452h();
            if (h.exists()) {
                C11715c j = m51454j();
                if (j.exists()) {
                    j.delete();
                }
                IronSourceStorageUtils.renameFile(h.getPath(), j.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo44697a(C11560b bVar) {
        C11516a a = new C11516a().mo44598a("generalmessage", Integer.valueOf(this.f51941b)).mo44598a("controllersource", Integer.valueOf(bVar.f51958g));
        if (this.f51940a > 0) {
            a.mo44598a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f51940a));
        }
        C11520d.m51360a(C11522f.f51821t, (Map<String, Object>) a.f51793a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo44698c() {
        return this.f51943d != C11560b.NONE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo44699d() {
        C11715c cVar;
        int i = C11562d.f51960a[this.f51942c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(m51452h());
            cVar = new C11715c(this.f51944e, SDKUtils.getFileName(this.f51945f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    C11715c h = m51452h();
                    C11715c i2 = m51453i();
                    if (!i2.exists() && !h.exists()) {
                        m51451b(new C11715c(this.f51944e, SDKUtils.getFileName(this.f51945f)));
                        return false;
                    } else if (i2.exists() || !h.exists()) {
                        m51455k();
                        if (IronSourceStorageUtils.renameFile(m51453i().getPath(), m51452h().getPath())) {
                            C11560b bVar = C11560b.PREPARED_CONTROLLER_LOADED;
                            this.f51943d = bVar;
                            mo44697a(bVar);
                            mo44700e();
                            m51451b(new C11715c(this.f51944e, i2.getName()));
                            return true;
                        } else if (mo44701f()) {
                            C11560b bVar2 = C11560b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f51943d = bVar2;
                            mo44697a(bVar2);
                            m51451b(new C11715c(this.f51944e, i2.getName()));
                            return true;
                        } else {
                            m51451b(new C11715c(this.f51944e, SDKUtils.getFileName(this.f51945f)));
                        }
                    } else {
                        C11560b bVar3 = C11560b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f51943d = bVar3;
                        mo44697a(bVar3);
                        m51451b(new C11715c(this.f51944e, i2.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            m51455k();
            cVar = new C11715c(this.f51944e, SDKUtils.getFileName(this.f51945f));
        }
        m51451b(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo44700e() {
        IronSourceStorageUtils.deleteFile(m51454j());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo44701f() {
        try {
            if (!m51454j().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(m51454j().getPath(), m51452h().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final JSONObject mo44702g() {
        return new C11561c();
    }
}
