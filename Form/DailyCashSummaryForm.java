package Development.Form;

import Development.BO.DailyCashSummary;
import Development.Controller.DailyCashSummaryController;
import Development.TableModel.AdvancedRecievedHistoryTableModel;
import Development.TableModel.BalancedRecievedHistoryTableModel;
import Development.TableModel.InvoiceDetailCashClientTableModel;
import Development.TableModel.InvoiceDetailTableModel;
import Development.TableModel.InvoiceMasterCashClientTableModel;
import Development.TableModel.RefundDetailTableModel;
import Development.TableModel.RefundMasterTableModel;
import Development.TableModel.InvoiceMasterTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import utilities.Constants;
import utilities.Database;
import utilities.DisplayLOV;
import utilities.GUIUtils;

public class DailyCashSummaryForm extends javax.swing.JInternalFrame {

    DailyCashSummary objBo = new DailyCashSummary();
    DailyCashSummaryController objCtl = new DailyCashSummaryController();
    List<DailyCashSummary> lstInvoiceDetail = new ArrayList();
    List<DailyCashSummary> lstInvoiceMaster = new ArrayList();
    List<DailyCashSummary> lstRefundDetail = new ArrayList();
    List<DailyCashSummary> lstRefundMaster = new ArrayList();
    List<DailyCashSummary> lstAdvRecHis = new ArrayList();
    List<DailyCashSummary> lstBalancedRecHis = new ArrayList();
    List<DailyCashSummary> lstInvoiceDetailClient = new ArrayList();
    List<DailyCashSummary> lstInvoiceMasterClient = new ArrayList();
    List<DailyCashSummary> lstInvoiceDetailCash = new ArrayList();
    List<DailyCashSummary> lstInvoiceMasterCash = new ArrayList();
    String todate = "";
    String fromdate = "";
    String patientId = "";
    String patientName = "";
    String locationId = "", locDescription = "";
    String userId = "", userName = "";
    String endTime = "";
    String startTime = "";
    String endDateTime = "";
    String startDateTime = "";
    private String cboInvoiceGrp = "";
    DisplayLOV lov = new DisplayLOV();

    public DailyCashSummaryForm() {

        initComponents();
        this.setSize(Constants.xSize - 10, Constants.ySize - 195);
//        
//        txtLocation.setText(locationId);
//        txtLocation.setEditable(false);
//        txtUser.setText(userId);
//        txtUser.setEditable(false);

    }

    public void clear() {
        txtRefundAmount.setText("");
        txtUser.setText("");
        txtLocation.setText("");
        txtTotalAmount.setText("");
        txtTotalDiscount.setText("");
        txtTotalFinancial.setText("");
        txtTotalRecievedAmount.setText("");
        lstRefundMaster.clear();
        lstInvoiceDetail.clear();
        lstInvoiceMaster.clear();
        lstRefundDetail.clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPL = new javax.swing.JPanel();
        lblPacsLink = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        txtEndTime = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFromDate = new org.jdesktop.swingx.JXDatePicker();
        txtToDate = new org.jdesktop.swingx.JXDatePicker();
        cboGroup = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPatName = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblTotalInvoiceDetail = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTotalDiscount = new javax.swing.JTextField();
        txtTotalFinancial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        txtRefundAmount = new javax.swing.JTextField();
        txtTotalRecievedAmount = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUserDetail = new javax.swing.JButton();
        btnAllUserDetail = new javax.swing.JButton();
        btnUserSummary = new javax.swing.JButton();
        btnAllUserSummary = new javax.swing.JButton();
        btnClientTrans = new javax.swing.JButton();

        setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle(Constants.title+"Daily Cash Summary");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(980, 710));
        setRequestFocusEnabled(false);

        pnlPL.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        pnlPL.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblPacsLink.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        lblPacsLink.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPacsLink.setForeground(new java.awt.Color(0, 102, 102));
        lblPacsLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacsLink.setText(Constants.footerAllScreens);

