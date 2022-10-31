/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.Person;
import model.SystemAdmin;

/**
 *
 * @author manavhirey
 */
public class ManageCommunity extends javax.swing.JPanel {

    /**
     * Creates new form ManageCommunity
     */
    public ManageCommunity(Person loggedInPerson) {
        initComponents();
        deleteBtn.setVisible(false);
        if(loggedInPerson.getRole().equals(SystemAdmin.UserRole.SYS_ADMIN)){
            deleteBtn.setVisible(true);
        }
        populateTable();
        populateCities();
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
        commId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        commTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        zipTxt = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        commTable = new javax.swing.JTable();
        loginLabel1 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Community ID:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Community Name:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Zip Code:");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        commTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community ID", "Community Name", "Zip"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        commTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(commTable);

        loginLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginLabel1.setText("Community Manager");

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(commId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(loginLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(commId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(commTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(zipTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int selected = commTable.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }

        long communityId = Long.parseLong(commId.getText());
        String communityName = commTxt.getText();
        long zip = Long.parseLong(zipTxt.getText());

        //      City city = new City(cityName, cityID, communityNames);
        Community com = SystemAdmin.commDir.getDirectoryCom().get(selected);

        com.setCommunityId(communityId);
        com.setCommName(communityName);
        com.setZip(zip);

        populateTable();

        commId.setText("");
        commTxt.setText("");
        zipTxt.setText("");
        cmbCity.setSelectedIndex(0);
        
        createBtn.setEnabled(true);
       
        JOptionPane.showMessageDialog(this, "Community Updated.");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selected = commTable.getSelectedRow();

        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        Community com = SystemAdmin.commDir.getDirectoryCom().get(selected);

        SystemAdmin.commDir.getDirectoryCom().remove(com);

        populateTable();

        commId.setText("");
        commTxt.setText("");
        zipTxt.setText("");
        createBtn.setEnabled(true);
        cmbCity.setSelectedIndex(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        long commID = Long.parseLong(commId.getText());
        String commName = commTxt.getText();
        long zip = Long.parseLong(zipTxt.getText());
        String cmbVal = String.valueOf(cmbCity.getSelectedItem());
        long cityId = 0;
        for(City ci: SystemAdmin.cityDir.getCityDir()){
            if(cmbVal.equals(ci.getName())){
                cityId = ci.getCityID();
            }
        }

        Community comm = new Community(commID, commName, zip,cityId);
        SystemAdmin.commDir.getDirectoryCom().add(comm);

        JOptionPane.showMessageDialog(this, "New City Details Added Successfully!");

        commId.setText("");
        commTxt.setText("");
        zipTxt.setText("");
        cmbCity.setSelectedIndex(0);
        populateTable();
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selected = commTable.getSelectedRow();
        if (selected < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        Community com = SystemAdmin.commDir.getDirectoryCom().get(selected);
        City cityName = SystemAdmin.cityDir.getCityDir().stream()
                .filter(x -> x.getCityID() == com.getCityId())
                .findFirst().get();
        commId.setText(String.valueOf(com.getCommunityId()));
        commTxt.setText(String.valueOf(com.getCommName()));
        zipTxt.setText(String.valueOf(com.getZip()));
        cmbCity.setSelectedItem(cityName.getName());
        

        createBtn.setEnabled(false);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) commTable.getModel();
        model.setRowCount(0);
                for (Community com : SystemAdmin.commDir.getDirectoryCom()) {

            Object[] rowData = new Object[3];
            rowData[0] = com.getCommunityId();
            rowData[1] = com.getCommName();
            rowData[2] = com.getZip();
            model.addRow(rowData);

        }
    }
    
    private void populateCities(){
        cmbCity.removeAllItems();
        cmbCity.addItem("Select City");
        SystemAdmin.cityDir.getCityDir().forEach( c -> cmbCity.addItem(c.getName()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JTextField commId;
    private javax.swing.JTable commTable;
    private javax.swing.JTextField commTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLabel1;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTextField zipTxt;
    // End of variables declaration//GEN-END:variables
}
