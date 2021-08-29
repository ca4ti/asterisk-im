/*
 * Async_ServiceEvent.java Version-1.4, 2002/11/22 09:26:10 -0800 (Fri)
 * ECTF S.410-R2 Source code distribution.
 *
 * Copyright (c) 2002, Enterprise Computer Telephony Forum (ECTF),
 * All Rights Reserved.
 *
 * Use and redistribution of this file is subject to a License.
 * For terms and conditions see: javax/telephony/media/LICENSE.HTML
 * 
 * In short, you can use this source code if you keep and display
 * the ECTF Copyright and the License conditions. The code is supplied
 * "AS IS" and ECTF disclaims all warranties and liability.
 */

package javax.telephony.media.messaging;

import javax.telephony.media.*;
import javax.telephony.media.async.Async;

/** A ServiceEvent with Async.Event methods.
 *
 * @author  Jeff Peck
 * @since   JTAPI-1.4
 */
public interface Async_ServiceEvent extends ServiceEvent, Async.Event {
    public void throwIfServiceException() throws ServiceException;
}
