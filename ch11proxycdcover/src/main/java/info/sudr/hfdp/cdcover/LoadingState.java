package info.sudr.hfdp.cdcover;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class LoadingState implements State {

	private final ImageProxy imageProxy;
	private Thread retrievalThread;
	private boolean retrieving;
	
	public LoadingState(ImageProxy imageProxy) {
		this.imageProxy = imageProxy;
	}

	@Override
	public int getIconHeight() {
		return 800;
	}

	@Override
	public int getIconWidth() {
		return 600;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD cover, please wait...", x + 300, y + 300);
		if (retrieving) {
			return;
		}

		retrieving = true;
		retrievalThread = new Thread(new Runnable() {

			@Override
			public void run() {
				ImageIcon imageIcon = new ImageIcon(imageProxy.getImageURL(), "CD Cover");
				imageProxy.loaded(imageIcon);
				c.repaint();
			}
			
		});
		retrievalThread.start();
	}

}
