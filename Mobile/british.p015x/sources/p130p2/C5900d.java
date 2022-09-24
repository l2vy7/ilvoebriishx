package p130p2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;
import p065d2.C5163h;
import p065d2.C5165j;
import p082g2.C5323v;

/* renamed from: p2.d */
/* compiled from: ResourceDrawableDecoder */
public class C5900d implements C5165j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f24735a;

    public C5900d(Context context) {
        this.f24735a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m26052d(Uri uri, String str) {
        if (str.equals(this.f24735a.getPackageName())) {
            return this.f24735a;
        }
        try {
            return this.f24735a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f24735a.getPackageName())) {
                return this.f24735a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m26053e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m26054f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m26055g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m26054f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m26053e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public C5323v<Drawable> mo21345b(Uri uri, int i, int i2, C5163h hVar) {
        Context d = m26052d(uri, uri.getAuthority());
        return C5899c.m26048e(C5897a.m26043b(this.f24735a, d, m26055g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo21344a(Uri uri, C5163h hVar) {
        return uri.getScheme().equals("android.resource");
    }
}
