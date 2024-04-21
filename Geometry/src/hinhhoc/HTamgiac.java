package hinhhoc;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class HTamgiac extends JFrame implements HinhVe,ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	public float canh1;
    public float canh2;
    public float canh3;
    public String donvido;
	
	 
	public HTamgiac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		setBounds(23, 70, 762, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 757, 43);
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Hình Tam Giác");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 43, 304, 454);
		contentPane.add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Hình tam giác trên trục tọa độ xy");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 233, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_2, -81, SpringLayout.EAST, panel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nhập thông tin của hình ");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_3, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_3, -33, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -152, SpringLayout.SOUTH, panel_2);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chiều dài cạnh a");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_4, -168, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -124, SpringLayout.SOUTH, panel_2);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4);
		
		textField = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField, -48, SpringLayout.SOUTH, panel_2);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Đơn vị đo");
		sl_panel_2.putConstraint(SpringLayout.WEST, textField, 55, SpringLayout.EAST, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_6, -2, SpringLayout.NORTH, textField);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_6, -222, SpringLayout.EAST, panel_2);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Tính toán");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, textField);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton, 150, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField);
		btnNewButton.setForeground(SystemColor.activeCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, output());
			}
		});
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel, 20, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, lblNewLabel_2);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\Xj1cKWTX9suR1f8J.jpg"));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chu vi của hình (Perimeter)");
		lblNewLabel_3_1.setForeground(Color.BLACK);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(310, 112, 327, 25);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Diện tích của hình (Area)");
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1_1.setBounds(310, 269, 260, 25);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\Ảnh chụp màn hình 2024-04-10 224135.png"));
		lblNewLabel_5.setBounds(330, 291, 327, 59);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\Ảnh chụp màn hình 2024-04-10 224050.png"));
		lblNewLabel_7.setBounds(330, 91, 227, 168);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\1200px-Vietnam_Championship_Series_2023_lightmode (2).png"));
		lblNewLabel_8.setBounds(455, 390, 126, 71);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Các công thức của hình");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(310, 66, 271, 36);
		contentPane.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_1, -71, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_1, 1, SpringLayout.EAST, lblNewLabel_4);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Chiều dài cạnh b");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_4_1, 6, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4_1, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Chiều dài cạnh a");
		lblNewLabel_4_2.setForeground(Color.BLACK);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Chiều dài cạnh c");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_4_3, 5, SpringLayout.SOUTH, lblNewLabel_4_1);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4_3, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_4_3.setForeground(Color.BLACK);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4_3);
		
		textField_2 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_2, 0, SpringLayout.SOUTH, lblNewLabel_4_1);
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_3, -6, SpringLayout.NORTH, textField);
		textField_3.setColumns(10);
		panel_2.add(textField_3);
		
		JButton btnNewButton_2 = new JButton("Nhập");
		btnNewButton_2.addActionListener(this);
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, lblNewLabel_4);
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Trong đó, s là nửa chu vi:");
		lblNewLabel_3_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblNewLabel_3_1_1_1.setBounds(330, 355, 260, 25);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\Ảnh chụp màn hình 2024-04-10 224400.png"));
		lblNewLabel_10.setBounds(554, 345, 112, 59);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("Quay lại");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main m = new Main();
				m.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(653, 49, 85, 30);
		contentPane.add(btnNewButton_1);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		String canh1 = textField_1.getText();
		this.canh1 = Float.parseFloat(canh1);
		String canh2 = textField_2.getText();
		this.canh2 = Float.parseFloat(canh2);
		String canh3 = textField_3.getText();
		this.canh3 = Float.parseFloat(canh3);
		this.donvido = textField.getText();
	}



	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String output() {
		String output = "Cạnh 1: "+canh1+", Cạnh 2: "+canh2+", Cạnh 3: " +canh3+"\nChu vi: "+this.chuvi()+ " "+this.donvido+"\nDiện tích: "+this.dientich()+" "+this.donvido+"2";
        return output;
	}



	@Override
	public float chuvi() {
		return canh1+canh2+canh3;
	}



	@Override
	public float dientich() {
		float p=(canh1+canh2+canh3)/2;
        return (float)Math.sqrt(p*(p-canh1)*(p-canh2)*(p-canh3));
	}
}
