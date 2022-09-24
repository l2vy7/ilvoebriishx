package p130p3;

import androidx.annotation.RecentlyNonNull;

/* renamed from: p3.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public enum C5902a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");
    

    /* renamed from: b */
    private final String f24741b;

    private C5902a(String str) {
        this.f24741b = str;
    }

    @RecentlyNonNull
    public String toString() {
        return this.f24741b;
    }
}
