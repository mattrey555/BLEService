package com.ratio.deviceService;

/**
 * device error codes returned from the DeviceService
 *
 */
public class DeviceErrorCodes {
	/**
	 * internal error thrown if enqueueing the command failed
	 */
	public static final int ERROR_ENQUEUING_COMMAND = 101;
	/**
	 * connecting to the device took longer than the specified timeout
	 */
	public static final int ERROR_CONNECTION_TIMEOUT = 102;
	/**
	 * device has disconnected (and we didn't tell it to)
	 */
	public static final int ERROR_DISCONNECT = 103;
	/**
	 * error retrieving the device connection status
	 */
	public static final int ERROR_CONNECT_STATUS = 104;
	/**
	 * error discovering services from the device
	 */
	public static final int ERROR_SERVICES_DISCOVERED = 105;
	/**
	 * a horrible failure occurred initialzing the device services
	 */
	public static final int ERROR_INIITIALIZATION = 106;
	/**
	 * error connecting to the device
	 */
	public static final int ERROR_CONNECT = 107;
	/**
	 * error retrieving the characteristics from a service
	 */
	public static final int ERROR_GET_CHARACTERISTICS = 108;
	/**
	 * error enabling/disabling the notification for a characteristic
	 */
	public static final int ERROR_SET_CHARACTERISTIC_NOTIFICATION = 109;
	/**
	 * error writing to a descriptor
	 */
	public static final int ERROR_WRITE_DESCRIPTOR = 110;
	/**
	 * error write a characteristic
	 */
	public static final int ERROR_WRITE_CHARACTERISTIC = 111;	
	/**
	 * error reading a characteristic
	 */
	public static final int ERROR_READ_CHARACTERISTIC = 112;
	/**
	 * error reading a descriptor
	 */
	public static final int ERROR_READ_DESCRIPTOR = 113;
	/**
	 * error trying to reconnect to a device
	 */
	public static final int ERROR_RECONNECT = 120;
	/**
	 * requested device not fond
	 */
	public static final int ERROR_DEVICE_NOT_FOUND = 121;
	/**
	 * error reading RSSI from device
	 */
	public static final int ERROR_READ_RSSI = 122;
	/**
	 * error discovering services from the device
	 */
	public static final int ERROR_DISCOVER_SERVICES = 123;
	
}

