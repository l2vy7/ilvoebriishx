package com.google.ads.interactivemedia.p039v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.p039v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dh */
/* compiled from: IMASDK */
public final class C3934dh implements CompanionAdSlot {

    /* renamed from: a */
    private int f16917a;

    /* renamed from: b */
    private int f16918b;

    /* renamed from: c */
    private ViewGroup f16919c;

    /* renamed from: d */
    private String f16920d;

    /* renamed from: e */
    private final List<CompanionAdSlot.ClickListener> f16921e = new ArrayList(1);

    /* renamed from: a */
    public final void mo15676a(String str) {
        this.f16920d = str;
    }

    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f16921e.add(clickListener);
    }

    /* renamed from: b */
    public final List<CompanionAdSlot.ClickListener> mo15677b() {
        return this.f16921e;
    }

    public final ViewGroup getContainer() {
        return this.f16919c;
    }

    public final int getHeight() {
        return this.f16918b;
    }

    public final int getWidth() {
        return this.f16917a;
    }

    public final boolean isFilled() {
        return this.f16919c.findViewWithTag(this.f16920d) != null;
    }

    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.f16921e.remove(clickListener);
    }

    public final void setContainer(ViewGroup viewGroup) {
        this.f16919c = viewGroup;
    }

    public final void setSize(int i, int i2) {
        this.f16917a = i;
        this.f16918b = i2;
    }
}
