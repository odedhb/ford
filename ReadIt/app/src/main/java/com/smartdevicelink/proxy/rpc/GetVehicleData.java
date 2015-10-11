package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

public class GetVehicleData extends RPCRequest {
	public static final String KEY_SPEED = "speed";
	public static final String KEY_RPM = "rpm";
	public static final String KEY_EXTERNAL_TEMPERATURE = "externalTemperature";
	public static final String KEY_FUEL_LEVEL = "fuelLevel";
	public static final String KEY_VIN = "vin";
	public static final String KEY_PRNDL = "prndl";
	public static final String KEY_TIRE_PRESSURE = "tirePressure";
	public static final String KEY_ENGINE_TORQUE = "engineTorque";
	public static final String KEY_ODOMETER = "odometer";
	public static final String KEY_GPS = "gps";
	public static final String KEY_FUEL_LEVEL_STATE = "fuelLevel_State";
	public static final String KEY_INSTANT_FUEL_CONSUMPTION = "instantFuelConsumption";
	public static final String KEY_BELT_STATUS = "beltStatus";
	public static final String KEY_BODY_INFORMATION = "bodyInformation";
	public static final String KEY_DEVICE_STATUS = "deviceStatus";
	public static final String KEY_DRIVER_BRAKING = "driverBraking";
	public static final String KEY_WIPER_STATUS = "wiperStatus";
	public static final String KEY_HEAD_LAMP_STATUS = "headLampStatus";
	public static final String KEY_ACC_PEDAL_POSITION = "accPedalPosition";
	public static final String KEY_STEERING_WHEEL_ANGLE = "steeringWheelAngle";
	public static final String KEY_E_CALL_INFO = "eCallInfo";
	public static final String KEY_AIRBAG_STATUS = "airbagStatus";
	public static final String KEY_EMERGENCY_EVENT = "emergencyEvent";
	public static final String KEY_CLUSTER_MODE_STATUS = "clusterModeStatus";
	public static final String KEY_MY_KEY = "myKey";

    public GetVehicleData() {
        super(FunctionID.GET_VEHICLE_DATA.toString());
    }
    public GetVehicleData(Hashtable<String, Object> hash) {
        super(hash);
    }
    public void setGps(Boolean gps) {
        if (gps != null) {
            parameters.put(KEY_GPS, gps);
        } else {
        	parameters.remove(KEY_GPS);
        }
    }
    public Boolean getGps() {
        return (Boolean) parameters.get(KEY_GPS);
    }
    public void setSpeed(Boolean speed) {
        if (speed != null) {
            parameters.put(KEY_SPEED, speed);
        } else {
        	parameters.remove(KEY_SPEED);
        }
    }
    public Boolean getSpeed() {
        return (Boolean) parameters.get(KEY_SPEED);
    }
    public void setRpm(Boolean rpm) {
        if (rpm != null) {
            parameters.put(KEY_RPM, rpm);
        } else {
        	parameters.remove(KEY_RPM);
        }
    }
    public Boolean getRpm() {
        return (Boolean) parameters.get(KEY_RPM);
    }
    public void setFuelLevel(Boolean fuelLevel) {
        if (fuelLevel != null) {
            parameters.put(KEY_FUEL_LEVEL, fuelLevel);
        } else {
        	parameters.remove(KEY_FUEL_LEVEL);
        }
    }
    public Boolean getFuelLevel() {
        return (Boolean) parameters.get(KEY_FUEL_LEVEL);
    }
    @Deprecated
    public void setFuelLevel_State(Boolean fuelLevel_State) {
        setFuelLevelState(fuelLevel_State);
    }
    @Deprecated
    public Boolean getFuelLevel_State() {
        return getFuelLevelState();
    }
    public void setFuelLevelState(Boolean fuelLevelState) {
        if (fuelLevelState != null) {
            parameters.put(KEY_FUEL_LEVEL_STATE, fuelLevelState);
        } else {
            parameters.remove(KEY_FUEL_LEVEL_STATE);
        }
    }
    public Boolean getFuelLevelState() {
        return (Boolean) parameters.get(KEY_FUEL_LEVEL_STATE);
    }
    public void setInstantFuelConsumption(Boolean instantFuelConsumption) {
        if (instantFuelConsumption != null) {
            parameters.put(KEY_INSTANT_FUEL_CONSUMPTION, instantFuelConsumption);
        } else {
        	parameters.remove(KEY_INSTANT_FUEL_CONSUMPTION);
        }
    }
    public Boolean getInstantFuelConsumption() {
        return (Boolean) parameters.get(KEY_INSTANT_FUEL_CONSUMPTION);
    }
    public void setExternalTemperature(Boolean externalTemperature) {
        if (externalTemperature != null) {
            parameters.put(KEY_EXTERNAL_TEMPERATURE, externalTemperature);
        } else {
        	parameters.remove(KEY_EXTERNAL_TEMPERATURE);
        }
    }
    public Boolean getExternalTemperature() {
        return (Boolean) parameters.get(KEY_EXTERNAL_TEMPERATURE);
    }
    
