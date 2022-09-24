package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: C0 */
    public abstract String mo18003C0();

    public final String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        String C0 = mo18003C0();
        StringBuilder sb = new StringBuilder(C0.length() + 53);
        sb.append(zzc);
        sb.append("\t");
        sb.append(zza);
        sb.append("\t");
        sb.append(zzb);
        sb.append(C0);
        return sb.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();
}
