package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ed3<P> {

    /* renamed from: a */
    private final ConcurrentMap<dd3, List<bd3<P>>> f31321a = new ConcurrentHashMap();

    /* renamed from: b */
    private bd3<P> f31322b;

    /* renamed from: c */
    private final Class<P> f31323c;

    private ed3(Class<P> cls) {
        this.f31323c = cls;
    }

    /* renamed from: c */
    public static <P> ed3<P> m31789c(Class<P> cls) {
        return new ed3<>(cls);
    }

    /* renamed from: a */
    public final bd3<P> mo31547a(P p, kk3 kk3) throws GeneralSecurityException {
        byte[] bArr;
        if (kk3.mo33107J() == 3) {
            int K = kk3.mo33108K() - 2;
            if (K != 1) {
                if (K != 2) {
                    if (K == 3) {
                        bArr = ic3.f33204a;
                    } else if (K != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(kk3.mo33104E()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(kk3.mo33104E()).array();
            }
            bd3 bd3 = new bd3(p, bArr, kk3.mo33107J(), kk3.mo33108K(), kk3.mo33104E());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bd3);
            dd3 dd3 = new dd3(bd3.mo30658b(), (cd3) null);
            List list = (List) this.f31321a.put(dd3, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bd3);
                this.f31321a.put(dd3, Collections.unmodifiableList(arrayList2));
            }
            return bd3;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    /* renamed from: b */
    public final bd3<P> mo31548b() {
        return this.f31322b;
    }

    /* renamed from: d */
    public final Class<P> mo31549d() {
        return this.f31323c;
    }

    /* renamed from: e */
    public final void mo31550e(bd3<P> bd3) {
        if (bd3.mo30659c() == 3) {
            List list = (List) this.f31321a.get(new dd3(bd3.mo30658b(), (cd3) null));
            if (list == null) {
                list = Collections.emptyList();
            }
            if (!list.isEmpty()) {
                this.f31322b = bd3;
                return;
            }
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        throw new IllegalArgumentException("the primary entry has to be ENABLED");
    }
}
