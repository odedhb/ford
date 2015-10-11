package com.smartdevicelink.proxy.rpc;

import java.util.Hashtable;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

/**
 * This function is used to unsubscribe the notifications from the
 * subscribeVehicleData function
 * <p>
 * Function Group: Location, VehicleInfo and DrivingChara
 * <p>
 * <b>HMILevel needs to be FULL, LIMITED or BACKGROUND</b>
 * </p>
 * 
 * @since SmartDeviceLink 2.0
 * @see SubscribeVehicleData
 * @see GetVehicleData
 */
public class UnsubscribeVehicleData extends RPCRequest {
	public static final String KEY_SPEED = "speed";
	public static final String KEY_RPM = "rpm";
	public static final String KEY_EXTERNAL_TEMPERATURE = "externalTemperature";
	public static final String KEY_FUEL_LEVEL = "fuelLevel";
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
	

	/**
	 * Constructs a new UnsubscribeVehicleData object
	 */
    public UnsubscribeVehicleData() {
        super(FunctionID.UNSUBSCRIBE_VEHICLE_DATA.toString());
    }

	/**
	 * Constructs a new UnsubscribeVehicleData object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public UnsubscribeVehicleData(Hashtable<String, Object> hash) {
        super(hash);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes Gps data
	 * 
	 * @param gps
	 *            a boolean value
	 */
    public void setGps(Boolean gps) {
        if (gps != null) {
            parameters.put(KEY_GPS, gps);
        } else {
        	parameters.remove(KEY_GPS);
        }
    }

