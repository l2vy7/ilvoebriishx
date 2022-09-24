package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.FriendlyObstructionPurpose;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.af */
/* compiled from: IMASDK */
final class C3766af extends C3793bf {
    private Boolean attached;
    private C3778ar bounds;
    private String detailedReason;
    private Boolean hidden;
    private FriendlyObstructionPurpose purpose;
    private String type;

    C3766af() {
    }

    public C3793bf attached(boolean z) {
        this.attached = Boolean.valueOf(z);
        return this;
    }

    public C3793bf bounds(C3778ar arVar) {
        Objects.requireNonNull(arVar, "Null bounds");
        this.bounds = arVar;
        return this;
    }

    public C3794bg build() {
        String str;
        String str2 = "";
        if (this.attached == null) {
            str2 = str2.concat(" attached");
        }
        if (this.bounds == null) {
            str2 = String.valueOf(str2).concat(" bounds");
        }
        if (this.hidden == null) {
            str2 = String.valueOf(str2).concat(" hidden");
        }
        if (this.purpose == null) {
            str2 = String.valueOf(str2).concat(" purpose");
        }
        if (this.type == null) {
            str2 = String.valueOf(str2).concat(" type");
        }
        if (str2.isEmpty()) {
            return new C3767ag(this.attached.booleanValue(), this.bounds, this.detailedReason, this.hidden.booleanValue(), this.purpose, this.type);
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3793bf detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    public C3793bf hidden(boolean z) {
        this.hidden = Boolean.valueOf(z);
        return this;
    }

    public C3793bf purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Objects.requireNonNull(friendlyObstructionPurpose, "Null purpose");
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    public C3793bf type(String str) {
        Objects.requireNonNull(str, "Null type");
        this.type = str;
        return this;
    }
}
