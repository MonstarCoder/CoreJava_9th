package timer;

/**
 * Timer test.
 * @author Monstar
 * 2016/9/3
 */

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
// to resolve conflict with java.util.Timer

public class TimerTest 
{
	public static void main(String[] args)
	{
		ActionListener listener = new TimePrinter();
		
		//construct a timer that calls the listener
		//once every 10 seconds
		Timer t = new Timer(10000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

class TimePrinter implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		Date now = new Date();
		System.out.println("At the tone, the time is: " + now);
		Toolkit.getDefaultToolkit().beep();
	}
}
