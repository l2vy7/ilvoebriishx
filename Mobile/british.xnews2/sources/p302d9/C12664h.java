package p302d9;

import java.util.Date;
import p333v8.C12926k;
import p333v8.C12928m;

/* renamed from: d9.h */
/* compiled from: BasicMaxAgeHandler */
public class C12664h extends C12650a {
    /* renamed from: c */
    public void mo47649c(C12928m mVar, String str) throws C12926k {
        if (mVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    mVar.mo47669m(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                throw new C12926k("Negative max-age attribute: " + str);
            } catch (NumberFormatException unused) {
                throw new C12926k("Invalid max-age attribute: " + str);
            }
        } else {
            throw new C12926k("Missing value for max-age attribute");
        }
    }
}
