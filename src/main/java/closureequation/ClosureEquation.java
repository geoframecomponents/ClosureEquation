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

import rheology.Rheology;
import rheology.RheologyParameters;

/**
 * @author Niccolo` Tubini
 *
 */
public abstract class ClosureEquation {
	
	public RheologyParameters parameters;
	public Rheology rheology;
	
	public ClosureEquation(Rheology rheology) {
		parameters = RheologyParameters.getInstance();
		this.rheology = rheology;
	}
	
	public abstract double k(double x, int id, int element);

	public abstract double k(double x, double y, int id, int element);
}