        javax.swing.GroupLayout pnlPLLayout = new javax.swing.GroupLayout(pnlPL);
        pnlPL.setLayout(pnlPLLayout);
        pnlPLLayout.setHorizontalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPLLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPacsLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPLLayout.setVerticalGroup(
            pnlPLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPacsLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reports", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daily Cash Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("From Date :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("To Date :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("User :");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DD:MM:YY");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DD:MM:YY");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Start Time :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("End Time :");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Location :");

        txtStartTime.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtStartTime.setForeground(new java.awt.Color(102, 0, 0));
        txtStartTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStartTime.setText("00:00:00");
        txtStartTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartTimeActionPerformed(evt);
            }
        });

        txtEndTime.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtEndTime.setForeground(new java.awt.Color(102, 0, 0));
        txtEndTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEndTime.setText("23:59:59");
        txtEndTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndTimeActionPerformed(evt);
            }
        });

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HH:MM:SS");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("HH:MM:SS");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtFromDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromDateActionPerformed(evt);
            }
        });

        txtToDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToDateActionPerformed(evt);
            }
        });

        cboGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invoice Detail", "Invoice Master","Refund Detail", "Refund Master", "Adv Recieved History", "Bal Recieved History",
            "Client Inv Detail", "Client Inv Master", "Cash Inv Detail", "Cash Inv Master",}));
cboGroup.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        cboGroupMouseReleased(evt);
    }
    });
    cboGroup.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            cboGroupActionPerformed(evt);
        }
    });

    jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(102, 0, 0));
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel13.setText("Patient ID :");

    txtPatientId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatientIdActionPerformed(evt);
        }
    });

    jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel14.setForeground(new java.awt.Color(102, 0, 0));
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel14.setText("Patient Name :");

    txtPatName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtPatNameActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtToDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addComponent(txtFromDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPatientId))
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addComponent(jTextField1)
                .addComponent(cboGroup, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(25, 25, 25)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(3, 3, 3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(txtStartTime)
                    .addGap(3, 3, 3)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtLocation)
                .addComponent(txtPatName))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cboGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14)
                .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jPanel2.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daily Cash History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N

    tblTotalInvoiceDetail.setBackground(java.awt.SystemColor.activeCaption);
    tblTotalInvoiceDetail.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null}
        },
        new String [] {"Invoice No","MR.No","Name","Description", "Price", "Payable","Rcv. Amount"  }));
