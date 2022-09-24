package com.google.ads.interactivemedia.p038v3.impl.data;

import com.google.ads.interactivemedia.p038v3.api.UiElement;
import com.google.ads.interactivemedia.p038v3.internal.bfi;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bl */
/* compiled from: IMASDK */
public final class C3799bl implements UiElement {
    public static final bfi<C3799bl> GSON_TYPE_ADAPTER = new C3798bk();
    private final String name;

    public C3799bl(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3799bl)) {
            return this.name.equals(((C3799bl) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name});
    }

    public String toString() {
        String str = this.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20);
        sb.append("UiElementImpl[name=");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
