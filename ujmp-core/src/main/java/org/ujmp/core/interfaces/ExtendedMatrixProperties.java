/*
 * Copyright (C) 2008-2015 by Holger Arndt
 *
 * This file is part of the Universal Java Matrix Package (UJMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * UJMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * UJMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with UJMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.ujmp.core.interfaces;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation.Ret;

public interface ExtendedMatrixProperties {

	public int rank();

	public double trace();

	public double det();

	public double pdet();

	public boolean isSPD();

	public boolean containsMissingValues();

	public double doubleValue();

	public int intValue();

	public long longValue();

	public short shortValue();

	public byte byteValue();

	public boolean booleanValue();

	public String stringValue();

	public Date dateValue();

	public char charValue();

	public BigInteger bigIntegerValue();

	public BigDecimal bigDecimalValue();

	public float floatValue();

	public double getMinValue();

	public double getMeanValue();

	public double getStdValue();

	public double getMaxValue();

	public double getEuklideanValue();

	public double getValueSum();

	public double getAbsoluteValueSum();

	public double getAbsoluteValueMean();

	public double getRMS();

	public double norm1();

	public double norm2();

	public double normF();

	public double normInf();

	public boolean containsNull();

	public boolean containsBigDecimal(BigDecimal v);

	public boolean containsBigInteger(BigInteger v);

	public boolean containsBoolean(boolean v);

	public boolean containsByte(byte v);

	public boolean containsChar(char v);

	public boolean containsDate(Date v);

	public boolean containsDouble(double v);

	public boolean containsFloat(float v);

	public boolean containsInt(int v);

	public boolean containsLong(long v);

	public boolean containsObject(Object o);

	public boolean containsShort(short v);

	public boolean containsString(String s);

	public Matrix setContent(Ret ret, Matrix matrix, long... coordinates);
}
