
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Pantalla_login extends javax.swing.JFrame {

    int x, y;

    public Pantalla_login() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\media\\icono.png"));
        frame_principal.setIconImage(Toolkit.getDefaultToolkit().getImage("src\\media\\icono.png"));
        frame_principal.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame_cambiarContra = new javax.swing.JFrame();
        panel_cambiarContra = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PassField_contraAct = new javax.swing.JPasswordField();
        passField_nueva2 = new javax.swing.JPasswordField();
        passField_nueva = new javax.swing.JPasswordField();
        checkBox_mostrarContraNueva = new javax.swing.JCheckBox();
        checkBox_mostrarContraAct = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        checkBox_mostrarContraNueva2 = new javax.swing.JCheckBox();
        boton_cancelar = new javax.swing.JButton();
        boton_aceptar = new javax.swing.JButton();
        panel_titulo1 = new javax.swing.JPanel();
        etiqueta_cerrar_cambiarContra = new javax.swing.JLabel();
        etiqueta_minimizar_cambiarContra = new javax.swing.JLabel();
        etiqueta_titulo_cambiarContra = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        frame_agregar = new javax.swing.JFrame();
        panel_agregar = new javax.swing.JPanel();
        panel_titulo3 = new javax.swing.JPanel();
        etiqueta_cerrar3 = new javax.swing.JLabel();
        etiqueta_minimizar_principal1 = new javax.swing.JLabel();
        etiqueta_titulo_agregar = new javax.swing.JLabel();
        etiqueta_infoAgregar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textField_agregarUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textField_agregarContra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textField_agregarContra2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textField_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textField_apellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textField_correo = new javax.swing.JTextField();
        boton_volver = new javax.swing.JButton();
        boton_agregar = new javax.swing.JButton();
        dateChooser_fecha = new com.toedter.calendar.JDateChooser();
        frame_principal = new javax.swing.JFrame();
        panel_principal = new javax.swing.JPanel();
        panel_titulo2 = new javax.swing.JPanel();
        etiqueta_cerrar2 = new javax.swing.JLabel();
        etiqueta_minimizar_principal = new javax.swing.JLabel();
        etiqueta_titulo_principal = new javax.swing.JLabel();
        etiqueta_bienvenido = new javax.swing.JLabel();
        label_logo = new javax.swing.JLabel();
        etiqueta_info = new javax.swing.JLabel();
        panel_Botones = new javax.swing.JPanel();
        boton_cerrarSesion = new javax.swing.JButton();
        boton_nuevoUser = new javax.swing.JButton();
        boton_cambiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_principal = new javax.swing.JTextArea();
        panel_textArea = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menuItem_guardar = new javax.swing.JMenuItem();
        menuItem_abrir = new javax.swing.JMenuItem();
        menu_edicion = new javax.swing.JMenu();
        menuItem_selector = new javax.swing.JMenuItem();
        panel_login = new javax.swing.JPanel();
        label_instrucciones = new javax.swing.JLabel();
        label_usuario = new javax.swing.JLabel();
        textField_usuario = new javax.swing.JTextField();
        label_passwd = new javax.swing.JLabel();
        checkBox_mostrar = new javax.swing.JCheckBox();
        boton_log = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        etiqueta_click = new javax.swing.JLabel();
        panel_titulo = new javax.swing.JPanel();
        etiqueta_cerrar = new javax.swing.JLabel();
        etiqueta_minimizar = new javax.swing.JLabel();
        etiqueta_cabezera = new javax.swing.JLabel();

        frame_cambiarContra.setUndecorated(true);
        frame_cambiarContra.setResizable(false);
        frame_cambiarContra.setSize(new java.awt.Dimension(518, 312));

        panel_cambiarContra.setBackground(new java.awt.Color(33, 36, 41));
        panel_cambiarContra.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(40, 109, 213));
        jLabel11.setText("Repetir nueva contraseña:");
        panel_cambiarContra.add(jLabel11);
        jLabel11.setBounds(30, 200, 230, 18);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(40, 109, 213));
        jLabel12.setText("Contraseña actual:");
        panel_cambiarContra.add(jLabel12);
        jLabel12.setBounds(30, 120, 180, 18);

        PassField_contraAct.setBackground(new java.awt.Color(49, 52, 59));
        PassField_contraAct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PassField_contraAct.setForeground(new java.awt.Color(255, 255, 255));
        PassField_contraAct.setBorder(null);
        panel_cambiarContra.add(PassField_contraAct);
        PassField_contraAct.setBounds(260, 120, 145, 18);

        passField_nueva2.setBackground(new java.awt.Color(49, 52, 59));
        passField_nueva2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passField_nueva2.setForeground(new java.awt.Color(255, 255, 255));
        passField_nueva2.setBorder(null);
        panel_cambiarContra.add(passField_nueva2);
        passField_nueva2.setBounds(260, 200, 145, 18);

        passField_nueva.setBackground(new java.awt.Color(49, 52, 59));
        passField_nueva.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passField_nueva.setForeground(new java.awt.Color(255, 255, 255));
        passField_nueva.setBorder(null);
        panel_cambiarContra.add(passField_nueva);
        passField_nueva.setBounds(260, 160, 145, 18);

        checkBox_mostrarContraNueva.setBackground(new java.awt.Color(33, 36, 41));
        checkBox_mostrarContraNueva.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        checkBox_mostrarContraNueva.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_mostrarContraNueva.setText("Mostrar");
        checkBox_mostrarContraNueva.setBorder(null);
        checkBox_mostrarContraNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_mostrarContraNuevaActionPerformed(evt);
            }
        });
        panel_cambiarContra.add(checkBox_mostrarContraNueva);
        checkBox_mostrarContraNueva.setBounds(410, 120, 80, 20);

        checkBox_mostrarContraAct.setBackground(new java.awt.Color(33, 36, 41));
        checkBox_mostrarContraAct.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        checkBox_mostrarContraAct.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_mostrarContraAct.setText("Mostrar");
        checkBox_mostrarContraAct.setBorder(null);
        checkBox_mostrarContraAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_mostrarContraActActionPerformed(evt);
            }
        });
        panel_cambiarContra.add(checkBox_mostrarContraAct);
        checkBox_mostrarContraAct.setBounds(410, 160, 80, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Por favor, introduce la nueva contraseña");
        panel_cambiarContra.add(jLabel9);
        jLabel9.setBounds(20, 70, 450, 18);

        checkBox_mostrarContraNueva2.setBackground(new java.awt.Color(33, 36, 41));
        checkBox_mostrarContraNueva2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        checkBox_mostrarContraNueva2.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_mostrarContraNueva2.setText("Mostrar");
        checkBox_mostrarContraNueva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_mostrarContraNueva2ActionPerformed(evt);
            }
        });
        panel_cambiarContra.add(checkBox_mostrarContraNueva2);
        checkBox_mostrarContraNueva2.setBounds(410, 200, 80, 22);

        boton_cancelar.setBackground(new java.awt.Color(35, 133, 255));
        boton_cancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBorder(null);
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        panel_cambiarContra.add(boton_cancelar);
        boton_cancelar.setBounds(40, 250, 160, 30);

        boton_aceptar.setBackground(new java.awt.Color(35, 133, 255));
        boton_aceptar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        boton_aceptar.setText("Aceptar");
        boton_aceptar.setBorder(null);
        boton_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_aceptarActionPerformed(evt);
            }
        });
        panel_cambiarContra.add(boton_aceptar);
        boton_aceptar.setBounds(270, 250, 160, 30);

        panel_titulo1.setBackground(new java.awt.Color(33, 36, 41));

        etiqueta_cerrar_cambiarContra.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_cerrar_cambiarContra.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_cerrar_cambiarContra.setText("X");
        etiqueta_cerrar_cambiarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_cerrar_cambiarContraMouseClicked(evt);
            }
        });

        etiqueta_minimizar_cambiarContra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_minimizar_cambiarContra.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_minimizar_cambiarContra.setText("_");
        etiqueta_minimizar_cambiarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_minimizar_cambiarContraMouseClicked(evt);
            }
        });

        etiqueta_titulo_cambiarContra.setBackground(new java.awt.Color(33, 36, 41));
        etiqueta_titulo_cambiarContra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_titulo_cambiarContra.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_titulo_cambiarContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo_cambiarContra.setText("CAMBIO DE CONTRASEÑA");
        etiqueta_titulo_cambiarContra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta_titulo_cambiarContra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        etiqueta_titulo_cambiarContra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_cambiarContraMouseDragged(evt);
            }
        });
        etiqueta_titulo_cambiarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_cambiarContraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_titulo1Layout = new javax.swing.GroupLayout(panel_titulo1);
        panel_titulo1.setLayout(panel_titulo1Layout);
        panel_titulo1Layout.setHorizontalGroup(
            panel_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo1Layout.createSequentialGroup()
                .addComponent(etiqueta_titulo_cambiarContra, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(etiqueta_minimizar_cambiarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiqueta_cerrar_cambiarContra)
                .addGap(21, 21, 21))
        );
        panel_titulo1Layout.setVerticalGroup(
            panel_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo1Layout.createSequentialGroup()
                .addGroup(panel_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta_titulo_cambiarContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_titulo1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(panel_titulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqueta_cerrar_cambiarContra)
                            .addComponent(etiqueta_minimizar_cambiarContra))))
                .addContainerGap())
        );

        panel_cambiarContra.add(panel_titulo1);
        panel_titulo1.setBounds(0, 0, 520, 40);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(40, 109, 213));
        jLabel10.setText("Nueva contraseña:");
        panel_cambiarContra.add(jLabel10);
        jLabel10.setBounds(30, 160, 180, 18);

        javax.swing.GroupLayout frame_cambiarContraLayout = new javax.swing.GroupLayout(frame_cambiarContra.getContentPane());
        frame_cambiarContra.getContentPane().setLayout(frame_cambiarContraLayout);
        frame_cambiarContraLayout.setHorizontalGroup(
            frame_cambiarContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_cambiarContra, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        frame_cambiarContraLayout.setVerticalGroup(
            frame_cambiarContraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_cambiarContra, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        frame_agregar.setTitle("Agregar Nuevo Usuario");
        frame_agregar.setLocation(new java.awt.Point(0, 0));
        frame_agregar.setLocationRelativeTo(null);
        frame_agregar.setUndecorated(true);
        frame_agregar.setResizable(false);
        frame_agregar.setSize(new java.awt.Dimension(869, 380));

        panel_agregar.setBackground(new java.awt.Color(33, 36, 41));
        panel_agregar.setForeground(new java.awt.Color(255, 255, 255));
        panel_agregar.setLayout(null);

        panel_titulo3.setBackground(new java.awt.Color(33, 36, 41));

        etiqueta_cerrar3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_cerrar3.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_cerrar3.setText("X");
        etiqueta_cerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_cerrar3MouseClicked(evt);
            }
        });

        etiqueta_minimizar_principal1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_minimizar_principal1.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_minimizar_principal1.setText("_");
        etiqueta_minimizar_principal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_minimizar_principal1MouseClicked(evt);
            }
        });

        etiqueta_titulo_agregar.setBackground(new java.awt.Color(33, 36, 41));
        etiqueta_titulo_agregar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_titulo_agregar.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_titulo_agregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo_agregar.setText("AGREGAR NUEVO USUARIO");
        etiqueta_titulo_agregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta_titulo_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        etiqueta_titulo_agregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_agregarMouseDragged(evt);
            }
        });
        etiqueta_titulo_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_agregarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_titulo3Layout = new javax.swing.GroupLayout(panel_titulo3);
        panel_titulo3.setLayout(panel_titulo3Layout);
        panel_titulo3Layout.setHorizontalGroup(
            panel_titulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo3Layout.createSequentialGroup()
                .addComponent(etiqueta_titulo_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_minimizar_principal1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_cerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_titulo3Layout.setVerticalGroup(
            panel_titulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo3Layout.createSequentialGroup()
                .addGroup(panel_titulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta_titulo_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_titulo3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiqueta_cerrar3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(etiqueta_minimizar_principal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_agregar.add(panel_titulo3);
        panel_titulo3.setBounds(0, 0, 870, 40);

        etiqueta_infoAgregar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_infoAgregar.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_infoAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_infoAgregar.setText("Por favor, introduzca la información del nuevo usuario");
        panel_agregar.add(etiqueta_infoAgregar);
        etiqueta_infoAgregar.setBounds(10, 70, 450, 18);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 109, 213));
        jLabel1.setText("Usuario");
        panel_agregar.add(jLabel1);
        jLabel1.setBounds(40, 120, 90, 18);

        textField_agregarUsuario.setBackground(new java.awt.Color(49, 52, 59));
        textField_agregarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_agregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        textField_agregarUsuario.setBorder(null);
        panel_agregar.add(textField_agregarUsuario);
        textField_agregarUsuario.setBounds(240, 120, 190, 20);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(40, 109, 213));
        jLabel2.setText("Contraseña");
        panel_agregar.add(jLabel2);
        jLabel2.setBounds(40, 160, 150, 18);

        textField_agregarContra.setBackground(new java.awt.Color(49, 52, 59));
        textField_agregarContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_agregarContra.setForeground(new java.awt.Color(255, 255, 255));
        textField_agregarContra.setBorder(null);
        panel_agregar.add(textField_agregarContra);
        textField_agregarContra.setBounds(240, 160, 190, 20);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 109, 213));
        jLabel3.setText("Confirmar contraseña");
        panel_agregar.add(jLabel3);
        jLabel3.setBounds(40, 200, 180, 18);

        textField_agregarContra2.setBackground(new java.awt.Color(49, 52, 59));
        textField_agregarContra2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_agregarContra2.setForeground(new java.awt.Color(255, 255, 255));
        textField_agregarContra2.setBorder(null);
        panel_agregar.add(textField_agregarContra2);
        textField_agregarContra2.setBounds(240, 200, 190, 20);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos opcionales del nuevo usuario");
        panel_agregar.add(jLabel4);
        jLabel4.setBounds(500, 70, 346, 18);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 109, 213));
        jLabel5.setText("Nombre");
        panel_agregar.add(jLabel5);
        jLabel5.setBounds(520, 110, 100, 18);

        textField_nombre.setBackground(new java.awt.Color(49, 52, 59));
        textField_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_nombre.setForeground(new java.awt.Color(255, 255, 255));
        textField_nombre.setBorder(null);
        panel_agregar.add(textField_nombre);
        textField_nombre.setBounds(710, 110, 129, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(40, 109, 213));
        jLabel6.setText("Apellidos");
        panel_agregar.add(jLabel6);
        jLabel6.setBounds(520, 150, 110, 18);

        textField_apellidos.setBackground(new java.awt.Color(49, 52, 59));
        textField_apellidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        textField_apellidos.setBorder(null);
        panel_agregar.add(textField_apellidos);
        textField_apellidos.setBounds(710, 150, 129, 20);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(40, 109, 213));
        jLabel7.setText("Fecha de nacimiento");
        panel_agregar.add(jLabel7);
        jLabel7.setBounds(520, 190, 180, 18);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(40, 109, 213));
        jLabel8.setText("Correo");
        panel_agregar.add(jLabel8);
        jLabel8.setBounds(520, 240, 80, 18);

        textField_correo.setBackground(new java.awt.Color(49, 52, 59));
        textField_correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_correo.setForeground(new java.awt.Color(255, 255, 255));
        textField_correo.setBorder(null);
        panel_agregar.add(textField_correo);
        textField_correo.setBounds(599, 240, 240, 20);

        boton_volver.setBackground(new java.awt.Color(40, 109, 213));
        boton_volver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton_volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_volver.setText("Volver");
        boton_volver.setBorder(null);
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });
        panel_agregar.add(boton_volver);
        boton_volver.setBounds(98, 310, 280, 30);

        boton_agregar.setBackground(new java.awt.Color(40, 109, 213));
        boton_agregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        boton_agregar.setForeground(new java.awt.Color(255, 255, 255));
        boton_agregar.setText("Agregar");
        boton_agregar.setBorder(null);
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });
        panel_agregar.add(boton_agregar);
        boton_agregar.setBounds(540, 310, 270, 30);

        dateChooser_fecha.setBackground(new java.awt.Color(49, 52, 59));
        dateChooser_fecha.setDateFormatString("dd.MM.yyyy");
        dateChooser_fecha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        panel_agregar.add(dateChooser_fecha);
        dateChooser_fecha.setBounds(710, 190, 129, 20);

        javax.swing.GroupLayout frame_agregarLayout = new javax.swing.GroupLayout(frame_agregar.getContentPane());
        frame_agregar.getContentPane().setLayout(frame_agregarLayout);
        frame_agregarLayout.setHorizontalGroup(
            frame_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        frame_agregarLayout.setVerticalGroup(
            frame_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        frame_principal.setTitle("Principal");
        frame_principal.setLocationRelativeTo(null);
        frame_principal.setAlwaysOnTop(true);
        frame_principal.setUndecorated(true);
        frame_principal.setResizable(false);
        frame_principal.setSize(new java.awt.Dimension(603, 505));

        panel_principal.setBackground(new java.awt.Color(33, 36, 41));
        panel_principal.setLayout(null);

        panel_titulo2.setBackground(new java.awt.Color(33, 36, 41));

        etiqueta_cerrar2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_cerrar2.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_cerrar2.setText("X");
        etiqueta_cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_cerrar2MouseClicked(evt);
            }
        });

        etiqueta_minimizar_principal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_minimizar_principal.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_minimizar_principal.setText("_");
        etiqueta_minimizar_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_minimizar_principalMouseClicked(evt);
            }
        });

        etiqueta_titulo_principal.setBackground(new java.awt.Color(33, 36, 41));
        etiqueta_titulo_principal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_titulo_principal.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_titulo_principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo_principal.setText("PRINCIPAL");
        etiqueta_titulo_principal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta_titulo_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        etiqueta_titulo_principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_principalMouseDragged(evt);
            }
        });
        etiqueta_titulo_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etiqueta_titulo_principalMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_titulo2Layout = new javax.swing.GroupLayout(panel_titulo2);
        panel_titulo2.setLayout(panel_titulo2Layout);
        panel_titulo2Layout.setHorizontalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo2Layout.createSequentialGroup()
                .addComponent(etiqueta_titulo_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_minimizar_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiqueta_cerrar2)
                .addGap(21, 21, 21))
        );
        panel_titulo2Layout.setVerticalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_titulo2Layout.createSequentialGroup()
                .addGroup(panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta_titulo_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_titulo2Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addGroup(panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiqueta_cerrar2)
                            .addComponent(etiqueta_minimizar_principal))))
                .addContainerGap())
        );

        panel_principal.add(panel_titulo2);
        panel_titulo2.setBounds(0, 0, 610, 40);

        etiqueta_bienvenido.setBackground(new java.awt.Color(35, 133, 255));
        etiqueta_bienvenido.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        etiqueta_bienvenido.setForeground(new java.awt.Color(35, 133, 255));
        etiqueta_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_bienvenido.setText("Bienvenid@");
        panel_principal.add(etiqueta_bienvenido);
        etiqueta_bienvenido.setBounds(10, 80, 350, 30);

        label_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/icono.png"))); // NOI18N
        panel_principal.add(label_logo);
        label_logo.setBounds(150, 130, 60, 60);

        etiqueta_info.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_info.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_info.setText("El usuario  está logueado");
        etiqueta_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_principal.add(etiqueta_info);
        etiqueta_info.setBounds(20, 210, 280, 18);

        panel_Botones.setBackground(new java.awt.Color(33, 36, 41));
        panel_Botones.setOpaque(false);

        boton_cerrarSesion.setBackground(new java.awt.Color(35, 133, 255));
        boton_cerrarSesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        boton_cerrarSesion.setText("Cerrar sesion");
        boton_cerrarSesion.setBorder(null);
        boton_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cerrarSesionActionPerformed(evt);
            }
        });

        boton_nuevoUser.setBackground(new java.awt.Color(35, 133, 255));
        boton_nuevoUser.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_nuevoUser.setForeground(new java.awt.Color(255, 255, 255));
        boton_nuevoUser.setText("Nuevo usuario");
        boton_nuevoUser.setBorder(null);
        boton_nuevoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoUserActionPerformed(evt);
            }
        });

        boton_cambiar.setBackground(new java.awt.Color(35, 133, 255));
        boton_cambiar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_cambiar.setForeground(new java.awt.Color(255, 255, 255));
        boton_cambiar.setText("Cambiar contraseña");
        boton_cambiar.setBorder(null);
        boton_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_BotonesLayout = new javax.swing.GroupLayout(panel_Botones);
        panel_Botones.setLayout(panel_BotonesLayout);
        panel_BotonesLayout.setHorizontalGroup(
            panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_nuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_BotonesLayout.setVerticalGroup(
            panel_BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_nuevoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(boton_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_principal.add(panel_Botones);
        panel_Botones.setBounds(350, 100, 210, 120);

        textArea_principal.setColumns(20);
        textArea_principal.setRows(5);
        jScrollPane1.setViewportView(textArea_principal);

        panel_principal.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 550, 210);

        javax.swing.GroupLayout panel_textAreaLayout = new javax.swing.GroupLayout(panel_textArea);
        panel_textArea.setLayout(panel_textAreaLayout);
        panel_textAreaLayout.setHorizontalGroup(
            panel_textAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panel_textAreaLayout.setVerticalGroup(
            panel_textAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        panel_principal.add(panel_textArea);
        panel_textArea.setBounds(90, 260, 420, 210);

        jMenuBar1.setBackground(new java.awt.Color(33, 36, 41));
        jMenuBar1.setBorder(null);
        jMenuBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseDragged(evt);
            }
        });
        jMenuBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBar1MouseClicked(evt);
            }
        });

        menu_archivo.setText("Archivo");

        menuItem_guardar.setText("Guardar");
        menuItem_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_guardarActionPerformed(evt);
            }
        });
        menu_archivo.add(menuItem_guardar);

        menuItem_abrir.setText("Abrir");
        menuItem_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_abrirActionPerformed(evt);
            }
        });
        menu_archivo.add(menuItem_abrir);

        jMenuBar1.add(menu_archivo);

        menu_edicion.setText("Edición");

        menuItem_selector.setText("Selector de color");
        menuItem_selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_selectorActionPerformed(evt);
            }
        });
        menu_edicion.add(menuItem_selector);

        jMenuBar1.add(menu_edicion);

        frame_principal.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout frame_principalLayout = new javax.swing.GroupLayout(frame_principal.getContentPane());
        frame_principal.getContentPane().setLayout(frame_principalLayout);
        frame_principalLayout.setHorizontalGroup(
            frame_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        frame_principalLayout.setVerticalGroup(
            frame_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(33, 36, 41));
        setName("frame_login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panel_login.setBackground(new java.awt.Color(33, 36, 41));
        panel_login.setLayout(null);

        label_instrucciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        label_instrucciones.setForeground(new java.awt.Color(255, 255, 255));
        label_instrucciones.setText("Por favor, introduzca sus credenciales para acceder:");
        panel_login.add(label_instrucciones);
        label_instrucciones.setBounds(20, 50, 430, 18);

        label_usuario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        label_usuario.setForeground(new java.awt.Color(40, 109, 213));
        label_usuario.setText("Usuario");
        panel_login.add(label_usuario);
        label_usuario.setBounds(40, 100, 70, 18);

        textField_usuario.setBackground(new java.awt.Color(49, 52, 59));
        textField_usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_usuario.setForeground(new java.awt.Color(255, 255, 255));
        textField_usuario.setBorder(null);
        panel_login.add(textField_usuario);
        textField_usuario.setBounds(160, 100, 170, 20);

        label_passwd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        label_passwd.setForeground(new java.awt.Color(40, 109, 213));
        label_passwd.setText("Contraseña");
        panel_login.add(label_passwd);
        label_passwd.setBounds(40, 160, 100, 18);

        checkBox_mostrar.setBackground(new java.awt.Color(33, 36, 41));
        checkBox_mostrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        checkBox_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        checkBox_mostrar.setText("Mostrar");
        checkBox_mostrar.setBorder(null);
        checkBox_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_mostrarActionPerformed(evt);
            }
        });
        panel_login.add(checkBox_mostrar);
        checkBox_mostrar.setBounds(360, 160, 90, 24);

        boton_log.setBackground(new java.awt.Color(35, 133, 255));
        boton_log.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        boton_log.setForeground(new java.awt.Color(255, 255, 255));
        boton_log.setText("Login");
        boton_log.setBorder(null);
        boton_log.setOpaque(true);
        boton_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_logActionPerformed(evt);
            }
        });
        panel_login.add(boton_log);
        boton_log.setBounds(110, 210, 250, 30);

        passwordField.setBackground(new java.awt.Color(49, 52, 59));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        panel_login.add(passwordField);
        passwordField.setBounds(160, 160, 170, 20);

        etiqueta_click.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_click.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_click.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_click.setText("<HTML><U>Haz clic para agregar un nuevo usuario</U></HTML>");
        etiqueta_click.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        etiqueta_click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_clickMouseClicked(evt);
            }
        });
        panel_login.add(etiqueta_click);
        etiqueta_click.setBounds(30, 260, 390, 18);

        panel_titulo.setBackground(new java.awt.Color(33, 36, 41));

        etiqueta_cerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        etiqueta_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_cerrar.setText("X");
        etiqueta_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_cerrarMouseClicked(evt);
            }
        });

        etiqueta_minimizar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_minimizar.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_minimizar.setText("_");
        etiqueta_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiqueta_minimizarMouseClicked(evt);
            }
        });

        etiqueta_cabezera.setBackground(new java.awt.Color(33, 36, 41));
        etiqueta_cabezera.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        etiqueta_cabezera.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta_cabezera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_cabezera.setText("LOGIN");
        etiqueta_cabezera.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        etiqueta_cabezera.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        etiqueta_cabezera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                etiqueta_cabezeraMouseDragged(evt);
            }
        });
        etiqueta_cabezera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etiqueta_cabezeraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tituloLayout.createSequentialGroup()
                .addComponent(etiqueta_cabezera, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiqueta_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tituloLayout.createSequentialGroup()
                .addGroup(panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(etiqueta_cabezera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiqueta_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_login.add(panel_titulo);
        panel_titulo.setBounds(0, 0, 470, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBox_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_mostrarActionPerformed
        mostrar(checkBox_mostrar, passwordField);
    }//GEN-LAST:event_checkBox_mostrarActionPerformed

    private void boton_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_logActionPerformed
        JFrame jFrame = new JFrame();
        String nombre = textField_usuario.getText();
        Usuario user = new Usuario(textField_usuario.getText(), String.valueOf(passwordField.getPassword()));

        if (Metodos.verificarUser(user)) {
            etiqueta_info.setText("El usuario " + user.getUsuario() + " está logueado");
            this.setVisible(false);
            frame_principal.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(jFrame, "El usuario o la contraseña son incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_logActionPerformed


    private void boton_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cerrarSesionActionPerformed
        frame_principal.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_boton_cerrarSesionActionPerformed

    private void etiqueta_clickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_clickMouseClicked
        this.setVisible(false);
        frame_agregar.setVisible(true);
    }//GEN-LAST:event_etiqueta_clickMouseClicked

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        frame_agregar.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        Usuario user = null;

        String usuario = textField_agregarUsuario.getText();
        String contraseña = textField_agregarContra.getText();
        String nombre = textField_nombre.getText();
        String apellidos = textField_apellidos.getText();
        String fecha = crearFecha(dateChooser_fecha.getDate());
        String correo = textField_correo.getText();

        boolean masDatos = false;

        if (!correo.equals("") || !fecha.equals("") || !apellidos.equals("") || !nombre.equals("")) {
            masDatos = true;
        }

        if (verificaciones()) {
            if (masDatos) {
                if (verificacionesOpcionales()) {
                    //Crea el user y se lo pasa a la base de datos
                    user = new Usuario(usuario, contraseña, nombre, apellidos, fecha, correo);
                    guardar(user);
                } else {
                    JOptionPane.showMessageDialog(frame_agregar, "Los datos opcionales no son correctos.", "Error datos opcionales", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                user = new Usuario(usuario, contraseña);
                guardar(user);
            }
        }
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_nuevoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoUserActionPerformed
        frame_principal.dispose();
        frame_agregar.setVisible(true);
    }//GEN-LAST:event_boton_nuevoUserActionPerformed

    private void boton_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiarActionPerformed
        frame_principal.setVisible(false);
        frame_cambiarContra.setVisible(true);
    }//GEN-LAST:event_boton_cambiarActionPerformed

    private void boton_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_aceptarActionPerformed

        String user = textField_usuario.getText();
        String contraAct = String.valueOf(PassField_contraAct.getPassword());
        String contra1 = String.valueOf(passField_nueva.getPassword());
        String contra2 = String.valueOf(passField_nueva2.getPassword());

        Usuario usuario = new Usuario(user, contraAct);

        if (Metodos.verificarUser(user)) {
            if (Metodos.verificarDobleContra(contra1, contra2)) {
                if (Metodos.modificarContraseña(usuario, contra1)) {
                    JOptionPane.showMessageDialog(frame_agregar, "La contraseña ha sido modificada");
                    frame_cambiarContra.dispose();
                    frame_principal.dispose();
                    this.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame_agregar, "No se ha podido cambiar la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame_agregar, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame_agregar, "Contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_aceptarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        frame_principal.setVisible(true);
        frame_cambiarContra.dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void checkBox_mostrarContraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_mostrarContraNuevaActionPerformed
        mostrar(checkBox_mostrarContraNueva, PassField_contraAct);
    }//GEN-LAST:event_checkBox_mostrarContraNuevaActionPerformed

    private void checkBox_mostrarContraActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_mostrarContraActActionPerformed
        mostrar(checkBox_mostrarContraAct, passField_nueva);
    }//GEN-LAST:event_checkBox_mostrarContraActActionPerformed

    private void checkBox_mostrarContraNueva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_mostrarContraNueva2ActionPerformed
        mostrar(checkBox_mostrarContraNueva2, passField_nueva2);
    }//GEN-LAST:event_checkBox_mostrarContraNueva2ActionPerformed

    private void etiqueta_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_etiqueta_cerrarMouseClicked

    private void etiqueta_cerrar_cambiarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cerrar_cambiarContraMouseClicked
        frame_cambiarContra.dispose();
        frame_principal.setVisible(true);
    }//GEN-LAST:event_etiqueta_cerrar_cambiarContraMouseClicked

    private void etiqueta_cerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cerrar2MouseClicked
        frame_principal.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_etiqueta_cerrar2MouseClicked

    private void etiqueta_cabezeraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cabezeraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_etiqueta_cabezeraMousePressed

    private void etiqueta_cabezeraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cabezeraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_etiqueta_cabezeraMouseDragged

    private void etiqueta_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_etiqueta_minimizarMouseClicked

    private void etiqueta_minimizar_principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_minimizar_principalMouseClicked
        frame_principal.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_etiqueta_minimizar_principalMouseClicked

    private void etiqueta_titulo_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_etiqueta_titulo_principalMousePressed

    private void etiqueta_titulo_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_principalMouseDragged
        frame_principal.setLocation(frame_principal.getLocation().x + evt.getX() - x, frame_principal.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_etiqueta_titulo_principalMouseDragged

    private void etiqueta_cerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_cerrar3MouseClicked
        frame_agregar.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_etiqueta_cerrar3MouseClicked

    private void etiqueta_minimizar_principal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_minimizar_principal1MouseClicked
        frame_agregar.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_etiqueta_minimizar_principal1MouseClicked

    private void etiqueta_titulo_agregarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_agregarMouseDragged
        frame_agregar.setLocation(frame_agregar.getLocation().x + evt.getX() - x, frame_agregar.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_etiqueta_titulo_agregarMouseDragged

    private void etiqueta_titulo_agregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_agregarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_etiqueta_titulo_agregarMousePressed

    private void etiqueta_minimizar_cambiarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_minimizar_cambiarContraMouseClicked
        frame_cambiarContra.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_etiqueta_minimizar_cambiarContraMouseClicked

    private void etiqueta_titulo_cambiarContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_cambiarContraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_etiqueta_titulo_cambiarContraMousePressed

    private void etiqueta_titulo_cambiarContraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiqueta_titulo_cambiarContraMouseDragged
        frame_cambiarContra.setLocation(frame_cambiarContra.getLocation().x + evt.getX() - x, frame_cambiarContra.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_etiqueta_titulo_cambiarContraMouseDragged

    private void menuItem_selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_selectorActionPerformed
        frame_principal.setVisible(false);
        JColorChooser jc = new JColorChooser();
        Color background = JColorChooser.showDialog(jc, "Elija color", Color.BLUE);

        panel_login.setBackground(background);
        panel_principal.setBackground(background);
        panel_agregar.setBackground(background);
        
        frame_principal.setVisible(true);
    }//GEN-LAST:event_menuItem_selectorActionPerformed

    private void jMenuBar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseClicked
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jMenuBar1MouseClicked

    private void jMenuBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBar1MouseDragged
        frame_principal.setLocation(frame_principal.getLocation().x + evt.getX() - x, frame_principal.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jMenuBar1MouseDragged

    private void menuItem_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_guardarActionPerformed
        JFileChooser fchooser = new JFileChooser();
        frame_principal.setVisible(false);
        fchooser.setVisible(true);
        int seleccion = fchooser.showOpenDialog(fchooser);
        boolean append = false;
        String entrada = textArea_principal.getText();

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = new File(fchooser.getSelectedFile().getPath() + ".txt");
            if (fichero.exists()) {
                int dialogButton = JOptionPane.showConfirmDialog(null, "El fichero ya existe,¿desea sobreescribirlo?", "WARNING", JOptionPane.YES_NO_OPTION);
                if (dialogButton == JOptionPane.NO_OPTION) {
                    append = true;
                }
            }
            Metodos.guardarEnFichero(entrada, fichero, append);
        }
        frame_principal.setVisible(true);
    }//GEN-LAST:event_menuItem_guardarActionPerformed

    private void menuItem_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_abrirActionPerformed
        JFileChooser fchooser = new JFileChooser();
        fchooser.setAcceptAllFileFilterUsed(false);
        fchooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT Documents", "txt"));

        frame_principal.setVisible(false);
        fchooser.setVisible(true);
        int seleccion = fchooser.showOpenDialog(fchooser);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = new File(fchooser.getSelectedFile().getPath());
            if (fichero.exists()) {
                textArea_principal.setText(Metodos.leerFichero(fichero));
            }
        }
        frame_principal.setVisible(true);
    }//GEN-LAST:event_menuItem_abrirActionPerformed

    private boolean verificaciones() {
        String usuario = textField_agregarUsuario.getText();
        String contraseña = textField_agregarContra.getText();
        String contraseña2 = textField_agregarContra2.getText();

        //Verifica que no esten los campos vacios (obligatorios)
        if (usuario.equals("") || usuario == null) {
            JOptionPane.showMessageDialog(frame_agregar, "El usuario no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (contraseña.equals("") || contraseña == null) {
            JOptionPane.showMessageDialog(frame_agregar, "La contraseña no puede estar vacia.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        //Verifica que no existan ya el usuario
        if (!(Metodos.verificarDuplicado(usuario))) {
            //Verifica que coincidan las contras
            if (Metodos.verificarDobleContra(contraseña, contraseña2)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(frame_agregar, "La contraseña no coincide.", "Error", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(frame_agregar, "El usuario ya existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    private boolean verificacionesOpcionales() {
        String correo = textField_correo.getText();

        if (!correo.equals("")) {
            if (Metodos.verificarCorreo(correo)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(frame_agregar, "El formato del correo es incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private String crearFecha(Date date) {
        String fecha = "";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            fecha = sdf.format(date);
        } catch (NullPointerException ex) {
            return "01.01.2000";
        }
        return fecha;
    }

    private void guardar(Usuario user) {
        if (BaseDatos.guardar(user)) {
            JOptionPane.showMessageDialog(frame_agregar, "El usuario ha sido creado");
            frame_agregar.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(frame_agregar, "No se ha podido agregar al usuario.", "Error en la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrar(JCheckBox checkBox, JPasswordField password) {
        if (checkBox.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('\u2022');
        }
    }

    public static void main(String args[]) {

        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PassField_contraAct;
    private javax.swing.JButton boton_aceptar;
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_cambiar;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_cerrarSesion;
    private javax.swing.JButton boton_log;
    private javax.swing.JButton boton_nuevoUser;
    private javax.swing.JButton boton_volver;
    private javax.swing.JCheckBox checkBox_mostrar;
    private javax.swing.JCheckBox checkBox_mostrarContraAct;
    private javax.swing.JCheckBox checkBox_mostrarContraNueva;
    private javax.swing.JCheckBox checkBox_mostrarContraNueva2;
    private com.toedter.calendar.JDateChooser dateChooser_fecha;
    private javax.swing.JLabel etiqueta_bienvenido;
    private javax.swing.JLabel etiqueta_cabezera;
    private javax.swing.JLabel etiqueta_cerrar;
    private javax.swing.JLabel etiqueta_cerrar2;
    private javax.swing.JLabel etiqueta_cerrar3;
    private javax.swing.JLabel etiqueta_cerrar_cambiarContra;
    private javax.swing.JLabel etiqueta_click;
    private javax.swing.JLabel etiqueta_info;
    private javax.swing.JLabel etiqueta_infoAgregar;
    private javax.swing.JLabel etiqueta_minimizar;
    private javax.swing.JLabel etiqueta_minimizar_cambiarContra;
    private javax.swing.JLabel etiqueta_minimizar_principal;
    private javax.swing.JLabel etiqueta_minimizar_principal1;
    private javax.swing.JLabel etiqueta_titulo_agregar;
    private javax.swing.JLabel etiqueta_titulo_cambiarContra;
    private javax.swing.JLabel etiqueta_titulo_principal;
    private javax.swing.JFrame frame_agregar;
    private javax.swing.JFrame frame_cambiarContra;
    private javax.swing.JFrame frame_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_instrucciones;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel label_passwd;
    private javax.swing.JLabel label_usuario;
    private javax.swing.JMenuItem menuItem_abrir;
    private javax.swing.JMenuItem menuItem_guardar;
    private javax.swing.JMenuItem menuItem_selector;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_edicion;
    private javax.swing.JPanel panel_Botones;
    private javax.swing.JPanel panel_agregar;
    private javax.swing.JPanel panel_cambiarContra;
    private javax.swing.JPanel panel_login;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_textArea;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JPanel panel_titulo1;
    private javax.swing.JPanel panel_titulo2;
    private javax.swing.JPanel panel_titulo3;
    private javax.swing.JPasswordField passField_nueva;
    private javax.swing.JPasswordField passField_nueva2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextArea textArea_principal;
    private javax.swing.JTextField textField_agregarContra;
    private javax.swing.JTextField textField_agregarContra2;
    private javax.swing.JTextField textField_agregarUsuario;
    private javax.swing.JTextField textField_apellidos;
    private javax.swing.JTextField textField_correo;
    private javax.swing.JTextField textField_nombre;
    private javax.swing.JTextField textField_usuario;
    // End of variables declaration//GEN-END:variables
}
