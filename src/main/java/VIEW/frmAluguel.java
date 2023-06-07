package VIEW;

import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import DTO.AluguelDTO;
import DTO.VeiculoDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class frmAluguel extends JDialog {

    SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");
    ArrayList<String> placa = new ArrayList<>();
    ArrayList<String> cpf = new ArrayList<>();
    String placaVerificacao = null;

    public frmAluguel() {
        initComponents();
        nomeComboBox();
        abaDados.setSelectedIndex(0);
        this.IdAluguel.setVisible(false);
        this.txtIdAluguel.setVisible(false);
        this.btnEditarAluguel.setVisible(false);
        modeloComboBox();
        LimparCampos();

        //BLOQUEIA A TELA DE FUNDO / SÓ PERMITE USAR FRMVEICULO
        this.setModal(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        abaDados = new javax.swing.JTabbedPane();
        panDados = new javax.swing.JPanel();
        IdValor = new javax.swing.JLabel();
        IdPlaca = new javax.swing.JLabel();
        IdModelo = new javax.swing.JLabel();
        IdCpf = new javax.swing.JLabel();
        IdDataEntrega = new javax.swing.JLabel();
        IdObs = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        IdNomeC = new javax.swing.JLabel();
        btnSalvarAluguel = new javax.swing.JButton();
        IdAluguel = new javax.swing.JLabel();
        txtIdAluguel = new javax.swing.JTextField();
        IdDataAluguel = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        IdEntregue = new javax.swing.JLabel();
        cbEntregue = new javax.swing.JComboBox<>();
        txtDataE = new javax.swing.JFormattedTextField();
        txtDataA = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        cbModelo = new javax.swing.JComboBox<>();
        cbNomeC = new javax.swing.JComboBox<>();
        btnEditarAluguel = new javax.swing.JButton();
        panHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veículo");
        setBackground(new java.awt.Color(0, 204, 204));

        panPrincipal.setPreferredSize(new java.awt.Dimension(910, 621));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abaDados.setForeground(new java.awt.Color(60, 0, 90));
        abaDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        panDados.setForeground(new java.awt.Color(60, 0, 90));
        panDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panDados.setPreferredSize(new java.awt.Dimension(900, 500));

        IdValor.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdValor.setForeground(new java.awt.Color(60, 0, 90));
        IdValor.setText("Valor:");

        IdPlaca.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdPlaca.setForeground(new java.awt.Color(60, 0, 90));
        IdPlaca.setText("Placa:");

        IdModelo.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdModelo.setForeground(new java.awt.Color(60, 0, 90));
        IdModelo.setText("Modelo:");

        IdCpf.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdCpf.setForeground(new java.awt.Color(60, 0, 90));
        IdCpf.setText("CPF:");

        IdDataEntrega.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdDataEntrega.setForeground(new java.awt.Color(60, 0, 90));
        IdDataEntrega.setText("Data de Entrega:");

        IdObs.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdObs.setForeground(new java.awt.Color(60, 0, 90));
        IdObs.setText("Observações:");

        txtValor.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtValor.setPreferredSize(new java.awt.Dimension(64, 19));

        txtPlaca.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPlaca.setPreferredSize(new java.awt.Dimension(64, 19));

        IdNomeC.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdNomeC.setForeground(new java.awt.Color(60, 0, 90));
        IdNomeC.setText("Nome:");

        btnSalvarAluguel.setBackground(new java.awt.Color(60, 0, 90));
        btnSalvarAluguel.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnSalvarAluguel.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAluguel.setText("Salvar");
        btnSalvarAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAluguelActionPerformed(evt);
            }
        });

        IdAluguel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdAluguel.setForeground(new java.awt.Color(60, 0, 90));
        IdAluguel.setText("Id:");

        txtIdAluguel.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtIdAluguel.setPreferredSize(new java.awt.Dimension(64, 19));

        IdDataAluguel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdDataAluguel.setForeground(new java.awt.Color(60, 0, 90));
        IdDataAluguel.setText("Data do Aluguel:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        IdEntregue.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdEntregue.setForeground(new java.awt.Color(60, 0, 90));
        IdEntregue.setText("Entregue:");

        cbEntregue.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbEntregue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "N" }));
        cbEntregue.setPreferredSize(new java.awt.Dimension(70, 25));

        try {
            txtDataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataE.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        try {
            txtDataA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataA.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        txtObservacoes.setColumns(20);
        txtObservacoes.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        cbModelo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloActionPerformed(evt);
            }
        });

        cbNomeC.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeCActionPerformed(evt);
            }
        });

        btnEditarAluguel.setBackground(new java.awt.Color(60, 0, 90));
        btnEditarAluguel.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnEditarAluguel.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarAluguel.setText("Salvar");
        btnEditarAluguel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAluguelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDadosLayout = new javax.swing.GroupLayout(panDados);
        panDados.setLayout(panDadosLayout);
        panDadosLayout.setHorizontalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(IdModelo)
                        .addGap(37, 37, 37)
                        .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(IdDataAluguel)
                        .addGap(21, 21, 21)
                        .addComponent(txtDataA, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(IdNomeC)
                        .addGap(52, 52, 52)
                        .addComponent(cbNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(IdDataEntrega)
                        .addGap(21, 21, 21)
                        .addComponent(txtDataE, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(IdPlaca)
                        .addGap(58, 58, 58)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(IdEntregue)
                        .addGap(86, 86, 86)
                        .addComponent(cbEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdCpf)
                            .addComponent(IdValor))
                        .addGap(56, 56, 56)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(IdObs)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(IdAluguel)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnSalvarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
            .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panDadosLayout.createSequentialGroup()
                    .addGap(353, 353, 353)
                    .addComponent(btnEditarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(459, Short.MAX_VALUE)))
        );
        panDadosLayout.setVerticalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(IdModelo))
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(IdDataAluguel))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtDataA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(IdNomeC))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cbNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IdDataEntrega)
                    .addComponent(txtDataE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(IdPlaca))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IdEntregue)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cbEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(IdCpf)
                        .addGap(13, 13, 13)
                        .addComponent(IdValor))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(IdObs))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(IdAluguel))
                    .addComponent(txtIdAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnSalvarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosLayout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(btnEditarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(173, 173, 173)))
        );

        abaDados.addTab("Dados do Aluguel", panDados);

        panPrincipal.add(abaDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 540));

        panHeader.setBackground(new java.awt.Color(178, 128, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 0, 63));
        jLabel1.setText("Alugar Veículo");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panPrincipal.add(panHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAluguelActionPerformed
        if (cbModelo.getSelectedItem().equals("") || cbNomeC.equals("") || txtPlaca.getText().equals("")
                || txtCpf.getText().equals("")
                || txtValor.getText().equals("") || cbEntregue.equals("")
                || txtDataE.getText().equals("") || txtDataA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {

            try {

                try {
                    String diaE = txtDataE.getText().substring(0, 2);
                    String diaA = txtDataA.getText().substring(0, 2);
                    String mesE = txtDataE.getText().substring(3, 5);
                    String mesA = txtDataA.getText().substring(3, 5);
                    String anoE = txtDataE.getText().substring(6);
                    String anoA = txtDataA.getText().substring(6);

                    String dataEn = anoE + "-" + mesE + "-" + diaE;
                    String dataAl = anoA + "-" + mesA + "-" + diaA;

                    AluguelDTO obj = new AluguelDTO();
                    obj.setModelo(cbModelo.getSelectedItem().toString());
                    obj.setNomeCliente(cbNomeC.getSelectedItem().toString());
                    obj.setPlacaVeiculo(txtPlaca.getText());
                    obj.setCpfCliente(txtCpf.getText());
                    obj.setValor(Double.parseDouble(txtValor.getText()));
                    obj.setDataEntrega(dataEn);
                    obj.setDataAluguel(dataAl);
                    obj.setObservacao(txtObservacoes.getText());
                    obj.setEntregue(cbEntregue.getSelectedItem().toString());

                    AluguelDAO dao = new AluguelDAO();
                    dao.cadastrarAluguel(obj);

                    JOptionPane.showMessageDialog(null, "Aluguel bem sucedido!");

                    dispose();

                } catch (SQLException ex) {
                    Logger.getLogger(frmAluguel.class.getName()).log(Level.SEVERE, null, ex);

                }
                PrincipalVIEW prin = new PrincipalVIEW();
                prin.listarAluguel();
                prin.listarStatus();

            } catch (SQLException ex) {
                Logger.getLogger(frmAluguel.class.getName()).log(Level.SEVERE, null, ex);

            }


        }    }//GEN-LAST:event_btnSalvarAluguelActionPerformed

    private void cbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloActionPerformed
        txtPlaca.setText(placa.get(cbModelo.getSelectedIndex()));
    }//GEN-LAST:event_cbModeloActionPerformed

    private void cbNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeCActionPerformed
        txtCpf.setText(cpf.get(cbNomeC.getSelectedIndex()));

    }//GEN-LAST:event_cbNomeCActionPerformed

    private void btnEditarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAluguelActionPerformed
        if (cbModelo.getSelectedItem().equals("") || cbNomeC.equals("") || txtPlaca.getText().equals("")
            || txtCpf.getText().equals("")
            || txtValor.getText().equals("") || cbEntregue.equals("")
            || txtDataE.getText().equals("") || txtDataA.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {

            try {

                String diaE = txtDataE.getText().substring(0, 2);
                String diaA = txtDataA.getText().substring(0, 2);
                String mesE = txtDataE.getText().substring(3, 5);
                String mesA = txtDataA.getText().substring(3, 5);
                String anoE = txtDataE.getText().substring(6);
                String anoA = txtDataA.getText().substring(6);

                String dataEn = anoE + "-" + mesE + "-" + diaE;
                String dataAl = anoA + "-" + mesA + "-" + diaA;

                AluguelDTO obj = new AluguelDTO();

                obj.setModelo(cbModelo.getSelectedItem().toString());
                obj.setNomeCliente(cbNomeC.getSelectedItem().toString());
                obj.setPlacaVeiculo(txtPlaca.getText());
                obj.setCpfCliente(txtCpf.getText());
                obj.setValor(Double.parseDouble(txtValor.getText()));
                obj.setDataEntrega(dataEn);
                obj.setDataAluguel(dataAl);
                obj.setObservacao(txtObservacoes.getText());
                obj.setEntregue(cbEntregue.getSelectedItem().toString());
                obj.setIdAluguel(Integer.parseInt(txtIdAluguel.getText()));

                AluguelDAO dao = new AluguelDAO();
                dao.alterarAluguel(obj);

                JOptionPane.showMessageDialog(null, "Alteração bem sucedida!");

                dispose();
                PrincipalVIEW prin = new PrincipalVIEW();
                prin.listarAluguel();
                prin.listarStatus();

                this.btnEditarAluguel.setVisible(false);
                this.btnSalvarAluguel.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(frmAluguel.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }//GEN-LAST:event_btnEditarAluguelActionPerformed

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
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAluguel().setVisible(true);
            }
        });
    }

    public void LimparCampos() {
        cbModelo.setSelectedItem("");
        cbNomeC.setSelectedItem("");
        txtPlaca.setText("");
        txtCpf.setText("");
        txtValor.setText("");
        txtDataE.setText("");
        txtDataA.setText("");
        txtObservacoes.setText("");
        cbEntregue.setSelectedItem(0);
    }

    public void modeloComboBox() {

        try {
            VeiculoDAO objV = new VeiculoDAO();
            VeiculoDTO objVe = new VeiculoDTO();
            AluguelDAO objA = new AluguelDAO();
            ResultSet rsV = objV.listarModelo();
            ResultSet rsA = objA.listarModelo();

            while (rsA.next()) {
                placa.add(rsA.getString(2));
                cbModelo.addItem(rsA.getString(1));
            };
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO COMBO MODELO" + e);
        }
    }

    public List<String> modeloComboBoxEdit(String placaV) {

        try {
            VeiculoDAO objV = new VeiculoDAO();
            AluguelDAO objA = new AluguelDAO();
            ResultSet rsV = objV.verificarVeiculo(placaV);

            while (rsV.next()) {
                placa.add(rsV.getString(2));
                cbModelo.addItem(rsV.getString(1));
            };

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO COMBO MODELO" + e);
        }
        return placa;
    }

    public void nomeComboBox() {
        try {
            ClienteDAO obj = new ClienteDAO();
            ResultSet rs = obj.listarNomes();

            while (rs.next()) {
                cpf.add(rs.getString(6));
                cbNomeC.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }

    public void setarEdiçãoAluguel(AluguelDTO obj) {

        String diaA = obj.getDataAluguel().substring(0, 2);
        String mesA = obj.getDataAluguel().substring(3, 5);
        String anoA = obj.getDataAluguel().substring(6);

        String diaE = obj.getDataEntrega().substring(0, 2);
        String mesE = obj.getDataEntrega().substring(3, 5);
        String anoE = obj.getDataEntrega().substring(6);

        String dataAl = diaA + mesA + anoA;
        String dataEn = diaE + mesE + anoE;

        String placaVerif = obj.getPlacaVeiculo();
        this.cbModelo.setSelectedItem(modeloComboBoxEdit(placaVerif));
        this.cbNomeC.setSelectedItem(obj.getNomeCliente());
        this.txtPlaca.setText(obj.getPlacaVeiculo());
        this.txtCpf.setText(obj.getCpfCliente());
        this.txtValor.setText(String.valueOf(obj.getValor()));
        this.txtDataE.setText(dataEn);
        this.txtDataA.setText(dataAl);
        this.cbEntregue.setSelectedItem(obj.getEntregue());
        this.txtObservacoes.setText(obj.getObservacao());
        this.txtIdAluguel.setText(String.valueOf(obj.getIdAluguel()));
        this.btnEditarAluguel.setVisible(true);
        this.btnSalvarAluguel.setVisible(false);

    }

    public void bloquearCampos() {
        cbModelo.setVisible(false);
        IdModelo.setVisible(false);
        cbNomeC.setVisible(false);
        IdNomeC.setVisible(false);
        txtPlaca.setVisible(false);
        IdPlaca.setVisible(false);
        txtCpf.setVisible(false);
        IdCpf.setVisible(false);
        txtValor.setVisible(false);
        IdValor.setVisible(false);
        IdDataAluguel.setVisible(false);
        IdDataEntrega.setVisible(false);
        txtDataA.setVisible(false);
        txtDataE.setVisible(false);
        txtObservacoes.setVisible(false);
        btnSalvarAluguel.setVisible(false);
        IdObs.setVisible(false);
        cbEntregue.setVisible(false);
        IdEntregue.setVisible(false);
        txtIdAluguel.setVisible(false);
        IdAluguel.setVisible(false);
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
        LimparCampos();
    }

    public void desbloquearCampos() {

        //TORNANDO OS CAMPOS DE DADOS VISÍVEIS
        cbModelo.setVisible(true);
        IdModelo.setVisible(true);
        cbNomeC.setVisible(true);
        IdNomeC.setVisible(true);
        txtPlaca.setVisible(true);
        IdPlaca.setVisible(true);
        txtCpf.setVisible(true);
        IdCpf.setVisible(true);
        txtValor.setVisible(true);
        IdValor.setVisible(true);
        IdDataAluguel.setVisible(true);
        IdDataEntrega.setVisible(true);
        txtDataA.setVisible(true);
        txtDataE.setVisible(true);
        txtObservacoes.setVisible(true);
        btnSalvarAluguel.setVisible(true);
        IdObs.setVisible(true);
        cbEntregue.setVisible(true);
        IdEntregue.setVisible(true);
        txtIdAluguel.setVisible(true);
        IdAluguel.setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
        LimparCampos();

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdAluguel;
    private javax.swing.JLabel IdCpf;
    private javax.swing.JLabel IdDataAluguel;
    private javax.swing.JLabel IdDataEntrega;
    private javax.swing.JLabel IdEntregue;
    private javax.swing.JLabel IdModelo;
    private javax.swing.JLabel IdNomeC;
    private javax.swing.JLabel IdObs;
    private javax.swing.JLabel IdPlaca;
    private javax.swing.JLabel IdValor;
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnEditarAluguel;
    private javax.swing.JButton btnSalvarAluguel;
    private javax.swing.JComboBox<String> cbEntregue;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbNomeC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataA;
    private javax.swing.JFormattedTextField txtDataE;
    private javax.swing.JTextField txtIdAluguel;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
