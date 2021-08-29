/*
 * Connectable.java Version-1.4, 2002/11/22 09:26:10 -0800 (Fri)
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

package javax.telephony.media.connection;

/**
 * A marker interface identifying objects that can be used
 * as arguments to <tt>MediaConnection.connect()</tt> and related methods.
 * <p>
 * Allows otherwise unrelated objects 
 * (like <tt>MediaConnection.Token</tt>, <tt>MediaService</tt>, or
 * <tt>Conference</tt> objects)
 * to be arguments to <tt>MediaConnection.connect()</tt>.
 *
 * @author  Jeff Peck
 * @since   JTAPI-1.4
 */
public interface Connectable {}
