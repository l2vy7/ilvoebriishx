package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0600b;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p073f.C5238a;
import p073f.C5243f;
import p128p0.C5879c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.z */
/* compiled from: SuggestionsAdapter */
class C0436z extends C5879c implements View.OnClickListener {

    /* renamed from: A */
    private int f1730A = -1;

    /* renamed from: n */
    private final SearchView f1731n;

    /* renamed from: o */
    private final SearchableInfo f1732o;

    /* renamed from: p */
    private final Context f1733p;

    /* renamed from: q */
    private final WeakHashMap<String, Drawable.ConstantState> f1734q;

    /* renamed from: r */
    private final int f1735r;

    /* renamed from: s */
    private boolean f1736s = false;

    /* renamed from: t */
    private int f1737t = 1;

    /* renamed from: u */
    private ColorStateList f1738u;

    /* renamed from: v */
    private int f1739v = -1;

    /* renamed from: w */
    private int f1740w = -1;

    /* renamed from: x */
    private int f1741x = -1;

    /* renamed from: y */
    private int f1742y = -1;

    /* renamed from: z */
    private int f1743z = -1;

    /* renamed from: androidx.appcompat.widget.z$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0437a {

        /* renamed from: a */
        public final TextView f1744a;

        /* renamed from: b */
        public final TextView f1745b;

        /* renamed from: c */
        public final ImageView f1746c;

        /* renamed from: d */
        public final ImageView f1747d;

        /* renamed from: e */
        public final ImageView f1748e;

        public C0437a(View view) {
            this.f1744a = (TextView) view.findViewById(16908308);
            this.f1745b = (TextView) view.findViewById(16908309);
            this.f1746c = (ImageView) view.findViewById(16908295);
            this.f1747d = (ImageView) view.findViewById(16908296);
            this.f1748e = (ImageView) view.findViewById(C5243f.f22932s);
        }
    }

    public C0436z(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1731n = searchView;
        this.f1732o = searchableInfo;
        this.f1735r = searchView.getSuggestionCommitIconResId();
        this.f1733p = context;
        this.f1734q = weakHashMap;
    }

    /* renamed from: A */
    private void m2291A(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: B */
    private void m2292B(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1734q.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: C */
    private void m2293C(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m2294k(String str) {
        Drawable.ConstantState constantState = this.f1734q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m2295l(CharSequence charSequence) {
        if (this.f1738u == null) {
            TypedValue typedValue = new TypedValue();
            this.f24636e.getTheme().resolveAttribute(C5238a.f22802P, typedValue, true);
            this.f1738u = this.f24636e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1738u, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m2296m(ComponentName componentName) {
        PackageManager packageManager = this.f24636e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m2297n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1734q.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1734q.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1733p.getResources());
        }
        Drawable m = m2296m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f1734q.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m2298o(Cursor cursor, String str) {
        return m2304w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m2299p() {
        Drawable n = m2297n(this.f1732o.getSearchActivity());
        if (n != null) {
            return n;
        }
        return this.f24636e.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m2300q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2355r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1733p     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0436z.m2300q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m2301s(String str) {
        if (str == null || str.isEmpty() || SessionDescription.SUPPORTED_SDP_VERSION.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1733p.getPackageName() + "/" + parseInt;
            Drawable k = m2294k(str2);
            if (k != null) {
                return k;
            }
            Drawable f = C0600b.m3294f(this.f1733p, parseInt);
            m2292B(str2, f);
            return f;
        } catch (NumberFormatException unused) {
            Drawable k2 = m2294k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m2300q(Uri.parse(str));
            m2292B(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m2302t(Cursor cursor) {
        int i = this.f1742y;
        if (i == -1) {
            return null;
        }
        Drawable s = m2301s(cursor.getString(i));
        if (s != null) {
            return s;
        }
        return m2299p();
    }

    /* renamed from: u */
    private Drawable m2303u(Cursor cursor) {
        int i = this.f1743z;
        if (i == -1) {
            return null;
        }
        return m2301s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m2304w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: z */
    private void m2305z(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    public CharSequence mo2344a(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m2298o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f1732o.shouldRewriteQueryFromData() && (o2 = m2298o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f1732o.shouldRewriteQueryFromText() || (o = m2298o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    /* renamed from: b */
    public void mo2345b(Cursor cursor) {
        if (this.f1736s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2345b(cursor);
            if (cursor != null) {
                this.f1739v = cursor.getColumnIndex("suggest_text_1");
                this.f1740w = cursor.getColumnIndex("suggest_text_2");
                this.f1741x = cursor.getColumnIndex("suggest_text_2_url");
                this.f1742y = cursor.getColumnIndex("suggest_icon_1");
                this.f1743z = cursor.getColumnIndex("suggest_icon_2");
                this.f1730A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: d */
    public Cursor mo2346d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1731n.getVisibility() == 0 && this.f1731n.getWindowVisibility() == 0) {
            try {
                Cursor v = mo2356v(this.f1732o, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo2347e(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0437a aVar = (C0437a) view.getTag();
        int i = this.f1730A;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1744a != null) {
            m2291A(aVar.f1744a, m2304w(cursor, this.f1739v));
        }
        if (aVar.f1745b != null) {
            String w = m2304w(cursor, this.f1741x);
            if (w != null) {
                charSequence = m2295l(w);
            } else {
                charSequence = m2304w(cursor, this.f1740w);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1744a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1744a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1744a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1744a.setMaxLines(1);
                }
            }
            m2291A(aVar.f1745b, charSequence);
        }
        ImageView imageView = aVar.f1746c;
        if (imageView != null) {
            m2305z(imageView, m2302t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1747d;
        if (imageView2 != null) {
            m2305z(imageView2, m2303u(cursor), 8);
        }
        int i3 = this.f1737t;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1748e.setVisibility(0);
            aVar.f1748e.setTag(aVar.f1744a.getText());
            aVar.f1748e.setOnClickListener(this);
            return;
        }
        aVar.f1748e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo22812g(this.f24636e, this.f24635d, viewGroup);
            if (g != null) {
                ((C0437a) g.getTag()).f1744a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo2350h(this.f24636e, this.f24635d, viewGroup);
            if (h != null) {
                ((C0437a) h.getTag()).f1744a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo2350h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo2350h(context, cursor, viewGroup);
        h.setTag(new C0437a(h));
        ((ImageView) h.findViewById(C5243f.f22932s)).setImageResource(this.f1735r);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2293C(mo22810c());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2293C(mo22810c());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1731n.mo1796U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo2355r(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f24636e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo2356v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f24636e.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: y */
    public void mo2357y(int i) {
        this.f1737t = i;
    }
}
