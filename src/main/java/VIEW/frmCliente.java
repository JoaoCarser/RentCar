package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCliente extends JDialog {

    public frmCliente() {
        initComponents();
        listarClientes();
        panBotCad.setVisible(false);
        panBotEdit.setVisible(false);
        this.txtId.setVisible(false);
        this.IdCliente.setVisible(false);
        bloquearCampos();

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCadastro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        abaDados = new javax.swing.JTabbedPane();
        panConsultarClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        labelNome1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNomeCons = new javax.swing.JTextField();
        panDadosCliente = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        txtNomeDados = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        IdCliente = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        panBotEdit = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelarBotEdit = new javax.swing.JButton();
        panBotCad = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnCancelarBotCad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setBackground(new java.awt.Color(221, 221, 221));

        jPanel1.setBackground(new java.awt.Color(178, 128, 255));

        labelCadastro.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(25, 0, 63));
        labelCadastro.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCadastro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(58, 0, 90));

        abaDados.setBackground(new java.awt.Color(255, 255, 255));
        abaDados.setForeground(new java.awt.Color(25, 0, 63));
        abaDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        panConsultarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelaCliente = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaCliente.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "CPF", "Telefone", "E-mail", "Endereço", "Estado"
            }
        ));
        tabelaCliente.getTableHeader().setResizingAllowed(false);
        tabelaCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaCliente);

        labelNome1.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelNome1.setForeground(new java.awt.Color(60, 0, 90));
        labelNome1.setText("Nome ou CPF:");

        btnNovo.setBackground(new java.awt.Color(60, 0, 90));
        btnNovo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoMouseExited(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(60, 0, 90));
        btnEditar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(60, 0, 90));
        btnExcluir.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcluirMouseExited(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtNomeCons.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        txtNomeCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeConsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panConsultarClientesLayout = new javax.swing.GroupLayout(panConsultarClientes);
        panConsultarClientes.setLayout(panConsultarClientesLayout);
        panConsultarClientesLayout.setHorizontalGroup(
            panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(panConsultarClientesLayout.createSequentialGroup()
                .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConsultarClientesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCons, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome1)))
                    .addGroup(panConsultarClientesLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panConsultarClientesLayout.setVerticalGroup(
            panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConsultarClientesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelNome1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCons, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        abaDados.addTab("Consultar Clientes", panConsultarClientes);

        panDadosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelNome.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(60, 0, 90));
        labelNome.setText("Nome:");

        labelEndereco.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(60, 0, 90));
        labelEndereco.setText("Endereço:");

        txtNomeDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNomeDados.setPreferredSize(new java.awt.Dimension(64, 19));

        labelCPF.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(60, 0, 90));
        labelCPF.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCpf.setPreferredSize(new java.awt.Dimension(64, 19));

        labelTelefone.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(60, 0, 90));
        labelTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(64, 19));

        labelEmail.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(60, 0, 90));
        labelEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 19));

        labelUF.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelUF.setForeground(new java.awt.Color(60, 0, 90));
        labelUF.setText("UF:");

        cbUF.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEndereco.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEndereco.setPreferredSize(new java.awt.Dimension(64, 19));

        IdCliente.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdCliente.setForeground(new java.awt.Color(60, 0, 90));
        IdCliente.setText("Id:");

        txtId.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtId.setPreferredSize(new java.awt.Dimension(64, 19));

        panBotEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvar.setBackground(new java.awt.Color(60, 0, 90));
        btnSalvar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotEdit.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 93, 44));

        btnCancelarBotEdit.setBackground(new java.awt.Color(60, 0, 90));
        btnCancelarBotEdit.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCancelarBotEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarBotEdit.setText("Cancelar");
        btnCancelarBotEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarBotEdit.setPreferredSize(new java.awt.Dimension(95, 28));
        btnCancelarBotEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarBotEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarBotEditMouseExited(evt);
            }
        });
        btnCancelarBotEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBotEditActionPerformed(evt);
            }
        });
        panBotEdit.add(btnCancelarBotEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 44));

        btnCadastrar.setBackground(new java.awt.Color(60, 0, 90));
        btnCadastrar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelarBotCad.setBackground(new java.awt.Color(60, 0, 90));
        btnCancelarBotCad.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCancelarBotCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarBotCad.setText("Cancelar");
        btnCancelarBotCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarBotCad.setPreferredSize(new java.awt.Dimension(95, 28));
        btnCancelarBotCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarBotCadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarBotCadMouseExited(evt);
            }
        });
        btnCancelarBotCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBotCadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBotCadLayout = new javax.swing.GroupLayout(panBotCad);
        panBotCad.setLayout(panBotCadLayout);
        panBotCadLayout.setHorizontalGroup(
            panBotCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotCadLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnCadastrar)
                .addGap(30, 30, 30)
                .addComponent(btnCancelarBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panBotCadLayout.setVerticalGroup(
            panBotCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotCadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panBotCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panDadosClienteLayout = new javax.swing.GroupLayout(panDadosCliente);
        panDadosCliente.setLayout(panDadosClienteLayout);
        panDadosClienteLayout.setHorizontalGroup(
            panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosClienteLayout.createSequentialGroup()
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addComponent(labelEndereco)
                                .addGap(6, 6, 6)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefone)
                                    .addComponent(labelEmail))
                                .addGap(12, 12, 12)
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNome)
                                    .addComponent(labelCPF))
                                .addGap(39, 39, 39)
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(txtNomeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(67, 67, 67)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addComponent(labelUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addComponent(IdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panBotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        panDadosClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCpf, txtEmail, txtEndereco, txtNomeDados, txtTelefone});

        panDadosClienteLayout.setVerticalGroup(
            panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUF)
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdCliente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(txtNomeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCPF)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEndereco)
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail))))
                .addGap(38, 38, 38)
                .addComponent(panBotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        abaDados.addTab("Dados Pessoais", panDadosCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaDados)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaDados))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabelaCliente.getSelectedRow() > -1) {
            desbloquearCampos();            
            abaDados.setSelectedIndex(1);
            this.panBotEdit.setVisible(true);
            this.panBotCad.setVisible(false);

            txtId.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString());
            txtNomeDados.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 1).toString());
            txtCpf.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 2).toString());
            txtTelefone.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 3).toString());
            txtEmail.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 4).toString());
            txtEndereco.setText(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 5).toString());
            cbUF.setSelectedItem(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 6).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        desbloquearCampos();
        this.abaDados.setSelectedIndex(1);
        panBotCad.setVisible(true);
        panBotEdit.setVisible(false);

        // TORNANDO TODOS OS CAMPOS EDITAVEIS
        this.txtNomeDados.setEnabled(true);
        this.txtEndereco.setEnabled(true);
        this.txtCpf.setEnabled(true);
        this.txtTelefone.setEnabled(true);
        this.txtEmail.setEnabled(true);
        this.cbUF.setEnabled(true);
        this.txtId.setEnabled(false);

        this.txtNomeDados.setText("");
        this.txtEndereco.setText("");
        this.txtCpf.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
        this.cbUF.setSelectedItem("");
        this.txtId.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setForeground(Color.decode("#3C005A"));
        btnNovo.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setForeground(Color.decode("#3C005A"));
        btnEditar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setForeground(Color.decode("#3C005A"));
        btnExcluir.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseExited
        btnNovo.setBackground(Color.decode("#3C005A"));
        btnNovo.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnNovoMouseExited

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(Color.decode("#3C005A"));
        btnEditar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        btnExcluir.setBackground(Color.decode("#3C005A"));
        btnExcluir.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnExcluirMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNomeDados.getText().equals("") || cbUF.getSelectedItem().equals("") || txtCpf.getText().equals("")
                || txtEndereco.getText().equals("")
                || txtTelefone.getText().equals("")
                || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            this.abaDados.setSelectedIndex(1);       // botao do metodo de alteração dos clientes

            ClienteDTO obj = new ClienteDTO();
            // abastecendo os campos
            obj.setNomeCliente(txtNomeDados.getText());
            obj.setEndereco(txtEndereco.getText());
            obj.setCpf(txtCpf.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setEmail(txtEmail.getText());
            obj.setUf(cbUF.getSelectedItem().toString());
            obj.setId(Integer.parseInt(txtId.getText()));

            ClienteDAO dao = new ClienteDAO();
            dao.alterarCliente(obj);                 // enviando o objeto para o metodo da alteração no ClienteDAO
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            this.abaDados.setSelectedIndex(0);

            this.panBotEdit.setVisible(false); // TORNA VISIBILIDADE DOS BOTOES FALSO
            listarClientes();
            LimparCampo();
            bloquearCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setBackground(Color.decode("#3C005A"));
        btnSalvar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.decode("#3C005A"));
        btnSalvar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnCancelarBotCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBotCadActionPerformed
        this.abaDados.setSelectedIndex(0);
        this.panBotCad.setVisible(false);
        listarClientes();
        LimparCampo();
        bloquearCampos();
    }//GEN-LAST:event_btnCancelarBotCadActionPerformed

    private void btnCancelarBotCadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBotCadMouseExited
        btnCancelarBotCad.setBackground(Color.decode("#3C005A"));
        btnCancelarBotCad.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnCancelarBotCadMouseExited

    private void btnCancelarBotCadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBotCadMouseEntered
        btnCancelarBotCad.setForeground(Color.decode("#3C005A"));
        btnCancelarBotCad.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnCancelarBotCadMouseEntered

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeDados.getText().equals("") || cbUF.getSelectedItem().equals("") || txtCpf.getText().equals("") || txtTelefone.getText().equals("") || txtEmail.getText().equals("") || txtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            ClienteDTO obj = new ClienteDTO();

            obj.setNomeCliente(txtNomeDados.getText());
            obj.setEndereco(txtEndereco.getText());
            obj.setUf(cbUF.getSelectedItem().toString());
            obj.setTelefone(txtTelefone.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtEmail.getText());

            ClienteDAO dao = new ClienteDAO();
            dao.cadastrarCliente(obj);

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

            this.panBotCad.setVisible(false); // APOS CADASTRAR OS BOTOES SOMEM DA TELA "DADOS"
            listarClientes();
            LimparCampo();
            this.abaDados.setSelectedIndex(0);
            bloquearCampos();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(Color.decode("#3C005A"));
        btnCadastrar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setForeground(Color.decode("#3C005A"));
        btnCadastrar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void txtNomeConsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeConsKeyPressed
        // A PESQUISA OCORRE ENQUANTO ESTÁ SENDO DIGITADO O NOME.

        String nome = "%" + txtNomeCons.getText() + "%"; // A PESQUISA É FEITA NO BD COM O ARGUMENTO LIKE, 
        //NO METODO BUSCAR CLIENTE
        String cpf = "%" + txtNomeCons.getText() + "%";
        // CRIAÇÃO DO OBJ E DA LISTA QUE TERÁ O RETORNO DO DADOS.
        ClienteDAO obj = new ClienteDAO();
        List<ClienteDTO> lista = obj.buscarCliente(nome, cpf);
        DefaultTableModel dados = (DefaultTableModel) tabelaCliente.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (ClienteDTO c : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                c.getId(),
                c.getNomeCliente(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getEndereco(),
                c.getUf()
            });
        }
    }//GEN-LAST:event_txtNomeConsKeyPressed

    private void btnCancelarBotEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBotEditMouseEntered
         btnCancelarBotEdit.setForeground(Color.decode("#3C005A"));
        btnCancelarBotEdit.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnCancelarBotEditMouseEntered

    private void btnCancelarBotEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBotEditMouseExited
        btnCancelarBotEdit.setBackground(Color.decode("#3C005A"));
        btnCancelarBotEdit.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnCancelarBotEditMouseExited

    private void btnCancelarBotEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBotEditActionPerformed
        this.abaDados.setSelectedIndex(0);
        this.panBotEdit.setVisible(false);
        listarClientes();
        LimparCampo();
        bloquearCampos();
    }//GEN-LAST:event_btnCancelarBotEditActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        // TRADUZ OS BOTÕES DE INGLES PARA PORTUGUES
        Object[] options = {"Sim", "Não"};

        if (tabelaCliente.getSelectedRow() > -1) {
            int resposta = JOptionPane.showOptionDialog(null,
                    "Você tem certeza que deseja excluir?", "Confirmação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {                      // O usuário clicou em "Sim"
                ClienteDTO obj = new ClienteDTO();                         // abastecendo o campo do ID
                obj.setId(Integer.parseInt(tabelaCliente.getValueAt(tabelaCliente.getSelectedRow(), 0).toString()));

                ClienteDAO dao = new ClienteDAO();
                dao.excluirCliente(obj);

                listarClientes();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                LimparCampo();
            } else if (resposta == JOptionPane.NO_OPTION) {
                listarClientes();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdCliente;
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelarBotCad;
    private javax.swing.JButton btnCancelarBotEdit;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JPanel panBotCad;
    private javax.swing.JPanel panBotEdit;
    private javax.swing.JPanel panConsultarClientes;
    private javax.swing.JPanel panDadosCliente;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomeCons;
    private javax.swing.JTextField txtNomeDados;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void listarClientes() {

        ClienteDAO obj = new ClienteDAO();
        List<ClienteDTO> lista = obj.PesquisarCliente();
        DefaultTableModel dados = (DefaultTableModel) tabelaCliente.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (ClienteDTO c : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                c.getId(),
                c.getNomeCliente(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail(),
                c.getEndereco(),
                c.getUf()
            });
        }
    }

    public void LimparCampo() {

        txtNomeDados.setText("");
        txtEndereco.setText("");
        cbUF.setSelectedItem("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtNomeDados.requestFocus();
    }

    public void bloquearCampos() {

        //TORNANDO OS CAMPOS DE DADOS NÃO VISÍVEIS
        this.labelNome.setVisible(false);
        this.txtNomeDados.setVisible(false);
        this.txtEndereco.setVisible(false);
        this.labelEndereco.setVisible(false);
        this.labelEndereco.setVisible(false);
        this.txtCpf.setVisible(false);
        this.labelCPF.setVisible(false);
        this.txtTelefone.setVisible(false);
        this.labelTelefone.setVisible(false);
        this.txtEmail.setVisible(false);
        this.labelEmail.setVisible(false);
        this.cbUF.setVisible(false);
        this.labelUF.setVisible(false);

        // SETANDO VAZIOS NOS CAMPOS.
        this.txtNomeDados.setText("");
        this.txtEndereco.setText("");
        this.txtCpf.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
        this.cbUF.setSelectedItem("");
        this.txtId.setText("");
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);

    }

    public void desbloquearCampos() {

        //TORNANDO OS CAMPOS DE DADOS NÃO VISÍVEIS
        this.labelNome.setVisible(true);
        this.txtNomeDados.setVisible(true);
        this.txtEndereco.setVisible(true);
        this.labelEndereco.setVisible(true);
        this.labelEndereco.setVisible(true);
        this.txtCpf.setVisible(true);
        this.labelCPF.setVisible(true);
        this.txtTelefone.setVisible(true);
        this.labelTelefone.setVisible(true);
        this.txtEmail.setVisible(true);
        this.labelEmail.setVisible(true);
        this.cbUF.setVisible(true);
        this.labelUF.setVisible(true);

        // SETANDO VAZIOS NOS CAMPOS.
        this.txtNomeDados.setText("");
        this.txtEndereco.setText("");
        this.txtCpf.setText("");
        this.txtTelefone.setText("");
        this.txtEmail.setText("");
        this.cbUF.setSelectedItem("");
        this.txtId.setText("");
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
    }

}
