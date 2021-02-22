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
		
		Enumeration<String> keys = props.getKeys();
		
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String valeur = props.getString(key);
			System.out.println(key + " : " + valeur);
			
		}

	}

}
