package p115m4;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.RecentlyNonNull;
import androidx.mediarouter.app.C0879e;
import androidx.mediarouter.app.MediaRouteActionProvider;
import androidx.mediarouter.app.MediaRouteButton;
import androidx.mediarouter.media.C1001r;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C4646v8;
import com.google.android.gms.internal.cast.C8652n7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p111m0.C5710h;
import p244q4.C10922b;

/* renamed from: m4.a */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10739a {

    /* renamed from: a */
    private static final C10922b f49383a = new C10922b("CastButtonFactory");

    /* renamed from: b */
    private static final List<WeakReference<MenuItem>> f49384b = new ArrayList();

    /* renamed from: c */
    private static final List<WeakReference<MediaRouteButton>> f49385c = new ArrayList();

    @RecentlyNonNull
    /* renamed from: a */
    public static MenuItem m48620a(@RecentlyNonNull Context context, @RecentlyNonNull Menu menu, int i) {
        C4604n.m20093f("Must be called from the main thread.");
        C4604n.m20098k(menu);
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            try {
                m48622c(context, findItem, (C0879e) null);
                f49384b.add(new WeakReference(findItem));
                C4646v8.m21378b(C8652n7.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
                return findItem;
            } catch (IllegalArgumentException unused) {
                throw new IllegalArgumentException(String.format(Locale.ROOT, "menu item with ID %d doesn't have a MediaRouteActionProvider.", new Object[]{Integer.valueOf(i)}));
            }
        } else {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "menu doesn't contain a menu item whose ID is %d.", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: b */
    public static void m48621b(@RecentlyNonNull Context context, @RecentlyNonNull MediaRouteButton mediaRouteButton) {
        C4604n.m20093f("Must be called from the main thread.");
        if (mediaRouteButton != null) {
            m48623d(context, mediaRouteButton, (C0879e) null);
            f49385c.add(new WeakReference(mediaRouteButton));
        }
        C4646v8.m21378b(C8652n7.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }

    /* renamed from: c */
    private static void m48622c(Context context, MenuItem menuItem, C0879e eVar) throws IllegalArgumentException {
        C1001r b;
        C4604n.m20093f("Must be called from the main thread.");
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) C5710h.m25220a(menuItem);
        if (mediaRouteActionProvider != null) {
            C5758b f = C5758b.m25465f(context);
            if (f != null && (b = f.mo22534b()) != null) {
                mediaRouteActionProvider.setRouteSelector(b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    private static void m48623d(Context context, MediaRouteButton mediaRouteButton, C0879e eVar) {
        C1001r b;
        C4604n.m20093f("Must be called from the main thread.");
        C5758b f = C5758b.m25465f(context);
        if (f != null && (b = f.mo22534b()) != null) {
            mediaRouteButton.setRouteSelector(b);
        }
    }
}
