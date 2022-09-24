package com.startapp;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.startapp.networkTest.enums.C12084Os;
import com.startapp.networkTest.enums.IdleStates;
import com.startapp.networkTest.enums.MemoryStates;
import com.startapp.networkTest.enums.MultiSimVariants;
import com.startapp.networkTest.enums.PhoneTypes;
import com.startapp.networkTest.enums.ScreenStates;
import com.startapp.networkTest.enums.SimStates;
import com.startapp.networkTest.enums.ThreeState;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.startapp.m2 */
/* compiled from: Sta */
public class C12042m2 {

    /* renamed from: a */
    private static final String f53261a = "m2";

    /* renamed from: b */
    private static final boolean f53262b = false;

    /* renamed from: com.startapp.m2$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C12043a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53263a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53263a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53263a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53263a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12042m2.C12043a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static C11976j1 m52572a(Context context) {
        C11976j1 j1Var = new C11976j1();
        j1Var.MissingPermission = true;
        return j1Var;
    }

    /* renamed from: b */
    public static C12070n2 m52578b(Context context) {
        String[] strArr;
        C12070n2 n2Var = new C12070n2();
        n2Var.DeviceManufacturer = Build.MANUFACTURER;
        n2Var.DeviceName = Build.MODEL;
        n2Var.f53324OS = C12084Os.Android;
        n2Var.OSVersion = Build.VERSION.RELEASE;
        n2Var.BuildFingerprint = Build.FINGERPRINT;
        n2Var.DeviceUpTime = SystemClock.elapsedRealtime();
        n2Var.UserLocal = Locale.getDefault().toString();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            n2Var.SimOperator = C11926ga.m52349a(telephonyManager.getSimOperator());
            n2Var.SimOperatorName = C11926ga.m52349a(telephonyManager.getSimOperatorName());
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                String typeAllocationCode = telephonyManager.getTypeAllocationCode();
                if (typeAllocationCode == null || typeAllocationCode.isEmpty()) {
                    String manufacturerCode = telephonyManager.getManufacturerCode();
                    if (manufacturerCode != null && !manufacturerCode.isEmpty()) {
                        n2Var.TAC = manufacturerCode;
                    }
                } else {
                    n2Var.TAC = typeAllocationCode;
                }
            }
            SimStates simStates = SimStates.Unknown;
            int simState = telephonyManager.getSimState();
            if (simState == 1) {
                simStates = SimStates.Absent;
            } else if (simState == 2) {
                simStates = SimStates.PinRequired;
            } else if (simState == 3) {
                simStates = SimStates.PukRequired;
            } else if (simState == 4) {
                simStates = SimStates.NetworkLocked;
            } else if (simState == 5) {
                simStates = SimStates.Ready;
            }
            n2Var.SimState = simStates;
            if (i >= 23) {
                try {
                    n2Var.PhoneCount = ((Integer) telephonyManager.getClass().getDeclaredMethod("getPhoneCount", new Class[0]).invoke(telephonyManager, new Object[0])).intValue();
                } catch (Throwable th) {
                    C12356u2.m53524b(th);
                }
            }
            PhoneTypes phoneTypes = PhoneTypes.Unknown;
            int phoneType = telephonyManager.getPhoneType();
            if (phoneType == 0) {
                phoneTypes = PhoneTypes.None;
            } else if (phoneType == 1) {
                phoneTypes = PhoneTypes.GSM;
            } else if (phoneType == 2) {
                phoneTypes = PhoneTypes.CDMA;
            } else if (phoneType == 3) {
                phoneTypes = PhoneTypes.SIP;
            }
            n2Var.PhoneType = phoneTypes;
        }
        n2Var.IsRooted = m52577a();
        if (Build.VERSION.SDK_INT <= 24) {
            strArr = C12130p9.m52744a("/proc/version");
        } else {
            strArr = C12130p9.m52745b("uname -a");
        }
        if (strArr.length > 0) {
            n2Var.OsSystemVersion = C11926ga.m52349a(strArr[0]);
        }
        n2Var.BluetoothInfo = m52572a(context);
        n2Var.PowerSaveMode = m52585g(context);
        n2Var.MultiSimInfo = m52584f(context);
        n2Var.HostAppInfo = m52581c(context);
        return n2Var;
    }

    /* renamed from: c */
    private static C12340t3 m52581c(Context context) {
        C12340t3 t3Var = new C12340t3();
        t3Var.AppPackageName = context.getPackageName();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            } catch (Throwable th) {
                C12356u2.m53524b(th);
            }
        }
        if (applicationInfo != null) {
            t3Var.AppTargetVersion = applicationInfo.targetSdkVersion;
            t3Var.AppName = (String) applicationInfo.loadLabel(context.getPackageManager());
            if (Build.VERSION.SDK_INT >= 26) {
                t3Var.AppCategory = C11912g0.m52326a(applicationInfo.category);
            }
        }
        ArrayList<C11794b0> arrayList = new ArrayList<>();
        try {
            for (String str : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions) {
                C11794b0 b0Var = new C11794b0();
                b0Var.Permission = str.toLowerCase();
                if (str.equalsIgnoreCase("android.permission.PACKAGE_USAGE_STATS")) {
                    b0Var.IsGranted = C11912g0.m52329b(context) ? 1 : 0;
                } else {
                    b0Var.IsGranted = context.checkPermission(str, Process.myPid(), Process.myUid()) == 0 ? 1 : 0;
                }
                arrayList.add(b0Var);
            }
        } catch (Throwable th2) {
            t3Var.AppPermissions = arrayList;
            throw th2;
        }
        t3Var.AppPermissions = arrayList;
        return t3Var;
    }

    /* renamed from: d */
    public static IdleStates m52582d(Context context) {
        PowerManager powerManager;
        IdleStates idleStates = IdleStates.Unknown;
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return idleStates;
        }
        if (i >= 24) {
            try {
                if (((Boolean) powerManager.getClass().getDeclaredMethod("isLightDeviceIdleMode", new Class[0]).invoke(powerManager, new Object[0])).booleanValue()) {
                    idleStates = IdleStates.LightIdle;
                }
            } catch (Throwable th) {
                C12356u2.m53524b(th);
            }
        }
        if (idleStates != IdleStates.LightIdle) {
            return powerManager.isDeviceIdleMode() ? IdleStates.DeepIdle : IdleStates.NonIdle;
        }
        return idleStates;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public static C11801b6 m52583e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        C11801b6 b6Var = new C11801b6();
        long j = memoryInfo.availMem;
        b6Var.MemoryFree = j;
        if (Build.VERSION.SDK_INT >= 16) {
            long j2 = memoryInfo.totalMem;
            b6Var.MemoryTotal = j2;
            b6Var.MemoryUsed = j2 - j;
        }
        if (memoryInfo.lowMemory) {
            b6Var.MemoryState = MemoryStates.Low;
        } else {
            b6Var.MemoryState = MemoryStates.Normal;
        }
        return b6Var;
    }

    /* renamed from: f */
    public static C12179s6 m52584f(Context context) {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        SimStates simStates;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        C12179s6 s6Var = new C12179s6();
        if (Build.VERSION.SDK_INT >= 22 && context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
            char c = 65535;
            if (subscriptionManager != null) {
                s6Var.ActiveSimCount = subscriptionManager.getActiveSubscriptionInfoCount();
                s6Var.ActiveSimCountMax = subscriptionManager.getActiveSubscriptionInfoCountMax();
                List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList != null && activeSubscriptionInfoList.size() > 0) {
                    C12166r9[] r9VarArr = new C12166r9[activeSubscriptionInfoList.size()];
                    int i = 0;
                    for (SubscriptionInfo next : activeSubscriptionInfoList) {
                        C12166r9 r9Var = new C12166r9();
                        try {
                            if (next.getCarrierName() != null) {
                                r9Var.CarrierName = C11926ga.m52349a(next.getCarrierName().toString());
                            }
                        } catch (Throwable th) {
                            C12356u2.m53524b(th);
                        }
                        try {
                            if (next.getCountryIso() != null) {
                                r9Var.CountryIso = C11926ga.m52349a(next.getCountryIso());
                            }
                        } catch (Throwable th2) {
                            C12356u2.m53524b(th2);
                        }
                        try {
                            if (next.getIccId() != null) {
                                r9Var.IccId = m52575a(C11926ga.m52349a(next.getIccId()));
                            }
                        } catch (Throwable th3) {
                            C12356u2.m53524b(th3);
                        }
                        r9Var.Mcc = next.getMcc() == Integer.MAX_VALUE ? -1 : next.getMcc();
                        r9Var.Mnc = next.getMnc() == Integer.MAX_VALUE ? -1 : next.getMnc();
                        r9Var.SimSlotIndex = next.getSimSlotIndex();
                        r9Var.SubscriptionId = next.getSubscriptionId();
                        r9Var.DataRoaming = next.getDataRoaming() == 1;
                        m52576a(context, r9Var.SubscriptionId, r9Var);
                        r9VarArr[i] = r9Var;
                        i++;
                    }
                    s6Var.SimInfos = new ArrayList<>(Arrays.asList(r9VarArr));
                }
                try {
                    method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e) {
                    C12356u2.m53524b(e);
                    method5 = null;
                }
                if (method5 == null) {
                    try {
                        method5 = subscriptionManager.getClass().getDeclaredMethod("getDefaultDataSubId", new Class[0]);
                    } catch (NoSuchMethodException e2) {
                        C12356u2.m53524b(e2);
                    }
                }
                if (method5 != null) {
                    try {
                        s6Var.DefaultDataSimId = ((Integer) method5.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th4) {
                        C12356u2.m53522a(th4);
                    }
                }
                try {
                    method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e3) {
                    C12356u2.m53524b(e3);
                    method6 = null;
                }
                if (method6 == null) {
                    try {
                        method6 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSmsSubId", new Class[0]);
                    } catch (NoSuchMethodException e4) {
                        C12356u2.m53524b(e4);
                    }
                }
                if (method6 != null) {
                    try {
                        s6Var.DefaultSmsSimId = ((Integer) method6.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th5) {
                        C12356u2.m53522a(th5);
                    }
                }
                try {
                    method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e5) {
                    C12356u2.m53524b(e5);
                    method7 = null;
                }
                if (method7 == null) {
                    try {
                        method7 = subscriptionManager.getClass().getDeclaredMethod("getDefaultSubId", new Class[0]);
                    } catch (NoSuchMethodException e6) {
                        C12356u2.m53524b(e6);
                    }
                }
                if (method7 != null) {
                    try {
                        s6Var.DefaultSimId = ((Integer) method7.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th6) {
                        C12356u2.m53522a(th6);
                    }
                }
                try {
                    method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubscriptionId", new Class[0]);
                } catch (NoSuchMethodException e7) {
                    C12356u2.m53524b(e7);
                    method8 = null;
                }
                if (method8 == null) {
                    try {
                        method8 = subscriptionManager.getClass().getDeclaredMethod("getDefaultVoiceSubId", new Class[0]);
                    } catch (NoSuchMethodException e8) {
                        C12356u2.m53524b(e8);
                    }
                }
                if (method8 != null) {
                    try {
                        s6Var.DefaultVoiceSimId = ((Integer) method8.invoke(subscriptionManager, new Object[0])).intValue();
                    } catch (Throwable th7) {
                        C12356u2.m53522a(th7);
                    }
                }
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    method = telephonyManager.getClass().getDeclaredMethod("getMultiSimConfiguration", new Class[0]);
                } catch (NoSuchMethodException e9) {
                    C12356u2.m53524b(e9);
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(telephonyManager, new Object[0]);
                        if (invoke instanceof Enum) {
                            String obj = invoke.toString();
                            int hashCode = obj.hashCode();
                            if (hashCode != 2107724) {
                                if (hashCode != 2107742) {
                                    if (hashCode == 2584894) {
                                        if (obj.equals("TSTS")) {
                                            c = 2;
                                        }
                                    }
                                } else if (obj.equals("DSDS")) {
                                    c = 1;
                                }
                            } else if (obj.equals("DSDA")) {
                                c = 0;
                            }
                            if (c == 0) {
                                s6Var.MultiSimVariant = MultiSimVariants.DSDA;
                            } else if (c == 1) {
                                s6Var.MultiSimVariant = MultiSimVariants.DSDS;
                            } else if (c != 2) {
                                s6Var.MultiSimVariant = MultiSimVariants.Unknown;
                            } else {
                                s6Var.MultiSimVariant = MultiSimVariants.TSTS;
                            }
                        }
                    } catch (Throwable th8) {
                        C12356u2.m53522a(th8);
                    }
                }
                Iterator<C12166r9> it = s6Var.SimInfos.iterator();
                while (it.hasNext()) {
                    C12166r9 next2 = it.next();
                    try {
                        method2 = telephonyManager.getClass().getDeclaredMethod("getSimState", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e10) {
                        C12356u2.m53524b(e10);
                        method2 = null;
                    }
                    if (method2 != null) {
                        try {
                            switch (((Integer) method2.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SimSlotIndex)})).intValue()) {
                                case 1:
                                    simStates = SimStates.Absent;
                                    break;
                                case 2:
                                    simStates = SimStates.PinRequired;
                                    break;
                                case 3:
                                    simStates = SimStates.PukRequired;
                                    break;
                                case 4:
                                    simStates = SimStates.NetworkLocked;
                                    break;
                                case 5:
                                    simStates = SimStates.Ready;
                                    break;
                                case 6:
                                    simStates = SimStates.NotReady;
                                    break;
                                case 7:
                                    simStates = SimStates.PermanentlyDisabled;
                                    break;
                                case 8:
                                    simStates = SimStates.CardIoError;
                                    break;
                                case 9:
                                    simStates = SimStates.CardRestricted;
                                    break;
                                default:
                                    simStates = SimStates.Unknown;
                                    break;
                            }
                            next2.SimState = simStates;
                        } catch (Throwable th9) {
                            C12356u2.m53522a(th9);
                        }
                    }
                    try {
                        method3 = telephonyManager.getClass().getDeclaredMethod("getSubscriberId", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e11) {
                        C12356u2.m53524b(e11);
                        method3 = null;
                    }
                    if (method3 != null) {
                        try {
                            next2.IMSI = m52579b(C11926ga.m52349a((String) method3.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)})));
                        } catch (Throwable th10) {
                            C12356u2.m53522a(th10);
                        }
                    }
                    try {
                        method4 = telephonyManager.getClass().getDeclaredMethod("getGroupIdLevel1", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e12) {
                        C12356u2.m53524b(e12);
                        method4 = null;
                    }
                    if (method4 != null) {
                        try {
                            next2.GroupIdentifierLevel1 = C11926ga.m52349a((String) method4.invoke(telephonyManager, new Object[]{Integer.valueOf(next2.SubscriptionId)}));
                        } catch (Throwable th11) {
                            C12356u2.m53522a(th11);
                        }
                    }
                }
            }
        }
        return s6Var;
    }

    /* renamed from: g */
    private static ThreeState m52585g(Context context) {
        try {
            String string = Settings.System.getString(context.getContentResolver(), "user_powersaver_enable");
            if (string != null) {
                return string.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) ? ThreeState.Enabled : ThreeState.Disabled;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (Build.MANUFACTURER.toLowerCase().startsWith("sony") && i < 23) {
                    return ThreeState.Unknown;
                }
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode() ? ThreeState.Enabled : ThreeState.Disabled;
                }
            }
            return ThreeState.Unknown;
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
    }

    /* renamed from: h */
    public static ScreenStates m52586h(Context context) {
        ScreenStates screenStates = ScreenStates.Unknown;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isScreenOn() ? ScreenStates.On : ScreenStates.Off;
        }
        return screenStates;
    }

    /* renamed from: i */
    public static C12166r9 m52587i(Context context) {
        return m52584f(context).getDefaultDataSimInfo();
    }

    /* renamed from: j */
    public static C12166r9 m52588j(Context context) {
        return m52584f(context).getDefaultVoiceSimInfo();
    }

    /* renamed from: k */
    public static C11870da m52589k(Context context) {
        C11870da daVar = new C11870da();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = (long) statFs.getBlockSize();
        daVar.StorageInternalSize = ((long) statFs.getBlockCount()) * blockSize;
        daVar.StorageInternalAvailable = blockSize * ((long) statFs.getAvailableBlocks());
        daVar.StorageInternalAudio = m52571a(context, MediaStore.Audio.Media.INTERNAL_CONTENT_URI);
        daVar.StorageInternalImages = m52571a(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        daVar.StorageInternalVideo = m52571a(context, MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        if (m52580b()) {
            try {
                StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                long blockSize2 = (long) statFs2.getBlockSize();
                daVar.StorageExternalSize = ((long) statFs2.getBlockCount()) * blockSize2;
                daVar.StorageExternalAvailable = blockSize2 * ((long) statFs2.getAvailableBlocks());
            } catch (IllegalArgumentException unused) {
                daVar.StorageExternalSize = -1;
                daVar.StorageExternalAvailable = -1;
            }
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                daVar.StorageExternalAudio = m52571a(context, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                daVar.StorageExternalImages = m52571a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                daVar.StorageExternalVideo = m52571a(context, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            }
        }
        return daVar;
    }

    /* renamed from: a */
    private static boolean m52577a() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static long m52571a(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_size"}, (String) null, (String[]) null, (String) null);
            long j = 0;
            if (cursor != null) {
                if (cursor.getCount() == 0) {
                    cursor.close();
                    return 0;
                }
                while (cursor.moveToNext()) {
                    j += cursor.getLong(cursor.getColumnIndexOrThrow("_size"));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static C12415wa m52574a(C11891ed edVar) {
        C12415wa waVar = new C12415wa();
        waVar.MobileRxBytes = C12433xa.m53762e();
        waVar.MobileTxBytes = C12433xa.m53763f();
        waVar.TotalRxBytes = TrafficStats.getTotalRxBytes();
        waVar.TotalTxBytes = TrafficStats.getTotalTxBytes();
        if (edVar != null) {
            waVar.WifiRxBytes = edVar.mo45334d();
            waVar.WifiTxBytes = edVar.mo45335e();
        } else {
            waVar.WifiRxBytes = -1;
            waVar.WifiTxBytes = -1;
        }
        return waVar;
    }

    /* renamed from: a */
    public static C12166r9 m52573a(int i, Context context) {
        return m52584f(context).getSimInfoSubId(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m52576a(android.content.Context r9, int r10, com.startapp.C12166r9 r11) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "apn"
            r2 = -1
            if (r10 == r2) goto L_0x000e
            java.lang.String r2 = "content://telephony/carriers/preferapn/subId/"
            java.lang.String r10 = com.startapp.C12024l2.m52554a(r2, r10)
            goto L_0x0010
        L_0x000e:
            java.lang.String r10 = "content://telephony/carriers/preferapn"
        L_0x0010:
            r2 = 0
            android.net.Uri r4 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x004b }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ all -> 0x004b }
            java.lang.String[] r5 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x004b }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004b }
            if (r9 == 0) goto L_0x0047
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r10 == 0) goto L_0x0047
            int r10 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0044 }
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0044 }
            r11.Apn = r10     // Catch:{ all -> 0x0044 }
            r11.ApnTypes = r0     // Catch:{ all -> 0x0044 }
            r9.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r10 = move-exception
            r2 = r9
            goto L_0x004c
        L_0x0047:
            r2 = r9
        L_0x0048:
            if (r2 == 0) goto L_0x0059
            goto L_0x0051
        L_0x004b:
            r10 = move-exception
        L_0x004c:
            com.startapp.C12356u2.m53522a((java.lang.Throwable) r10)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
        L_0x0051:
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r9 = move-exception
            com.startapp.C12356u2.m53524b(r9)
        L_0x0059:
            return
        L_0x005a:
            r9 = move-exception
            if (r2 == 0) goto L_0x0065
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r10 = move-exception
            com.startapp.C12356u2.m53524b(r10)
        L_0x0065:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12042m2.m52576a(android.content.Context, int, com.startapp.r9):void");
    }

    /* renamed from: a */
    private static String m52575a(String str) {
        int i;
        if (str.length() == 0 || (i = C12043a.f53263a[C12385v4.m53561b().SIMINFO_ICCID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() < 11) {
            return str.replaceAll("[\\d\\w]", "*");
        }
        String substring = str.substring(0, 7);
        String replaceAll = str.substring(7, str.length()).replaceAll("[\\d\\w]", "*");
        return substring + replaceAll;
    }

    /* renamed from: b */
    private static boolean m52580b() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            C12356u2.m53522a(th);
            return false;
        }
    }

    /* renamed from: b */
    private static String m52579b(String str) {
        int i;
        if (str.length() == 0 || (i = C12043a.f53263a[C12385v4.m53561b().SIMINFO_IMSI_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() < 14) {
            return str.replaceAll("[\\d\\w]", "*");
        }
        String substring = str.substring(0, 10);
        String replaceAll = str.substring(10, str.length()).replaceAll("[\\d\\w]", "*");
        return substring + replaceAll;
    }
}
