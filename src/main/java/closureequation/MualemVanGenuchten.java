/*
 * GNU GPL v3 License
 *
 * Copyright 2019 Niccolo` Tubini
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
package closureequation;

import closureequation.ClosureEquation;
import rheology.Rheology;
import rheology.RheologyParameters;

/**
 * @author Niccolo` Tubini
 *
 */
public class MualemVanGenuchten extends ClosureEquation{
	
	private double m = -999.0;
	private double saturationDegree = -999.0;
	
	public MualemVanGenuchten(Rheology rheology) {
		super(rheology);
		// TODO Auto-generated constructor stub
	}
	
	
	public double k(double x, double y, int id, int element) {
			
		this.m = 1-1/parameters.par1[id];
		saturationDegree = (super.rheology.f(x, y, id) - parameters.thetaR[id])/(parameters.thetaS[id] - parameters.thetaR[id]); 
//		saturationDegree = (Variables.thetasOld[i]-SoilParameters.thetaR[i])/(SoilParameters.thetaS[i]-SoilParameters.thetaR[i]); 
		if(saturationDegree<1) {
			return parameters.kappaSaturation[id] * Math.pow(saturationDegree, 0.5 ) * Math.pow(1.0 - Math.pow(1.0 - Math.pow(saturationDegree, 1.0/m), m), 2.0);
		} else {
			return parameters.kappaSaturation[id];
		}
		
	
	}
	
	public double k(double x, int id, int element) {
		
		this.m = 1-1/parameters.par1[id];
		saturationDegree = (super.rheology.f(x, id) - parameters.thetaR[id])/(parameters.thetaS[id] - parameters.thetaR[id]); 
//		saturationDegree = (Variables.thetasOld[i]-SoilParameters.thetaR[i])/(SoilParameters.thetaS[i]-SoilParameters.thetaR[i]); 
		if(saturationDegree<1) {
			return parameters.kappaSaturation[id] * Math.pow(saturationDegree, 0.5 ) * Math.pow(1.0 - Math.pow(1.0 - Math.pow(saturationDegree, 1.0/m), m), 2.0);
		} else {
			return parameters.kappaSaturation[id];
		}
		
	
	}
	
}
