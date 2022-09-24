package com.google.ads.mediation;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.co0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: com.google.ads.mediation.e */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C4553e {

    /* renamed from: com.google.ads.mediation.e$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static final class C4554a extends Exception {
        public C4554a(@RecentlyNonNull String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.e$b */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    protected @interface C4555b {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    /* renamed from: a */
    public void mo16976a(@RecentlyNonNull Map<String, String> map) throws C4554a {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C4555b bVar = (C4555b) field.getAnnotation(C4555b.class);
            if (bVar != null) {
                hashMap.put(bVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            co0.zzj("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str3 = (String) next.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str3);
                    sb.append("\" could not be set: Illegal Access");
                    co0.zzj(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str4 = (String) next.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str4);
                    sb2.append("\" could not be set: Bad Type");
                    co0.zzj(sb2.toString());
                }
            } else {
                String str5 = (String) next.getKey();
                String str6 = (String) next.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 31 + String.valueOf(str6).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str5);
                sb3.append(" = \"");
                sb3.append(str6);
                sb3.append("\"");
                co0.zze(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C4555b) field3.getAnnotation(C4555b.class)).required()) {
                String valueOf = String.valueOf(((C4555b) field3.getAnnotation(C4555b.class)).name());
                if (valueOf.length() != 0) {
                    str2 = "Required server option missing: ".concat(valueOf);
                } else {
                    str2 = new String("Required server option missing: ");
                }
                co0.zzj(str2);
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C4555b) field3.getAnnotation(C4555b.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String sb5 = sb4.toString();
            if (sb5.length() != 0) {
                str = "Required server option(s) missing: ".concat(sb5);
            } else {
                str = new String("Required server option(s) missing: ");
            }
            throw new C4554a(str);
        }
    }
}
