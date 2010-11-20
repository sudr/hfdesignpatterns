package info.sudr.hfdp.cdcover;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	private ImageIcon imageIcon; // proxy holds a reference to the real subject
	private URL imageURL;
	private State currentState; // using state pattern to separate out the two states

	public ImageProxy(URL url) {
		imageURL = url; // proxy has a way to instantiate the real subject
		currentState = new LoadingState(this);
	}

	@Override
	public int getIconHeight() {
		return currentState.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return currentState.getIconWidth();
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		currentState.paintIcon(c, g, x, y);
	}

	public void loaded(ImageIcon imageIcon) {
		currentState = new LoadedState(imageIcon);
	}

	public URL getImageURL() {
		return imageURL;
	}

}
