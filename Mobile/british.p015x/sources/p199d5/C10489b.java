package p199d5;

import android.os.IBinder;
import com.google.android.gms.common.internal.C4604n;
import java.lang.reflect.Field;
import p199d5.C10487a;

/* renamed from: d5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10489b<T> extends C10487a.C10488a {

    /* renamed from: b */
    private final T f49005b;

    private C10489b(T t) {
        this.f49005b = t;
    }

    /* renamed from: f3 */
    public static <T> T m48194f3(C10487a aVar) {
        if (aVar instanceof C10489b) {
            return ((C10489b) aVar).f49005b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C4604n.m20098k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: m6 */
    public static <T> C10487a m48195m6(T t) {
        return new C10489b(t);
    }
}
