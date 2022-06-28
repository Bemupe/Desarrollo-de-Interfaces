/********************************************************************************
 ** Form generated from reading ui file 'frmReforma.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
//SE AÑADE EL ARCHIVO JAVA "Frame_Reforma" AL PAQUETE (Línea 11)
//SE OCULTAN AL INICIO DEL FORMULARIO nueva_mano_obra_pushButton (Línea 464), contenedor_numeOper_regisOper (Línea 480),tipo_mano_obra_plainTextEdit (Línea 498)
//SE ACTIVAN LOS BOTONES GUARDAR Y SALIR EN LA LAS LÍNEAS 663 Y 664
package programa;//SE AÑADE EL ARCHIVO JAVA AL PAQUETE
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Frame_Reforma implements com.trolltech.qt.QUiForm<QDialog>
{
    public QFrame cliente;
    public QWidget verticalLayoutWidget_2;
    public QVBoxLayout verticalLayout_2;
    public QLabel codigo_label;
    public QLabel nombre_label;
    public QLabel apellidos_label;
    public QLabel direccion_label;
    public QLabel telefono_label_;
    public QLabel fecha_label;
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout;
    public QLineEdit codigo;
    public QLineEdit nombre;
    public QLineEdit apellidos;
    public QLineEdit direccion;
    public QLineEdit telefono;
    public QDateEdit fecha;
    public QLabel datos_cliente_label;
    public QFrame tipo_reforma;
    public QLabel tipo_reforma_label;
    public QWidget verticalLayoutWidget_3;
    public QVBoxLayout integral_layout;
    public QRadioButton estructura_radioButton;
    public QRadioButton cimentacion_radioButton;
    public QRadioButton albanileria_radioButton;
    public QRadioButton fontaneria_radioButton;
    public QRadioButton decoracion_radioButton;
    public QRadioButton carpinteria_radioButton;
    public QWidget verticalLayoutWidget_5;
    public QVBoxLayout sanitarios_layout;
    public QRadioButton sani_alba_radioButton;
    public QRadioButton fonta_sani_radioButton;
    public QRadioButton deco_sani_radioButton;
    public QWidget verticalLayoutWidget_6;
    public QVBoxLayout pavimentos_layout;
    public QRadioButton es_pavi_radioButton;
    public QRadioButton cimen_pavi_radioButton;
    public QRadioButton reforma_integral_radioButton;
    public QRadioButton sanitarios_radioButton;
    public QRadioButton pavimentos_radioButton;
    public QPushButton pushButton;
    public QFrame mano_obra;
    public QLabel encargado_label;
    public QWidget horizontalLayoutWidget;
    public QHBoxLayout horizontalLayout;
    public QLabel checkbox_label;
    public QCheckBox necesario_obra_externacheckBox;
    public QPushButton nueva_mano_obra_pushButton;
    public QWidget contenedor_numeOper_regisOper;
    public QPlainTextEdit operarios_plainTextEdit;
    public QComboBox operarios_comboBox;
    public QComboBox tipo_mano_obra_comboBox;
    public QPlainTextEdit tipo_mano_obra_plainTextEdit;
    public QWidget horizontalLayoutWidget_3;
    public QHBoxLayout horizontalLayout_3;
    public QLabel tipo_mano_label;
    public QLabel n_operarios_label;
    public QWidget horizontalLayoutWidget_2;
    public QHBoxLayout horizontalLayout_2;
    public QPushButton limpiar_pushButton;
    public QPushButton guardar_pushButton;
    public QPushButton salir_pushButton;

    public Frame_Reforma() { super(); }

    public void setupUi(QDialog Nueva_reforma)
    {
        Nueva_reforma.setObjectName("Nueva_reforma");
        Nueva_reforma.setEnabled(true);
        Nueva_reforma.resize(new QSize(825, 578).expandedTo(Nueva_reforma.minimumSizeHint()));
        Nueva_reforma.setAutoFillBackground(false);
        Nueva_reforma.setStyleSheet("background-color: rgb(255, 255, 255);");
        cliente = new QFrame(Nueva_reforma);
        cliente.setObjectName("cliente");
        cliente.setGeometry(new QRect(30, 20, 331, 271));
        cliente.setStyleSheet("background-color: rgb(241, 241, 241);");
        cliente.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        cliente.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        verticalLayoutWidget_2 = new QWidget(cliente);
        verticalLayoutWidget_2.setObjectName("verticalLayoutWidget_2");
        verticalLayoutWidget_2.setGeometry(new QRect(20, 50, 111, 151));
        verticalLayout_2 = new QVBoxLayout(verticalLayoutWidget_2);
        verticalLayout_2.setObjectName("verticalLayout_2");
        codigo_label = new QLabel(verticalLayoutWidget_2);
        codigo_label.setObjectName("codigo_label");
        QFont font = new QFont();
        font.setFamily("Agency FB");
        font.setPointSize(11);
        font.setBold(true);
        font.setWeight(75);
        codigo_label.setFont(font);

        verticalLayout_2.addWidget(codigo_label);

        nombre_label = new QLabel(verticalLayoutWidget_2);
        nombre_label.setObjectName("nombre_label");
        QFont font1 = new QFont();
        font1.setFamily("Agency FB");
        font1.setPointSize(11);
        font1.setBold(true);
        font1.setWeight(75);
        nombre_label.setFont(font1);

        verticalLayout_2.addWidget(nombre_label);

        apellidos_label = new QLabel(verticalLayoutWidget_2);
        apellidos_label.setObjectName("apellidos_label");
        QFont font2 = new QFont();
        font2.setFamily("Agency FB");
        font2.setPointSize(11);
        font2.setBold(true);
        font2.setWeight(75);
        apellidos_label.setFont(font2);

        verticalLayout_2.addWidget(apellidos_label);

        direccion_label = new QLabel(verticalLayoutWidget_2);
        direccion_label.setObjectName("direccion_label");
        QFont font3 = new QFont();
        font3.setFamily("Agency FB");
        font3.setPointSize(11);
        font3.setBold(true);
        font3.setWeight(75);
        direccion_label.setFont(font3);

        verticalLayout_2.addWidget(direccion_label);

        telefono_label_ = new QLabel(verticalLayoutWidget_2);
        telefono_label_.setObjectName("telefono_label_");
        QFont font4 = new QFont();
        font4.setFamily("Agency FB");
        font4.setPointSize(11);
        font4.setBold(true);
        font4.setWeight(75);
        telefono_label_.setFont(font4);

        verticalLayout_2.addWidget(telefono_label_);

        fecha_label = new QLabel(verticalLayoutWidget_2);
        fecha_label.setObjectName("fecha_label");
        QFont font5 = new QFont();
        font5.setFamily("Agency FB");
        font5.setPointSize(11);
        font5.setBold(true);
        font5.setWeight(75);
        fecha_label.setFont(font5);

        verticalLayout_2.addWidget(fecha_label);

        verticalLayoutWidget = new QWidget(cliente);
        verticalLayoutWidget.setObjectName("verticalLayoutWidget");
        verticalLayoutWidget.setGeometry(new QRect(140, 50, 161, 152));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        codigo = new QLineEdit(verticalLayoutWidget);
        codigo.setObjectName("codigo");
        codigo.setMaxLength(5);

        verticalLayout.addWidget(codigo);

        nombre = new QLineEdit(verticalLayoutWidget);
        nombre.setObjectName("nombre");
        nombre.setMaxLength(20);

        verticalLayout.addWidget(nombre);

        apellidos = new QLineEdit(verticalLayoutWidget);
        apellidos.setObjectName("apellidos");
        apellidos.setMaxLength(30);

        verticalLayout.addWidget(apellidos);

        direccion = new QLineEdit(verticalLayoutWidget);
        direccion.setObjectName("direccion");
        direccion.setMaxLength(30);

        verticalLayout.addWidget(direccion);

        telefono = new QLineEdit(verticalLayoutWidget);
        telefono.setObjectName("telefono");
        telefono.setMaxLength(9);

        verticalLayout.addWidget(telefono);

        fecha = new QDateEdit(verticalLayoutWidget);
        fecha.setObjectName("fecha");

        verticalLayout.addWidget(fecha);

        datos_cliente_label = new QLabel(cliente);
        datos_cliente_label.setObjectName("datos_cliente_label");
        datos_cliente_label.setGeometry(new QRect(20, 10, 121, 21));
        QFont font6 = new QFont();
        font6.setFamily("Agency FB");
        font6.setPointSize(14);
        font6.setBold(true);
        font6.setUnderline(true);
        font6.setWeight(75);
        datos_cliente_label.setFont(font6);
        tipo_reforma = new QFrame(Nueva_reforma);
        tipo_reforma.setObjectName("tipo_reforma");
        tipo_reforma.setGeometry(new QRect(380, 20, 411, 271));
        tipo_reforma.setStyleSheet("background-color: rgb(241, 241, 241);");
        tipo_reforma.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        tipo_reforma.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        tipo_reforma_label = new QLabel(tipo_reforma);
        tipo_reforma_label.setObjectName("tipo_reforma_label");
        tipo_reforma_label.setEnabled(true);
        tipo_reforma_label.setGeometry(new QRect(20, 10, 121, 21));
        QFont font7 = new QFont();
        font7.setFamily("Agency FB");
        font7.setPointSize(14);
        font7.setBold(true);
        font7.setUnderline(true);
        font7.setWeight(75);
        tipo_reforma_label.setFont(font7);
        verticalLayoutWidget_3 = new QWidget(tipo_reforma);
        verticalLayoutWidget_3.setObjectName("verticalLayoutWidget_3");
        verticalLayoutWidget_3.setGeometry(new QRect(10, 60, 111, 158));
        integral_layout = new QVBoxLayout(verticalLayoutWidget_3);
        integral_layout.setObjectName("integral_layout");
        estructura_radioButton = new QRadioButton(verticalLayoutWidget_3);
        estructura_radioButton.setObjectName("estructura_radioButton");
        estructura_radioButton.setEnabled(false);
        QFont font8 = new QFont();
        font8.setFamily("Agency FB");
        font8.setPointSize(10);
        estructura_radioButton.setFont(font8);
        estructura_radioButton.setAutoRepeat(true);
        estructura_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(estructura_radioButton);

        cimentacion_radioButton = new QRadioButton(verticalLayoutWidget_3);
        cimentacion_radioButton.setObjectName("cimentacion_radioButton");
        cimentacion_radioButton.setEnabled(false);
        QFont font9 = new QFont();
        font9.setFamily("Agency FB");
        font9.setPointSize(10);
        cimentacion_radioButton.setFont(font9);
        cimentacion_radioButton.setAutoRepeat(true);
        cimentacion_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(cimentacion_radioButton);

        albanileria_radioButton = new QRadioButton(verticalLayoutWidget_3);
        albanileria_radioButton.setObjectName("albanileria_radioButton");
        albanileria_radioButton.setEnabled(false);
        QFont font10 = new QFont();
        font10.setFamily("Agency FB");
        font10.setPointSize(10);
        albanileria_radioButton.setFont(font10);
        albanileria_radioButton.setAutoRepeat(true);
        albanileria_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(albanileria_radioButton);

        fontaneria_radioButton = new QRadioButton(verticalLayoutWidget_3);
        fontaneria_radioButton.setObjectName("fontaneria_radioButton");
        fontaneria_radioButton.setEnabled(false);
        QFont font11 = new QFont();
        font11.setFamily("Agency FB");
        font11.setPointSize(10);
        fontaneria_radioButton.setFont(font11);
        fontaneria_radioButton.setAutoRepeat(true);
        fontaneria_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(fontaneria_radioButton);

        decoracion_radioButton = new QRadioButton(verticalLayoutWidget_3);
        decoracion_radioButton.setObjectName("decoracion_radioButton");
        decoracion_radioButton.setEnabled(false);
        QFont font12 = new QFont();
        font12.setFamily("Agency FB");
        font12.setPointSize(10);
        decoracion_radioButton.setFont(font12);
        decoracion_radioButton.setAutoRepeat(true);
        decoracion_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(decoracion_radioButton);

        carpinteria_radioButton = new QRadioButton(verticalLayoutWidget_3);
        carpinteria_radioButton.setObjectName("carpinteria_radioButton");
        carpinteria_radioButton.setEnabled(false);
        QFont font13 = new QFont();
        font13.setFamily("Agency FB");
        font13.setPointSize(10);
        carpinteria_radioButton.setFont(font13);
        carpinteria_radioButton.setAutoRepeat(true);
        carpinteria_radioButton.setAutoExclusive(false);

        integral_layout.addWidget(carpinteria_radioButton);

        verticalLayoutWidget_5 = new QWidget(tipo_reforma);
        verticalLayoutWidget_5.setObjectName("verticalLayoutWidget_5");
        verticalLayoutWidget_5.setGeometry(new QRect(150, 60, 111, 161));
        sanitarios_layout = new QVBoxLayout(verticalLayoutWidget_5);
        sanitarios_layout.setObjectName("sanitarios_layout");
        sani_alba_radioButton = new QRadioButton(verticalLayoutWidget_5);
        sani_alba_radioButton.setObjectName("sani_alba_radioButton");
        sani_alba_radioButton.setEnabled(false);
        QFont font14 = new QFont();
        font14.setFamily("Agency FB");
        font14.setPointSize(10);
        sani_alba_radioButton.setFont(font14);
        sani_alba_radioButton.setAutoRepeat(true);
        sani_alba_radioButton.setAutoExclusive(false);

        sanitarios_layout.addWidget(sani_alba_radioButton);

        fonta_sani_radioButton = new QRadioButton(verticalLayoutWidget_5);
        fonta_sani_radioButton.setObjectName("fonta_sani_radioButton");
        fonta_sani_radioButton.setEnabled(false);
        QFont font15 = new QFont();
        font15.setFamily("Agency FB");
        font15.setPointSize(10);
        fonta_sani_radioButton.setFont(font15);
        fonta_sani_radioButton.setAutoRepeat(true);
        fonta_sani_radioButton.setAutoExclusive(false);

        sanitarios_layout.addWidget(fonta_sani_radioButton);

        deco_sani_radioButton = new QRadioButton(verticalLayoutWidget_5);
        deco_sani_radioButton.setObjectName("deco_sani_radioButton");
        deco_sani_radioButton.setEnabled(false);
        QFont font16 = new QFont();
        font16.setFamily("Agency FB");
        font16.setPointSize(10);
        deco_sani_radioButton.setFont(font16);
        deco_sani_radioButton.setAutoRepeat(true);
        deco_sani_radioButton.setAutoExclusive(false);

        sanitarios_layout.addWidget(deco_sani_radioButton);

        verticalLayoutWidget_6 = new QWidget(tipo_reforma);
        verticalLayoutWidget_6.setObjectName("verticalLayoutWidget_6");
        verticalLayoutWidget_6.setGeometry(new QRect(290, 60, 111, 151));
        pavimentos_layout = new QVBoxLayout(verticalLayoutWidget_6);
        pavimentos_layout.setObjectName("pavimentos_layout");
        es_pavi_radioButton = new QRadioButton(verticalLayoutWidget_6);
        es_pavi_radioButton.setObjectName("es_pavi_radioButton");
        es_pavi_radioButton.setEnabled(false);
        QFont font17 = new QFont();
        font17.setFamily("Agency FB");
        font17.setPointSize(10);
        es_pavi_radioButton.setFont(font17);
        es_pavi_radioButton.setAutoRepeat(true);
        es_pavi_radioButton.setAutoExclusive(false);

        pavimentos_layout.addWidget(es_pavi_radioButton);

        cimen_pavi_radioButton = new QRadioButton(verticalLayoutWidget_6);
        cimen_pavi_radioButton.setObjectName("cimen_pavi_radioButton");
        cimen_pavi_radioButton.setEnabled(false);
        QFont font18 = new QFont();
        font18.setFamily("Agency FB");
        font18.setPointSize(10);
        cimen_pavi_radioButton.setFont(font18);
        cimen_pavi_radioButton.setChecked(false);
        cimen_pavi_radioButton.setAutoRepeat(true);
        cimen_pavi_radioButton.setAutoExclusive(false);

        pavimentos_layout.addWidget(cimen_pavi_radioButton);

        reforma_integral_radioButton = new QRadioButton(tipo_reforma);
        reforma_integral_radioButton.setObjectName("reforma_integral_radioButton");
        reforma_integral_radioButton.setGeometry(new QRect(10, 40, 131, 17));
        QFont font19 = new QFont();
        font19.setFamily("Agency FB");
        font19.setPointSize(10);
        font19.setBold(true);
        font19.setWeight(75);
        reforma_integral_radioButton.setFont(font19);
        sanitarios_radioButton = new QRadioButton(tipo_reforma);
        sanitarios_radioButton.setObjectName("sanitarios_radioButton");
        sanitarios_radioButton.setGeometry(new QRect(150, 40, 82, 17));
        QFont font20 = new QFont();
        font20.setFamily("Agency FB");
        font20.setPointSize(10);
        font20.setBold(true);
        font20.setWeight(75);
        sanitarios_radioButton.setFont(font20);
        pavimentos_radioButton = new QRadioButton(tipo_reforma);
        pavimentos_radioButton.setObjectName("pavimentos_radioButton");
        pavimentos_radioButton.setGeometry(new QRect(290, 40, 82, 17));
        QFont font21 = new QFont();
        font21.setFamily("Agency FB");
        font21.setPointSize(10);
        font21.setBold(true);
        font21.setWeight(75);
        pavimentos_radioButton.setFont(font21);
        pushButton = new QPushButton(tipo_reforma);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(330, 240, 75, 23));
        QFont font22 = new QFont();
        font22.setFamily("Agency FB");
        font22.setPointSize(9);
        font22.setBold(true);
        font22.setWeight(75);
        pushButton.setFont(font22);
        mano_obra = new QFrame(Nueva_reforma);
        mano_obra.setObjectName("mano_obra");
        mano_obra.setGeometry(new QRect(30, 320, 761, 221));
        mano_obra.setToolTip("");
        mano_obra.setStyleSheet("background-color: rgb(241, 241, 241);");
        mano_obra.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.StyledPanel);
        mano_obra.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);
        encargado_label = new QLabel(mano_obra);
        encargado_label.setObjectName("encargado_label");
        encargado_label.setGeometry(new QRect(20, 10, 171, 21));
        QFont font23 = new QFont();
        font23.setFamily("Agency FB");
        font23.setPointSize(14);
        font23.setBold(true);
        font23.setUnderline(true);
        font23.setWeight(75);
        encargado_label.setFont(font23);
        horizontalLayoutWidget = new QWidget(mano_obra);
        horizontalLayoutWidget.setObjectName("horizontalLayoutWidget");
        horizontalLayoutWidget.setGeometry(new QRect(120, 10, 201, 31));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout.setObjectName("horizontalLayout");
        checkbox_label = new QLabel(horizontalLayoutWidget);
        checkbox_label.setObjectName("checkbox_label");
        QFont font24 = new QFont();
        font24.setFamily("Agency FB");
        font24.setPointSize(10);
        checkbox_label.setFont(font24);

        horizontalLayout.addWidget(checkbox_label);

        necesario_obra_externacheckBox = new QCheckBox(horizontalLayoutWidget);
        necesario_obra_externacheckBox.setObjectName("necesario_obra_externacheckBox");
        necesario_obra_externacheckBox.setCursor(new QCursor(Qt.CursorShape.PointingHandCursor));

        horizontalLayout.addWidget(necesario_obra_externacheckBox);

        nueva_mano_obra_pushButton = new QPushButton(mano_obra);
        nueva_mano_obra_pushButton.setObjectName("nueva_mano_obra_pushButton");
        nueva_mano_obra_pushButton.setGeometry(new QRect(400, 180, 221, 23));
        QFont font25 = new QFont();
        font25.setFamily("Agency FB");
        font25.setPointSize(9);
        font25.setBold(true);
        font25.setWeight(75);
        nueva_mano_obra_pushButton.setFont(font25);
        contenedor_numeOper_regisOper = new QWidget(mano_obra);
        nueva_mano_obra_pushButton.hide();//SE OCULTA EL BOTON PARA AÑADIR UNA NUEVA EMPRESA EXTERNA
        
        contenedor_numeOper_regisOper.setObjectName("contenedor_numeOper_regisOper");
        contenedor_numeOper_regisOper.setGeometry(new QRect(230, 110, 151, 91));
        operarios_plainTextEdit = new QPlainTextEdit(contenedor_numeOper_regisOper);
        operarios_plainTextEdit.setObjectName("operarios_plainTextEdit");
        operarios_plainTextEdit.setGeometry(new QRect(0, 20, 151, 71));
        operarios_plainTextEdit.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhNone));
        operarios_plainTextEdit.setVerticalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy.ScrollBarAlwaysOn);
        operarios_plainTextEdit.setHorizontalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy.ScrollBarAlwaysOff);
        operarios_plainTextEdit.setOverwriteMode(false);
        operarios_plainTextEdit.setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.createQFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.NoTextInteraction));
        operarios_comboBox = new QComboBox(contenedor_numeOper_regisOper);
        operarios_comboBox.setObjectName("operarios_comboBox");
        operarios_comboBox.setGeometry(new QRect(0, 0, 151, 18));
        tipo_mano_obra_comboBox = new QComboBox(mano_obra);
        contenedor_numeOper_regisOper.hide();//SE OCULTA EL QWIDGET DONDE SE ENCUENTRA  operarios_comboBox Y operarios_plainTextEdit
        
        tipo_mano_obra_comboBox.setObjectName("tipo_mano_obra_comboBox");
        tipo_mano_obra_comboBox.setEnabled(false);
        tipo_mano_obra_comboBox.setGeometry(new QRect(70, 110, 149, 18));
        tipo_mano_obra_plainTextEdit = new QPlainTextEdit(mano_obra);
        tipo_mano_obra_plainTextEdit.setObjectName("tipo_mano_obra_plainTextEdit");
        tipo_mano_obra_plainTextEdit.setGeometry(new QRect(70, 130, 149, 71));
        tipo_mano_obra_plainTextEdit.setInputMethodHints(com.trolltech.qt.core.Qt.InputMethodHint.createQFlags(com.trolltech.qt.core.Qt.InputMethodHint.ImhNone));
        tipo_mano_obra_plainTextEdit.setVerticalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy.ScrollBarAlwaysOn);
        tipo_mano_obra_plainTextEdit.setHorizontalScrollBarPolicy(com.trolltech.qt.core.Qt.ScrollBarPolicy.ScrollBarAlwaysOff);
        tipo_mano_obra_plainTextEdit.setOverwriteMode(false);
        tipo_mano_obra_plainTextEdit.setTextInteractionFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.createQFlags(com.trolltech.qt.core.Qt.TextInteractionFlag.NoTextInteraction));
        horizontalLayoutWidget_3 = new QWidget(mano_obra);
        horizontalLayoutWidget_3.setObjectName("horizontalLayoutWidget_3");
        horizontalLayoutWidget_3.setGeometry(new QRect(70, 70, 321, 31));
        horizontalLayout_3 = new QHBoxLayout(horizontalLayoutWidget_3);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        tipo_mano_obra_plainTextEdit.hide();//SE OCULTA EL EDITOR DE TEXTO PLANO DONDE SE REGISTRAN EL TIPO DE EMPRESA EXTERNA
        
        tipo_mano_label = new QLabel(horizontalLayoutWidget_3);
        tipo_mano_label.setObjectName("tipo_mano_label");
        QFont font26 = new QFont();
        font26.setFamily("Agency FB");
        font26.setPointSize(10);
        font26.setBold(true);
        font26.setUnderline(true);
        font26.setWeight(75);
        tipo_mano_label.setFont(font26);

        horizontalLayout_3.addWidget(tipo_mano_label);

        n_operarios_label = new QLabel(horizontalLayoutWidget_3);
        n_operarios_label.setObjectName("n_operarios_label");
        QFont font27 = new QFont();
        font27.setFamily("Agency FB");
        font27.setPointSize(10);
        font27.setBold(true);
        font27.setUnderline(true);
        font27.setWeight(75);
        n_operarios_label.setFont(font27);

        horizontalLayout_3.addWidget(n_operarios_label);

        horizontalLayoutWidget_2 = new QWidget(Nueva_reforma);
        horizontalLayoutWidget_2.setObjectName("horizontalLayoutWidget_2");
        horizontalLayoutWidget_2.setGeometry(new QRect(480, 540, 311, 31));
        horizontalLayout_2 = new QHBoxLayout(horizontalLayoutWidget_2);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        limpiar_pushButton = new QPushButton(horizontalLayoutWidget_2);
        limpiar_pushButton.setObjectName("limpiar_pushButton");
        QFont font28 = new QFont();
        font28.setFamily("Agency FB");
        font28.setPointSize(10);
        font28.setBold(true);
        font28.setWeight(75);
        limpiar_pushButton.setFont(font28);
        limpiar_pushButton.setCursor(new QCursor(Qt.CursorShape.PointingHandCursor));
        limpiar_pushButton.setStyleSheet("background-color: rgb(255, 255, 255);");

        horizontalLayout_2.addWidget(limpiar_pushButton);

        guardar_pushButton = new QPushButton(horizontalLayoutWidget_2);
        guardar_pushButton.setObjectName("guardar_pushButton");
        QFont font29 = new QFont();
        font29.setFamily("Agency FB");
        font29.setPointSize(10);
        font29.setBold(true);
        font29.setWeight(75);
        guardar_pushButton.setFont(font29);

        horizontalLayout_2.addWidget(guardar_pushButton);

        salir_pushButton = new QPushButton(horizontalLayoutWidget_2);
        salir_pushButton.setObjectName("salir_pushButton");
        QFont font30 = new QFont();
        font30.setFamily("Agency FB");
        font30.setPointSize(10);
        font30.setBold(true);
        font30.setWeight(75);
        salir_pushButton.setFont(font30);

        horizontalLayout_2.addWidget(salir_pushButton);

        codigo_label.setBuddy(codigo);
        nombre_label.setBuddy(nombre);
        apellidos_label.setBuddy(apellidos);
        direccion_label.setBuddy(direccion);
        telefono_label_.setBuddy(telefono);
        fecha_label.setBuddy(fecha);
        checkbox_label.setBuddy(necesario_obra_externacheckBox);
        QWidget.setTabOrder(codigo, nombre);
        QWidget.setTabOrder(nombre, apellidos);
        QWidget.setTabOrder(apellidos, direccion);
        QWidget.setTabOrder(direccion, telefono);
        QWidget.setTabOrder(telefono, fecha);
        QWidget.setTabOrder(fecha, reforma_integral_radioButton);
        QWidget.setTabOrder(reforma_integral_radioButton, sanitarios_radioButton);
        QWidget.setTabOrder(sanitarios_radioButton, pavimentos_radioButton);
        QWidget.setTabOrder(pavimentos_radioButton, estructura_radioButton);
        QWidget.setTabOrder(estructura_radioButton, cimentacion_radioButton);
        QWidget.setTabOrder(cimentacion_radioButton, albanileria_radioButton);
        QWidget.setTabOrder(albanileria_radioButton, fontaneria_radioButton);
        QWidget.setTabOrder(fontaneria_radioButton, decoracion_radioButton);
        QWidget.setTabOrder(decoracion_radioButton, carpinteria_radioButton);
        QWidget.setTabOrder(carpinteria_radioButton, sani_alba_radioButton);
        QWidget.setTabOrder(sani_alba_radioButton, fonta_sani_radioButton);
        QWidget.setTabOrder(fonta_sani_radioButton, deco_sani_radioButton);
        QWidget.setTabOrder(deco_sani_radioButton, es_pavi_radioButton);
        QWidget.setTabOrder(es_pavi_radioButton, cimen_pavi_radioButton);
        QWidget.setTabOrder(cimen_pavi_radioButton, pushButton);
        QWidget.setTabOrder(pushButton, necesario_obra_externacheckBox);
        QWidget.setTabOrder(necesario_obra_externacheckBox, tipo_mano_obra_comboBox);
        QWidget.setTabOrder(tipo_mano_obra_comboBox, operarios_comboBox);
        QWidget.setTabOrder(operarios_comboBox, nueva_mano_obra_pushButton);
        QWidget.setTabOrder(nueva_mano_obra_pushButton, tipo_mano_obra_plainTextEdit);
        QWidget.setTabOrder(tipo_mano_obra_plainTextEdit, operarios_plainTextEdit);
        QWidget.setTabOrder(operarios_plainTextEdit, limpiar_pushButton);
        QWidget.setTabOrder(limpiar_pushButton, guardar_pushButton);
        QWidget.setTabOrder(guardar_pushButton, salir_pushButton);
        retranslateUi(Nueva_reforma);
        reforma_integral_radioButton.clicked.connect(sanitarios_radioButton, "setDisabled(boolean)");
        reforma_integral_radioButton.clicked.connect(pavimentos_radioButton, "setDisabled(boolean)");
        reforma_integral_radioButton.clicked.connect(estructura_radioButton, "setEnabled(boolean)");
        reforma_integral_radioButton.clicked.connect(cimentacion_radioButton, "setEnabled(boolean)");
        reforma_integral_radioButton.clicked.connect(albanileria_radioButton, "setEnabled(boolean)");
        reforma_integral_radioButton.clicked.connect(fontaneria_radioButton, "setEnabled(boolean)");
        reforma_integral_radioButton.clicked.connect(decoracion_radioButton, "setEnabled(boolean)");
        reforma_integral_radioButton.clicked.connect(carpinteria_radioButton, "setEnabled(boolean)");
        sanitarios_radioButton.clicked.connect(reforma_integral_radioButton, "setDisabled(boolean)");
        sanitarios_radioButton.clicked.connect(pavimentos_radioButton, "setDisabled(boolean)");
        sanitarios_radioButton.clicked.connect(sani_alba_radioButton, "setEnabled(boolean)");
        sanitarios_radioButton.clicked.connect(fonta_sani_radioButton, "setEnabled(boolean)");
        sanitarios_radioButton.clicked.connect(deco_sani_radioButton, "setEnabled(boolean)");
        pavimentos_radioButton.clicked.connect(sanitarios_radioButton, "setDisabled(boolean)");
        pavimentos_radioButton.clicked.connect(reforma_integral_radioButton, "setDisabled(boolean)");
        pavimentos_radioButton.clicked.connect(es_pavi_radioButton, "setEnabled(boolean)");
        pavimentos_radioButton.clicked.connect(cimen_pavi_radioButton, "setEnabled(boolean)");
        limpiar_pushButton.clicked.connect(codigo, "clear()");
        limpiar_pushButton.clicked.connect(nombre, "clear()");
        limpiar_pushButton.clicked.connect(apellidos, "clear()");
        limpiar_pushButton.clicked.connect(direccion, "clear()");
        limpiar_pushButton.clicked.connect(telefono, "clear()");
        pushButton.clicked.connect(pavimentos_radioButton, "setDisabled(boolean)");
        pushButton.clicked.connect(sanitarios_radioButton, "setDisabled(boolean)");
        pushButton.clicked.connect(reforma_integral_radioButton, "setDisabled(boolean)");
        pushButton.clicked.connect(es_pavi_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(cimen_pavi_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(es_pavi_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(cimen_pavi_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(sani_alba_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(fonta_sani_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(deco_sani_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(deco_sani_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(fonta_sani_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(sani_alba_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(pavimentos_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(sanitarios_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(reforma_integral_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(carpinteria_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(decoracion_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(fontaneria_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(albanileria_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(cimentacion_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(estructura_radioButton, "setEnabled(boolean)");
        pushButton.clicked.connect(carpinteria_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(decoracion_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(fontaneria_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(albanileria_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(cimentacion_radioButton, "setChecked(boolean)");
        pushButton.clicked.connect(estructura_radioButton, "setChecked(boolean)");
        tipo_mano_obra_comboBox.activated.connect(tipo_mano_obra_plainTextEdit, "appendPlainText(java.lang.String)");
        operarios_comboBox.activated.connect(operarios_plainTextEdit, "appendPlainText(java.lang.String)");
        necesario_obra_externacheckBox.clicked.connect(tipo_mano_obra_comboBox, "setEnabled(boolean)");
        tipo_mano_obra_plainTextEdit.textChanged.connect(tipo_mano_obra_comboBox, "hide()");
        operarios_plainTextEdit.textChanged.connect(operarios_comboBox, "hide()");
        nueva_mano_obra_pushButton.clicked.connect(tipo_mano_obra_comboBox, "show()");
        nueva_mano_obra_pushButton.clicked.connect(operarios_comboBox, "show()");
        necesario_obra_externacheckBox.clicked.connect(tipo_mano_obra_plainTextEdit, "setVisible(boolean)");
        necesario_obra_externacheckBox.clicked.connect(nueva_mano_obra_pushButton, "setVisible(boolean)");
        necesario_obra_externacheckBox.clicked.connect(contenedor_numeOper_regisOper, "setVisible(boolean)");

        
        guardar_pushButton.clicked.connect(Nueva_reforma, "close()");//CONECTAMOS CON EL BOTON GUARDAR, LA ACCIÓN CERRAR EL FORMULARIO "Nueva_reforma".
        salir_pushButton.clicked.connect(Nueva_reforma, "close()");//CONECTAMOS CON EL BOTON SALIR, LA ACCIÓN CERRAR EL FORMULARIO "Nueva_reforma".
        
        
        Nueva_reforma.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Nueva_reforma)
    {
        Nueva_reforma.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Dialog", null));
        Nueva_reforma.setToolTip("");
        codigo_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "C\u00f3digo", null));
        nombre_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Nombre", null));
        apellidos_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Apellidos", null));
        direccion_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Direcci\u00f3n", null));
        telefono_label_.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Tel\u00e9fono de contacto", null));
        fecha_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Fecha de alta", null));
        codigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "C\u00f3digo de 5 d\u00edgitos num\u00e9ricos.", null));
        nombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Nombre.M\u00e1ximo 20 caracteres.", null));
        apellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Apellidos.M\u00e1ximo 30 caracteres.", null));
        direccion.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Direcci\u00f3n.M\u00e1ximo 30 caracteres", null));
        telefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Tel\u00e9fono de contacto.M\u00e1ximo 9 caracteres.D\u00edgitos.", null));
        fecha.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Formato de fecha dd/mm/aaaa", null));
        datos_cliente_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "DATOS DEL CLIENTE", null));
        tipo_reforma_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "TIPO DE REFORMA", null));
        estructura_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Estructura", null));
        cimentacion_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Cimentaci\u00f3n", null));
        albanileria_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Alba\u00f1iler\u00eda", null));
        fontaneria_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Fontaner\u00eda", null));
        decoracion_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Decoraci\u00f3n", null));
        carpinteria_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Carpinter\u00eda", null));
        sani_alba_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Alba\u00f1iler\u00eda", null));
        fonta_sani_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Fontaner\u00eda", null));
        deco_sani_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Decoraci\u00f3n", null));
        es_pavi_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Estructura", null));
        cimen_pavi_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Cimentaci\u00f3n", null));
        reforma_integral_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "REFORMA INTEGRAL", null));
        sanitarios_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "SANITARIOS", null));
        pavimentos_radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "PAVIMENTOS", null));
        pushButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Se resetea la selecci\u00f3n \"Tipo Reforma\"", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "DESHACER", null));
        encargado_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "MANO DE OBRA", null));
        checkbox_label.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Selecciona o no, si es necesario mano de obra externa.", null));
        checkbox_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Necesario mano de obra externa", null));
        necesario_obra_externacheckBox.setText("");
        nueva_mano_obra_pushButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Pulsar para establecer una nueva l\u00ednea de mano de obra externa.", null));
        nueva_mano_obra_pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "A\u00d1ADIR NUEVA MANO DE OBRA EXTERNA", null));
        operarios_plainTextEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Registro del n\u00ba de la mano de obra", null));
        operarios_plainTextEdit.setPlainText("");
        operarios_comboBox.clear();
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "2", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "3", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "4", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "5", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "6", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "7", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "8", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "9", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "10", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "11", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "12", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "13", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "14", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "15", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "16", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "17", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "18", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "19", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "20", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "21", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "22", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "23", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "24", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "25", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "26", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "27", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "28", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "29", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "30", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "31", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "32", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "33", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "34", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "35", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "36", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "37", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "38", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "39", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "40", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "41", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "42", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "43", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "44", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "45", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "46", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "47", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "48", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "49", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "50", null));
        operarios_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "New Item", null));
        tipo_mano_obra_comboBox.clear();
        tipo_mano_obra_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Aut\u00f3nomos", null));
        tipo_mano_obra_comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Subcontratas", null));
        tipo_mano_obra_plainTextEdit.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Registro de tipo de mano de obra externa", null));
        tipo_mano_obra_plainTextEdit.setPlainText("");
        tipo_mano_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Tipo mano de obra externa", null));
        n_operarios_label.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "N\u00ba de operarios", null));
        limpiar_pushButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Se eliminar\u00e1 los datos del cliente.", null));
        limpiar_pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "LIMPIAR", null));
        guardar_pushButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Guardar reforma", null));
        guardar_pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "GUARDAR", null));
        salir_pushButton.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "Salir de nueva reforma", null));
        salir_pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Nueva_reforma", "SALIR", null));
    } // retranslateUi

}

