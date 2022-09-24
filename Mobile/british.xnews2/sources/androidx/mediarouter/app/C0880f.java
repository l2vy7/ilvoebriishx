package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p011b1.C1534b;
import p011b1.C1536d;

/* renamed from: androidx.mediarouter.app.f */
/* compiled from: MediaRouteDialogHelper */
final class C0880f {
    /* renamed from: a */
    public static int m4581a(Context context) {
        return !context.getResources().getBoolean(C1534b.is_tablet) ? -1 : -2;
    }

    /* renamed from: b */
    public static int m4582b(Context context) {
        int i;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z) {
            i = C1536d.mr_dialog_fixed_width_minor;
        } else {
            i = C1536d.mr_dialog_fixed_width_major;
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i2 != 6) {
            return -2;
        } else {
            int i3 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction((float) i3, (float) i3);
        }
        return (int) fraction;
    }

    /* renamed from: c */
    public static int m4583c(Context context) {
        if (!context.getResources().getBoolean(C1534b.is_tablet)) {
            return -1;
        }
        return m4582b(context);
    }

    /* renamed from: d */
    public static <E> HashMap<E, BitmapDrawable> m4584d(Context context, ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, BitmapDrawable> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            hashMap.put(arrayAdapter.getItem(firstVisiblePosition + i), m4588h(context, listView.getChildAt(i)));
        }
        return hashMap;
    }

    /* renamed from: e */
    public static <E> HashMap<E, Rect> m4585e(ListView listView, ArrayAdapter<E> arrayAdapter) {
        HashMap<E, Rect> hashMap = new HashMap<>();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); i++) {
            E item = arrayAdapter.getItem(firstVisiblePosition + i);
            View childAt = listView.getChildAt(i);
            hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static <E> Set<E> m4586f(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list2);
        hashSet.removeAll(list);
        return hashSet;
    }

    /* renamed from: g */
    public static <E> Set<E> m4587g(List<E> list, List<E> list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }

    /* renamed from: h */
    private static BitmapDrawable m4588h(Context context, View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* renamed from: i */
    public static <E> boolean m4589i(List<E> list, List<E> list2) {
        return new HashSet(list).equals(new HashSet(list2));
    }
}
