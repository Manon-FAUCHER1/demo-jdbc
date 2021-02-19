package fr.diginamic.props;

import java.util.Enumeration;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 
 */

/**
 * @author manon
 *
 */
public class TestConfiguration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceBundle props = ResourceBundle.getBundle("data");
		
		// 1
		String driver= props.getString("nom");
		System.out.println(driver);
		
		
		// 2
		Enumeration<String> keys = props.getKeys();
		
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println(key + " : " + props.getString(key));
			
		}

	}

}
