/*
 * GNU GPL v3 License
 *
 * Copyright 2019 Niccolo Tubini
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package org.geoframe.closureequation.conductivitymodel;

import org.geoframe.closureequation.closureequation.ClosureEquation;
import org.geoframe.closureequation.conductivitymodel.ConductivityEquation;

/**
 * @author Niccolo Tubini
 *
 */
public class WaterThermalConductivity extends ConductivityEquation{
	
	public WaterThermalConductivity(ClosureEquation closureEquation) {
		super(closureEquation);
		// TODO Auto-generated constructor stub
	}

	
	public double k(double x, int id, int element) {
		if(x>=273.15) {
			return super.closureEquation.getParameters().thermalConductivityWater;
		} else {
			return super.closureEquation.getParameters().thermalConductivityIce;
		}
	}


	@Override
	public double k(double x, double y, int id, int element) {
		// TODO Auto-generated method stub
		if(x>=273.15) {
			return super.closureEquation.getParameters().thermalConductivityWater;
		} else {
			return super.closureEquation.getParameters().thermalConductivityIce;
		}

	}
	
	
}
