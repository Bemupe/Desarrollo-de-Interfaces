/********************************************************************************
 ** Form generated from reading ui file 'frmMenu.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
//AÑADIDO: línea 10, línea 27 a 32, línea 65, línea 67, línea 93

package programa;//SE AÑADE EL ARCHIVO JAVA AL PAQUETE
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Frame_Principal implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionNueva_Reforma;
    public QAction actionSalir;
    public QWidget centralwidget;
    public QLabel logo;
    public QPushButton botonNuevaReforma;
    public QMenuBar menubar;
    public QMenu menuGestionar_Reformas;
    public QStatusBar statusbar;

    public Frame_Principal() { super(); }

  void nueva_reforma() {//AÑADIMOS FUNCION PARA ABRIR EL FORMULARIO DE REFORMA
    Frame_Reforma reforma = new Frame_Reforma();
    QDialog dialog = new QDialog();
    reforma.setupUi(dialog);
    dialog.show();
    }
    
    
    
    public void setupUi(QMainWindow Menu_inicial)
    {
        Menu_inicial.setObjectName("Menu_inicial");
        Menu_inicial.resize(new QSize(402, 345).expandedTo(Menu_inicial.minimumSizeHint()));
        Menu_inicial.setMinimumSize(new QSize(402, 345));
        Menu_inicial.setMaximumSize(new QSize(402, 345));
        actionNueva_Reforma = new QAction(Menu_inicial);
        actionNueva_Reforma.setObjectName("actionNueva_Reforma");
        QFont font = new QFont();
        font.setFamily("Agency FB");
        font.setPointSize(10);
        
        
        
        
        actionNueva_Reforma.setFont(font);
        
        
        
        actionSalir = new QAction(Menu_inicial);
        actionSalir.setObjectName("actionSalir");
        QFont font1 = new QFont();
        font1.setFamily("Agency FB");
        font1.setPointSize(10);
        font1.setBold(true);
        font1.setWeight(75);
        actionSalir.setFont(font1);
        
        
        actionNueva_Reforma.triggered.connect(this, "nueva_reforma()");//AÑADIMOS LA FUNCIONALIDAD, DE AL HACER CLICK EN NUEVA REFORMA, EN LA ZONA DE MENÚ, SE ABRE EL FORMULARIO "nueva_reforma" (Frame_Reforma).
        
        actionSalir.triggered.connect(Menu_inicial, "close()");//AÑADIMOS LA FUNCIONALIDAD, DE AL HACER CLICK EN SALIR, EN LA ZONA DE MENÚ, SE CIERRA EL FORMULARIO.
        
        
        
        centralwidget = new QWidget(Menu_inicial);
        centralwidget.setObjectName("centralwidget");
        logo = new QLabel(centralwidget);
        logo.setObjectName("logo");
        logo.setGeometry(new QRect(0, 0, 411, 311));
        logo.setPixmap(new QPixmap(("classpath:recursos/construcion_jpg.jpg")));

        
        botonNuevaReforma = new QPushButton(centralwidget);
        botonNuevaReforma.setObjectName("botonNuevaReforma");
        botonNuevaReforma.setGeometry(new QRect(270, 130, 111, 23));
        QFont font2 = new QFont();
        font2.setFamily("Agency FB");
        font2.setPointSize(11);
        font2.setBold(true);
        font2.setWeight(75);
        botonNuevaReforma.setFont(font2);
        botonNuevaReforma.setCursor(new QCursor(Qt.CursorShape.PointingHandCursor));
        botonNuevaReforma.setStyleSheet("background-color: rgb(255, 255, 255);\n"+
";");
        
        
        botonNuevaReforma.clicked.connect(this, "nueva_reforma()");//AÑADIMOS LA FUNCIONALIDAD, DE AL HACER CLICK, EN EL BOTÓN NUEVA REFORMA, SE ABRE EL FORMULARIO "nueva_reforma" (Frame_Reforma).
        
 
        Menu_inicial.setCentralWidget(centralwidget);
        menubar = new QMenuBar(Menu_inicial);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 402, 21));
        menuGestionar_Reformas = new QMenu(menubar);
        menuGestionar_Reformas.setObjectName("menuGestionar_Reformas");
        QFont font3 = new QFont();
        font3.setFamily("Agency FB");
        font3.setBold(false);
        font3.setWeight(50);
        menuGestionar_Reformas.setFont(font3);
        menuGestionar_Reformas.setCursor(new QCursor(Qt.CursorShape.PointingHandCursor));
        Menu_inicial.setMenuBar(menubar);
        statusbar = new QStatusBar(Menu_inicial);
        statusbar.setObjectName("statusbar");
        Menu_inicial.setStatusBar(statusbar);

        menubar.addAction(menuGestionar_Reformas.menuAction());
        menuGestionar_Reformas.addAction(actionNueva_Reforma);
        menuGestionar_Reformas.addSeparator();
        menuGestionar_Reformas.addAction(actionSalir);
        retranslateUi(Menu_inicial);

        Menu_inicial.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow Menu_inicial)
    {
        Menu_inicial.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "MainWindow", null));
        actionNueva_Reforma.setText(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Nueva Reforma", null));
        actionNueva_Reforma.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Iniciar nueva reforma", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Salir", null));
        logo.setText("");
        botonNuevaReforma.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Iniciar nueva reforma", null));
        botonNuevaReforma.setText(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "NUEVA REFORMA", null));
        menuGestionar_Reformas.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Opciones", null));
        menuGestionar_Reformas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Menu_inicial", "Gestionar Reformas", null));
    } // retranslateUi

}

