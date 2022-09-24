package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.exoplayer2.C6540C;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p010b0.C1523f;
import p063d0.C5135a;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    static final PorterDuff.Mode f3166k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3167a = -1;

    /* renamed from: b */
    Object f3168b;

    /* renamed from: c */
    public byte[] f3169c = null;

    /* renamed from: d */
    public Parcelable f3170d = null;

    /* renamed from: e */
    public int f3171e = 0;

    /* renamed from: f */
    public int f3172f = 0;

    /* renamed from: g */
    public ColorStateList f3173g = null;

    /* renamed from: h */
    PorterDuff.Mode f3174h = f3166k;

    /* renamed from: i */
    public String f3175i = null;

    /* renamed from: j */
    public String f3176j;

    public IconCompat() {
    }

    /* renamed from: b */
    static Bitmap m3322b(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m3323c(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f3168b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    /* renamed from: d */
    public static IconCompat m3324d(Context context, int i) {
        if (context != null) {
            return m3325e(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    /* renamed from: e */
    public static IconCompat m3325e(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f3171e = i;
            if (resources != null) {
                try {
                    iconCompat.f3168b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f3168b = str;
            }
            iconCompat.f3176j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: h */
    private static int m3326h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: j */
    private static String m3327j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: k */
    private static Resources m3328k(Context context, String str) {
        if (MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    /* renamed from: m */
    private static int m3329m(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e);
            return -1;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        }
    }

    /* renamed from: o */
    private static Uri m3330o(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: r */
    private Drawable m3331r(Context context) {
        switch (this.f3167a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f3168b);
            case 2:
                String i = mo3113i();
                if (TextUtils.isEmpty(i)) {
                    i = context.getPackageName();
                }
                try {
                    return C1523f.m7886e(m3328k(context, i), this.f3171e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f3171e), this.f3168b}), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f3168b, this.f3171e, this.f3172f));
            case 4:
                InputStream p = mo3116p(context);
                if (p != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(p));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), m3322b((Bitmap) this.f3168b, false));
            case 6:
                InputStream p2 = mo3116p(context);
                if (p2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return new AdaptiveIconDrawable((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(p2)));
                    }
                    return new BitmapDrawable(context.getResources(), m3322b(BitmapFactory.decodeStream(p2), false));
                }
                break;
        }
        return null;
    }

    /* renamed from: w */
    private static String m3332w(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: a */
    public void mo3110a(Context context) {
        Object obj;
        if (this.f3167a == 2 && (obj = this.f3168b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String i = mo3113i();
                int identifier = m3328k(context, i).getIdentifier(str4, str3, str5);
                if (this.f3171e != identifier) {
                    Log.i("IconCompat", "Id has changed for " + i + " " + str);
                    this.f3171e = identifier;
                }
            }
        }
    }

    /* renamed from: f */
    public Bitmap mo3111f() {
        int i = this.f3167a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f3168b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.f3168b;
        } else {
            if (i == 5) {
                return m3322b((Bitmap) this.f3168b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    /* renamed from: g */
    public int mo3112g() {
        int i = this.f3167a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3326h((Icon) this.f3168b);
        }
        if (i == 2) {
            return this.f3171e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: i */
    public String mo3113i() {
        int i = this.f3167a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3327j((Icon) this.f3168b);
        }
        if (i != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        } else if (TextUtils.isEmpty(this.f3176j)) {
            return ((String) this.f3168b).split(":", -1)[0];
        } else {
            return this.f3176j;
        }
    }

    /* renamed from: l */
    public int mo3114l() {
        int i = this.f3167a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m3329m((Icon) this.f3168b);
    }

    /* renamed from: n */
    public Uri mo3115n() {
        int i = this.f3167a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m3330o((Icon) this.f3168b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f3168b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: p */
    public InputStream mo3116p(Context context) {
        Uri n = mo3115n();
        String scheme = n.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(n);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + n, e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f3168b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + n, e2);
                return null;
            }
        }
    }

    /* renamed from: q */
    public Drawable mo3117q(Context context) {
        mo3110a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return mo3122v(context).loadDrawable(context);
        }
        Drawable r = m3331r(context);
        if (!(r == null || (this.f3173g == null && this.f3174h == f3166k))) {
            r.mutate();
            C5135a.m23415o(r, this.f3173g);
            C5135a.m23416p(r, this.f3174h);
        }
        return r;
    }

    /* renamed from: s */
    public void mo3118s() {
        this.f3174h = PorterDuff.Mode.valueOf(this.f3175i);
        switch (this.f3167a) {
            case -1:
                Parcelable parcelable = this.f3170d;
                if (parcelable != null) {
                    this.f3168b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3170d;
                if (parcelable2 != null) {
                    this.f3168b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3169c;
                this.f3168b = bArr;
                this.f3167a = 3;
                this.f3171e = 0;
                this.f3172f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3169c, Charset.forName(C6540C.UTF16_NAME));
                this.f3168b = str;
                if (this.f3167a == 2 && this.f3176j == null) {
                    this.f3176j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3168b = this.f3169c;
                return;
            default:
                return;
        }
    }

    /* renamed from: t */
    public void mo3119t(boolean z) {
        this.f3175i = this.f3174h.name();
        switch (this.f3167a) {
            case -1:
                if (!z) {
                    this.f3170d = (Parcelable) this.f3168b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f3168b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f3169c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f3170d = (Parcelable) this.f3168b;
                return;
            case 2:
                this.f3169c = ((String) this.f3168b).getBytes(Charset.forName(C6540C.UTF16_NAME));
                return;
            case 3:
                this.f3169c = (byte[]) this.f3168b;
                return;
            case 4:
            case 6:
                this.f3169c = this.f3168b.toString().getBytes(Charset.forName(C6540C.UTF16_NAME));
                return;
            default:
                return;
        }
    }

    public String toString() {
        if (this.f3167a == -1) {
            return String.valueOf(this.f3168b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m3332w(this.f3167a));
        switch (this.f3167a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3168b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3168b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3176j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(mo3112g())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3171e);
                if (this.f3172f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3172f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3168b);
                break;
        }
        if (this.f3173g != null) {
            sb.append(" tint=");
            sb.append(this.f3173g);
        }
        if (this.f3174h != f3166k) {
            sb.append(" mode=");
            sb.append(this.f3174h);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: u */
    public Icon mo3121u() {
        return mo3122v((Context) null);
    }

    /* renamed from: v */
    public Icon mo3122v(Context context) {
        Icon icon;
        switch (this.f3167a) {
            case -1:
                return (Icon) this.f3168b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f3168b);
                break;
            case 2:
                icon = Icon.createWithResource(mo3113i(), this.f3171e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f3168b, this.f3171e, this.f3172f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f3168b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(m3322b((Bitmap) this.f3168b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f3168b);
                    break;
                }
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(mo3115n());
                    break;
                } else if (context != null) {
                    InputStream p = mo3116p(context);
                    if (p != null) {
                        if (i < 26) {
                            icon = Icon.createWithBitmap(m3322b(BitmapFactory.decodeStream(p), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(p));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + mo3115n());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + mo3115n());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f3173g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f3174h;
        if (mode != f3166k) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    private IconCompat(int i) {
        this.f3167a = i;
    }
}
