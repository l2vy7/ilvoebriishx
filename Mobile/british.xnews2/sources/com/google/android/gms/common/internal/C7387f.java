package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C7240f;
import com.google.android.gms.common.api.internal.C7276m;
import com.google.android.gms.common.internal.C7377d;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7387f<T extends IInterface> extends C7377d<T> implements C7191a.C7201f, C7385e0 {
    private static volatile Executor zaa;
    private final C4601e zab;
    private final Set<Scope> zac;
    private final Account zad;

    protected C7387f(Context context, Handler handler, int i, C4601e eVar) {
        super(context, handler, C7389g.m29999b(context), C7190a.m29483q(), i, (C7377d.C7378a) null, (C7377d.C7379b) null);
        this.zab = (C4601e) C4604n.m20098k(eVar);
        this.zad = eVar.mo17977a();
        this.zac = zaa(eVar.mo17980d());
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    public final Account getAccount() {
        return this.zad;
    }

    /* access modifiers changed from: protected */
    public final Executor getBindServiceExecutor() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final C4601e getClientSettings() {
        return this.zab;
    }

    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    /* access modifiers changed from: protected */
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected C7387f(Context context, Looper looper, int i, C4601e eVar) {
        this(context, looper, C7389g.m29999b(context), C7190a.m29483q(), i, eVar, (C7240f) null, (C7276m) null);
    }

    @Deprecated
    protected C7387f(Context context, Looper looper, int i, C4601e eVar, C7206f.C7208b bVar, C7206f.C7209c cVar) {
        this(context, looper, i, eVar, (C7240f) bVar, (C7276m) cVar);
    }

    protected C7387f(Context context, Looper looper, int i, C4601e eVar, C7240f fVar, C7276m mVar) {
        this(context, looper, C7389g.m29999b(context), C7190a.m29483q(), i, eVar, (C7240f) C4604n.m20098k(fVar), (C7276m) C4604n.m20098k(mVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C7387f(android.content.Context r11, android.os.Looper r12, com.google.android.gms.common.internal.C7389g r13, com.google.android.gms.common.C7190a r14, int r15, com.google.android.gms.common.internal.C4601e r16, com.google.android.gms.common.api.internal.C7240f r17, com.google.android.gms.common.api.internal.C7276m r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            com.google.android.gms.common.internal.c0 r3 = new com.google.android.gms.common.internal.c0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            com.google.android.gms.common.internal.d0 r0 = new com.google.android.gms.common.internal.d0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo17986j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.zab = r0
            android.accounts.Account r1 = r16.mo17977a()
            r9.zad = r1
            java.util.Set r0 = r16.mo17980d()
            java.util.Set r0 = r10.zaa(r0)
            r9.zac = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C7387f.<init>(android.content.Context, android.os.Looper, com.google.android.gms.common.internal.g, com.google.android.gms.common.a, int, com.google.android.gms.common.internal.e, com.google.android.gms.common.api.internal.f, com.google.android.gms.common.api.internal.m):void");
    }
}
