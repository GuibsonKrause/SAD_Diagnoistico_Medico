package CIH;

import CDP.Doencas;
import DAO.AgenteArquivador;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author gkrause
 */
public class AgenteMedico extends javax.swing.JFrame
{

    private static final int port = 6789;

    public AgenteMedico()
    {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnManchas = new javax.swing.JRadioButton();
        rbtnFebre = new javax.swing.JRadioButton();
        rbtnDor = new javax.swing.JRadioButton();
        rbtnTosse = new javax.swing.JRadioButton();
        rbtnCansaco = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        cbDoenca = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextPane();
        btnSolicitarAuxilio = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHouD");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sintomas"));

        rbtnManchas.setText("Manchas");

        rbtnFebre.setText("Febre");

        rbtnDor.setText("Dor");
        rbtnDor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rbtnDorActionPerformed(evt);
            }
        });

        rbtnTosse.setText("Tosse");

        rbtnCansaco.setText("Cansaço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnDor)
                    .addComponent(rbtnFebre)
                    .addComponent(rbtnManchas)
                    .addComponent(rbtnTosse)
                    .addComponent(rbtnCansaco))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtnDor)
                .addGap(18, 18, 18)
                .addComponent(rbtnFebre)
                .addGap(18, 18, 18)
                .addComponent(rbtnManchas)
                .addGap(18, 18, 18)
                .addComponent(rbtnTosse)
                .addGap(18, 18, 18)
                .addComponent(rbtnCansaco)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Doença"));

        cbDoenca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resfriado", "Dengue", "Pneumonia", "Catapora" }));

        jLabel1.setText("Diagnostico:");

        txtDiagnostico.setEditable(false);
        jScrollPane1.setViewportView(txtDiagnostico);

        btnSolicitarAuxilio.setText("Solicitar Auxílio");
        btnSolicitarAuxilio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSolicitarAuxilioActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 147, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSolicitarAuxilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolicitarAuxilio)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnDorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDorActionPerformed
    }//GEN-LAST:event_rbtnDorActionPerformed

    private void btnSolicitarAuxilioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSolicitarAuxilioActionPerformed
    {//GEN-HEADEREND:event_btnSolicitarAuxilioActionPerformed
        Doencas current = new Doencas();
        symptomsSelec(current);
        String symptoms = current.getDor() + ";" + current.getFebre() + ";"
                + current.getManchas() + ";" + current.getTosse() + ";"
                + current.getCansaco();
        messageServer(symptoms);
    }//GEN-LAST:event_btnSolicitarAuxilioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarActionPerformed
        Doencas current = new Doencas();
        current.setNomeD((String) cbDoenca.getSelectedItem());
        symptomsSelec(current);
        AgenteArquivador.WriteFile("data.txt", current);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[])
    {
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AgenteMedico.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AgenteMedico().setVisible(true);
            }
        });
    }

    public String getHost()
    {
        String hostName = "";
        try
        {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e)
        {
            System.out.println("Exception caught =" + e.getMessage());
        }
        return hostName;

    }

    public void messageServer(String message)
    {
        try (DatagramSocket aSocket = new DatagramSocket())
        {
            byte[] b = message.getBytes();
            InetAddress aHost = InetAddress.getByName(getHost());
            int serverPort = port;

            DatagramPacket request = new DatagramPacket(b, message.length(),
                    aHost, serverPort);

            aSocket.send(request);

            byte[] buffer = new byte[100];

            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

            aSocket.receive(reply);

            txtDiagnostico.setText(new String(reply.getData()));
        } catch (SocketException e)
        {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e)
        {
            System.out.println("Input Output: " + e.getMessage());
        }
    }

    public void symptomsSelec(Doencas current)
    {
        if (rbtnDor.isSelected())
        {
            current.setDor("S");
        } else
        {
            current.setDor("N");
        }

        if (rbtnFebre.isSelected())
        {
            current.setFebre("S");
        } else
        {
            current.setFebre("N");
        }

        if (rbtnManchas.isSelected())
        {
            current.setManchas("S");
        } else
        {
            current.setManchas("N");
        }

        if (rbtnTosse.isSelected())
        {
            current.setTosse("S");
        } else
        {
            current.setTosse("N");
        }

        if (rbtnCansaco.isSelected())
        {
            current.setCansaco("S");
        } else
        {
            current.setCansaco("N");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSolicitarAuxilio;
    private javax.swing.JComboBox<String> cbDoenca;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCansaco;
    private javax.swing.JRadioButton rbtnDor;
    private javax.swing.JRadioButton rbtnFebre;
    private javax.swing.JRadioButton rbtnManchas;
    private javax.swing.JRadioButton rbtnTosse;
    private javax.swing.JTextPane txtDiagnostico;
    // End of variables declaration//GEN-END:variables
}
