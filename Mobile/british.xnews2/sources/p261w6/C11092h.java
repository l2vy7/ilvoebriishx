package p261w6;

import com.google.android.gms.common.internal.C4604n;

/* renamed from: w6.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C11092h extends Exception {
    @Deprecated
    protected C11092h() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11092h(String str) {
        super(str);
        C4604n.m20095h(str, "Detail message must not be empty");
    }
}
