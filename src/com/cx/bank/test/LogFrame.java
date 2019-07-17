package com.cx.bank.test;

import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.cx.bank.manager.ManagerImpl;
import com.cx.bank.model.MoneyBean;
import com.cx.bank.model.UserBean;

public class LogFrame extends JFrame {
	public LogFrame(String[][] arr ,String[] arrColumn) {
		setTitle("��ϸ����");
		setResizable(false);
		// 1�����ô���λ������Ļ������
		int width = 438;
		int height = 365;
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		int w = (Toolkit.getDefaultToolkit().getScreenSize().width - width) / 2;
		int h = (Toolkit.getDefaultToolkit().getScreenSize().height - height) / 2;
		setLocation(w, h);

		Container c = getContentPane();
		c.setLayout(null);// ��������Ϊ���Բ���
		// c.setBackground(Color.WHITE);

		// ������������ĸ������
		JPanel p = new JPanel();// ��Ϣ���
		JButton bt_1 = new JButton("����");
		JScrollPane sp = new JScrollPane(p);// ������壬����Ϣ�����Ϊ����ģʽ

		// ������巽λ
		sp.setBounds(15, 10, 350, 300);
		bt_1.setBounds(362,308,60,20);

		JTable table = new JTable(arr, arrColumn);// ����������
		table.setRowHeight(25);// ���ñ�����
		
		bt_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		p.add(table);// �������ӵ����p
		// �������ӵ�������
		c.add(sp);
		c.add(bt_1);

		setVisible(true);

	}

	public static void main(String[] args) {
		String[] arrColumn = null;
		String[][] arr = null;
		new LogFrame(arr, arrColumn);
	}
}