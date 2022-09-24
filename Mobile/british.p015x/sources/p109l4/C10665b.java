package p109l4;

import androidx.annotation.RecentlyNonNull;
import java.util.Collection;
import p244q4.C10920a;

/* renamed from: l4.b */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C10665b {
    @RecentlyNonNull
    /* renamed from: a */
    public static String m48489a(@RecentlyNonNull String str) throws IllegalArgumentException {
        if (str != null) {
            return m48491c("com.google.android.gms.cast.CATEGORY_CAST", str, (Collection<String>) null, false, true);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static String m48490b(@RecentlyNonNull String str, @RecentlyNonNull Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        } else if (collection != null) {
            return m48491c("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false, true);
        } else {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
    }

    /* renamed from: c */
    private static String m48491c(String str, String str2, Collection<String> collection, boolean z, boolean z2) throws IllegalArgumentException {
        String str3;
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                if (str2.length() != 0) {
                    str3 = "Invalid application ID: ".concat(str2);
                } else {
                    str3 = new String("Invalid application ID: ");
                }
                throw new IllegalArgumentException(str3);
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str2 == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z3 = true;
                for (String next : collection) {
                    C10920a.m49142e(next);
                    if (!z3) {
                        sb.append(",");
                    }
                    sb.append(C10920a.m49147j(next));
                    z3 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str2 == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