    public void setVin(Boolean vin) {
        if (vin != null) {
            parameters.put(KEY_VIN, vin);
        } else {
        	parameters.remove(KEY_VIN);
        }
    }
    public Boolean getVin() {
        return (Boolean) parameters.get(KEY_VIN);
    }
    
    public void setPrndl(Boolean prndl) {
        if (prndl != null) {
            parameters.put(KEY_PRNDL, prndl);
        } else {
        	parameters.remove(KEY_PRNDL);
        }
    }
    public Boolean getPrndl() {
        return (Boolean) parameters.get(KEY_PRNDL);
    }
    public void setTirePressure(Boolean tirePressure) {
        if (tirePressure != null) {
            parameters.put(KEY_TIRE_PRESSURE, tirePressure);
        } else {
        	parameters.remove(KEY_TIRE_PRESSURE);
        }
    }
    public Boolean getTirePressure() {
        return (Boolean) parameters.get(KEY_TIRE_PRESSURE);
    }
    public void setOdometer(Boolean odometer) {
        if (odometer != null) {
            parameters.put(KEY_ODOMETER, odometer);
        } else {
        	parameters.remove(KEY_ODOMETER);
        }
    }
    public Boolean getOdometer() {
        return (Boolean) parameters.get(KEY_ODOMETER);
    }
    public void setBeltStatus(Boolean beltStatus) {
        if (beltStatus != null) {
            parameters.put(KEY_BELT_STATUS, beltStatus);
        } else {
        	parameters.remove(KEY_BELT_STATUS);
        }
    }
    public Boolean getBeltStatus() {
        return (Boolean) parameters.get(KEY_BELT_STATUS);
    }
    public void setBodyInformation(Boolean bodyInformation) {
        if (bodyInformation != null) {
            parameters.put(KEY_BODY_INFORMATION, bodyInformation);
        } else {
        	parameters.remove(KEY_BODY_INFORMATION);
        }
    }
    public Boolean getBodyInformation() {
        return (Boolean) parameters.get(KEY_BODY_INFORMATION);
    }
    public void setDeviceStatus(Boolean deviceStatus) {
        if (deviceStatus != null) {
            parameters.put(KEY_DEVICE_STATUS, deviceStatus);
        } else {
        	parameters.remove(KEY_DEVICE_STATUS);
        }
    }
    public Boolean getDeviceStatus() {
        return (Boolean) parameters.get(KEY_DEVICE_STATUS);
    }
    public void setDriverBraking(Boolean driverBraking) {
        if (driverBraking != null) {
            parameters.put(KEY_DRIVER_BRAKING, driverBraking);
        } else {
        	parameters.remove(KEY_DRIVER_BRAKING);
        }
    }
    public Boolean getDriverBraking() {
        return (Boolean) parameters.get(KEY_DRIVER_BRAKING);
    }
    public void setWiperStatus(Boolean wiperStatus) {
        if (wiperStatus != null) {
            parameters.put(KEY_WIPER_STATUS, wiperStatus);
        } else {
        	parameters.remove(KEY_WIPER_STATUS);
        }
    }
    public Boolean getWiperStatus() {
        return (Boolean) parameters.get(KEY_WIPER_STATUS);
    }
    public void setHeadLampStatus(Boolean headLampStatus) {
        if (headLampStatus != null) {
            parameters.put(KEY_HEAD_LAMP_STATUS, headLampStatus);
        } else {
        	parameters.remove(KEY_HEAD_LAMP_STATUS);
        }
    }
    public Boolean getHeadLampStatus() {
        return (Boolean) parameters.get(KEY_HEAD_LAMP_STATUS);
    }
    public void setEngineTorque(Boolean engineTorque) {
        if (engineTorque != null) {
            parameters.put(KEY_ENGINE_TORQUE, engineTorque);
        } else {
        	parameters.remove(KEY_ENGINE_TORQUE);
        }
    }
    public Boolean getEngineTorque() {
        return (Boolean) parameters.get(KEY_ENGINE_TORQUE);
    }
    public void setAccPedalPosition(Boolean accPedalPosition) {
        if (accPedalPosition != null) {
            parameters.put(KEY_ACC_PEDAL_POSITION, accPedalPosition);
        } else {
        	parameters.remove(KEY_ACC_PEDAL_POSITION);
        }
    }
    public Boolean getAccPedalPosition() {
        return (Boolean) parameters.get(KEY_ACC_PEDAL_POSITION);
    }
        
