package jsinify;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author BogdanC
 */
public class jSinify {
	public static void draw() throws Exception {
		Robot robot = new Robot();

		Double angle = 0.0;
		Integer xSpeed = 1;
		Integer ySpeed = 200;

		Integer xPos = 0;
		Integer yPos = 0;

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screensize = toolkit.getScreenSize();
		yPos = screensize.height / 2;

		//capture screen
		Rectangle screenRect = new Rectangle(screensize);
		BufferedImage capture = robot.createScreenCapture(screenRect);

		JFrame f = new JFrame("sinify");
		f.setSize(screensize.width, screensize.height);
		f.setLocation(0, 0);

		f.setUndecorated(true);
		f.setVisible(true);

		Thread.sleep(100);


		Graphics image = f.getGraphics();
		robot.mouseMove(0, 0);
		image.drawImage(capture, 0, 0, f);
		image.dispose();



		Graphics g = f.getGraphics();
		g.setColor(Color.red);

		for(int i = 0; i <= screensize.width; i++) {

			Double myY = yPos + (Math.sin(angle) * ySpeed);
			robot.mouseMove(xPos, myY.intValue());


			g.fillOval(xPos, myY.intValue(), 5, 5);

			angle += 0.01;
			xPos += xSpeed;

			Thread.sleep(10);
		}
		g.dispose();

		f.setVisible(false);
		f.dispose();
	}
}
