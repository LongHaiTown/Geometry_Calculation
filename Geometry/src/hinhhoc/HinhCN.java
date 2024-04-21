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

public class HinhCN extends JFrame implements HinhVe,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	public float chieudai;
    public float chieurong;
    public String donvido;
	
    

	public HinhCN() {
		chieudai =0;
		chieurong = 0;
		donvido ="";
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
		
		JLabel lblNewLabel_1 = new JLabel("Hình Chữ Nhật");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 43, 304, 454);
		contentPane.add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Hình chữ nhật trên trục tọa độ xy");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 233, SpringLayout.NORTH, panel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_2, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_2, -81, SpringLayout.EAST, panel_2);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nhập thông tin của hình ");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_3, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_3, -33, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -152, SpringLayout.SOUTH, panel_2);
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chiều dài (L) ");
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_4, -168, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -124, SpringLayout.SOUTH, panel_2);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Đơn vị đo");
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField, 2, SpringLayout.NORTH, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField, 55, SpringLayout.EAST, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_6, -222, SpringLayout.EAST, panel_2);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Tính toán");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton, 17, SpringLayout.SOUTH, textField);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton, 150, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, textField);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, output());
			}
		});
		btnNewButton.setForeground(SystemColor.activeCaption);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, -223, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, lblNewLabel_2);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\rectangle.png"));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_4_1 = new JLabel("Chiều rộng (W)");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 6, SpringLayout.SOUTH, lblNewLabel_4_1);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_4_1, -99, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_4_1, 0, SpringLayout.WEST, lblNewLabel_2);
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel_4_1);
		
		textField_2 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_2, 137, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, textField_2, -6, SpringLayout.NORTH, textField);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_2, -52, SpringLayout.EAST, panel_2);
		textField_2.setColumns(10);
		panel_2.add(textField_2);
		
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
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\Ảnh_chụp_màn_hình_2024-04-10_215720.png"));
		lblNewLabel_5.setBounds(310, 291, 192, 59);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Admin\\eclipse-workspace\\Geometry\\src\\images\\Ảnh_chụp_màn_hình_2024-04-10_220440.png"));
		lblNewLabel_7.setBounds(332, 132, 227, 112);
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
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_1, 137, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField_2);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Nhập");
        btnNewButton_2.addActionListener(this);
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_2, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, lblNewLabel_4);
		btnNewButton_2.setForeground(SystemColor.activeCaption);
		panel_2.add(btnNewButton_2);
		
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

	public void actionPerformed(ActionEvent e){
		String chieudai = textField_1.getText();
		this.chieudai = Float.parseFloat(chieudai);
		String chieurong = textField_2.getText();
		this.chieurong = Float.parseFloat(chieurong);
		this.donvido = textField.getText();
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String output() {
    	String output = "Chiều dài: "+chieudai+", Chiều rộng: "+chieurong+"\nChu vi: "+this.chuvi()+ " "+this.donvido+"\nDiện tích: "+this.dientich()+" "+this.donvido+"2";
        return output;
	}

   

	@Override
	public float chuvi() {
		// TODO Auto-generated method stub
		return (chieudai+chieurong)*2;
	}



	@Override
	public float dientich() {
		// TODO Auto-generated method stub
		return chieudai*chieurong;
	}
}
