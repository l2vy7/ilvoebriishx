package com.google.ads.interactivemedia.p039v3.impl.data;

import com.google.ads.interactivemedia.p039v3.internal.bnh;
import com.google.ads.interactivemedia.p039v3.internal.bnj;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.az */
/* compiled from: IMASDK */
public final class C3786az {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;

    public Map<String, String> constructMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(SessionDescription.ATTR_TYPE, this.type);
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(this.errorCode));
        hashMap.put("errorMessage", this.errorMessage);
        String str = this.innerError;
        if (str != null) {
            hashMap.put("innerError", str);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        return bnh.m16832c(this, obj, new String[0]);
    }

    public int hashCode() {
        return bnj.m16840b(this, new String[0]);
    }

    public String toString() {
        return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", new Object[]{this.type, Integer.valueOf(this.errorCode), this.errorMessage, this.innerError});
    }
}
