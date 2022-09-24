package com.startapp;

import com.iab.omid.library.startio.adsession.CreativeType;
import com.iab.omid.library.startio.adsession.ImpressionType;
import com.iab.omid.library.startio.adsession.Owner;

/* renamed from: com.startapp.n */
/* compiled from: Sta */
public class C12063n {

    /* renamed from: a */
    public final Owner f53308a;

    /* renamed from: b */
    public final Owner f53309b;

    /* renamed from: c */
    public final boolean f53310c;

    /* renamed from: d */
    public final CreativeType f53311d;

    /* renamed from: e */
    public final ImpressionType f53312e;

    public C12063n(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.f53311d = creativeType;
        this.f53312e = impressionType;
        this.f53308a = owner;
        if (owner2 == null) {
            this.f53309b = Owner.NONE;
        } else {
            this.f53309b = owner2;
        }
        this.f53310c = z;
    }
}
