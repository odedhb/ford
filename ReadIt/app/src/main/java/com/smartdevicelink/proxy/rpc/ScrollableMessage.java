package com.smartdevicelink.proxy.rpc;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

/**
 * Creates a full screen overlay containing a large block of formatted text that
 * can be scrolled with up to 8 SoftButtons defined
 * <p>
 * Function Group: ScrollableMessage
 * <p>
 * <b>HMILevel needs to be FULL</b>
 * <p>
 */
public class ScrollableMessage extends RPCRequest {
	public static final String KEY_SCROLLABLE_MESSAGE_BODY = "scrollableMessageBody";
	public static final String KEY_TIMEOUT = "timeout";
	public static final String KEY_SOFT_BUTTONS = "softButtons";

	/**
	 * Constructs a new ScrollableMessage object
	 */
    public ScrollableMessage() {
        super(FunctionID.SCROLLABLE_MESSAGE.toString());
    }

	/**
	 * Constructs a new ScrollableMessage object indicated by the Hashtable
	 * parameter
	 * <p>
	 * 
	 * @param hash
	 *            The Hashtable to use
	 */
    public ScrollableMessage(Hashtable<String, Object> hash) {
        super(hash);
    }

	/**
	 * Sets a Body of text that can include newlines and tabs
	 * 
	 * @param scrollableMessageBody
	 *            a String value representing the Body of text that can include
	 *            newlines and tabs
	 *            <p>
	 *            <b>Notes: </b>Maxlength=500
	 */
    public void setScrollableMessageBody(String scrollableMessageBody) {
        if (scrollableMessageBody != null) {
            parameters.put(KEY_SCROLLABLE_MESSAGE_BODY, scrollableMessageBody);
        } else {
        	parameters.remove(KEY_SCROLLABLE_MESSAGE_BODY);
        }
    }

	/**
	 * Gets a Body of text that can include newlines and tabs
	 * 
	 * @return String -a String value
	 */
    public String getScrollableMessageBody() {
        return (String) parameters.get(KEY_SCROLLABLE_MESSAGE_BODY);
    }

	/**
	 * Sets an App defined timeout. Indicates how long of a timeout from the
	 * last action
	 * 
	 * @param timeout
	 *            an Integer value representing an App defined timeout
	 *            <p>
	 *            <b>Notes</b>:Minval=0; Maxval=65535;Default=30000
	 */
    public void setTimeout(Integer timeout) {
        if (timeout != null) {
            parameters.put(KEY_TIMEOUT, timeout);
        } else {
        	parameters.remove(KEY_TIMEOUT);
        }
    }

	/**
	 * Gets an App defined timeout
	 * 
	 * @return Integer -an Integer value representing an App defined timeout
	 */
    public Integer getTimeout() {
        return (Integer) parameters.get(KEY_TIMEOUT);
    }

	/**
	 * Sets App defined SoftButtons.If omitted on supported displays, only the
	 * system defined "Close" SoftButton will be displayed
	 * 
	 * @param softButtons
	 *            a List<SoftButton> value representing App defined
	 *            SoftButtons
	 *            <p>
	 *            <b>Notes: </b>Minsize=0, Maxsize=8
	 */
    public void setSoftButtons(List<SoftButton> softButtons) {
        if (softButtons != null) {
            parameters.put(KEY_SOFT_BUTTONS, softButtons);
        } else {
        	parameters.remove(KEY_SOFT_BUTTONS);
        }
    }

	/**
	 * Gets App defined soft button
	 * @return List -List<SoftButton> value
	 */
    @SuppressWarnings("unchecked")
    public List<SoftButton> getSoftButtons() {
        if (parameters.get(KEY_SOFT_BUTTONS) instanceof List<?>) {
        	List<?> list = (List<?>)parameters.get(KEY_SOFT_BUTTONS);
	        if (list != null && list.size() > 0) {
	            Object obj = list.get(0);
	            if (obj instanceof SoftButton) {
	                return (List<SoftButton>) list;
	            } else if (obj instanceof Hashtable) {
	            	List<SoftButton> newList = new ArrayList<SoftButton>();
	                for (Object hashObj : list) {
	                    newList.add(new SoftButton((Hashtable<String, Object>) hashObj));
	                }
	                return newList;
	            }
	        }
        }
        return null;
    }
}
