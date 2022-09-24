package p006a5;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: a5.s */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C0116s {

    /* renamed from: a */
    private static final Pattern f264a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* renamed from: a */
    public static boolean m414a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
