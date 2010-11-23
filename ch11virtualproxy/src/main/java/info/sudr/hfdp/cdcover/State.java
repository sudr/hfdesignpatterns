package info.sudr.hfdp.cdcover;

import java.awt.Component;
import java.awt.Graphics;

public interface State {

	int getIconHeight();
	int getIconWidth();
	void paintIcon(final Component c, Graphics g, int x, int y);
	
}
