/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Hospital;
import model.Person;
import model.SystemAdmin;

/**
 *
 * @author manavhirey
 */
public class HospitalDirectory extends javax.swing.JPanel {

    /**
     * Creates new form HospitalDirectory
     */
    public HospitalDirectory(Person loggedInPerson) {
        initComponents();
        deleteBtn.setVisible(false);
        if(loggedInPerson.getRole().equals(SystemAdmin.UserRole.SYS_ADMIN)){
            deleteBtn.setVisible(true);
        }
        populateComms();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        hosTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hosId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        phoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hosTbl = new javax.swing.JTable();
        loginLabel1 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbComm = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 51, 51));

        updateBtn.setBackground(new java.awt.Color(165, 201, 202));
        updateBtn.setForeground(new java.awt.Color(57, 91, 100));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(165, 201, 202));
        deleteBtn.setForeground(new java.awt.Color(57, 91, 100));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(165, 201, 202));
        createBtn.setForeground(new java.awt.Color(57, 91, 100));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setBackground(new java.awt.Color(165, 201, 202));
        viewBtn.setForeground(new java.awt.Color(57, 91, 100));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        hosTxt.setBackground(new java.awt.Color(231, 246, 242));
        hosTxt.setForeground(new java.awt.Color(57, 91, 100));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 246, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hospital Name:");

        hosId.setBackground(new java.awt.Color(231, 246, 242));
        hosId.setForeground(new java.awt.Color(57, 91, 100));
        hosId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hosIdFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 246, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Hospital ID");

        phoneTxt.setBackground(new java.awt.Color(231, 246, 242));
        phoneTxt.setForeground(new java.awt.Color(57, 91, 100));
        phoneTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneTxtKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(231, 246, 242));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Phone Number:");

        emailTxt.setBackground(new java.awt.Color(231, 246, 242));
        emailTxt.setForeground(new java.awt.Color(57, 91, 100));
        emailTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTxtFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 246, 242));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email:");

        addressTxt.setBackground(new java.awt.Color(231, 246, 242));
        addressTxt.setForeground(new java.awt.Color(57, 91, 100));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 246, 242));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");

        hosTbl.setBackground(new java.awt.Color(44, 51, 51));
        hosTbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        hosTbl.setForeground(new java.awt.Color(231, 246, 242));
        hosTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Name", "Address", "Community", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hosTbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(hosTbl);

        loginLabel1.setBackground(new java.awt.Color(44, 51, 51));
        loginLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(165, 201, 202));
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel1.setText("Hospital Directory");

        cmbCity.setBackground(new java.awt.Color(231, 246, 242));
        cmbCity.setForeground(new java.awt.Color(57, 91, 100));
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(231, 246, 242));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("City:");

        cmbComm.setBackground(new java.awt.Color(231, 246, 242));
        cmbComm.setForeground(new java.awt.Color(57, 91, 100));
        cmbComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(231, 246, 242));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Community:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(phoneTxt)
                                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbComm, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(hosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(hosId, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(loginLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hosId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selected = hosTbl.getSelectedRow();
        
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        Hospital hos = SystemAdmin.hosDir.getHospitalList().get(selected);
        
        SystemAdmin.hosDir.getHospitalList().remove(hos);
        
        populateTable();
        
        hosId.setText("");
        hosTxt.setText("");
        addressTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        cmbCity.setSelectedIndex(0);
        cmbComm.setSelectedIndex(0);
        
        
         JOptionPane.showMessageDialog(this,"Hospital Data Deleted.");
         
         createBtn.setEnabled(true);
                 
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        long hospitalId = Long.parseLong(hosId.getText());
        String hospitalName = hosTxt.getText();
        String add = addressTxt.getText();
        String emailId = emailTxt.getText();
        long phone = Long.parseLong(phoneTxt.getText());
        String cmbVal = String.valueOf(cmbCity.getSelectedItem());
        String cmbValC = String.valueOf(cmbComm.getSelectedItem());
        City cityId = SystemAdmin.cityDir.getCityDir().stream()
                    .filter( x -> x.getName().equals(cmbVal))
                    .findFirst().get();
        Community commId = SystemAdmin.commDir.getDirectoryCom().stream()
                    .filter( x -> x.getCommName().equals(cmbValC))
                    .findFirst().get();
        
        Hospital newhos = new Hospital(hospitalId, hospitalName,add,phone,emailId,commId,cityId);
        SystemAdmin.hosDir.getHospitalList().add(newhos);
        
        hosId.setText("");
        hosTxt.setText("");
        addressTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        cmbCity.setSelectedIndex(0);
        cmbComm.setSelectedIndex(0);
        
        
        JOptionPane.showMessageDialog(this,"New Hospital Added.");
        
        populateTable();
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
                int selected = hosTbl.getSelectedRow();
        
        if (selected < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) hosTbl.getModel();
        Hospital selectedHos = SystemAdmin.hosDir.getHospitalList().get(selected);
        
        hosId.setText(String.valueOf(selectedHos.getHospitalId()));
        hosTxt.setText(selectedHos.getHospitalName());
        addressTxt.setText(selectedHos.getAddress());
        emailTxt.setText(selectedHos.getEmail());
        phoneTxt.setText(String.valueOf(selectedHos.getPhoneNo()));
        cmbComm.setSelectedItem(selectedHos.getComm().getCommName());
        cmbCity.setSelectedItem(selectedHos.getCity().getName());
        
        createBtn.setEnabled(false);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selected = hosTbl.getSelectedRow();
        
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        long hospitalId = Long.parseLong(hosId.getText());
        String hospitalName = hosTxt.getText();
        String add = addressTxt.getText();
        String emailId = emailTxt.getText();
        long phone = Long.parseLong(phoneTxt.getText());
        String cmbVal = String.valueOf(cmbCity.getSelectedItem());
        String cmbValC = String.valueOf(cmbComm.getSelectedItem());
        City cityId = SystemAdmin.cityDir.getCityDir().stream()
                    .filter( x -> x.getName().equals(cmbVal))
                    .findFirst().get();
        Community commId = SystemAdmin.commDir.getDirectoryCom().stream()
                    .filter( x -> x.getCommName().equals(cmbValC))
                    .findFirst().get();
        
        
        Hospital hos = SystemAdmin.hosDir.getHospitalList().get(selected);
        
        
        hos.setHospitalId(hospitalId);
        hos.setHospitalName(hospitalName);  
        hos.setPhoneNo(phone);
        hos.setAddress(add);
        hos.setEmail(emailId);
        hos.setComm(commId);
        hos.setCity(cityId);
        
        populateTable();
          
        hosId.setText("");
        hosTxt.setText("");
        addressTxt.setText("");
        phoneTxt.setText("");
        emailTxt.setText("");
        cmbCity.setSelectedIndex(0);
        cmbComm.setSelectedIndex(0);
        
        createBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void cmbCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommActionPerformed
        // TODO add your handling code here:
        populateCities();
    }//GEN-LAST:event_cmbCommActionPerformed

    private void hosIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hosIdFocusLost
        // TODO add your handling code here:
        if(!hosId.getText().equals("")){
            List<Long> ssnList = SystemAdmin.hosDir.getHospitalList().stream().map(x -> x.getHospitalId()).toList();
            if(ssnList.contains(Long.parseLong(hosId.getText()))){
                JOptionPane.showMessageDialog(this, "HospitalId already taken.");
            }
        }
    }//GEN-LAST:event_hosIdFocusLost

    private void emailTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTxtFocusLost
        // TODO add your handling code here:
        if(!emailTxt.getText().equals("")){
            String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(emailTxt.getText());
        
            if(!matcher.matches()){
                JOptionPane.showMessageDialog(null,"Enter a valid Email");
                emailTxt.setText("");
            }
        }
    }//GEN-LAST:event_emailTxtFocusLost

    private void phoneTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTxtKeyPressed
        // TODO add your handling code here:
        String phoneNumber = phoneTxt.getText();
        int lengthOfPhoneNumber = phoneNumber.length();
        char checkChar = evt.getKeyChar();
        if (checkChar >= '0' && checkChar <= '9') {
            if (lengthOfPhoneNumber < 10) {
                phoneTxt.setEditable(true);
            } else {
                phoneTxt.setEditable(false);
                JOptionPane.showMessageDialog(this, "Cannot add more than 10 Numbers!");
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                phoneTxt.setEditable(true);
            } else {
                phoneTxt.setEditable(false);
            }
        }
    }//GEN-LAST:event_phoneTxtKeyPressed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) hosTbl.getModel();
        model.setRowCount(0);
        
        for (Hospital hos : SystemAdmin.hosDir.getHospitalList()) {
            
            Object[] row = new Object[5];
            row[0] = hos.getHospitalId();
            row[1] = hos.getHospitalName();
            row[2] = hos.getAddress();
            row[3] = hos.getComm().getCommName();
            row[4] = hos.getCity().getName();

            model.addRow(row);
        }
    }
    
    private void populateCities(){
        cmbCity.removeAllItems();
        cmbCity.addItem("Select City");
        SystemAdmin.cityDir.getCityDir().forEach( c -> cmbCity.addItem(c.getName()));
    }
    
    private void populateComms(){
        cmbComm.removeAllItems();
        cmbComm.addItem("Select Community");
        SystemAdmin.commDir.getDirectoryCom().forEach( c -> cmbComm.addItem(c.getCommName()));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbComm;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField hosId;
    private javax.swing.JTable hosTbl;
    private javax.swing.JTextField hosTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
