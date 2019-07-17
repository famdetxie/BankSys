package com.cx.bank.dao;

import java.sql.ResultSet;

public interface BankDaoInterface {
	public boolean Register(String user_name,String user_password);//ע��
	public ResultSet Login(String user_name,String user_password);//��¼
	public int deposit(double blance,String user);//���
	public int withdrawals(double balance , String user);//ȡ��
	public ResultSet getBalance(String User_name); //���
	public ResultSet transfer(String user_name,double balance , int user_id );//ת��
	public void Record(String log_type , double log_amount ,int user_id);//��¼����
	public ResultSet GetLog(int user_id);//��ȡ��ϸ
	public ResultSet selectUser_id(int user_id);
}
