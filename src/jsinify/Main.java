/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jsinify;

/**
 *
 * @author BogdanC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
		while(true) {
			jSinify.draw();

			Double sleep = 300 * 1000 * (0.1 + Math.random());
			Thread.sleep(sleep.intValue());
		}
    }

}
