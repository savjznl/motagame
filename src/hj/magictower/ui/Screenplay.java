/*
 * Screenplay.java
 *
 * Created on __DATE__, __TIME__
 */

package hj.magictower.ui;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author  __USER__
 */
public class Screenplay extends javax.swing.JFrame {

	/** Creates new form Screenplay */
	public Screenplay() {
		initComponents();
		setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("image/mbg.jpeg");
        this.setIconImage(icon);
        setTitle("耗子尾汁");
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(0, 153, 204));

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 22));
		jTextArea1.setLineWrap(true);
		jTextArea1.setRows(5);
		jTextArea1
				.setText("    \u6d51\u5143\u5f62\u610f\u592a\u6781\u95e8\u662f\u4e94\u884c\u56fd\u6700\u5927\u95e8\u6d3e\uff0c\u5176\u95e8\u5185\u5f1f\u5b50\u4f17\u591a\u3001\u9ad8\u624b\u65e0\u6570\uff0c\u9a6c\u4fdd\u56fd\u53ea\u662f\u5176\u4e2d\u4e00\u4f4d\u5fae\u4e0d\u8db3\u9053\u7684\u5c0f\u5c0f\u5b66\u5f92\uff0c\u4ed6\u4e00\u76f4\u6697\u604b\u7740\u638c\u95e8\u4eba\u7684\u5973\u513f\u5a77\u5a77\u5e08\u59d0\uff0c\u4f46\u662f\u4eba\u5bb6\u9ad8\u9ad8\u5728\u4e0a\u7684\u638c\u95e8\u5343\u91d1\u600e\u4e48\u4f1a\u770b\u4e0a\u4e00\u4e2a\u5c0f\u5b66\u5f92\u5462\uff1f\u4ed6\u53ea\u597d\u9ed8\u9ed8\u52aa\u529b\u7740\uff0c\u5e0c\u671b\u6709\u671d\u4e00\u65e5\u53ef\u4ee5\u83b7\u5f97\u5a77\u5a77\u5e08\u59d0\u7684\u9752\u7750\u3002\n    \u5929\u6709\u4e0d\u6d4b\u98ce\u4e91\uff0c\u4eba\u6709\u798f\u7978\u65e6\u5915\uff0c\u638c\u95e8\u6700\u8fd1\u5f97\u4e86\u4e00\u79cd\u602a\u75c5\uff0c\u795e\u533b\u770b\u4e86\u4e5f\u76f4\u6447\u5934\u8bf4:\u2018\u2019\u8be5\u5403\u5403\u8be5\u559d\u559d\u3002\u2018\u2019\u8bdd\u950b\u4e00\u8f6c\uff0c\u795e\u533b\u63a5\u7740\u9053\uff1a\u201c\u4e0d\u8fc7\uff0c\u6b64\u4e8b\u672a\u5fc5\u6ca1\u6709\u8f6c\u673a\u201d\u201c\u4e0d\u8fc7\u4ec0\u4e48\uff1f\u795e\u533b\u4f60\u4e00\u5b9a\u8981\u6551\u6551\u6211\u7236\u4eb2\u554a\uff0c\u6211\u6c42\u6c42\u4f60\u4e86\u201d\u5a77\u5a77\u54ed\u7740\u8bf4\u3002\u795e\u533b\u8bf4\u9053\uff1a\u201c\u4f60\u53ef\u77e5\u6211\u4eec\u4e3a\u4ec0\u4e48\u53eb\u505a\u4e94\u884c\u56fd\uff1f\n    \u76f8\u4f20\u5f88\u4e45\u5f88\u4e45\u4ee5\u524d\u5929\u4e0a\u7684\u5927\u795e\u5973\u5a32\uff0c\u7528\u6ce5\u571f\u505a\u6210\u6ce5\u5a03\u5a03\uff0c\u518d\u8d4b\u4e88\u5b83\u4eec\u751f\u547d\u3002\u4ece\u6b64\u5973\u5a32\u521b\u9020\u4e86\u4eba\uff0c\u4eba\u4eec\u4e16\u4e16\u4ee3\u4ee3\u7e41\u884d\u751f\u606f\uff0c\u8fc7\u7740\u5e78\u798f\u7684\u751f\u6d3b\u3002\u7136\u800c\uff0c\u597d\u666f\u4e0d\u957f\u3002\u6709\u4e00\u5e74\uff0c\u706b\u795e\u795d\u878d\u548c\u6c34\u795e\u5171\u5de5\u6253\u8d77\u4ed7\u6765\u3002\u5171\u5de5\u628a\u6491\u5929\u7684\u67f1\u5b50\u4e0d\u5468\u5c71\u649e\u5012\u4e86\uff0c\u5929\u584c\u4e0b\u534a\u8fb9\u6765\uff0c\u7838\u4e86\u5f88\u591a\u7a9f\u7abf\uff0c\u628a\u5730\u4e5f\u7838\u88c2\u4e86\uff0c\u5730\u4e0a\u7684\u6d2a\u6c34\u53ca\u5929\u6cb3\u7684\u6c34\u4e0d\u505c\u7684\u6f0f\u4e0b\u6765\uff0c\u9020\u6210\u5927\u5730\u4e0a\u6c34\u60a3\u3002\u5929\u7834\u4e4b\u540e\uff0c\u4e0d\u65ad\u7684\u6709\u9668\u77f3\u548c\u5929\u706b\u4ece\u7834\u5f00\u7684\u5929\u6d1e\u4e2d\u843d\u4e0b\uff0c\u5927\u5730\u4e0a\u7684\u4eba\u7c7b\u4e0d\u662f\u88ab\u9668\u77f3\u7838\u6b7b\u5c31\u662f\u88ab\u5927\u706b\u70e7\uff0c\u9762\u4e34\u7740\u5de8\u5927\u7684\u751f\u5b58\u5371\u673a\u3002\n    \u5973\u5a32\u770b\u5230\u4eba\u7c7b\u5de6\u8eb2\u897f\u85cf\uff0c\u65e0\u5904\u5bb9\u8eab\u7684\u60e8\u8c61\uff0c\u5fc3\u4e2d\u5341\u5206\u75db\u60dc\u3002\u5979\u4fbf\u904d\u5386\u4e7e\u5764\uff0c\u4e3a\u4e86\u89e3\u6551\u751f\u7075\uff0c\u51b3\u5b9a\u91c7\u77f3\u8865\u5929\uff0c\u7528\u4e94\u8272\u77f3\u628a\u5929\u8865\u8d77\u6765\uff0c\u518d\u7528\u4e1c\u6d77\u795e\u9f9f\u7684\u56db\u53ea\u811a\u9876\u4f4f\u82cd\u5929\u3002\u5973\u5a32\u627e\u6765\u4e94\u8272\u77f3\u5757\u70bc\u51fa\u4e94\u5f69\u6676\u77f3\uff0c\u628a\u5df2\u788e\u7684\u5929\u4e00\u70b9\u70b9\u7684\u8865\u4e86\u8d77\u6765\u3002\u800c\u5269\u4e0b\u6765\u7684\u4e94\u8272\u77f3\u5219\u9057\u7559\u5728\u6211\u4eec\u4e94\u884c\u56fd\u7684\u4e94\u884c\u5854\u4e0a\uff0c\u53ea\u8981\u6709\u4eba\u80fd\u95ef\u8fc7\u4e94\u884c\u5854\uff0c\u62ff\u5230\u91cc\u9762\u7684\u4e94\u884c\u5b9d\u7269\uff0c\u4f60\u7236\u4eb2\u5c31\u6709\u6551\u5566\u3002\u201d\n    \u5a77\u5a77\u4e00\u542c\u987f\u65f6\u611f\u5230\u60ca\u559c\uff0c\u5979\u4fcf\u8138\u4e00\u7ea2\u8bf4\u9053\uff1a\u201c\u5982\u679c\u8c01\u80fd\u628a\u4e94\u884c\u5b9d\u7269\u5e26\u56de\u6765\u6211\u2026\u2026\u6211\u5c31\u628a\u6211\u81ea\u5df1\u5ac1\u7ed9\u4ed6\uff01\u201d\u6d51\u5143\u5f62\u610f\u592a\u6781\u95e8\u73b0\u5728\u7fa4\u9f99\u65e0\u9996\uff0c\u5a77\u5a77\u4f5c\u4e3a\u638c\u95e8\u5343\u91d1\uff0c\u5979\u7684\u8bdd\u81ea\u7136\u662f\u4e00\u8a00\u4e5d\u9f0e\u3002\n\u9a6c\u4fdd\u56fd\u95fb\u8a00\uff0c\u51b3\u5b9a\u660e\u5929\u5c31\u52a8\u8eab\u53bb\u95ef\u4e00\u95ef\u8fd9\u4e94\u884c\u5854\uff0c\u52bf\u5fc5\u628a\u4e94\u884c\u5b9d\u7269\u5e26\u56de\u6765......");
		jScrollPane1.setViewportView(jTextArea1);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22));
		jButton1.setForeground(new java.awt.Color(0, 153, 204));
		jButton1.setText("\u70b9\u51fb\u7ee7\u7eed");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(103,
						Short.MAX_VALUE).addComponent(jScrollPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 1006,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(87, 87,
						87)).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(520, 520, 520)
						.addComponent(jButton1).addContainerGap(555,
								Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(53, Short.MAX_VALUE)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												552,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton1).addGap(37, 37,
												37)));

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
		 setVisible(false);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Screenplay().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}