	/**
	 * Gets a boolean value. If true, means the Gps data has been unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the Gps data has been
	 *         unsubscribed.
	 */
    public Boolean getGps() {
        return (Boolean) parameters.get(KEY_GPS);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes speed data
	 * 
	 * @param speed
	 *            a boolean value
	 */
    public void setSpeed(Boolean speed) {
        if (speed != null) {
            parameters.put(KEY_SPEED, speed);
        } else {
        	parameters.remove(KEY_SPEED);
        }
    }

	/**
	 * Gets a boolean value. If true, means the Speed data has been unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the Speed data has been
	 *         unsubscribed.
	 */
    public Boolean getSpeed() {
        return (Boolean) parameters.get(KEY_SPEED);
    }

	/**
	 * Sets a boolean value. If true, unsubscribe data
	 * 
	 * @param rpm
	 *            a boolean value
	 */
    public void setRpm(Boolean rpm) {
        if (rpm != null) {
            parameters.put(KEY_RPM, rpm);
        } else {
        	parameters.remove(KEY_RPM);
        }
    }

	/**
	 * Gets a boolean value. If true, means the rpm data has been unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the rpm data has been
	 *         unsubscribed.
	 */
    public Boolean getRpm() {
        return (Boolean) parameters.get(KEY_RPM);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes FuelLevel data
	 * 
	 * @param fuelLevel
	 *            a boolean value
	 */
    public void setFuelLevel(Boolean fuelLevel) {
        if (fuelLevel != null) {
            parameters.put(KEY_FUEL_LEVEL, fuelLevel);
        } else {
        	parameters.remove(KEY_FUEL_LEVEL);
        }
    }

	/**
	 * Gets a boolean value. If true, means the FuelLevel data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the FuelLevel data has
	 *         been unsubscribed.
	 */
    public Boolean getFuelLevel() {
        return (Boolean) parameters.get(KEY_FUEL_LEVEL);
    }

    /**
     * Sets a boolean value. If true, unsubscribes fuelLevel_State data
     * 
     * @param fuelLevel_State
     *            a boolean value
     */
    @Deprecated
    public void setFuelLevel_State(Boolean fuelLevel_State) {
        setFuelLevelState(fuelLevel_State);
    }

    /**
     * Gets a boolean value. If true, means the fuelLevel_State data has been
     * unsubscribed.
     * 
     * @return Boolean -a Boolean value. If true, means the fuelLevel_State data
     *         has been unsubscribed.
     */
    @Deprecated
    public Boolean getFuelLevel_State() {
        return getFuelLevelState();
    }

    /**
     * Sets a boolean value. If true, unsubscribes fuelLevelState data
     * 
     * @param fuelLevelState
     *            a boolean value
     */
    public void setFuelLevelState(Boolean fuelLevelState) {
        if (fuelLevelState != null) {
            parameters.put(KEY_FUEL_LEVEL_STATE, fuelLevelState);
        } else {
            parameters.remove(KEY_FUEL_LEVEL_STATE);
        }
    }

    /**
     * Gets a boolean value. If true, means the fuelLevel_State data has been
     * unsubscribed.
     * 
     * @return Boolean -a Boolean value. If true, means the fuelLevelState data
     *         has been unsubscribed.
     */
    public Boolean getFuelLevelState() {
        return (Boolean) parameters.get(KEY_FUEL_LEVEL_STATE);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes instantFuelConsumption data
	 * 
	 * @param instantFuelConsumption
	 *            a boolean value
	 */
    public void setInstantFuelConsumption(Boolean instantFuelConsumption) {
        if (instantFuelConsumption != null) {
            parameters.put(KEY_INSTANT_FUEL_CONSUMPTION, instantFuelConsumption);
        } else {
        	parameters.remove(KEY_INSTANT_FUEL_CONSUMPTION);
        }
    }

	/**
	 * Gets a boolean value. If true, means the getInstantFuelConsumption data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the getInstantFuelConsumption data
	 *         has been unsubscribed.
	 */
    public Boolean getInstantFuelConsumption() {
        return (Boolean) parameters.get(KEY_INSTANT_FUEL_CONSUMPTION);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes externalTemperature data
	 * 
	 * @param externalTemperature
	 *            a boolean value
	 */
    public void setExternalTemperature(Boolean externalTemperature) {
        if (externalTemperature != null) {
            parameters.put(KEY_EXTERNAL_TEMPERATURE, externalTemperature);
        } else {
        	parameters.remove(KEY_EXTERNAL_TEMPERATURE);
        }
    }

	/**
	 * Gets a boolean value. If true, means the externalTemperature data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the externalTemperature data
	 *         has been unsubscribed.
	 */
    public Boolean getExternalTemperature() {
        return (Boolean) parameters.get(KEY_EXTERNAL_TEMPERATURE);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes Currently selected gear data
	 * 
	 * @param prndl
	 *            a boolean value
	 */
    public void setPrndl(Boolean prndl) {
        if (prndl != null) {
            parameters.put(KEY_PRNDL, prndl);
        } else {
        	parameters.remove(KEY_PRNDL);
        }
    }

	/**
	 * Gets a boolean value. If true, means the Currently selected gear data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the Currently selected gear data
	 *         has been unsubscribed.
	 */
    public Boolean getPrndl() {
        return (Boolean) parameters.get(KEY_PRNDL);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes tire pressure status data
	 * 
	 * @param tirePressure
	 *            a boolean value
	 */
    public void setTirePressure(Boolean tirePressure) {
        if (tirePressure != null) {
            parameters.put(KEY_TIRE_PRESSURE, tirePressure);
        } else {
        	parameters.remove(KEY_TIRE_PRESSURE);
        }
    }

	/**
	 * Gets a boolean value. If true, means the tire pressure status data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the tire pressure status data
	 *         has been unsubscribed.
	 */
    public Boolean getTirePressure() {
        return (Boolean) parameters.get(KEY_TIRE_PRESSURE);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes odometer data
	 * 
	 * @param odometer
	 *            a boolean value
	 */
    public void setOdometer(Boolean odometer) {
        if (odometer != null) {
            parameters.put(KEY_ODOMETER, odometer);
        } else {
        	parameters.remove(KEY_ODOMETER);
        }
    }

	/**
	 * Gets a boolean value. If true, means the odometer data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the odometer data
	 *         has been unsubscribed.
	 */
    public Boolean getOdometer() {
        return (Boolean) parameters.get(KEY_ODOMETER);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes belt Status data
	 * 
	 * @param beltStatus
	 *            a boolean value
	 */
    public void setBeltStatus(Boolean beltStatus) {
        if (beltStatus != null) {
            parameters.put(KEY_BELT_STATUS, beltStatus);
        } else {
        	parameters.remove(KEY_BELT_STATUS);
        }
    }

	/**
	 * Gets a boolean value. If true, means the belt Status data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the belt Status data
	 *         has been unsubscribed.
	 */
    public Boolean getBeltStatus() {
        return (Boolean) parameters.get(KEY_BELT_STATUS);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes body Information data
	 * 
	 * @param bodyInformation
	 *            a boolean value
	 */
    public void setBodyInformation(Boolean bodyInformation) {
        if (bodyInformation != null) {
            parameters.put(KEY_BODY_INFORMATION, bodyInformation);
        } else {
        	parameters.remove(KEY_BODY_INFORMATION);
        }
    }

	/**
	 * Gets a boolean value. If true, means the body Information data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the body Information data
	 *         has been unsubscribed.
	 */
    public Boolean getBodyInformation() {
        return (Boolean) parameters.get(KEY_BODY_INFORMATION);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes device Status data
	 * 
	 * @param deviceStatus
	 *            a boolean value
	 */
    public void setDeviceStatus(Boolean deviceStatus) {
        if (deviceStatus != null) {
            parameters.put(KEY_DEVICE_STATUS, deviceStatus);
        } else {
        	parameters.remove(KEY_DEVICE_STATUS);
        }
    }

	/**
	 * Gets a boolean value. If true, means the device Status data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the device Status data
	 *         has been unsubscribed.
	 */
    public Boolean getDeviceStatus() {
        return (Boolean) parameters.get(KEY_DEVICE_STATUS);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes driver Braking data
	 * 
	 * @param driverBraking
	 *            a boolean value
	 */
    public void setDriverBraking(Boolean driverBraking) {
        if (driverBraking != null) {
            parameters.put(KEY_DRIVER_BRAKING, driverBraking);
        } else {
        	parameters.remove(KEY_DRIVER_BRAKING);
        }
    }

	/**
	 * Gets a boolean value. If true, means the driver Braking data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the driver Braking data
	 *         has been unsubscribed.
	 */
    public Boolean getDriverBraking() {
        return (Boolean) parameters.get(KEY_DRIVER_BRAKING);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes wiper Status data
	 * 
	 * @param wiperStatus
	 *            a boolean value
	 */
    public void setWiperStatus(Boolean wiperStatus) {
        if (wiperStatus != null) {
            parameters.put(KEY_WIPER_STATUS, wiperStatus);
        } else {
        	parameters.remove(KEY_WIPER_STATUS);
        }
    }

	/**
	 * Gets a boolean value. If true, means the wiper Status data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the wiper Status data
	 *         has been unsubscribed.
	 */
    public Boolean getWiperStatus() {
        return (Boolean) parameters.get(KEY_WIPER_STATUS);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes Head Lamp Status data
	 * 
	 * @param headLampStatus
	 *            a boolean value
	 */
    public void setHeadLampStatus(Boolean headLampStatus) {
        if (headLampStatus != null) {
            parameters.put(KEY_HEAD_LAMP_STATUS, headLampStatus);
        } else {
        	parameters.remove(KEY_HEAD_LAMP_STATUS);
        }
    }

	/**
	 * Gets a boolean value. If true, means the Head Lamp Status data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the Head Lamp Status data
	 *         has been unsubscribed.
	 */
    public Boolean getHeadLampStatus() {
        return (Boolean) parameters.get(KEY_HEAD_LAMP_STATUS);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes Engine Torque data
	 * 
	 * @param engineTorque
	 *            a boolean value
	 */
    public void setEngineTorque(Boolean engineTorque) {
        if (engineTorque != null) {
            parameters.put(KEY_ENGINE_TORQUE, engineTorque);
        } else {
        	parameters.remove(KEY_ENGINE_TORQUE);
        }
    }

	/**
	 * Gets a boolean value. If true, means the Engine Torque data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the Engine Torque data
	 *         has been unsubscribed.
	 */
    public Boolean getEngineTorque() {
        return (Boolean) parameters.get(KEY_ENGINE_TORQUE);
    }

	/**
	 * Sets a boolean value. If true, unsubscribes accPedalPosition data
	 * 
	 * @param accPedalPosition
	 *            a boolean value
	 */
    public void setAccPedalPosition(Boolean accPedalPosition) {
        if (accPedalPosition != null) {
            parameters.put(KEY_ACC_PEDAL_POSITION, accPedalPosition);
        } else {
        	parameters.remove(KEY_ACC_PEDAL_POSITION);
        }
    }

	/**
	 * Gets a boolean value. If true, means the accPedalPosition data has been
	 * unsubscribed.
	 * 
	 * @return Boolean -a Boolean value. If true, means the accPedalPosition data
	 *         has been unsubscribed.
	 */
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
