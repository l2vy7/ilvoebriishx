package com.startapp;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.xc */
/* compiled from: Sta */
public class C12435xc {
    /* renamed from: a */
    public static NotDisplayedReason m53767a(View view, BannerOptions bannerOptions, AtomicReference<JSONObject> atomicReference) {
        ViewGroup viewGroup = view;
        AtomicReference<JSONObject> atomicReference2 = atomicReference;
        if (viewGroup == null) {
            return NotDisplayedReason.INTERNAL_ERROR;
        }
        if (view.getParent() == null) {
            return NotDisplayedReason.VIEW_NOT_ATTACHED;
        }
        if (view.getRootView() == null) {
            return NotDisplayedReason.VIEW_NOT_ATTACHED;
        }
        if (view.getRootView().getParent() == null) {
            return NotDisplayedReason.VIEW_NOT_ATTACHED;
        }
        if (bannerOptions.mo45797r() && !view.hasWindowFocus()) {
            return NotDisplayedReason.WINDOW_NOT_FOCUSED;
        }
        if (!view.isShown()) {
            return NotDisplayedReason.VIEW_NOT_VISIBLE;
        }
        if (view.getWidth() < 1 || view.getHeight() < 1) {
            return NotDisplayedReason.VIEW_INVALID_SIZE;
        }
        int height = ((view.getHeight() * view.getWidth()) * Math.min(Math.max(1, bannerOptions.mo45786h()), 100)) / 100;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return NotDisplayedReason.AD_CLIPPED;
        }
        if (rect.isEmpty()) {
            return NotDisplayedReason.AD_CLIPPED;
        }
        Rect rect2 = null;
        if (!bannerOptions.mo45796q()) {
            return null;
        }
        Region region = new Region(rect);
        Rect rect3 = new Rect();
        atomicReference2.set(m53769a(viewGroup, rect, true));
        NotDisplayedReason notDisplayedReason = NotDisplayedReason.AD_CLIPPED;
        while (true) {
            int i = 0;
            if (!(viewGroup.getParent() instanceof ViewGroup)) {
                RegionIterator regionIterator = new RegionIterator(region);
                while (regionIterator.next(rect3)) {
                    i += rect3.height() * rect3.width();
                    if (i >= height) {
                        return null;
                    }
                }
                return notDisplayedReason;
            } else if (Build.VERSION.SDK_INT >= 11 && viewGroup.getAlpha() < 1.0f) {
                return NotDisplayedReason.VIEW_TRANSPARENT;
            } else {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                JSONObject a = m53769a((View) viewGroup2, rect2, false);
                m53770a(a, atomicReference.get());
                atomicReference2.set(a);
                int indexOfChild = viewGroup2.indexOfChild(viewGroup);
                int childCount = viewGroup2.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = viewGroup2.getChildAt(i2);
                    if (childAt != viewGroup) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            int compare = Float.compare(childAt.getZ(), viewGroup.getZ());
                            if (compare >= 0) {
                                if (compare == 0 && i2 <= indexOfChild) {
                                }
                            }
                        } else if (i2 <= indexOfChild) {
                        }
                        if (childAt != null && childAt.getVisibility() == 0 && childAt.getGlobalVisibleRect(rect3) && Rect.intersects(rect, rect3)) {
                            region.op(rect3, Region.Op.DIFFERENCE);
                            m53770a(a, m53769a(childAt, rect3, false));
                            notDisplayedReason = NotDisplayedReason.AD_WAS_COVERED;
                        }
                    }
                    i2++;
                    rect2 = null;
                }
                viewGroup = viewGroup2;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r1 = "0x" + java.lang.Integer.toHexString(r3.getId());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m53769a(android.view.View r3, android.graphics.Rect r4, boolean r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "class"
            java.lang.String r2 = m53768a(r3)     // Catch:{ JSONException -> 0x0089 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0089 }
            int r1 = r3.getId()     // Catch:{ JSONException -> 0x0089 }
            r2 = -1
            if (r1 != r2) goto L_0x0017
            r1 = 0
            goto L_0x0041
        L_0x0017:
            android.content.Context r1 = r3.getContext()     // Catch:{ NotFoundException -> 0x0028 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0028 }
            int r2 = r3.getId()     // Catch:{ NotFoundException -> 0x0028 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0028 }
            goto L_0x0041
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0089 }
            r1.<init>()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r2 = "0x"
            r1.append(r2)     // Catch:{ JSONException -> 0x0089 }
            int r2 = r3.getId()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch:{ JSONException -> 0x0089 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0089 }
        L_0x0041:
            if (r1 == 0) goto L_0x0048
            java.lang.String r2 = "id"
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x0089 }
        L_0x0048:
            if (r5 == 0) goto L_0x0050
            java.lang.String r5 = "target"
            r1 = 1
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0089 }
        L_0x0050:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0089 }
            r1 = 11
            if (r5 < r1) goto L_0x006a
            float r5 = r3.getAlpha()     // Catch:{ JSONException -> 0x0089 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x006a
            java.lang.String r5 = "alpha"
            float r3 = r3.getAlpha()     // Catch:{ JSONException -> 0x0089 }
            double r1 = (double) r3     // Catch:{ JSONException -> 0x0089 }
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0089 }
        L_0x006a:
            if (r4 == 0) goto L_0x0088
            java.lang.String r3 = "left"
            int r5 = r4.left     // Catch:{ JSONException -> 0x0089 }
            r0.put(r3, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r3 = "top"
            int r5 = r4.top     // Catch:{ JSONException -> 0x0089 }
            r0.put(r3, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r3 = "right"
            int r5 = r4.right     // Catch:{ JSONException -> 0x0089 }
            r0.put(r3, r5)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r3 = "bottom"
            int r4 = r4.bottom     // Catch:{ JSONException -> 0x0089 }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x0089 }
        L_0x0088:
            return r0
        L_0x0089:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12435xc.m53769a(android.view.View, android.graphics.Rect, boolean):org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m53770a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
            try {
                jSONObject.put("children", optJSONArray);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        optJSONArray.put(jSONObject2);
    }

    /* renamed from: a */
    public static String m53768a(View view) {
        String name = view.getClass().getName();
        if (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("com.android.")) {
            return view.getClass().getSimpleName();
        }
        String packageName = view.getContext().getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".");
        return name.startsWith(sb.toString()) ? name.substring(packageName.length()) : name;
    }
}
