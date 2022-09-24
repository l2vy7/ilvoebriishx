package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.atz;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.ad */
/* compiled from: IMASDK */
final class C3764ad extends C3795bh {
    private final atz<C3794bg> obstructions;

    private C3764ad(atz<C3794bg> atz) {
        this.obstructions = atz;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3795bh) {
            return this.obstructions.equals(((C3795bh) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    /* access modifiers changed from: package-private */
    public atz<C3794bg> obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String valueOf = String.valueOf(this.obstructions);
        StringBuilder sb = new StringBuilder(valueOf.length() + 34);
        sb.append("ObstructionListData{obstructions=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
