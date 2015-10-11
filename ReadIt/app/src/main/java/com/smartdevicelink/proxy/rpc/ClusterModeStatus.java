package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.CarModeStatus;
import com.smartdevicelink.proxy.rpc.enums.PowerModeQualificationStatus;
import com.smartdevicelink.proxy.rpc.enums.PowerModeStatus;

public class ClusterModeStatus extends RPCStruct {
    public static final String KEY_POWER_MODE_ACTIVE = "powerModeActive";
    public static final String KEY_POWER_MODE_QUALIFICATION_STATUS = "powerModeQualificationStatus";
    public static final String KEY_CAR_MODE_STATUS = "carModeStatus";
    public static final String KEY_POWER_MODE_STATUS = "powerModeStatus";

	    public ClusterModeStatus() { }
	    public ClusterModeStatus(Hashtable<String, Object> hash) {
	        super(hash);
	    }

	    public void setPowerModeActive(Boolean powerModeActive) {
	        if (powerModeActive != null) {
	        	store.put(KEY_POWER_MODE_ACTIVE, powerModeActive);
	        } else {
	        	store.remove(KEY_POWER_MODE_ACTIVE);
	        }
	    }
	    public Boolean getPowerModeActive() {
	        return (Boolean) store.get(KEY_POWER_MODE_ACTIVE);
	    }
	    public void setPowerModeQualificationStatus(PowerModeQualificationStatus powerModeQualificationStatus) {
	        if (powerModeQualificationStatus != null) {
	            store.put(KEY_POWER_MODE_QUALIFICATION_STATUS, powerModeQualificationStatus);
	        } else {
	        	store.remove(KEY_POWER_MODE_QUALIFICATION_STATUS);
	        }
	    }
	    public PowerModeQualificationStatus getPowerModeQualificationStatus() {
	        Object obj = store.get(KEY_POWER_MODE_QUALIFICATION_STATUS);
	        if (obj instanceof PowerModeQualificationStatus) {
	            return (PowerModeQualificationStatus) obj;
	        } else if (obj instanceof String) {
	        	return PowerModeQualificationStatus.valueForString((String) obj);
	        }
	        return null;
	    }
	    public void setCarModeStatus(CarModeStatus carModeStatus) {
	        if (carModeStatus != null) {
	            store.put(KEY_CAR_MODE_STATUS, carModeStatus);
	        } else {
	        	store.remove(KEY_CAR_MODE_STATUS);
	        }
	    }
	    public CarModeStatus getCarModeStatus() {
	        Object obj = store.get(KEY_CAR_MODE_STATUS);
	        if (obj instanceof CarModeStatus) {
	            return (CarModeStatus) obj;
	        } else if (obj instanceof String) {
	        	return CarModeStatus.valueForString((String) obj);
	        }
	        return null;
	    }
	    public void setPowerModeStatus(PowerModeStatus powerModeStatus) {
	        if (powerModeStatus != null) {
	            store.put(KEY_POWER_MODE_STATUS, powerModeStatus);
	        } else {
	        	store.remove(KEY_POWER_MODE_STATUS);
	        }
	    }
	    public PowerModeStatus getPowerModeStatus() {
	        Object obj = store.get(KEY_POWER_MODE_STATUS);
	        if (obj instanceof PowerModeStatus) {
	            return (PowerModeStatus) obj;
	        } else if (obj instanceof String) {
	        	return PowerModeStatus.valueForString((String) obj);
	        }
	        return null;
	    }
}
