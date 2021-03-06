/*
 * Logon.java
 *
 * Created on __DATE__, __TIME__
 */

package hj.magictower.ui;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Mysql.User;

/**
 *
 * @author  __USER__
 */
public class Logon extends javax.swing.JFrame {

	/** Creates new form Logon */
	public Logon() {
		initComponents();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Image icon = Toolkit.getDefaultToolkit().getImage("image/mbg.jpeg");
        this.setIconImage(icon);
        setTitle("耗子尾汁");
	}

	public Logon(Class<Screenplay> class1) {
		// TODO Auto-generated constructor stub
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 153, 204));

		jLabel1.setBackground(new java.awt.Color(228, 226, 226));
		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 30));
		jLabel1.setForeground(new java.awt.Color(232, 230, 230));
		jLabel1.setText("\u6b22\u8fce\u6765\u5230");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 40));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u8017\u5b50\u5c3e\u6c41\u6ce8\u518c\u754c\u9762");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22));
		jLabel3.setText("\u8d26\u53f7\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22));
		jLabel4.setText("\u5bc6\u7801\uff1a");

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22));

		jPasswordField1.setFont(new java.awt.Font("宋体", 1, 22));

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 25));
		jButton1.setForeground(new java.awt.Color(0, 153, 204));
		jButton1.setText("\u6ce8\u518c");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(222, 222, 222)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jPasswordField1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																292,
																Short.MAX_VALUE))
										.addContainerGap(267, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(389, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(383,
												383, 383)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(368, Short.MAX_VALUE)
										.addComponent(jLabel1).addGap(367, 367,
												367)).addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(268, Short.MAX_VALUE)
										.addComponent(jLabel2).addGap(267, 267,
												267)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(105, 105, 105)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel2)
										.addGap(63, 63, 63)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(40, 40, 40)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(57, 57, 57).addComponent(
												jButton1).addContainerGap(97,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		User u = new User();
		String name = this.jTextField1.getText();
		String pw = this.jPasswordField1.getText();
		try {
			int uid = u.register(name, pw);
			JOptionPane.showMessageDialog(this, "恭喜你，注册成功,你的id是：" + uid);
			this.dispose();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "注册失败，请重试！");
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Logon().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}