package Development.Form;

import Development.BO.ModalityAnalyzer;
import Development.Controller.ModalityAnalyzerController;
import Development.TableModel.RegisteredMachineTableModel;
import Development.TableModel.SectionWiseMachineTableModel;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DefinitionTypes;
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class ModalityAnalyzerForm extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();

    private String statusId;
    private String machineType = "";
    private String status;
    private String reportFont = "fs22";
    private String displayFont = "fs30";
    private int performedRow = 0;
    private String machineId = "", secId = "";

    public ModalityAnalyzerForm() {

        initComponents();

        this.setSize(Constants.xSize + 110, Constants.ySize - 65);

        btnUpdate.setEnabled(false);
        cboType.setEnabled(true);
        cboActive.setSelectedIndex(1);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnRegister.setMnemonic(KeyEvent.VK_R);
        btnUpdate.setMnemonic(KeyEvent.VK_U);
        btnClear.setMnemonic(KeyEvent.VK_C);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUserDetail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMachineName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModelNo = new javax.swing.JTextField();
        txtManufacturer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSection = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        cboActive = new javax.swing.JComboBox();
        txtIp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cboType = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlSearchUser = new javax.swing.JPanel();
        txtBaudrate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtStopBits = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtParity = new javax.swing.JTextField();
        txtDatabits = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSearchMachine = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSearchDepartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSearchLocation = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtSearchSection = new javax.swing.JTextField();
        cboSearchType = new javax.swing.JComboBox();
        pnlSearchUser1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtStoreAetitle = new javax.swing.JTextField();
        txtMwlAetitle = new javax.swing.JTextField();
        txtStation = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        txtMachineType = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtMachineId = new javax.swing.JTextField();
        pnlSearchUser2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblRegisteredMachine = new javax.swing.JTable();
        pnlSearchUser3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblSectionWiseMachine = new javax.swing.JTable();
        pnlUserDetail2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtAddMachine = new javax.swing.JTextField();
        btnRemoveSection = new javax.swing.JButton();
        txtAddSection = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtAddDepartment = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Machine Form");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pnlUserDetail.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Machine Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Machine :");

        txtMachineName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMachineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachineNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Model :");

        txtModelNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtModelNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtModelNoMouseReleased(evt);
            }
        });
        txtModelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNoActionPerformed(evt);
            }
        });

        txtManufacturer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturerActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Manufacturer :");

        txtSection.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSectionActionPerformed(evt);
            }
        });

        txtDepartment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Ip :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Location :");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Section :");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Department :");

        txtLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","Y","N"}));
        cboActive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboActiveMouseReleased(evt);
            }
        });
        cboActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboActiveActionPerformed(evt);
            }
        });
        cboActive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboActiveKeyReleased(evt);
            }
        });

        txtIp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Port :");

        txtPort.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPortActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Active :");

        cboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","MODALITY","ANALYZER"}));
        cboType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboTypeMouseReleased(evt);
            }
        });
        cboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTypeActionPerformed(evt);
            }
        });
        cboType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboTypeKeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 0, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Type :");

        javax.swing.GroupLayout pnlUserDetailLayout = new javax.swing.GroupLayout(pnlUserDetail);
        pnlUserDetail.setLayout(pnlUserDetailLayout);
        pnlUserDetailLayout.setHorizontalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIp, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtLocation)
                    .addComponent(txtDepartment)
                    .addComponent(txtModelNo)
                    .addComponent(txtMachineName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboActive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cboType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlUserDetailLayout.setVerticalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetailLayout.createSequentialGroup()
                        .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMachineName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel17)))
                        .addGap(4, 4, 4)
                        .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(5, 5, 5)
                        .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUserDetailLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cboType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtSection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6)
        );

        pnlSearchUser.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analyzer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser.setForeground(java.awt.SystemColor.activeCaption);

        txtBaudrate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBaudrate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBaudrateMouseReleased(evt);
            }
        });
        txtBaudrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaudrateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Baudrate :");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Parity :");

        txtStopBits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStopBits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStopBitsActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Stop bits :");

        txtParity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtParity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParityActionPerformed(evt);
            }
        });

        txtDatabits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDatabits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatabitsActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Databits :");

        javax.swing.GroupLayout pnlSearchUserLayout = new javax.swing.GroupLayout(pnlSearchUser);
        pnlSearchUser.setLayout(pnlSearchUserLayout);
        pnlSearchUserLayout.setHorizontalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUserLayout.createSequentialGroup()
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBaudrate, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(txtStopBits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDatabits, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtParity))
                .addContainerGap())
        );
        pnlSearchUserLayout.setVerticalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUserLayout.createSequentialGroup()
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBaudrate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDatabits, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtParity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtStopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(102, 0, 0));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Machine :");

        txtSearchMachine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchMachineActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Department :");

        txtSearchDepartment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchDepartmentMouseReleased(evt);
            }
        });
        txtSearchDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchDepartmentActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Location :");

        txtSearchLocation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchLocation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchLocationMouseReleased(evt);
            }
        });
        txtSearchLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchLocationActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 0, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Section :");

        txtSearchSection.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchSectionMouseReleased(evt);
            }
        });
        txtSearchSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchSectionActionPerformed(evt);
            }
        });

        cboSearchType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select","MODALITY","ANALYZER"}));
        cboSearchType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboSearchTypeMouseReleased(evt);
            }
        });
        cboSearchType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSearchTypeActionPerformed(evt);
            }
        });
        cboSearchType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cboSearchTypeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchMachine, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(txtSearchDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addComponent(txtSearchSection, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearchLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSearchLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtSearchSection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSearchUser1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modality", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("MWL AE-Title :");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Store AE-Title :");

        txtStoreAetitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStoreAetitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtStoreAetitleMouseReleased(evt);
            }
        });
        txtStoreAetitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStoreAetitleActionPerformed(evt);
            }
        });

        txtMwlAetitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMwlAetitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMwlAetitleActionPerformed(evt);
            }
        });

        txtStation.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStationActionPerformed(evt);
            }
        });

        txtType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 0, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Type :");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 0, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Station :");

        label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(102, 0, 0));
        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label.setText("Server Type :");

        txtMachineType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMachineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMachineTypeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Configutation Manual");

        txtMachineId.setEditable(false);
        txtMachineId.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtMachineId.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlSearchUser1Layout = new javax.swing.GroupLayout(pnlSearchUser1);
        pnlSearchUser1.setLayout(pnlSearchUser1Layout);
        pnlSearchUser1Layout.setHorizontalGroup(
            pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser1Layout.createSequentialGroup()
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStoreAetitle, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtMwlAetitle)
                    .addComponent(txtMachineType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMachineId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStation)
                    .addComponent(txtType)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSearchUser1Layout.setVerticalGroup(
            pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser1Layout.createSequentialGroup()
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtStoreAetitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtStation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtMwlAetitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(jButton1)
                    .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMachineId, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMachineType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
        );

        pnlSearchUser2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser2.setForeground(java.awt.SystemColor.activeCaption);

        tblRegisteredMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null,null,null,null,null}
            },
            new String [] {
                "Sr.", "Machine", "Type", "IP", "PORT"}
        ));
        tblRegisteredMachine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegisteredMachineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRegisteredMachineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblRegisteredMachineMouseReleased(evt);
            }
        });
        tblRegisteredMachine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblRegisteredMachineKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblRegisteredMachineKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblRegisteredMachine);

        javax.swing.GroupLayout pnlSearchUser2Layout = new javax.swing.GroupLayout(pnlSearchUser2);
        pnlSearchUser2.setLayout(pnlSearchUser2Layout);
        pnlSearchUser2Layout.setHorizontalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        pnlSearchUser2Layout.setVerticalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        pnlSearchUser3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Section Wise Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser3.setForeground(java.awt.SystemColor.activeCaption);

        tblSectionWiseMachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null,null,null,null,null}
            },
            new String [] {
                "Sr.","Machine","Model No","Section","Department","Location"}
        ));
        tblSectionWiseMachine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSectionWiseMachineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSectionWiseMachineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSectionWiseMachineMouseReleased(evt);
            }
        });
        tblSectionWiseMachine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSectionWiseMachineKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSectionWiseMachineKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblSectionWiseMachine);

        javax.swing.GroupLayout pnlSearchUser3Layout = new javax.swing.GroupLayout(pnlSearchUser3);
        pnlSearchUser3.setLayout(pnlSearchUser3Layout);
        pnlSearchUser3Layout.setHorizontalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        pnlSearchUser3Layout.setVerticalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pnlUserDetail2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail2.setForeground(java.awt.SystemColor.activeCaption);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Department:");

        txtAddMachine.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMachineActionPerformed(evt);
            }
        });

        btnRemoveSection.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRemoveSection.setForeground(new java.awt.Color(102, 0, 0));
        btnRemoveSection.setText("Remove");
        btnRemoveSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveSectionActionPerformed(evt);
            }
        });

        txtAddSection.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddSection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAddSectionMouseReleased(evt);
            }
        });
        txtAddSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddSectionActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 0, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Section :");

        txtAddDepartment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddDepartmentActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 0, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Machine:");

        btnAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(102, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail2Layout = new javax.swing.GroupLayout(pnlUserDetail2);
        pnlUserDetail2.setLayout(pnlUserDetail2Layout);
        pnlUserDetail2Layout.setHorizontalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddMachine)
                    .addComponent(txtAddDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemoveSection, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddSection, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlUserDetail2Layout.setVerticalGroup(
            pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtAddMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemoveSection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserDetail2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtAddSection, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlUserDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlUserDetail2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlUserDetail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtMachineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachineNameActionPerformed

        txtMachineName.setCaretPosition(0);
        txtModelNo.requestFocus();
    }//GEN-LAST:event_txtMachineNameActionPerformed

    private void txtModelNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModelNoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNoMouseReleased

    private void txtModelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNoActionPerformed
        txtManufacturer.requestFocus();
        txtModelNo.setCaretPosition(0);
    }//GEN-LAST:event_txtModelNoActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchMachineActionPerformed

        if (txtSearchMachine.getText().length() == 0) {
            return;
        }
        machineId = txtSearchMachine.getText();
        selectMachine();

    }//GEN-LAST:event_txtSearchMachineActionPerformed

    private void txtSearchLocationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchLocationMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchLocationMouseReleased

    private void txtSearchLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchLocationActionPerformed
         
         machineId = "";
        String query = "  SELECT ID ID,DESCRIPTION DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.location + "                 \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtSearchLocation.getText() + "%')"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSearchLocation.setText("");
            searchlocationId = "";
        } else {
            searchlocationId = Constants.lovID;
            txtSearchLocation.setText(Constants.lovDescription.toUpperCase());
        }
        selectMachine();
    }//GEN-LAST:event_txtSearchLocationActionPerformed

    private void txtSearchDepartmentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchDepartmentMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchDepartmentMouseReleased

    private void txtSearchDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchDepartmentActionPerformed

        machineId = "";
        lov.LOVDefinitionSelection(DefinitionTypes.department, txtSearchDepartment.getText().trim(), this);
        if (Constants.lovID.equalsIgnoreCase("ID")) {
            return;
        }
        searchDepartmentId = Constants.lovID;
        txtSearchDepartment.setText(Constants.lovDescription);
        selectMachine();

    }//GEN-LAST:event_txtSearchDepartmentActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearForm();
        btnRegister.setEnabled(true);
        btnUpdate.setEnabled(false);
        cboType.setEnabled(true);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        if (txtMachineName.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Machine Name");
            txtMachineName.requestFocus();
            return;
        }
        if (txtModelNo.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Model No");
            txtModelNo.requestFocus();
            return;
        }
        if (txtManufacturer.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Manufacturer Name");
            txtManufacturer.requestFocus();
            return;
        }
        if (txtDepartment.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Department Name");
            txtDepartment.requestFocus();
            return;
        }
        if (txtSection.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Section Name");
            txtSection.requestFocus();
            return;
        }
        if (txtLocation.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Location Name");
            txtLocation.requestFocus();
            return;
        }
        if (cboActive.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Active Mark");
            txtLocation.requestFocus();
            return;
        }

        if (cboType.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "Kindly Select Type");
            cboType.requestFocus();
            return;
        }

        current.setMachineName(txtMachineName.getText().trim());
        current.setModel(txtModelNo.getText().trim());
        current.setManufacturer(txtManufacturer.getText().trim());
        current.setIp(txtIp.getText().trim());
        current.setPort(txtPort.getText().trim());
        current.setActive(cboActive.getSelectedItem().toString());
        current.setMachineType(cboType.getSelectedItem().toString());
        current.setBaudrate(txtBaudrate.getText().trim());
        current.setDatabits(txtDatabits.getText().trim());
        current.setStopbits(txtStopBits.getText().trim());
        current.setParity(txtParity.getText().trim());
        current.setStoreAetitle(txtStoreAetitle.getText().trim());
        current.setMwlAetitle(txtMwlAetitle.getText().trim());
        current.setType(txtType.getText().trim());
        current.setStationName(txtStation.getText().trim());
        current.setLocationId(locationId);
        current.setDepartmentId(departmentId);
        current.setSectionId(secId);
        current.setOrgId("332");

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Register Machine.");
        if (confirmation != 0) {
            return;
        }
        if (ctlMac.insertMachineRegister(current)) {
            JOptionPane.showMessageDialog(null, "Machine Registered Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Register Machine,Kindly Contact Administrator");
        }
          
        clearForm();

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (listMac.isEmpty() || tblRegisteredMachine.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select Machine to Update Info");
            return;
        }

        
        current.setMachineName(txtMachineName.getText().trim());
        current.setOrgId("332");
        current.setId(current.getId());
        current.setModel(txtModelNo.getText().trim());
        current.setManufacturer(txtManufacturer.getText().trim());

        if (locationId.isEmpty()) {
            current.setLocationId(current.getLocationId());
        } else {
            current.setLocationId(locationId);
        }
        if (departmentId.isEmpty()) {
            current.setDepartmentId(current.getDepartmentId());
        } else {
            current.setDepartmentId(departmentId);
        }
        if (secId.isEmpty()) {
            current.setSectionId(current.getSectionId());
        } else {
            current.setSectionId(secId);
        }
        current.setIp(txtIp.getText().trim());
        current.setPort(txtPort.getText().trim());
     //   setEditable();
        current.setBaudrate(txtBaudrate.getText().trim());
        current.setDatabits(txtDatabits.getText().trim());
        current.setStopbits(txtStopBits.getText().trim());
        current.setParity(txtParity.getText().trim());
        current.setStoreAetitle(txtStoreAetitle.getText().trim());
        current.setMwlAetitle(txtMwlAetitle.getText().trim());
        current.setType(txtType.getText().trim());
        current.setStationName(txtStation.getText().trim());
        current.setActive(cboActive.getSelectedItem().toString());

        if (cboType.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Machine Type");
            return;
        }
        current.setMachineType(cboType.getSelectedItem().toString());

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "Update Machine Information.");
        if (confirmation != 0) {
            return;
        }
        if (ctlMac.UpdateMachineInfo(current)) {
            JOptionPane.showMessageDialog(null, "Information Updated Successfully");
            machineId = "";
            selectMachine();

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update,Kindly Contact Administrator");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturerActionPerformed
        txtDepartment.requestFocus();
        txtManufacturer.setCaretPosition(0);
    }//GEN-LAST:event_txtManufacturerActionPerformed

    private void cboSearchTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboSearchTypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSearchTypeMouseReleased

    private void cboSearchTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSearchTypeActionPerformed

        if (cboSearchType.getSelectedIndex() == 0) {
            machineType = "";
            return;
        }
        machineType = cboSearchType.getSelectedItem().toString().toUpperCase();
        machineId = txtSearchMachine.getText().trim().toUpperCase();
        if (txtSearchDepartment.getText().trim().length() == 0) {
            searchDepartmentId = "";
        }
        selectMachine();
    }//GEN-LAST:event_cboSearchTypeActionPerformed

    private void cboSearchTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboSearchTypeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSearchTypeKeyReleased

    private void txtSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSectionActionPerformed

        if (txtDepartment.getDocument().getLength() <= 0) {

            JOptionPane.showMessageDialog(null, "Select Department first");
        }

        String query = "  SELECT SECTION_ID ID, DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.section + "                 \n"
                + " WHERE DEPARTMENT_ID = '" + departmentId + "'             \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtSection.getText().trim() + "%')";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSection.setText("");
            secId = "";

        } else {
            secId = Constants.lovID;
            txtSection.setText(Constants.lovDescription.toUpperCase());

        }

        txtLocation.requestFocus();
    }//GEN-LAST:event_txtSectionActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed

        String query = "  SELECT ID ID, DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.definitionTypeDetail + "                 \n"
                + " WHERE DEF_TYPE_ID = 15                               \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtDepartment.getText().trim() + "%')";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtDepartment.setText("");
            departmentId = "";

        } else {
            departmentId = Constants.lovID;
            txtDepartment.setText(Constants.lovDescription.toUpperCase());
        }
        txtSection.requestFocus();
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed

        String query = "  SELECT ID ID,DESCRIPTION DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.location + "                 \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtLocation.getText() + "%')"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtLocation.setText("");
            locationId = "";
        } else {
            locationId = Constants.lovID;
            txtLocation.setText(Constants.lovDescription.toUpperCase());
        }
        txtIp.requestFocus();
    }//GEN-LAST:event_txtLocationActionPerformed

    private void cboActiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboActiveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveMouseReleased

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveActionPerformed

    private void cboActiveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboActiveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveKeyReleased

    private void txtIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpActionPerformed
        txtPort.requestFocus();
        txtIp.setCaretPosition(0);
    }//GEN-LAST:event_txtIpActionPerformed

    private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
        // TODO add your handling code here:
        txtPort.setCaretPosition(0);
    }//GEN-LAST:event_txtPortActionPerformed

    private void tblRegisteredMachineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegisteredMachineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegisteredMachineMouseClicked

    private void tblRegisteredMachineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegisteredMachineMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegisteredMachineMousePressed

    private void tblRegisteredMachineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegisteredMachineMouseReleased

        if (listMac.isEmpty() || tblRegisteredMachine.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select Machine to view Information");
            return;
        }

        cboType.setEnabled(true);
        btnRegister.setEnabled(false);
        btnUpdate.setEnabled(true);
        current = listMac.get(tblRegisteredMachine.getSelectedRow());
        machineId = current.getId();
        txtAddMachine.setText(current.getMachineName());
        txtMachineName.setText(current.getMachineName());
        txtModelNo.setText(current.getModel());
        txtManufacturer.setText(current.getManufacturer());
        txtLocation.setText(current.getLocationDescription());
        txtDepartment.setText(current.getDepartmentDescription());
        txtSection.setText(current.getSectionDescription());
        txtPort.setText(current.getPort());
        txtIp.setText(current.getIp());
        cboActive.setSelectedItem(current.getActive());
        cboType.setSelectedItem(current.getMachineType());
        cboType.setSelectedItem(current.getType());
        txtBaudrate.setText(current.getBaudrate());
        txtDatabits.setText(current.getDatabits());
        txtStopBits.setText(current.getStopbits());
        txtParity.setText(current.getParity());
        txtStoreAetitle.setText(current.getStoreAetitle());
        txtType.setText(current.getType());
        txtMwlAetitle.setText(current.getMwlAetitle());
        txtStation.setText(current.getStationName());
        txtMachineType.setText(current.getMachineType());
        txtMachineId.setText(current.getId());
        AddDepartmentId = current.getDepartmentId();
        //addSectionId = current.getSectionId();
        txtAddDepartment.setText(current.getDepartmentDescription());
        
        txtAddSection.setText("");
        selectSectionWiseMachine(machineId);
        setEditable();
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegisteredMachineMouseReleased

    private void tblRegisteredMachineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRegisteredMachineKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegisteredMachineKeyPressed

    private void tblRegisteredMachineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRegisteredMachineKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegisteredMachineKeyReleased

    private void tblSectionWiseMachineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSectionWiseMachineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSectionWiseMachineMouseClicked

    private void tblSectionWiseMachineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSectionWiseMachineMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSectionWiseMachineMousePressed

    private void tblSectionWiseMachineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSectionWiseMachineMouseReleased

        if (listSection.isEmpty() || tblSectionWiseMachine.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Section Wise Machine Info is Empty");
            return;
        }

        current = listSection.get(tblSectionWiseMachine.getSelectedRow());

    }//GEN-LAST:event_tblSectionWiseMachineMouseReleased

    private void tblSectionWiseMachineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSectionWiseMachineKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSectionWiseMachineKeyPressed

    private void tblSectionWiseMachineKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSectionWiseMachineKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSectionWiseMachineKeyReleased

    private void txtBaudrateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBaudrateMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaudrateMouseReleased

    private void txtBaudrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaudrateActionPerformed
        txtDatabits.requestFocus();
        txtBaudrate.setCaretPosition(0);
    }//GEN-LAST:event_txtBaudrateActionPerformed

    private void txtStopBitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStopBitsActionPerformed
        txtParity.requestFocus();
        txtStopBits.setCaretPosition(0);
    }//GEN-LAST:event_txtStopBitsActionPerformed

    private void txtParityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParityActionPerformed
        txtParity.setCaretPosition(0);
    }//GEN-LAST:event_txtParityActionPerformed

    private void txtDatabitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatabitsActionPerformed
        txtStopBits.requestFocus();
        txtDatabits.setCaretPosition(0);
    }//GEN-LAST:event_txtDatabitsActionPerformed

    private void txtStoreAetitleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStoreAetitleMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStoreAetitleMouseReleased

    private void txtStoreAetitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStoreAetitleActionPerformed
        txtType.requestFocus();
        txtStoreAetitle.setCaretPosition(0);
    }//GEN-LAST:event_txtStoreAetitleActionPerformed

    private void txtMwlAetitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMwlAetitleActionPerformed
        txtStation.requestFocus();
        txtMwlAetitle.setCaretPosition(0);
    }//GEN-LAST:event_txtMwlAetitleActionPerformed

    private void txtStationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStationActionPerformed
        txtStation.setCaretPosition(0);
    }//GEN-LAST:event_txtStationActionPerformed

    private void txtTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeActionPerformed
        txtMwlAetitle.requestFocus();
        txtType.setCaretPosition(0);
    }//GEN-LAST:event_txtTypeActionPerformed

    private void cboTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTypeMouseReleased

    private void cboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTypeActionPerformed


    }//GEN-LAST:event_cboTypeActionPerformed

    private void cboTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboTypeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTypeKeyReleased

    private void txtSearchSectionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchSectionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchSectionMouseReleased

    private void txtSearchSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchSectionActionPerformed

        machineId = "";
        if (txtSearchDepartment.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Select Department first");
            return;
        }

        String query = "  SELECT SECTION_ID ID, DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.section + "                 \n"
                + " WHERE DEPARTMENT_ID = '" + searchDepartmentId + "'             \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtSearchSection.getText().trim() + "%')";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtSearchSection.setText("");
            searchSectionId = "";

        } else {
            searchSectionId = Constants.lovID;
            txtSearchSection.setText(Constants.lovDescription.toUpperCase());
            selectMachine();
        }

    }//GEN-LAST:event_txtSearchSectionActionPerformed

    private void txtAddMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMachineActionPerformed

        String query = "  SELECT ID ID, DESCRIPTION \n"
                + " FROM                                \n"
                + Database.DCMS.modalityAnalyzer + "                 \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtAddMachine.getText().trim() + "%')";

        lov.LOVSelection(query, this);
        machineId = "";
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            machineId = Constants.lovID;
            txtAddMachine.setText(Constants.lovDescription.toUpperCase());
            txtAddDepartment.requestFocus();
        }
    }//GEN-LAST:event_txtAddMachineActionPerformed

    private void txtAddSectionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddSectionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddSectionMouseReleased

    private void txtAddSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddSectionActionPerformed

        if (AddDepartmentId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Select Department first");
            txtAddDepartment.requestFocus();
            return;
        }

        String query = "  SELECT SECTION_ID ID, DESCRIPTION         \n"
                + " FROM " + Database.DCMS.section + "              \n"
                + " WHERE DEPARTMENT_ID = '" + AddDepartmentId + "' \n"
                + " AND UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtAddSection.getText().trim() + "%') \n"
                + " AND ACTIVE = 'Y' ";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAddSection.setText("");
            addSectionId = "";

        } else {
            addSectionId = Constants.lovID;
            txtAddSection.setText(Constants.lovDescription.toUpperCase());
        }


    }//GEN-LAST:event_txtAddSectionActionPerformed

    private void btnRemoveSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveSectionActionPerformed

        if (listSection.isEmpty() || tblSectionWiseMachine.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Section Wise Machine Info is Empty");
            return;
        }
        current = listSection.get(tblSectionWiseMachine.getSelectedRow());

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Un-Attach Machine from Section.");
        if (confirmation != 0) {
            return;
        }
        if (ctlMac.deleteSectionWiseMachine(current)) {
            JOptionPane.showMessageDialog(null, "Machine Un-Attached Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Un-Attach,Kindly Contact Administrator");
        }
        System.err.println("dddffd: "+ machineId);
        selectSectionWiseMachine(machineId);

    }//GEN-LAST:event_btnRemoveSectionActionPerformed

    private void txtAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddDepartmentActionPerformed

        lov.LOVDefinitionSelection(DefinitionTypes.department,
                txtAddDepartment.getText(), this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtAddDepartment.setText("");
            AddDepartmentId = "";

        } else {
            AddDepartmentId = Constants.lovID;
            txtAddDepartment.setText(Constants.lovDescription.toUpperCase());
            txtAddSection.requestFocus();
        }
    }//GEN-LAST:event_txtAddDepartmentActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        attachDepartmentSectionMachine();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtMachineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMachineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMachineTypeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRemoveSection;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JComboBox cboSearchType;
    private javax.swing.JComboBox cboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel label;
    private javax.swing.JPanel pnlSearchUser;
    private javax.swing.JPanel pnlSearchUser1;
    private javax.swing.JPanel pnlSearchUser2;
    private javax.swing.JPanel pnlSearchUser3;
    private javax.swing.JPanel pnlUserDetail;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JPanel pnlUserDetail2;
    private javax.swing.JTable tblRegisteredMachine;
    private javax.swing.JTable tblSectionWiseMachine;
    private javax.swing.JTextField txtAddDepartment;
    private javax.swing.JTextField txtAddMachine;
    private javax.swing.JTextField txtAddSection;
    private javax.swing.JTextField txtBaudrate;
    private javax.swing.JTextField txtDatabits;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMachineId;
    private javax.swing.JTextField txtMachineName;
    private javax.swing.JTextField txtMachineType;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtMwlAetitle;
    private javax.swing.JTextField txtParity;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtSearchDepartment;
    private javax.swing.JTextField txtSearchLocation;
    private javax.swing.JTextField txtSearchMachine;
    private javax.swing.JTextField txtSearchSection;
    private javax.swing.JTextField txtSection;
    private javax.swing.JTextField txtStation;
    private javax.swing.JTextField txtStopBits;
    private javax.swing.JTextField txtStoreAetitle;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables

    //new declarations
    ModalityAnalyzerController ctlMac = new ModalityAnalyzerController();
    ModalityAnalyzer current = new ModalityAnalyzer();
    ModalityAnalyzer currentSec = new ModalityAnalyzer();
    List<ModalityAnalyzer> listMac = new ArrayList<>();
    List<ModalityAnalyzer> listSection = new ArrayList<>();

    String AddDepartmentId = "";
    String departmentId = "";
    String searchDepartmentId = "";
    String locationId = "";
    String searchlocationId = "";
    String searchSectionId = "";
    String addSectionId = "";
    String specialityId = "";
    String deptId = "";

    private void selectMachine() {

        listMac = ctlMac.selectMachine(machineId, searchlocationId, searchDepartmentId, searchSectionId, machineType);
        System.err.println("----" + machineType);
        if (listMac.isEmpty()) {
            List list = new ArrayList();
            ModalityAnalyzer obj = new ModalityAnalyzer();
            list.add(obj);
            tblRegisteredMachine.setModel(new RegisteredMachineTableModel(list));
        } else {
            tblRegisteredMachine.setModel(new RegisteredMachineTableModel(listMac));
        }
        ListSelectionModel selectionModel = tblRegisteredMachine.getSelectionModel();
        tblRegisteredMachine.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsRegisteredMachine();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblRegisteredMachine);
    }

    private void selectSectionWiseMachine(String machine) {

        listSection = ctlMac.selectSectionWiseMachine(machine);

        if (listSection.isEmpty()) {
            List list = new ArrayList();
            ModalityAnalyzer obj = new ModalityAnalyzer();
            list.add(obj);
            //   JOptionPane.showMessageDialog(null, "No Record Found");
            tblSectionWiseMachine.setModel(new SectionWiseMachineTableModel(list));
        } else {
            currentSec = listSection.get(0);
            tblSectionWiseMachine.setModel(new SectionWiseMachineTableModel(listSection));
        }
        ListSelectionModel selectionModel = tblSectionWiseMachine.getSelectionModel();
        tblSectionWiseMachine.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsAddMachineSection();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblSectionWiseMachine);
    }

    public void setColumnsWidthsRegisteredMachine() {

        TableColumn column = null;
        for (int i = 0; i < tblRegisteredMachine.getColumnCount(); i++) {
            column = tblRegisteredMachine.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(170);
            } else if (i == 2) {
                column.setPreferredWidth(70);
            } else if (i == 3) {
                column.setPreferredWidth(60);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            }
        }
    }

    public void setColumnsWidthsAddMachineSection() {

        TableColumn column = null;
        for (int i = 0; i < tblSectionWiseMachine.getColumnCount(); i++) {
            column = tblSectionWiseMachine.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(120);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(80);
            } else {
                column.setPreferredWidth(100);
            }
        }
    }

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();

        comp.add(txtMachineName);
        comp.add(txtModelNo);
        comp.add(txtManufacturer);
        comp.add(txtLocation);
        comp.add(txtDepartment);
        comp.add(txtSection);
        comp.add(txtIp);
        comp.add(txtPort);
        comp.add(txtBaudrate);
        comp.add(txtAddMachine);
        comp.add(txtAddSection);
        comp.add(txtAddDepartment);

        comp.add(txtDatabits);
        comp.add(txtStopBits);
        comp.add(txtStoreAetitle);
        comp.add(txtMwlAetitle);
        comp.add(txtParity);
        comp.add(txtType);
        comp.add(txtStation);
        comp.add(txtSearchDepartment);
        comp.add(txtSearchLocation);
        comp.add(txtSearchMachine);
        comp.add(txtSearchSection);
        comp.add(txtMachineType);
        comp.add(txtMachineId);
        cboType.setSelectedItem("Select");
        cboSearchType.setSelectedItem("Select");
        cboActive.setSelectedItem("Select");
        locationId = "";
        AddDepartmentId = "";
        searchlocationId = "";
        searchDepartmentId = "";
        departmentId = "";
        secId = "";
        addSectionId = "";
        machineId = "";
        searchSectionId = "";
        machineType = "";

        GUIUtils.setClear(comp);

        listMac.clear();
        listSection.clear();

        tblRegisteredMachine.setModel(new RegisteredMachineTableModel(listMac));
        tblSectionWiseMachine.setModel(new SectionWiseMachineTableModel(listSection));

        listMac.clear();
        listSection.clear();

    }

    private void attachDepartmentSectionMachine() {

        if (machineId.trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Kindly Select Machine");
            txtAddMachine.requestFocus();
            return;
        }
        if (AddDepartmentId.trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Kindly Select Department");
            txtAddDepartment.requestFocus();
            return;
        }
        if (addSectionId.trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Kindly Select Section");
            txtAddSection.requestFocus();
            return;
        }
        ModalityAnalyzer add = new ModalityAnalyzer();
        add.setDepartmentId(AddDepartmentId);
        add.setSectionId(addSectionId);
        add.setMachineId(machineId);

        if (ctlMac.insertSectionWiseMachine(add)) {
            selectSectionWiseMachine(machineId);

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Add Section ,Kindly Contact Administrator");
        }
       txtAddSection.setText("");
       addSectionId =  "";
    }

    private void setEditable() {
        
        if(current.getMachineType().equalsIgnoreCase("MODALITY")){
           txtBaudrate.setEditable(false);
           txtDatabits.setEditable(false);
           txtStopBits.setEditable(false);
           txtParity.setEditable(false);
           
           txtStoreAetitle.setEditable(true);
           txtType.setEditable(true);
           txtMwlAetitle.setEditable(true);
           txtStation.setEditable(true);
           txtMachineType.setEditable(true);
        }
        
        if(current.getMachineType().equalsIgnoreCase("ANALYZER")){
           txtStoreAetitle.setEditable(false);
           txtType.setEditable(false);
           txtMwlAetitle.setEditable(false);
           txtStation.setEditable(false);
           txtMachineType.setEditable(false);
           
           
           txtBaudrate.setEditable(true);
           txtDatabits.setEditable(true);
           txtStopBits.setEditable(true);
           txtParity.setEditable(true);
           
        }
    }
    
     
}
