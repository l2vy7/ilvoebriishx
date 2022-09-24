package com.startapp;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.networkTest.data.BatteryInfo;
import com.startapp.networkTest.enums.BatteryChargePlugTypes;
import com.startapp.networkTest.enums.BatteryHealthStates;
import com.startapp.networkTest.enums.BatteryStatusStates;

/* renamed from: com.startapp.y0 */
/* compiled from: Sta */
public class C12440y0 {

    /* renamed from: c */
    private static final String f55147c = "y0";

    /* renamed from: a */
    private BatteryManager f55148a;

    /* renamed from: b */
    private Context f55149b;

    public C12440y0(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f55148a = (BatteryManager) context.getSystemService("batterymanager");
        }
        this.f55149b = context;
    }

    /* renamed from: a */
    public BatteryInfo mo46829a() {
        BatteryChargePlugTypes batteryChargePlugTypes;
        BatteryHealthStates batteryHealthStates;
        Intent intent = null;
        try {
            intent = this.f55149b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable th) {
            C12356u2.m53522a(th);
        }
        BatteryInfo batteryInfo = new BatteryInfo();
        if (intent == null) {
            batteryInfo.MissingPermission = true;
            return batteryInfo;
        }
        int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_STATUS, 1);
        BatteryStatusStates batteryStatusStates = BatteryStatusStates.Unknown;
        if (intExtra == 2) {
            batteryStatusStates = BatteryStatusStates.Charging;
        } else if (intExtra == 3) {
            batteryStatusStates = BatteryStatusStates.Discharging;
        } else if (intExtra == 4) {
            batteryStatusStates = BatteryStatusStates.NotCharging;
        } else if (intExtra == 5) {
            batteryStatusStates = BatteryStatusStates.Full;
        }
        batteryInfo.BatteryStatus = batteryStatusStates;
        int intExtra2 = intent.getIntExtra("plugged", -1);
        if (intExtra2 == 1) {
            batteryChargePlugTypes = BatteryChargePlugTypes.AC;
        } else if (intExtra2 == 2) {
            batteryChargePlugTypes = BatteryChargePlugTypes.USB;
        } else if (intExtra2 != 4) {
            batteryChargePlugTypes = BatteryChargePlugTypes.Unknown;
        } else {
            batteryChargePlugTypes = BatteryChargePlugTypes.Wireless;
        }
        batteryInfo.BatteryChargePlug = batteryChargePlugTypes;
        batteryInfo.BatteryLevel = (((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1))) * 100.0f;
        int intExtra3 = intent.getIntExtra("health", -1);
        if (intExtra3 == 2) {
            batteryHealthStates = BatteryHealthStates.Good;
        } else if (intExtra3 == 3) {
            batteryHealthStates = BatteryHealthStates.Overheat;
        } else if (intExtra3 == 4) {
            batteryHealthStates = BatteryHealthStates.Dead;
        } else if (intExtra3 == 5) {
            batteryHealthStates = BatteryHealthStates.OverVoltage;
        } else if (intExtra3 != 7) {
            batteryHealthStates = BatteryHealthStates.Unknown;
        } else {
            batteryHealthStates = BatteryHealthStates.Cold;
        }
        batteryInfo.BatteryHealth = batteryHealthStates;
        int intExtra4 = intent.getIntExtra("temperature", -1);
        if (intExtra4 > -1) {
            batteryInfo.BatteryTemp = (((float) intExtra4) / 10.0f) + "";
        }
        int intExtra5 = intent.getIntExtra("voltage", -1);
        if (intExtra5 > -1) {
            batteryInfo.BatteryVoltage = intExtra5;
        }
        batteryInfo.BatteryTechnology = C11926ga.m52349a(intent.getStringExtra("technology"));
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                m53788a(batteryInfo);
            } catch (Throwable th2) {
                C12356u2.m53522a(th2);
            }
        }
        return batteryInfo;
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m53788a(BatteryInfo batteryInfo) {
        BatteryManager batteryManager = this.f55148a;
        if (batteryManager != null) {
            int intProperty = batteryManager.getIntProperty(1);
            if (intProperty != Integer.MIN_VALUE) {
                batteryInfo.BatteryCapacity = intProperty;
            }
            int intProperty2 = this.f55148a.getIntProperty(2);
            if (intProperty2 != Integer.MIN_VALUE) {
                batteryInfo.BatteryCurrent = intProperty2;
            }
            long longProperty = this.f55148a.getLongProperty(5);
            if (longProperty != Long.MIN_VALUE) {
                batteryInfo.BatteryRemainingEnergy = longProperty;
            }
        }
    }
}