tblTotalInvoiceDetail.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tblTotalInvoiceDetailMouseClicked(evt);
    }
    public void mousePressed(java.awt.event.MouseEvent evt) {
        tblTotalInvoiceDetailMousePressed(evt);
    }
    public void mouseReleased(java.awt.event.MouseEvent evt) {
        tblTotalInvoiceDetailMouseReleased(evt);
    }
    });
    tblTotalInvoiceDetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
        public void propertyChange(java.beans.PropertyChangeEvent evt) {
            tblTotalInvoiceDetailPropertyChange(evt);
        }
    });
    tblTotalInvoiceDetail.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            tblTotalInvoiceDetailKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            tblTotalInvoiceDetailKeyReleased(evt);
        }
    });
    jScrollPane8.setViewportView(tblTotalInvoiceDetail);

    jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(102, 0, 0));
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("Total Financial Support :");

    jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(102, 0, 0));
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel12.setText("Total Discount Amount :");

    txtTotalDiscount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtTotalDiscount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalDiscountActionPerformed(evt);
        }
    });

    txtTotalFinancial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtTotalFinancial.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalFinancialActionPerformed(evt);
        }
    });

    jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel15.setForeground(new java.awt.Color(102, 0, 0));
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel15.setText("Total Amount :");

    jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel16.setForeground(new java.awt.Color(102, 0, 0));
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel16.setText("Total Refund Amount :");

    jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabel17.setForeground(new java.awt.Color(102, 0, 0));
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel17.setText("Total Recieved Amount :");

    txtTotalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalAmountActionPerformed(evt);
        }
    });

    txtRefundAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtRefundAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtRefundAmountActionPerformed(evt);
        }
    });

    txtTotalRecievedAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    txtTotalRecievedAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTotalRecievedAmountActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane8)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtTotalDiscount)
                .addComponent(txtTotalFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(272, 272, 272)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(txtTotalAmount)
                .addComponent(txtRefundAmount)
                .addComponent(txtTotalRecievedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(28, 28, 28))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jLabel15)
                .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotalFinancial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jLabel16)
                .addComponent(txtRefundAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTotalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17)
                .addComponent(txtTotalRecievedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel6.setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

    btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
    btnExit.setForeground(new java.awt.Color(204, 0, 0));
    btnExit.setText("Exit");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExitActionPerformed(evt);
        }
    });

    btnClear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnClear.setText("Clear");
    btnClear.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
        }
    });

    btnUserDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnUserDetail.setText("User Detail");
    btnUserDetail.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUserDetailActionPerformed(evt);
        }
    });

    btnAllUserDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnAllUserDetail.setText("All User Detail");
    btnAllUserDetail.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAllUserDetailActionPerformed(evt);
        }
    });

    btnUserSummary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnUserSummary.setText("User Summary");
    btnUserSummary.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUserSummaryActionPerformed(evt);
        }
    });

    btnAllUserSummary.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnAllUserSummary.setText("All User Summary");

    btnClientTrans.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
    btnClientTrans.setText("Client Transaction");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
            .addGap(70, 70, 70)
            .addComponent(btnUserDetail)
            .addGap(18, 18, 18)
            .addComponent(btnAllUserDetail)
            .addGap(18, 18, 18)
            .addComponent(btnUserSummary)
            .addGap(18, 18, 18)
            .addComponent(btnAllUserSummary)
            .addGap(18, 18, 18)
            .addComponent(btnClientTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnClear)
                .addComponent(btnExit)
                .addComponent(btnUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAllUserDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnUserSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnAllUserSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnClientTrans, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, 0))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(pnlPL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(5, 5, 5))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(5, 5, 5)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(pnlPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed

        String query = " SELECT USR.USER_NAME ID, USR.NAME DESCRIPTION FROM       \n"
                + Database.DCMS.users + "     USR                                 \n"
                + " WHERE USR.DESIGNATION_ID='136' \n"
                + " AND USR.NAME LIKE '%"
                + txtUser.getText().toUpperCase().trim() + "%' \n";
        if (locationId.length() != 0) {
                query += " AND  LOCATION_ID = '" + locationId + "'\n";
        }
                query += " ORDER BY USR.USER_NAME";

        lov.LOVSelection(query, this);
        
        if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION") ) {
             userId = Constants.lovID;
             userName = Constants.lovDescription;
            txtUser.setText(userName);
            objBo.setUserId(userId);
        }

        searchDCS();
       
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtStartTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartTimeActionPerformed

    private void txtEndTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndTimeActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        String query = " SELECT L.ID ID, L.DESCRIPTION FROM       \n"
                + Database.DCMS.location + "     L                                 \n"
                + " WHERE L.DESCRIPTION LIKE '%"
                + txtLocation.getText().toUpperCase().trim() + "%'"
                + " ORDER BY L.ID";

        lov.LOVSelection(query, this);
        
         if (!Constants.lovDescription.equalsIgnoreCase("DESCRIPTION")) {
             locationId = Constants.lovID;
             locDescription = Constants.lovDescription;
             txtLocation.setText(locDescription);
             objBo.setLocationId(locationId);
         }
         searchDCS();
    }//GEN-LAST:event_txtLocationActionPerformed

    private void tblTotalInvoiceDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailMouseClicked

    private void tblTotalInvoiceDetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailMousePressed

    private void tblTotalInvoiceDetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailMouseReleased

    private void tblTotalInvoiceDetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailPropertyChange

    private void tblTotalInvoiceDetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailKeyPressed

    private void tblTotalInvoiceDetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblTotalInvoiceDetailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTotalInvoiceDetailKeyReleased

    private void txtTotalDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDiscountActionPerformed

    private void txtTotalFinancialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalFinancialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalFinancialActionPerformed

    private void btnUserDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserDetailActionPerformed

    private void btnUserSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserSummaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserSummaryActionPerformed

    private void btnAllUserDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllUserDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllUserDetailActionPerformed

    private void txtFromDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromDateActionPerformed

        if (txtFromDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Set  Issue Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        fromdate = dateFormat.format(txtFromDate.getDate());
        startTime = txtStartTime.getText();
        startDateTime = fromdate + " " + startTime;
        objBo.setFromDate(startDateTime);

    }//GEN-LAST:event_txtFromDateActionPerformed

    private void txtToDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToDateActionPerformed
        // TODO add your handling code here:
        if (txtToDate.getDate().getDate() == 0) {
            JOptionPane.showMessageDialog(null, "Enter the From Date 22-DEC-1990",
                    "Set Issue Date", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        todate = dateFormat.format(txtToDate.getDate());
        endTime = txtEndTime.getText();
        endDateTime = todate + " " + endTime;
        objBo.setToDate(endDateTime);

    }//GEN-LAST:event_txtToDateActionPerformed

    private void cboGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGroupActionPerformed

        searchDCS();
    }//GEN-LAST:event_cboGroupActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void txtRefundAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefundAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefundAmountActionPerformed

    private void txtTotalRecievedAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalRecievedAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalRecievedAmountActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        patientId = txtPatientId.getText().trim();
        if (patientId.length() != 0) {
            if (GUIUtils.completePatientId(patientId)) {
                patientId = Constants.completePatientId;
                searchDCS();
            }
        } else {
            patientId = "";
        }
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboGroupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboGroupMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGroupMouseReleased

    private void txtPatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatNameActionPerformed
        objBo.setPatFullName(txtPatName.getText());
        patientId = "";
        searchDCS();
        

    }//GEN-LAST:event_txtPatNameActionPerformed

    public void setTotalInvoiceDetail() {

        txtTotalAmount.setText(String.valueOf(InvoiceDetailTableModel.getTotalAmount()));
        txtTotalDiscount.setText(String.valueOf(InvoiceDetailTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(InvoiceDetailTableModel.getFinAmount()));
        txtTotalRecievedAmount.setText(String.valueOf(InvoiceDetailTableModel.getRecvAmount()));
    }

    private void setInvoiceDetail() {
        lstInvoiceDetail = objCtl.getInvoiceDetail(objBo);

        if (lstInvoiceDetail.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            objCash.setPrice("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            list.add(objCash);
            tblTotalInvoiceDetail.setModel(new InvoiceDetailTableModel(list));

        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceDetailTableModel(lstInvoiceDetail));
            setTotalInvoiceDetail();

        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);
    }

    public void setColumnsWidthModel() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(3);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(100);
            } else if (i == 4) {
                column.setPreferredWidth(30);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } else if (i == 6) {
                column.setPreferredWidth(180);
            } else if (i == 7) {
                column.setPreferredWidth(20);
            } else if (i == 8) {
                column.setPreferredWidth(20);
            } else if (i == 9) {
                column.setPreferredWidth(20);
            } else if (i == 10) {
                column.setPreferredWidth(20);
            } else if (i == 11) {
                column.setPreferredWidth(20);
            }
        }
    }

    public void setTotalInvoiceMaster() {

        txtTotalAmount.setText(String.valueOf(InvoiceMasterTableModel.getTotalAmount()));
        txtTotalDiscount.setText(String.valueOf(InvoiceMasterTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(InvoiceMasterTableModel.getFinAmount()));
        txtTotalRecievedAmount.setText(String.valueOf(InvoiceMasterTableModel.getRecvAmount()));
    }

    private void setInvoiceMaster() {
        lstInvoiceMaster = objCtl.getInvoiceMaster(objBo);

        if (lstInvoiceMaster.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            
            objCash.setTotalAmount("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            
            list.add(objCash);
            tblTotalInvoiceDetail.setModel(new InvoiceMasterTableModel(list));
        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceMasterTableModel(lstInvoiceMaster));
            setTotalInvoiceMaster();
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthMasterModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthMasterModel() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(35);
            } else if (i == 2) {
                column.setPreferredWidth(60);
            } else if (i == 3) {
                column.setPreferredWidth(90);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(100);
            } else if (i == 6) {
                column.setPreferredWidth(120);
            } else if (i == 7) {
                column.setPreferredWidth(10);
            } else if (i == 8) {
                column.setPreferredWidth(10);
            } else if (i == 9) {
                column.setPreferredWidth(10);
            } else if (i == 10) {
                column.setPreferredWidth(10);
            } else if (i == 11) {
                column.setPreferredWidth(10);
            }
        }
    }

    public void setTotalRefundDetail() {

        txtRefundAmount.setText(String.valueOf(RefundDetailTableModel.getTotalRefundAmount()));
        txtTotalDiscount.setText(String.valueOf(RefundDetailTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(RefundDetailTableModel.getFinAmount()));
    }

    private void setRefundDetail() {
        lstRefundDetail = objCtl.getRefondDetail(objBo);

        if (lstRefundDetail.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            objCash.setNetDiscount("0");
            objCash.setRefundAmount("0");
            objCash.setSupport("0");
            list.add(objCash);
            tblTotalInvoiceDetail.setModel(new RefundDetailTableModel(list));
            // setTotalRefundDetail();
        } else {
            tblTotalInvoiceDetail.setModel(new RefundDetailTableModel(lstRefundDetail));
            setTotalRefundDetail();
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthRefundModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthRefundModel() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(50);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } else if (i == 6) {
                column.setPreferredWidth(100);
            } else if (i == 7) {
                column.setPreferredWidth(10);
            } else if (i == 8) {
                column.setPreferredWidth(10);
            } else if (i == 9) {
                column.setPreferredWidth(10);
            } else if (i == 10) {
                column.setPreferredWidth(10);
            } else if (i == 11) {
                column.setPreferredWidth(10);
            } else if (i == 12) {
                column.setPreferredWidth(10);
            } else if (i == 13) {
                column.setPreferredWidth(10);
            }
        }
    }

    public void setTotalRefundMaster() {

        txtRefundAmount.setText(String.valueOf(RefundMasterTableModel.getTotalRefundAmount()));
        txtTotalDiscount.setText(String.valueOf(RefundMasterTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(RefundMasterTableModel.getFinAmount()));
    }

    private void setRefundMaster() {
        lstRefundMaster = objCtl.getRefondMaster(objBo);

        if (lstRefundMaster.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            list.add(objCash);
            objCash.setNetDiscount("0");
            objCash.setRefundAmount("0");
            objCash.setSupport("0");
            tblTotalInvoiceDetail.setModel(new RefundMasterTableModel(list));
        } else {
            tblTotalInvoiceDetail.setModel(new RefundMasterTableModel(lstRefundMaster));
            setTotalRefundMaster();
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthRefundMasterModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthRefundMasterModel() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(30);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } else if (i == 6) {
                column.setPreferredWidth(10);
            } else if (i == 7) {
                column.setPreferredWidth(10);
            } else if (i == 8) {
                column.setPreferredWidth(10);
            } else if (i == 9) {
                column.setPreferredWidth(10);
            } else if (i == 10) {
                column.setPreferredWidth(10);
            } else if (i == 11) {
                column.setPreferredWidth(10);
            }
        }
    }

    private void setAdvancedRecHis() {
        lstAdvRecHis = objCtl.getadvanceRecHis(objBo);

        if (lstAdvRecHis.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            list.add(objCash);
            objCash.setNetDiscount("0");
            objCash.setAmount("0");
            objCash.setSupport("0");
            tblTotalInvoiceDetail.setModel(new AdvancedRecievedHistoryTableModel(list));
        } else {
            tblTotalInvoiceDetail.setModel(new AdvancedRecievedHistoryTableModel(lstAdvRecHis));
            txtTotalAmount.setText(String.valueOf(AdvancedRecievedHistoryTableModel.getTotalAmount()));

        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthBalRecHis();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthBalRecHis() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(30);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(50);
            } else if (i == 6) {
                column.setPreferredWidth(50);
            } else if (i == 7) {
                column.setPreferredWidth(50);
            } else if (i == 8) {
                column.setPreferredWidth(50);
            }
        }
    }

    private void setBalancedRecHis() {
        lstBalancedRecHis = objCtl.getbalanceRecHis(objBo);

        if (lstBalancedRecHis.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            list.add(objCash);
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            tblTotalInvoiceDetail.setModel(new BalancedRecievedHistoryTableModel(list));
        } else {
            tblTotalInvoiceDetail.setModel(new BalancedRecievedHistoryTableModel(lstBalancedRecHis));
            txtTotalRecievedAmount.setText(String.valueOf(BalancedRecievedHistoryTableModel.totalRecvAmount()));
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthAdvRecHis();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthAdvRecHis() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(20);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(80);
            } else if (i == 4) {
                column.setPreferredWidth(50);
            } else if (i == 5) {
                column.setPreferredWidth(80);
            } else if (i == 6) {
                column.setPreferredWidth(10);
            } else if (i == 7) {
                column.setPreferredWidth(10);
            } else if (i == 8) {
                column.setPreferredWidth(10);
            }
        }
    }

    public void setTotalInvoiceDetailClient() {

        txtTotalAmount.setText(String.valueOf(InvoiceDetailCashClientTableModel.getTotalAmount()));
        txtTotalDiscount.setText(String.valueOf(InvoiceDetailCashClientTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(InvoiceDetailCashClientTableModel.getFinAmount()));
        txtTotalRecievedAmount.setText(String.valueOf(InvoiceDetailCashClientTableModel.getRecvAmount()));
    }

    private void setInvoiceDetailClient() {
        lstInvoiceDetailClient = objCtl.getInvoiceDetailClient(objBo);

        if (lstInvoiceDetailClient.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            list.add(objCash);
            objCash.setPayableAmount("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            tblTotalInvoiceDetail.setModel(new InvoiceDetailCashClientTableModel(list));

        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceDetailCashClientTableModel(lstInvoiceDetailClient));
            setTotalInvoiceDetailClient();

        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);
    }

    public void setColumnsWidthModelclientInvDetail() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(80);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(30);
            } else if (i == 5) {
                column.setPreferredWidth(200);
            } else if (i == 6) {
                column.setPreferredWidth(200);
            } else if (i == 7) {
                column.setPreferredWidth(200);
            } else if (i == 8) {
                column.setPreferredWidth(5);
            } else if (i == 9) {
                column.setPreferredWidth(5);
            } else if (i == 10) {
                column.setPreferredWidth(5);
            } else if (i == 11) {
                column.setPreferredWidth(5);
            } else if (i == 12) {
                column.setPreferredWidth(5);
            }
        }
    }

    public void setTotalInvoiceMasterClient() {

        txtTotalAmount.setText(String.valueOf(InvoiceMasterCashClientTableModel.getTotalAmount()));
        txtTotalDiscount.setText(String.valueOf(InvoiceMasterCashClientTableModel.getDiscAmount()));
        txtTotalFinancial.setText(String.valueOf(InvoiceMasterCashClientTableModel.getFinAmount()));
        txtTotalRecievedAmount.setText(String.valueOf(InvoiceMasterCashClientTableModel.getRecvAmount()));
    }

    private void setInvoiceMasterClient() {
        lstInvoiceMasterClient = objCtl.getInvoiceMasterClient(objBo);

        if (lstInvoiceMasterClient.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();

            objCash.setTotalAmount("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            list.add(objCash);
            tblTotalInvoiceDetail.setModel(new InvoiceMasterCashClientTableModel(list));

        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceMasterCashClientTableModel(lstInvoiceMasterClient));
            setTotalInvoiceMasterClient();
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthMasterModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    public void setColumnsWidthModelclientInvMaster() {
        TableColumn column = null;
        for (int i = 0; i < tblTotalInvoiceDetail.getColumnCount(); i++) {
            column = tblTotalInvoiceDetail.getColumnModel().getColumn(i);
            if (i == 0) {
                column.setPreferredWidth(5);
            } else if (i == 1) {
                column.setPreferredWidth(30);
            } else if (i == 2) {
                column.setPreferredWidth(50);
            } else if (i == 3) {
                column.setPreferredWidth(50);
            } else if (i == 4) {
                column.setPreferredWidth(20);
            } else if (i == 5) {
                column.setPreferredWidth(200);
            } else if (i == 6) {
                column.setPreferredWidth(200);
            } else if (i == 7) {
                column.setPreferredWidth(10);
            } else if (i == 8) {
                column.setPreferredWidth(10);
            } else if (i == 9) {
                column.setPreferredWidth(10);
            } else if (i == 10) {
                column.setPreferredWidth(10);
            } else if (i == 11) {
                column.setPreferredWidth(10);
            } else if (i == 12) {
                column.setPreferredWidth(10);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllUserDetail;
    private javax.swing.JButton btnAllUserSummary;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClientTrans;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUserDetail;
    private javax.swing.JButton btnUserSummary;
    private javax.swing.JComboBox cboGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblPacsLink;
    private javax.swing.JPanel pnlPL;
    private javax.swing.JTable tblTotalInvoiceDetail;
    private javax.swing.JTextField txtEndTime;
    private org.jdesktop.swingx.JXDatePicker txtFromDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtRefundAmount;
    private javax.swing.JTextField txtStartTime;
    private org.jdesktop.swingx.JXDatePicker txtToDate;
    private javax.swing.JTextField txtTotalAmount;
    private javax.swing.JTextField txtTotalDiscount;
    private javax.swing.JTextField txtTotalFinancial;
    private javax.swing.JTextField txtTotalRecievedAmount;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void clearForm() {
        clear();
        cboInvoiceGrp.equalsIgnoreCase("");
        tblTotalInvoiceDetail.setModel(new InvoiceDetailTableModel(lstInvoiceDetail));
    }

    private void setInvoiceDetailCash() {

        lstInvoiceDetailClient.clear();

        lstInvoiceDetailCash = objCtl.getInvoiceDetailCash(objBo);

        if (lstInvoiceDetailCash.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();

            objCash.setTotalAmount("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            list.add(objCash);
            tblTotalInvoiceDetail.setModel(new InvoiceDetailTableModel(list));

        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceDetailTableModel(lstInvoiceDetailCash));
            setTotalInvoiceDetail();

        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    private void setInvoiceMasterCash() {
        lstInvoiceMasterClient.clear();

        lstInvoiceMasterCash = objCtl.getInvoiceMaster(objBo);

        if (lstInvoiceMasterCash.isEmpty()) {
            List<DailyCashSummary> list = new ArrayList();
            DailyCashSummary objCash = new DailyCashSummary();
            list.add(objCash);
            objCash.setTotalAmount("0");
            objCash.setNetDiscount("0");
            objCash.setReciveAmount("0");
            objCash.setSupport("0");
            tblTotalInvoiceDetail.setModel(new InvoiceMasterTableModel(list));

        } else {
            tblTotalInvoiceDetail.setModel(new InvoiceMasterTableModel(lstInvoiceMasterCash));
            setTotalInvoiceMaster();
        }
        ListSelectionModel selectionModel = tblTotalInvoiceDetail.getSelectionModel();
        tblTotalInvoiceDetail.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setColumnsWidthMasterModel();
        selectionModel.setSelectionInterval(0, 0);
        Constants.tablelook.setJTableEnvironment(tblTotalInvoiceDetail);

    }

    private void searchDCS() {
        
     objBo.setPatientId(patientId);
        if (endDateTime.length() == 0 || startDateTime.length() == 0) {
            JOptionPane.showMessageDialog(null, "Slelect Date and Time First");
            return;
        }
        patientName = txtPatName.getText().trim().toUpperCase();

        int cboIndex = cboGroup.getSelectedIndex();
        if (!txtPatientId.getText().equalsIgnoreCase("")) {
            patientId = txtPatientId.getText();
        }
        if (cboIndex == 0) {

            clear();
            setInvoiceDetail();
            txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 1) {
            clear();
            setInvoiceMaster();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 2) {
            clear();
            setRefundDetail();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 3) {
            clear();
            setRefundMaster();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }
        
        if (cboIndex == 4) {
            clear();
            setAdvancedRecHis();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 5) {

            clear();
            setBalancedRecHis();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 6) {
            clear();
            setInvoiceDetailClient();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 7) {
            clear();
            setInvoiceMasterClient();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 8) {

            clear();
            setInvoiceDetailCash();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }

        if (cboIndex == 9) {

            clear();
            setInvoiceMasterCash();
             txtUser.setText(userName);
            txtLocation.setText(locDescription);
        }    
    }

}
