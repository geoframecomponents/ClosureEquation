/*
 * GNU GPL v3 License
 *
 * Copyright 2019 Niccol� Tubini
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
package it.geoframe.blogspot.closureequation.conductivitymodel;

import it.geoframe.blogspot.closureequation.closureequation.ClosureEquation;

/**
 * @author Niccolo` Tubini
 *
 */

public class Hornberger1998  extends UnsaturatedHydraulicConductivityTemperatureDecorator {
	
	private ConductivityEquation modelUHC;
	
	
	
	public Hornberger1998(ClosureEquation closureEquation, ConductivityEquation modelUHC) {
		
		super(closureEquation);
		this.modelUHC = modelUHC;
		
	}

	
	@Override
	public double k(double x, int id, int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double k(double x, double y, int id, int element) {
		// TODO Auto-generated method stub
		return  this.modelUHC.k(x, y, id, element) * 1.5869*Math.pow(10, -4)*Math.pow(y, 2) + 2.5263*Math.pow(10,-2)*y + 0.7315;
}

}
