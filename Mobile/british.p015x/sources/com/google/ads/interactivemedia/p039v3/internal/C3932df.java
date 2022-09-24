package com.google.ads.interactivemedia.p039v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.p039v3.impl.data.C3782av;
import com.google.ads.interactivemedia.p039v3.impl.data.C3783aw;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.df */
/* compiled from: IMASDK */
public class C3932df implements BaseDisplayContainer {

    /* renamed from: g */
    private static int f16897g;

    /* renamed from: a */
    private ViewGroup f16898a;

    /* renamed from: b */
    private Collection<CompanionAdSlot> f16899b = atz.m14807i();

    /* renamed from: c */
    private Map<String, CompanionAdSlot> f16900c = null;

    /* renamed from: d */
    private final Set<FriendlyObstruction> f16901d = new HashSet();

    /* renamed from: e */
    private C3931de f16902e = null;

    /* renamed from: f */
    private boolean f16903f = false;

    public C3932df(ViewGroup viewGroup) {
        this.f16898a = viewGroup;
    }

    /* renamed from: a */
    public final Map<String, CompanionAdSlot> mo15663a() {
        return this.f16900c;
    }

    /* renamed from: b */
    public final Set<FriendlyObstruction> mo15664b() {
        return new HashSet(this.f16901d);
    }

    /* renamed from: c */
    public final void mo15665c(C3931de deVar) {
        this.f16902e = deVar;
    }

    public final void claim() {
        ars.m14622b(!this.f16903f, "A given DisplayContainer may only be used once");
        this.f16903f = true;
    }

    public final void destroy() {
        ViewGroup viewGroup = this.f16898a;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public final ViewGroup getAdContainer() {
        return this.f16898a;
    }

    public final Collection<CompanionAdSlot> getCompanionSlots() {
        return this.f16899b;
    }

    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction != null && !this.f16901d.contains(friendlyObstruction)) {
            this.f16901d.add(friendlyObstruction);
            C3931de deVar = this.f16902e;
            if (deVar != null) {
                ((C3973et) deVar).mo15747f(friendlyObstruction);
            }
        }
    }

    public final void registerVideoControlsOverlay(View view) {
        if (view != null) {
            C3782av builder = C3783aw.builder();
            builder.view(view);
            builder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
            C3783aw build = builder.build();
            if (!this.f16901d.contains(build)) {
                this.f16901d.add(build);
                C3931de deVar = this.f16902e;
                if (deVar != null) {
                    ((C3973et) deVar).mo15747f(build);
                }
            }
        }
    }

    public final void setAdContainer(ViewGroup viewGroup) {
        ars.m14627g(viewGroup);
        this.f16898a = viewGroup;
    }

    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = atz.m14807i();
        }
        auc auc = new auc();
        for (CompanionAdSlot next : collection) {
            if (next != null) {
                int i = f16897g;
                f16897g = i + 1;
                StringBuilder sb = new StringBuilder(20);
                sb.append("compSlot_");
                sb.append(i);
                auc.mo14540b(sb.toString(), next);
            }
        }
        this.f16900c = auc.mo14539a();
        this.f16899b = collection;
    }

    public final void unregisterAllFriendlyObstructions() {
        this.f16901d.clear();
        C3931de deVar = this.f16902e;
        if (deVar != null) {
            ((C3973et) deVar).mo15748g();
        }
    }

    public final void unregisterAllVideoControlsOverlays() {
        this.f16901d.clear();
        C3931de deVar = this.f16902e;
        if (deVar != null) {
            ((C3973et) deVar).mo15748g();
        }
    }
}
