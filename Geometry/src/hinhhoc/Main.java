package hinhhoc;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Panel;

import java.awt.FlowLayout;
import javax.swing.SwingConstants;

import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JTextField;


public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public Main() {
		this.setTitle("Thân Huỳnh");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 23));
		getContentPane().setBackground(SystemColor.text);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(23, 70, 765, 519);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }    
            public void windowMaximizing(WindowEvent e) {
                System.exit(0);
            }   
        });
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhCN hcn = new HinhCN(); 
				hcn.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\pngimg.com - square_PNG83 (.png"));
		btnNewButton.setForeground(SystemColor.windowText);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(47, 149, 149, 86);


		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HTamgiac tg= new HTamgiac();
				tg.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\pngimg.com - triangle_PNG3 (1).png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(47, 256, 149, 86);
		

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhVuong hv = new HinhVuong();
				hv.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\pngimg.com - square_PNG1.png"));
		btnNewButton_3.setBounds(395, 149, 149, 86);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HinhTron ht = new HinhTron();
				ht.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\pngimg.com - circle_PNG15.png"));
		btnNewButton_4.setBounds(395, 256, 149, 86);
		
		
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		getContentPane().add(btnNewButton_3);
		getContentPane().add(btnNewButton_1);
		getContentPane().add(btnNewButton_4);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.activeCaption);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		panel.setBounds(23, 70, 747, 43);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Chọn loại hình muốn tính");
		lblNewLabel_1.setForeground(SystemColor.text);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(-3, 70, 28, 430);
		getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(-3, 0, 786, 73);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("TÍNH DIỆN TÍCH / CHU VI");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		JLabel lblNewLabel_2 = new JLabel("Hình chữ nhật");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2.setBounds(206, 186, 135, 28);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_6 = new JLabel("Hình tam giác");
		lblNewLabel_2_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_6.setForeground(Color.GRAY);
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2_6.setBounds(206, 293, 135, 28);
		getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_2 = new JLabel("Hình vuông");
		lblNewLabel_2_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setForeground(Color.GRAY);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2_2.setBounds(554, 186, 135, 28);
		getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Hình tròn");
		lblNewLabel_2_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setForeground(Color.GRAY);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_2_3.setBounds(554, 293, 135, 28);
		getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\1200px-Vietnam_Championship_Series_2023_lightmode (2).png"));
		lblNewLabel_3.setBounds(317, 368, 126, 132);
		getContentPane().add(lblNewLabel_3);
		

		
	}
}
