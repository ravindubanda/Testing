/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Ekanayaketw
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stdaddress = new javax.swing.JTextArea();
        email = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        repw = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        gender = new javax.swing.JLabel();
        campus = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        Sem = new javax.swing.JTextField();
        stid = new javax.swing.JTextField();
        stdname = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        email_ = new javax.swing.JTextField();
        Campus = new javax.swing.JTextField();
        Course = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        pw2 = new javax.swing.JPasswordField();
        pw1 = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        view = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        Demo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setName("StudentRegistration"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Student Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, -1));

        sem.setText("Semester");
        jPanel1.add(sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 90, 20));

        jLabel3.setText("Student Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        jLabel5.setText("Student Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel6.setText("Student Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 20));

        contact.setText("Contact Number");
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 20));

        stdaddress.setColumns(20);
        stdaddress.setRows(5);
        jScrollPane1.setViewportView(stdaddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, 90));

        email.setText("Email Address");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 20));

        pw.setText("Password");
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 20));

        repw.setText("Re-enter Password");
        jPanel1.add(repw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, 20));

        buttonGroup1.add(male);
        male.setSelected(true);
        male.setText("Male");
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        gender.setText("Gender");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, 20));

        campus.setText("Campus");
        jPanel1.add(campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 90, 20));

        course.setText("Course");
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 20));

        year.setText("Year");
        jPanel1.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 90, 20));
        jPanel1.add(Sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 210, 30));
        jPanel1.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 200, 30));
        jPanel1.add(stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 200, 30));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 210, 30));
        jPanel1.add(email_, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 210, 30));
        jPanel1.add(Campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 210, 30));
        jPanel1.add(Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 210, 30));
        jPanel1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 210, 30));
        jPanel1.add(pw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 210, 30));
        jPanel1.add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 210, 30));

        reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reset.setText("Reset");
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        add1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add1.setText("Add");
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 560, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(548, 628));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 12, 501, -1));

        view.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        view.setText("View ");
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        delete.setText("Delete");
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        edit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        edit.setText("Edit");
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        Demo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Demo1.setText("Demo");
        jPanel2.add(Demo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campus;
    private javax.swing.JTextField Course;
    private javax.swing.JButton Demo1;
    private javax.swing.JTextField Sem;
    private javax.swing.JTextField Year;
    private javax.swing.JButton add1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel campus;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel course;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel email;
    private javax.swing.JTextField email_;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField number;
    private javax.swing.JLabel pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JPasswordField pw2;
    private javax.swing.JLabel repw;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sem;
    private javax.swing.JTextArea stdaddress;
    private javax.swing.JTextField stdname;
    private javax.swing.JTextField stid;
    private javax.swing.JButton view;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
