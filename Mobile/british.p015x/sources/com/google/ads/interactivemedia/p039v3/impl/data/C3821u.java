package com.google.ads.interactivemedia.p039v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.p039v3.api.FriendlyObstructionPurpose;
import java.util.Objects;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.u */
/* compiled from: IMASDK */
final class C3821u implements C3782av {
    private String detailedReason;
    private FriendlyObstructionPurpose purpose;
    private View view;

    C3821u() {
    }

    public C3783aw build() {
        String str;
        String str2 = "";
        if (this.view == null) {
            str2 = str2.concat(" view");
        }
        if (this.purpose == null) {
            str2 = String.valueOf(str2).concat(" purpose");
        }
        if (str2.isEmpty()) {
            return new C3822v(this.view, this.purpose, this.detailedReason);
        }
        if (str2.length() != 0) {
            str = "Missing required properties:".concat(str2);
        } else {
            str = new String("Missing required properties:");
        }
        throw new IllegalStateException(str);
    }

    public C3782av detailedReason(String str) {
        this.detailedReason = str;
        return this;
    }

    public C3782av purpose(FriendlyObstructionPurpose friendlyObstructionPurpose) {
        Objects.requireNonNull(friendlyObstructionPurpose, "Null purpose");
        this.purpose = friendlyObstructionPurpose;
        return this;
    }

    public C3782av view(View view2) {
        Objects.requireNonNull(view2, "Null view");
        this.view = view2;
        return this;
    }
}
