package com.google.ads.interactivemedia.p039v3.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.axl */
/* compiled from: IMASDK */
public final class axl<P> {

    /* renamed from: a */
    private final ConcurrentMap<axk, List<axj<P>>> f15878a = new ConcurrentHashMap();

    /* renamed from: b */
    private axj<P> f15879b;

    /* renamed from: c */
    private final Class<P> f15880c;

    private axl(Class<P> cls) {
        this.f15880c = cls;
    }

    /* renamed from: b */
    public static <P> axl<P> m15115b(Class<P> cls) {
        return new axl<>(cls);
    }

    /* renamed from: a */
    public final axj<P> mo14756a() {
        return this.f15879b;
    }

    /* renamed from: c */
    public final void mo14757c(axj<P> axj) {
        if (axj.mo14749b() == bcb.ENABLED) {
            List list = (List) this.f15878a.get(new axk(axj.mo14751d()));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f15879b = axj;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }

    /* renamed from: d */
    public final axj<P> mo14758d(P p, bce bce) throws GeneralSecurityException {
        byte[] bArr;
        if (bce.mo14901d() == bcb.ENABLED) {
            bcr bcr = bcr.UNKNOWN_PREFIX;
            int ordinal = bce.mo14903f().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = awu.f15861a;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(bce.mo14902e()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(bce.mo14902e()).array();
            }
            bcb d = bce.mo14901d();
            bcr f = bce.mo14903f();
            bce.mo14902e();
            axj<P> axj = new axj<>(p, bArr, d, f);
            ArrayList arrayList = new ArrayList();
            arrayList.add(axj);
            axk axk = new axk(axj.mo14751d());
            List list = (List) this.f15878a.put(axk, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(axj);
                this.f15878a.put(axk, Collections.unmodifiableList(arrayList2));
            }
            return axj;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    /* renamed from: e */
    public final Class<P> mo14759e() {
        return this.f15880c;
    }
}
