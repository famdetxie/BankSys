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

public class WithdrawalsFrame extends JFrame{
	
	public WithdrawalsFrame(UserBean user,MoneyBean balance) {
		setTitle("ȡ�����");
		setResizable(false);
		// 1�����ô���λ������Ļ������
		int width = 350;
		int height = 250;
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - width) / 2;
		int h = (Toolkit.getDefaultToolkit().getScreenSize().height - height) / 2;
		setLocation(w, h);
		Container c = getContentPane();
		c.setLayout(null);// ��������Ϊ���Բ���

		JLabel lb_1 = new JLabel("������ȡ���");
		JLabel lb_2 = new JLabel("");
		JTextField tf_1 = new JTextField();
		JButton bt_1 = new JButton("ȡ��");
		JButton bt_2 = new JButton("����");

		lb_1.setBounds(100, 50, 120, 20);
		tf_1.setBounds(100, 80, 120, 20);
		bt_1.setBounds(130, 120, 60, 20);
		bt_2.setBounds(275, 192, 60, 20);
		
		bt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double money=Double.parseDouble(tf_1.getText());
				Boolean bool =new ManagerImpl().Withdrawals(user,balance,money);
				if (bool==true) {
					lb_2.setText("    ȡ���ɹ�       ");
					lb_2.setBounds(120, 160,90, 20);
				}else {
					lb_2.setBounds(110, 160, 120, 20);
					lb_2.setText("��������ȷ�Ľ��");
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
		c.add(tf_1);
		c.add(bt_1);
		c.add(bt_2);
		setVisible(true);
	}
	public static void main(String[] args) {
		MoneyBean balance = null;
		UserBean user = null;
		
		new WithdrawalsFrame(user,balance);
	}
}
