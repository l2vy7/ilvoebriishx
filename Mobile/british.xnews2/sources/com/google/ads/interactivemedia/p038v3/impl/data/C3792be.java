package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.be */
/* compiled from: IMASDK */
public abstract class C3792be {
    public abstract C3795bh build();

    public C3792be friendlyObstructions(Collection<FriendlyObstruction> collection) {
        ArrayList arrayList = new ArrayList();
        for (FriendlyObstruction next : collection) {
            arrayList.add(C3794bg.builder().view(next.getView()).purpose(next.getPurpose()).detailedReason(next.getDetailedReason()).build());
        }
        return obstructions(arrayList);
    }

    public abstract C3792be obstructions(List<C3794bg> list);
}
