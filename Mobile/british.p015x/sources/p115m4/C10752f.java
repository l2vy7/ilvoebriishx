package p115m4;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.List;

/* renamed from: m4.f */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public interface C10752f {
    @RecentlyNullable
    List<C10781s> getAdditionalSessionProviders(@RecentlyNonNull Context context);

    @RecentlyNonNull
    CastOptions getCastOptions(@RecentlyNonNull Context context);
}
