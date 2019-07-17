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

public class InquiryFrame extends JFrame {
	public InquiryFrame(double balance) {
		setTitle("����ѯ");
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

		JLabel lb_1 = new JLabel("���ã��㵱ǰ���Ϊ:"+balance);
		JButton bt_1 = new JButton("����");
		lb_1.setBounds(90, 90, 250, 20);
		bt_1.setBounds(275, 192, 60, 20);
		
		bt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});


		c.add(lb_1);
		c.add(bt_1);
		setVisible(true);
	}
	public static void main(String[] args) {
		double balance=0;
		new InquiryFrame(balance);
	}
}
