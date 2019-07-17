package com.cx.bank.test;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.cx.bank.manager.ManagerImpl;
import com.cx.bank.model.MoneyBean;
import com.cx.bank.model.UserBean;

public class TransferFrame extends JFrame {
	public TransferFrame(UserBean user,MoneyBean balance) {
		setTitle("ת�˽���");
		setResizable(false);
		// 1�����ô���λ������Ļ������
		int width = 350;
		int height = 350;
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - width) / 2;
		int h = (Toolkit.getDefaultToolkit().getScreenSize().height - height) / 2;
		setLocation(w, h);
		Container c = getContentPane();
		c.setLayout(null);// ��������Ϊ���Բ���

		JLabel lb_1 = new JLabel("������ת���˺ţ�");
		JLabel lb_2 = new JLabel("������ת�˽�");
		
		JLabel lb_3 = new JLabel("");
		JTextField tf_1 = new JTextField();
		JTextField tf_2 = new JTextField();
		JButton bt_1 = new JButton("ת��");
		JButton bt_2 = new JButton("����");

		lb_1.setBounds(100, 50, 120, 20);
		tf_1.setBounds(100, 80, 120, 20);
		lb_2.setBounds(100, 110, 120, 20);
		tf_2.setBounds(100, 140, 120, 20);
		bt_1.setBounds(130, 180, 60, 20);
		bt_2.setBounds(275, 292, 60, 20);
		
		bt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int user_id=Integer.parseInt(tf_1.getText());
				double money=Double.parseDouble(tf_2.getText());
				boolean bool=new ManagerImpl().Transfer(user, balance, user_id, money);
				if(bool==true) {
					lb_3.setText("    ת�˳ɹ�       ");
					lb_3.setBounds(120, 220, 120, 20);
				}else {
					lb_3.setText("��˶��˺Ż���");
					lb_3.setBounds(110, 220, 120, 20);
				}
				
			}
		});
		
		
		bt_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});

		c.add(lb_1);
		c.add(lb_2);
		c.add(lb_3);
		c.add(tf_1);
		c.add(tf_2);
		c.add(bt_1);
		c.add(bt_2);
		setVisible(true);
	}
	public static void main(String[] args) {
		MoneyBean balance = null;
		UserBean user = null;
		
		new TransferFrame(user,balance);
	}
}