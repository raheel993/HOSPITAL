package Development.Form;

import Development.BO.ReportConfiguration;
import Development.Controller.ReportConfigurationController;

import Development.TableModel.ReportConfigurationTableModel;
import Development.TableModel.ReportWiseParameterTableModel;
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
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class ReportConfigurationForm extends javax.swing.JInternalFrame {

    DisplayLOV lov = new DisplayLOV();

    public ReportConfigurationForm() {

        initComponents();

        this.setSize(Constants.xSize, Constants.ySize - 200);

        btnExit.setMnemonic(KeyEvent.VK_X);

        btnClear.setMnemonic(KeyEvent.VK_C);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUserDetail = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtReportName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReportPath = new javax.swing.JTextField();
        txtReportConfig = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cboActive = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtReportServer = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlSearchUser = new javax.swing.JPanel();
        btnSaveReport = new javax.swing.JButton();
        btnEditReport = new javax.swing.JButton();
        btnClearReport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnlUserDetail1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSearchReport = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSearchReportPath = new javax.swing.JTextField();
        pnlSearchUser1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtReportNameId = new javax.swing.JTextField();
        txtParamterId = new javax.swing.JTextField();
        btnAttachReport = new javax.swing.JButton();
        btnDeleteReport = new javax.swing.JButton();
        pnlSearchUser2 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblAttachedReports = new javax.swing.JTable();
        pnlSearchUser3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblReportWiseParameter = new javax.swing.JTable();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Report Configuration");
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
        pnlUserDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail.setForeground(java.awt.SystemColor.activeCaption);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Description:");

        txtReportName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReportName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Report Path:");

        txtReportPath.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReportPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtReportPathMouseReleased(evt);
            }
        });
        txtReportPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportPathActionPerformed(evt);
            }
        });

        txtReportConfig.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReportConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportConfigActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Report Name :");

        cboActive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Y","N"}));
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

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Server: ");

        txtReportServer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReportServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportServerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetailLayout = new javax.swing.GroupLayout(pnlUserDetail);
        pnlUserDetail.setLayout(pnlUserDetailLayout);
        pnlUserDetailLayout.setHorizontalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReportName)
                    .addGroup(pnlUserDetailLayout.createSequentialGroup()
                        .addComponent(txtReportPath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtReportConfig)
                    .addComponent(txtReportServer))
                .addGap(5, 5, 5))
        );
        pnlUserDetailLayout.setVerticalGroup(
            pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetailLayout.createSequentialGroup()
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReportName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtReportPath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboActive, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReportConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(3, 3, 3)
                .addGroup(pnlUserDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReportServer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)))
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
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel6)
        );

        pnlSearchUser.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser.setForeground(java.awt.SystemColor.activeCaption);

        btnSaveReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSaveReport.setForeground(new java.awt.Color(102, 0, 0));
        btnSaveReport.setText("Save");
        btnSaveReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveReportActionPerformed(evt);
            }
        });

        btnEditReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditReport.setForeground(new java.awt.Color(102, 0, 0));
        btnEditReport.setText("Edit");
        btnEditReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReportActionPerformed(evt);
            }
        });

        btnClearReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClearReport.setForeground(new java.awt.Color(102, 0, 0));
        btnClearReport.setText("Clear");
        btnClearReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchUserLayout = new javax.swing.GroupLayout(pnlSearchUser);
        pnlSearchUser.setLayout(pnlSearchUserLayout);
        pnlSearchUserLayout.setHorizontalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUserLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnSaveReport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditReport, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearReport, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlSearchUserLayout.setVerticalGroup(
            pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUserLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlSearchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
        );

        pnlUserDetail1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlUserDetail1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search for Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlUserDetail1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Report Name:");

        txtSearchReport.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchReportActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Path:");

        txtSearchReportPath.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSearchReportPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtSearchReportPathMouseReleased(evt);
            }
        });
        txtSearchReportPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchReportPathActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserDetail1Layout = new javax.swing.GroupLayout(pnlUserDetail1);
        pnlUserDetail1.setLayout(pnlUserDetail1Layout);
        pnlUserDetail1Layout.setHorizontalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchReport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchReportPath, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlUserDetail1Layout.setVerticalGroup(
            pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserDetail1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserDetail1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtSearchReportPath, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pnlSearchUser1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attach Parameter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser1.setForeground(java.awt.SystemColor.activeCaption);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Parameter:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 0, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Report Name:");

        txtReportNameId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtReportNameId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtReportNameIdMouseReleased(evt);
            }
        });
        txtReportNameId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReportNameIdActionPerformed(evt);
            }
        });

        txtParamterId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtParamterId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParamterIdActionPerformed(evt);
            }
        });

        btnAttachReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAttachReport.setForeground(new java.awt.Color(102, 0, 0));
        btnAttachReport.setText("Attach");
        btnAttachReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachReportActionPerformed(evt);
            }
        });

        btnDeleteReport.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDeleteReport.setForeground(new java.awt.Color(102, 0, 0));
        btnDeleteReport.setText("Delete");
        btnDeleteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchUser1Layout = new javax.swing.GroupLayout(pnlSearchUser1);
        pnlSearchUser1.setLayout(pnlSearchUser1Layout);
        pnlSearchUser1Layout.setHorizontalGroup(
            pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchUser1Layout.createSequentialGroup()
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReportNameId, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(txtParamterId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAttachReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlSearchUser1Layout.setVerticalGroup(
            pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser1Layout.createSequentialGroup()
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtReportNameId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAttachReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSearchUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtParamterId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteReport, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pnlSearchUser2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser2.setForeground(java.awt.SystemColor.activeCaption);

        tblAttachedReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null,null,null,null,null}
            },
            new String [] {
                "Sr.","Machine","Model No","Manufacturer","Type","Regt By","Regt Date"}
        ));
        tblAttachedReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAttachedReportsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblAttachedReportsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAttachedReportsMouseReleased(evt);
            }
        });
        tblAttachedReports.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAttachedReportsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblAttachedReportsKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(tblAttachedReports);

        javax.swing.GroupLayout pnlSearchUser2Layout = new javax.swing.GroupLayout(pnlSearchUser2);
        pnlSearchUser2.setLayout(pnlSearchUser2Layout);
        pnlSearchUser2Layout.setHorizontalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
        );
        pnlSearchUser2Layout.setVerticalGroup(
            pnlSearchUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pnlSearchUser3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlSearchUser3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Wise Parameter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        pnlSearchUser3.setForeground(java.awt.SystemColor.activeCaption);

        tblReportWiseParameter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null,null,null,null,null,null}
            },
            new String [] {
                "Sr.","Parameter Name"}
        ));
        tblReportWiseParameter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReportWiseParameterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblReportWiseParameterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblReportWiseParameterMouseReleased(evt);
            }
        });
        tblReportWiseParameter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblReportWiseParameterKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblReportWiseParameterKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(tblReportWiseParameter);

        javax.swing.GroupLayout pnlSearchUser3Layout = new javax.swing.GroupLayout(pnlSearchUser3);
        pnlSearchUser3.setLayout(pnlSearchUser3Layout);
        pnlSearchUser3Layout.setHorizontalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        pnlSearchUser3Layout.setVerticalGroup(
            pnlSearchUser3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchUser3Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnlSearchUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlUserDetail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pnlSearchUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlSearchUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlUserDetail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSearchUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUserDetail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlSearchUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void txtReportNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportNameActionPerformed

        txtReportName.setCaretPosition(0);
        txtReportPath.requestFocus();
    }//GEN-LAST:event_txtReportNameActionPerformed

    private void txtReportPathMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReportPathMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportPathMouseReleased

    private void txtReportPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportPathActionPerformed
        txtReportConfig.requestFocus();

    }//GEN-LAST:event_txtReportPathActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSearchReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchReportActionPerformed

        searchReportName = txtSearchReport.getText().toUpperCase();

        selectReport();


    }//GEN-LAST:event_txtSearchReportActionPerformed

    private void txtSearchReportPathMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchReportPathMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchReportPathMouseReleased

    private void txtSearchReportPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchReportPathActionPerformed

        searchReportPath = txtSearchReportPath.getText().toUpperCase();
        selectReport();

    }//GEN-LAST:event_txtSearchReportPathActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearForm();


    }//GEN-LAST:event_btnClearActionPerformed

    private void txtReportConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportConfigActionPerformed
        txtReportServer.requestFocus();

    }//GEN-LAST:event_txtReportConfigActionPerformed

    private void cboActiveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboActiveMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveMouseReleased

    private void cboActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveActionPerformed

    private void cboActiveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cboActiveKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboActiveKeyReleased

    private void tblAttachedReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedReportsMouseClicked

    private void tblAttachedReportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedReportsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedReportsMousePressed

    private void tblAttachedReportsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttachedReportsMouseReleased

        if (listRep.isEmpty() || tblAttachedReports.getSelectedRow() < 0) {
            return;
        }
        btnSaveReport.setEnabled(false);

        current = listRep.get(tblAttachedReports.getSelectedRow());
        txtReportName.setText(current.getReportDescription());
        txtReportPath.setText(current.getReportPath());
        txtReportConfig.setText(current.getReportName());
        cboActive.setSelectedItem(current.getActive());
        reportId = current.getId();
        txtReportNameId.setText(current.getReportDescription());
        txtReportServer.setText(current.getReportServer());
        selectReportWiseParameter();// TODO add your handling code here:s
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedReportsMouseReleased

    private void tblAttachedReportsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAttachedReportsKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedReportsKeyPressed

    private void tblAttachedReportsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAttachedReportsKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblAttachedReportsKeyReleased

    private void tblReportWiseParameterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportWiseParameterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportWiseParameterMouseClicked

    private void tblReportWiseParameterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportWiseParameterMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportWiseParameterMousePressed

    private void tblReportWiseParameterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReportWiseParameterMouseReleased

        if (listRwp.isEmpty() || tblReportWiseParameter.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Parameter Info is Empty");
            return;
        }

        currentRwp = listRwp.get(tblReportWiseParameter.getSelectedRow());

    }//GEN-LAST:event_tblReportWiseParameterMouseReleased

    private void tblReportWiseParameterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReportWiseParameterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportWiseParameterKeyPressed

    private void tblReportWiseParameterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblReportWiseParameterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblReportWiseParameterKeyReleased

    private void txtReportNameIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReportNameIdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportNameIdMouseReleased

    private void txtReportNameIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportNameIdActionPerformed

        String query = "  SELECT ID ID,DESCRIPTION DESCRIPTION \n"
                + " FROM                                       \n"
                + Database.DCMS.reports + "                    \n"
                + " WHERE UPPER(DESCRIPTION) LIKE UPPER('%"
                + txtReportNameId.getText() + "%')"
                + " AND ACTIVE = 'Y'";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtReportNameId.setText("");
            reportId = "";
        } else {
            reportId = Constants.lovID;
            txtReportNameId.setText(Constants.lovDescription.toUpperCase());
        }
        selectReportWiseParameter();
    }//GEN-LAST:event_txtReportNameIdActionPerformed

    private void txtParamterIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParamterIdActionPerformed

        if (reportId.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Kindly Select Report First");
            txtReportNameId.requestFocus();
        }

        String query = "  SELECT ID ID,REPORT_PARAMETER_NAME DESCRIPTION \n"
                + " FROM                                       \n"
                + Database.DCMS.reportParameter + "                    \n"
                + " WHERE UPPER(REPORT_PARAMETER_NAME) LIKE UPPER('%"
                + txtParamterId.getText() + "%') "
                + " AND ID NOT IN (SELECT PARAMETER_ID FROM "
                + Database.DCMS.reportWiseParameter + " "
                + " WHERE REPORT_ID = " + reportId + ")";

        lov.LOVSelection(query, this);

        if (Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
            txtParamterId.setText("");
            paramterId = "";
        } else {
            paramterId = Constants.lovID;
            txtParamterId.setText(Constants.lovDescription.toUpperCase());
        }


    }//GEN-LAST:event_txtParamterIdActionPerformed

    private void btnSaveReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveReportActionPerformed

        if (txtReportName.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Report Name");
            txtReportName.requestFocus();
            return;
        }
        if (txtReportConfig.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Report Config Name");
            txtReportConfig.requestFocus();
            return;
        }

        if (reportPathId == null) {
            JOptionPane.showMessageDialog(null, "Kindly Select Report Path Again.");
            txtReportPath.requestFocus();
            return;
        }

        current.setReportDescription(txtReportName.getText().trim());
        current.setReportPath(reportPathId);
        current.setReportServer("\\\\10.10.14.10\\RISPACS\\SYSREP\\REPORTS");
        current.setReportName(txtReportConfig.getText().trim());
        current.setActive(cboActive.getSelectedItem().toString());
        current.setPosition("");
        current.setReportType("");

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Attach New Report in System.");
        if (confirmation != 0) {
            return;
        }
        if (ctlRep.insertAppReports(current)) {
            JOptionPane.showMessageDialog(null, "Report Attached Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Attach Report,Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnSaveReportActionPerformed

    private void btnEditReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReportActionPerformed

        if (listRep.isEmpty() || tblAttachedReports.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No Report Is Selected");
            return;
        }

        current = listRep.get(tblAttachedReports.getSelectedRow());
        current.setReportDescription(txtReportName.getText().trim());
        current.setReportPath(txtReportPath.getText().trim());
        current.setReportName(current.getReportName());
        current.setReportServer(current.getReportServer());
        current.setActive(cboActive.getSelectedItem().toString());

        if (reportPathId.isEmpty()) {
            current.setReportPathId(current.getReportPathId());
        } else {
            current.setReportPathId(reportPathId);
        }

        
     
        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going "
                + "Update Report Information.");
        if (confirmation != 0) {
            return;
        }
        if (ctlRep.updateReportInfo(current)) {
            JOptionPane.showMessageDialog(null, "Information Updated Successfully");

        } else {
            JOptionPane.showMessageDialog(null, "Unable to Update,Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnEditReportActionPerformed

    private void btnClearReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearReportActionPerformed

        clearFormReport();        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearReportActionPerformed

    private void btnAttachReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachReportActionPerformed

        if (txtReportNameId.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Report Name");
            txtReportNameId.requestFocus();
            return;
        }
        if (txtParamterId.getDocument().getLength() <= 0) {
            JOptionPane.showMessageDialog(null, "Kindly Enter Paramter Name");
            txtParamterId.requestFocus();
            return;
        }
        current.setReportId(reportId);
        current.setParameterId(paramterId);
        if (ctlRep.insertReportWiseParameter(current)) {
            selectReportWiseParameter();// TODO add your handling code here: 
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Attach,Kindly Contact Administrator");
        }

    }//GEN-LAST:event_btnAttachReportActionPerformed

    private void btnDeleteReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReportActionPerformed

        if (listRwp.isEmpty() || tblReportWiseParameter.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Section Wise Machine Info is Empty");
            return;
        }
        currentRwp = listRwp.get(tblReportWiseParameter.getSelectedRow());

        int confirmation = JOptionPane.showConfirmDialog(null, "You Are Going To "
                + "Un-Attach Parameter from Report.");
        if (confirmation != 0) {
            return;
        }
        if (ctlRep.deleteReportWiseParameter(currentRwp)) {
            JOptionPane.showMessageDialog(null, "Parameter Un-Attached Successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Unable to Un-Attach,Kindly Contact Administrator");
        }
        selectReportWiseParameter();
    }//GEN-LAST:event_btnDeleteReportActionPerformed

    private void txtReportServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReportServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReportServerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttachReport;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearReport;
    private javax.swing.JButton btnDeleteReport;
    private javax.swing.JButton btnEditReport;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSaveReport;
    private javax.swing.JComboBox cboActive;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlSearchUser;
    private javax.swing.JPanel pnlSearchUser1;
    private javax.swing.JPanel pnlSearchUser2;
    private javax.swing.JPanel pnlSearchUser3;
    private javax.swing.JPanel pnlUserDetail;
    private javax.swing.JPanel pnlUserDetail1;
    private javax.swing.JTable tblAttachedReports;
    private javax.swing.JTable tblReportWiseParameter;
    private javax.swing.JTextField txtParamterId;
    private javax.swing.JTextField txtReportConfig;
    private javax.swing.JTextField txtReportName;
    private javax.swing.JTextField txtReportNameId;
    private javax.swing.JTextField txtReportPath;
    private javax.swing.JTextField txtReportServer;
    private javax.swing.JTextField txtSearchReport;
    private javax.swing.JTextField txtSearchReportPath;
    // End of variables declaration//GEN-END:variables

    //new declarations
    ReportConfigurationController ctlRep = new ReportConfigurationController();
    ReportConfiguration current = new ReportConfiguration();
    ReportConfiguration currentRwp = new ReportConfiguration();

    List<ReportConfiguration> listRep = new ArrayList<>();
    List<ReportConfiguration> listRwp = new ArrayList<>();

    String reportId = "";
    String searchReportPath = "";
    String searchReportName = "";
    String paramterId = "";
    String reportPathId = "";
    String AddMachineId = "";
    String locationId = "";
    String searchlocationId = "";
    String searchSectionId = "";
    String secId = "";
    String addSectionId = "";
    String specialityId = "";
    String deptId = "";
    String cptId = "";
    String patientId = "";
    String fromUserId = "";
    String toUserId = "";

    private void selectReport() {

        listRep = ctlRep.selectReport(searchReportName, searchReportPath);

        if (listRep.isEmpty()) {
            List list = new ArrayList();
            ReportConfiguration obj = new ReportConfiguration();
            list.add(obj);
            tblAttachedReports.setModel(new ReportConfigurationTableModel(list));
        } else {
            tblAttachedReports.setModel(new ReportConfigurationTableModel(listRep));
        }
        ListSelectionModel selectionModel = tblAttachedReports.getSelectionModel();
        tblAttachedReports.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.setSelectionInterval(0, 0);
        setReportSearchTableModel();
        Constants.tablelook.setJTableEnvironment(tblAttachedReports);
    }

    private void selectReportWiseParameter() {

        listRwp = ctlRep.selectReportWiseParameter(reportId);

        if (listRwp.isEmpty()) {
            List list = new ArrayList();
            ReportConfiguration obj = new ReportConfiguration();
            list.add(obj);
            tblReportWiseParameter.setModel(new ReportWiseParameterTableModel(list));
        } else {
            tblReportWiseParameter.setModel(new ReportWiseParameterTableModel(listRwp));
        }
        ListSelectionModel selectionModel = tblReportWiseParameter.getSelectionModel();
        tblReportWiseParameter.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthsReportWiseParameter();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblReportWiseParameter);
    }

    public void setColumnsWidthsReportWiseParameter() {

        TableColumn column = null;
        for (int i = 0; i < tblReportWiseParameter.getColumnCount(); i++) {
            column = tblReportWiseParameter.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(20);
            } else {
                column.setPreferredWidth(200);
            }
        }
    }

    public void setReportSearchTableModel() {

        TableColumn column = null;
        for (int i = 0; i < tblAttachedReports.getColumnCount(); i++) {
            column = tblAttachedReports.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(10);
            } else if (i == 1) {
                column.setPreferredWidth(200);
            } else if (i == 2) {
                column.setPreferredWidth(200);
            }
        }
    }

    private void clearForm() {
        Vector<JComponent> comp = new Vector<JComponent>();

        comp.add(txtReportName);
        comp.add(txtReportPath);
        comp.add(txtParamterId);
        comp.add(txtReportConfig);
        comp.add(txtReportNameId);
        comp.add(txtSearchReport);
        comp.add(txtSearchReportPath);
        comp.add(txtReportServer);
        cboActive.setSelectedItem("Select");
        reportId = "";
        reportPathId = "";
        searchReportName = "";
        paramterId = "";

        GUIUtils.setClear(comp);

        listRep.clear();
        listRwp.clear();

        tblAttachedReports.setModel(new ReportConfigurationTableModel(listRep));
        tblReportWiseParameter.setModel(new ReportWiseParameterTableModel(listRwp));

        listRep.clear();
        listRwp.clear();

    }

    private void clearFormReport() {
        Vector<JComponent> comp = new Vector<JComponent>();

        comp.add(txtReportName);
        comp.add(txtReportPath);
        comp.add(txtReportConfig);
        comp.add(txtReportServer);
        reportPathId = null;
        cboActive.setSelectedIndex(0);

        GUIUtils.setClear(comp);
    }
}
