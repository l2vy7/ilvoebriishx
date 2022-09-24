package com.startapp.sdk.triggeredlinks;

import android.app.Activity;
import com.startapp.C5010hb;
import com.startapp.C5015nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TriggeredLinksMetadata implements Serializable {
    private static final long serialVersionUID = 1082253451843108611L;
    @C5010hb(complex = true, name = "AppEvents")
    private AppEventsMetadata appEvents;
    private boolean enabled = true;
    private int ief;
    private int smartRedirectTimeoutInSec = 10;
    @C5010hb(name = "ThrottlingPublisherIDs", type = ArrayList.class, value = Integer.class)
    private List<Integer> throttlingPublisherIDs;
    private boolean triggeredLinkInfoEvent = true;

    /* renamed from: a */
    public AppEventsMetadata mo46505a() {
        return this.appEvents;
    }

    /* renamed from: b */
    public int mo46506b() {
        return this.ief;
    }

    /* renamed from: c */
    public int mo46507c() {
        return this.smartRedirectTimeoutInSec;
    }

    /* renamed from: d */
    public List<Integer> mo46508d() {
        return this.throttlingPublisherIDs;
    }

    /* renamed from: e */
    public boolean mo46509e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggeredLinksMetadata triggeredLinksMetadata = (TriggeredLinksMetadata) obj;
        if (this.enabled == triggeredLinksMetadata.enabled && this.smartRedirectTimeoutInSec == triggeredLinksMetadata.smartRedirectTimeoutInSec && this.triggeredLinkInfoEvent == triggeredLinksMetadata.triggeredLinkInfoEvent && this.ief == triggeredLinksMetadata.ief && C5015nb.m22922a(this.appEvents, triggeredLinksMetadata.appEvents) && C5015nb.m22922a(this.throttlingPublisherIDs, triggeredLinksMetadata.throttlingPublisherIDs)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo46511f() {
        return this.triggeredLinkInfoEvent;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.smartRedirectTimeoutInSec), Boolean.valueOf(this.triggeredLinkInfoEvent), this.appEvents, this.throttlingPublisherIDs, Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }
}
