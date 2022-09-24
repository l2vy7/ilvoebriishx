package com.bumptech.glide;

import com.bumptech.glide.C3338k;
import p179y2.C6403a;
import p179y2.C6407c;

/* renamed from: com.bumptech.glide.k */
/* compiled from: TransitionOptions */
public abstract class C3338k<CHILD extends C3338k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    private C6407c<? super TranscodeType> f12697b = C6403a.m28086b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C3338k) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6407c<? super TranscodeType> mo11171b() {
        return this.f12697b;
    }
}
