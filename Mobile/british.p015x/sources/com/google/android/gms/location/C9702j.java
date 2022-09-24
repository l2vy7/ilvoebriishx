package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.j */
final class C9702j implements Comparator<DetectedActivity> {
    C9702j() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.mo38702C0()).compareTo(Integer.valueOf(detectedActivity.mo38702C0()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo38703D0()).compareTo(Integer.valueOf(detectedActivity2.mo38703D0())) : compareTo;
    }
}