    public void setSteeringWheelAngle(Boolean steeringWheelAngle) {
        if (steeringWheelAngle != null) {
            parameters.put(KEY_STEERING_WHEEL_ANGLE, steeringWheelAngle);
        } else {
        	parameters.remove(KEY_STEERING_WHEEL_ANGLE);
        }
    }
    public Boolean getSteeringWheelAngle() {
        return (Boolean) parameters.get(KEY_STEERING_WHEEL_ANGLE);
    }                
    public void setECallInfo(Boolean eCallInfo) {
        if (eCallInfo != null) {
            parameters.put(KEY_E_CALL_INFO, eCallInfo);
        } else {
        	parameters.remove(KEY_E_CALL_INFO);
        }
    }
    public Boolean getECallInfo() {
        return (Boolean) parameters.get(KEY_E_CALL_INFO);
    }    
    
    
    public void setAirbagStatus(Boolean airbagStatus) {
        if (airbagStatus != null) {
            parameters.put(KEY_AIRBAG_STATUS, airbagStatus);
        } else {
        	parameters.remove(KEY_AIRBAG_STATUS);
        }
    }
    public Boolean getAirbagStatus() {
        return (Boolean) parameters.get(KEY_AIRBAG_STATUS);
    }
    public void setEmergencyEvent(Boolean emergencyEvent) {
        if (emergencyEvent != null) {
            parameters.put(KEY_EMERGENCY_EVENT, emergencyEvent);
        } else {
        	parameters.remove(KEY_EMERGENCY_EVENT);
        }
    }
    public Boolean getEmergencyEvent() {
        return (Boolean) parameters.get(KEY_EMERGENCY_EVENT);
    }
    public void setClusterModeStatus(Boolean clusterModeStatus) {
        if (clusterModeStatus != null) {
            parameters.put(KEY_CLUSTER_MODE_STATUS, clusterModeStatus);
        } else {
        	parameters.remove(KEY_CLUSTER_MODE_STATUS);
        }
    }
    public Boolean getClusterModeStatus() {
        return (Boolean) parameters.get(KEY_CLUSTER_MODE_STATUS);
    }
    public void setMyKey(Boolean myKey) {
        if (myKey != null) {
            parameters.put(KEY_MY_KEY, myKey);
        } else {
        	parameters.remove(KEY_MY_KEY);
        }
    }
    public Boolean getMyKey() {
        return (Boolean) parameters.get(KEY_MY_KEY);
    }        
}
