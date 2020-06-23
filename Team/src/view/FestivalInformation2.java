package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class FestivalInformation2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FestivalInformation2 window = new FestivalInformation2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FestivalInformation2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 671, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 444, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		String path = "C:\\\\Users\\\\SMHRD\\\\Desktop\\\\¼ö±¹.jpg";
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\uBD04\uC774 \uC624\uB294 3\uC6D4 \uC218\uAD6D\uCD95\uC81C\uB97C \uC544\uC2DC\uB098\uC694?\r\n\uC804\uAD6D\uC11C \uAC00\uC7A5 \uBA3C\uC800 \uC218\uAD6D\uC744 \uB9CC\uB098 \uBCFC \uC218 \uC788\uC5B4 \u2018\uC778\uAE30\u2019\r\n3\uC6D4 20\uC77C\uBD80\uD130 7\uC6D4 \uC911\uC21C\uAE4C\uC9C0 \uD734\uC560\uB9AC\uC11C \uC5F4\uB824\r\n\r\n\uC11C\uADC0\uD3EC\uC2DC \uB0A8\uC6D0\uC74D\uC5D0 \uC704\uCE58\uD55C \uD734\uC560\uB9AC \uC790\uC5F0\uC0DD\uD65C\uACF5\uC6D0\uC740 \uC81C\uC8FC\uB3C4\uBBFC\uACFC \uC81C\uC8FC\uB97C \uCC3E\uB294 \uAD00\uAD11\uAC1D\uC5D0\uAC8C \uBCF4\uB2E4 \uB098\uC740 \uBCFC\uAC70\uB9AC\uB97C \uC81C\uACF5\uD558\uAE30 \uC704\uD574 3\uC6D4\uBD80\uD130 \uC218\uAD6D\uCD95\uC81C\uB97C \uAC1C\uCD5C\uD55C\uB2E4\uACE0 \uBC1D\uD614\uB2E4.\r\n\r\n\uD734\uC560\uB9AC\uC5D0 \uB530\uB974\uBA74 \uC624\uB294 3\uC6D4 20\uC77C\uBD80\uD130 7\uC6D4 \uC911\uC21C\uAE4C\uC9C0 \uC5F4\uB9AC\uB294 \uC774\uBC88 \uC218\uAD6D\uCD95\uC81C\uB294 \uD734\uC560\uB9AC \uACF5\uC6D0\uC5D0\uC11C \uC815\uC131\uC2A4\uB7FD\uAC8C \uD0A4\uC6B4 \uC624\uC0C9\uBE5B\uAE54 \uC218\uAD6D \uAF43\uB4E4\uC744 \uC218\uAD6D\uC815\uC6D0\uACFC \uACF5\uC6D0 \uACF3\uACF3\uC5D0\uC11C \uB9CC\uB0A0 \uC218 \uC788\uC73C\uBA70 \uC720\uCC44\uAF43\uC744 \uBE44\uB86F\uD55C \uB2E4\uC591\uD55C \uBD04\uAF43\uACFC \uD568\uAED8 \uC6E8\uB529\uC2A4\uB0C5 \uBC0F \uC6B0\uC815\uC2A4\uB0C5, \uC778\uC0DD\uC0AC\uC9C4 \uCC0D\uAE30 \uC88B\uC740 \uACF5\uAC04\uC73C\uB85C \uB354\uC6B1 \uC608\uC058\uAC8C \uAFB8\uBA70\uC9C8 \uC608\uC815\uC774\uB77C\uACE0 \uD55C\uB2E4.\r\n\r\n\uC774\uBC88 \uC218\uAD6D\uCD95\uC81C \uAE30\uAC04 \uB3D9\uC548 \uB3D9\uBB3C\uBA39\uC774\uC8FC\uAE30\uCCB4\uD5D8, \uC2B9\uB9C8\uCCB4\uD5D8, \uC804\uD1B5\uB180\uC774\uCCB4\uD5D8 \uB4F1 \uAE30\uC874\uC758 \uC0C1\uC124\uCCB4\uD5D8 \uD504\uB85C\uADF8\uB7A8\uC5D0 \uC774\uC5B4 \uD734\uC560\uB9AC \uAC24\uB7EC\uB9AC\uD321 \uC5D0\uC11C \uC218\uAD6D \uC0AC\uC9C4\uC804\uB3C4 \uC5F4\uC5B4 \uBC29\uBB38\uAC1D\uB4E4\uC5D0\uAC8C \uB610 \uB2E4\uB978 \uBCFC\uAC70\uB9AC\uB3C4 \uC81C\uACF5\uD560 \uACC4\uD68D\uC774\uB2E4.\r\n\r\n\uC591\uC9C0\uC120 \uD734\uC560\uB9AC \uB300\uD45C\uB294 \u201C\uC81C\uC8FC\uB97C \uC0AC\uB791\uD558\uB294 \uB3C4\uBBFC\uB4E4\uACFC \uC81C\uC8FC\uB97C \uCC3E\uB294 \uAD00\uAD11\uAC1D\uB4E4\uC5D0\uAC8C \uC0C9\uB2E4\uB978 \uBCFC\uAC70\uB9AC\uB97C \uC81C\uACF5\uD558\uACE0\uC790 \uB204\uAD6C\uBCF4\uB2E4 \uBA3C\uC800 \uC624\uC0C9\uBE5B\uAE54 \uC218\uAD6D\uAF43\uC744 \uB9CC\uB098 \uC788\uB3C4\uB85D \uC9C0\uB09C \uACA8\uC6B8\uBD80\uD130 \uC131\uC2EC\uC131\uC758\uAECF \uAC00\uAFB8\uACE0 \uBCF4\uC0B4\uD3B4 \uC654\uB2E4\u201D\uBA70 \u201C3\uC6D4\uBD80\uD130 7\uC6D4 \uC911\uC21C\uAE4C\uC9C0 \uAFB8\uC900\uD788 \uC218\uAD6D\uC744 \uBCFC \uC218 \uC788\uB3C4\uB85D \uC900\uBE44\uD558\uACE0 \uC788\uB2E4\u201D\uACE0 \uD3EC\uBD80\uB97C \uBC1D\uD614\uB2E4.\r\n\r\n\uD55C\uD3B8 \uD734\uC560\uB9AC\uB294 \uC5EC\uB7EC \uD574 \uC804\uBD80\uD130 \uC9C0\uC5ED\uC0AC\uD68C \uD658\uC6D0 \uCC28\uC6D0\uC5D0\uC11C \uC81C\uC8FC\uB3C4\uB0B4 \uC7A5\uC560\uC778\uB2E8\uCCB4, \uBCF4\uC721\uC6D0, \uC591\uB85C\uC6D0 \uB4F1\uC740 \uCD95\uC81C \uB54C\uB9C8\uB2E4 \uBB34\uB8CC\uC785\uC7A5(\uC0AC\uC804\uC608\uC57D \uD544\uC218)\uC744 \uC9C4\uD589\uD558\uACE0 \uC788\uC73C\uBA70 \uC81C\uC8FC\uB3C4\uBBFC\uACFC \uAD00\uAD11\uAC1D \uAC00\uC6B4\uB370 3\uC790\uB140\uC774\uC0C1(\uC18C\uC778, \uCCAD\uC18C\uB144) \uC785\uC7A5\uB8CC 50%\uD560\uC778\uD589\uC0AC\uB97C \uBCC4\uB3C4\uB85C \uC9C4\uD589\uD558\uACE0 \uC788\uB2E4.");
		textArea.setLineWrap(true);
		textArea.setBounds(12, 58, 420, 603);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("\u25C0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FestivalInformation.main(null);
			}
		});
		btnNewButton.setBounds(12, 10, 62, 38);
		panel.add(btnNewButton);

		
	}
}
