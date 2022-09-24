package british.xnews2;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.List;
import p114m4.C10752f;
import p114m4.C10781s;

public class CastOptionsProvider implements C10752f {
    public List<C10781s> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public CastOptions getCastOptions(Context context) {
        Class<ExpandedControlsActivity> cls = ExpandedControlsActivity.class;
        return new CastOptions.C7098a().mo29432c("CC1AD845").mo29431b(new CastMediaOptions.C7100a().mo29466c(new NotificationOptions.C7101a().mo29523c(cls.getName()).mo29522b(R.drawable.ic_launcher).mo29521a()).mo29465b(cls.getName()).mo29464a()).mo29430a();
    }
}
