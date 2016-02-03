/*
 * Copyright 1997-2009 by Trent Jarvi and others
 * Copyright 1998 Kevin Hester, kevinh@acm.org
 * Copyright 2016 Fraunhofer ISE and others
 *
 * This file is part of jRxTx.
 * jRxTx is a fork of RXTX originally maintained by Trent Jarvi.
 *
 * jRxTx is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * jRxTx is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with jRxTx.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package gnu.io;

/**
 * Exception thrown when a method does not support the requested functionality.
 * 
 * @author Trent Jarvi
 * @version %I%, %G%
 * @since JDK1.0
 */

public class UnSupportedLoggerException extends Exception {
	/**
	 * create an instances with no message about why the Exception was thrown.
	 * 
	 * @since JDK1.0
	 */
	public UnSupportedLoggerException() {
		super();
	}

	/**
	 * create an instance with a message about why the Exception was thrown.
	 * 
	 * @param str
	 *            A detailed message explaining the reason for the Exception.
	 * @since JDK1.0
	 */
	public UnSupportedLoggerException(String str) {
		super(str);
	}
}