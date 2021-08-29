/*
#pragma ident "%W%      %E%     SMI"

 * Copyright (c) 1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */

package javax.telephony.callcenter.events;
import  javax.telephony.*;

/**
 * The <CODE>RouteUsedEvent</CODE> event interface indicates the
 * <CODE>RouteSession</CODE> interface has moved into the
 * <CODE>RouteSession.ROUTE_USED</CODE> state and the Call has terminated at
 * a destination as a result of routing by the application. This interface
 * extends the <CODE>RouteSessionEvent</CODE> interface and is reported via the
 * <CODE>RouteCallback</CODE> interface.
 * <p>
 * @see javax.telephony.callcenter.RouteSession
 * @see javax.telephony.callcenter.RouteCallback
 * @see javax.telephony.callcenter.events.RouteSessionEvent
 */

public interface RouteUsedEvent extends RouteSessionEvent {

  /**
   * Returns the final destination Terminal.
   * <p>
   * @return The final destination Terminal.
   */
  public Terminal getRouteUsed();

  
  /**
   * Returns the calling Terminal.
   * <p>
   * @return The calling Terminal.
   */
  public Terminal getCallingTerminal();


  /**
   * Returns the calling Address.
   * <p>
   * @return The calling Address.
   */
  public Address getCallingAddress();


  /**
   * Returns true if the call was routed out of the Provider's domain, false
   * otherwise.
   * <p>
   * @return True if the call was routed out of the Provider's domain, false
   * otherwise.
   */
  public boolean getDomain();
}
