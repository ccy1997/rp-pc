package rp.robotics.testing;

import rp.robotics.mapping.MapUtils;
import rp.robotics.mapping.RPLineMap;

/**
 * Standard maps to be used for automated simulation testing.
 * 
 * @author Nick Hawes
 *
 */
public class TestMaps {

	public static final RPLineMap EMPTY_8_x_6 = MapUtils.createRectangularMap(
			8, 6);

}
